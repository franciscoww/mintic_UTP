import json
import pandas as pd
import numpy as np
def preProcesado (DF):
# Funcion que prepara los generos en un DF para ser codificadas en la matriz
# Devuelve tambien los generos en una lista
    generosDF = DF['genres']. apply (pd.Series)
    generosDF ['title'] = DF['title']
    generosDF = generosDF . drop_duplicates ([ 'title'])
    generosDF.set_index ('title' , inplace = True )
    genres = [ generosDF [ genre ]. unique () for genre in generosDF . columns ]
    genres = [ genre for lista in genres for genre in lista if all ([ pd. isnull (
    genre ) == False , genre != '' , genre != '', len (str ( genre )) > 1]) ]
    genres = list ( set( genres ))
    return generosDF , genres

def codificaMatriz (DF , genres : list , producto : list ):

    matriz = pd.DataFrame(
        np.zeros((len(genres), len(producto))),
        index=genres,
        columns=list(producto)
    )
    
    for pelicula in DF.index:
        for index in DF:
            genero = DF[index][pelicula]
            if genero in genres:
                matriz[pelicula][genero] = 1

    return matriz 

def recomiendaPeliculas ( url_puntuacion :str , url_perfil :str , url_recomendacion : str) ->json :
    solucionDict = {}

    puntPelicula = pd.read_csv(url_puntuacion, sep= ';', names=['Pelicula', 'Puntuacion'], index_col=['Pelicula'])
    dataPerfil = pd.read_json(url_perfil)
    dataPerfil, generosPuntuacion = preProcesado(dataPerfil)

    peliRecomendada = pd.read_json(url_recomendacion)
    peliRecomendada, genRecomendado = preProcesado(peliRecomendada)

    peliculasPuntuacion = dataPerfil.index
    peliculaRecomen = peliRecomendada.index

    mGeneros = codificaMatriz(dataPerfil, generosPuntuacion, peliculasPuntuacion)
    mRecomendada = codificaMatriz(peliRecomendada, genRecomendado, peliculaRecomen)
    
    for pelicula in mGeneros.columns:
        if pelicula in puntPelicula.index:
            mGeneros[pelicula] = mGeneros[pelicula].apply(lambda punto: float(punto * puntPelicula['Puntuacion'][pelicula]))


    mGeneros['perfilUsuario'] = [mGeneros.loc[genero,:].sum() for genero in mGeneros.index]
    mGeneros['perfilUsuario'] = mGeneros['perfilUsuario'].apply(lambda punto: punto / mGeneros['perfilUsuario'].sum())

    mRecomendada['perfilUsuario']= mGeneros['perfilUsuario']
    mRecomendada=mRecomendada.fillna(0)
    mRecomendada=mRecomendada.transpose()

    for genero in mRecomendada.columns:
            mRecomendada[genero] = mRecomendada[genero].apply(lambda punto: float(punto * mRecomendada.loc['perfilUsuario'][genero]))

    mRecomendada=mRecomendada.transpose()
    mRecomendada['perfilUsuario']= mGeneros['perfilUsuario']
    mRecomendada=mRecomendada.fillna(0)
    ponderacion=[]
    llaves=[]
    for pelicula in mRecomendada.columns:
        pond= mRecomendada[pelicula].sum()
        ponderacion.append(pond)
    for peli in mRecomendada.columns:
        llaves.append(peli)
    solucionDict= dict(zip(llaves, ponderacion))
    del(solucionDict['perfilUsuario'])
    

    keys = [k for k, v in solucionDict.items() if v == 0]
    for x in keys:
        del solucionDict[x]


    import operator
    solucionDict = dict(sorted(solucionDict.items(), key=operator.itemgetter(1), reverse=True))

    solucionDict = {k:round(v, 5) for (k,v) in solucionDict.items()}

    return print(json.dumps(solucionDict, indent=4))


# ----pruebas----
# recomiendaPeliculas('https://git.io/JZKcF', 'https://git.io/JZKZV', 'https://git.io/JZKWX')
# recomiendaPeliculas('https://git.io/JZKCJ', 'https://git.io/JZKnj', 'https://git.io/JZKW5')

# Privadas
print(recomiendaPeliculas('https://git.io/JZKlE', 'https://git.io/JZKcq', 'https://git.io/JZKWh'))
print(recomiendaPeliculas('https://git.io/JZKlM', 'https://git.io/JZKc8', 'https://git.io/JZKlJ'))