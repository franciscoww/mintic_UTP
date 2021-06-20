edadAnimales = {
    'Vertebrados': {
        'Reptiles': [('Cocodrilo', 70), ('Tortuga', 150), ('Tuatara', 117), ('Yacare', 80)],
        'Anfibios': [('Triton', 8), ('Tapalcua', 12), ('Rana', 10)]
    },
    'Invertebrados': {
        'Anelidos': [('Errantes', 50), ('Lombriz', 4), ('Sanguijuela', 26)],
        'Artropodos': [('Escorpion', 6), ('Libelula', .5), ('Cigarra', 10), ('Mariposa', 1)]
    }
}
listamax=[]



def longevo (valor,valor2):
    listamax.clear()
    valor = max(valor, key=lambda x: x[1])
    valor2 = max(valor2, key=lambda x: x[1])
    listamax.append(valor)
    listamax.append(valor2)
    maximo = max(listamax)
    return maximo

try:
    def consultaAnimales ( opt : int , db : dict , estructura : str = ' ') :
        if opt == 1:
            if estructura == 'Vertebrados':
                Reptiles = [q for q in edadAnimales['Vertebrados']['Reptiles']]
                Anfibios = [q for q in edadAnimales['Vertebrados']['Anfibios']]
                maximo=longevo(Reptiles, Anfibios)
                return maximo
            elif estructura == 'Invertebrados':
                Anelidos = [q for q in edadAnimales['Invertebrados']['Anelidos']]
                Artropodos = [q for q in edadAnimales['Invertebrados']['Artropodos']]
                maximo=longevo(Anelidos, Artropodos)
                return maximo
            else:
                return 'La opción ingresada requiere de una estructura animal valida'
        elif opt == 3:
            if estructura == 'Vertebrados':
                Reptiles = [q[1] for q in edadAnimales['Vertebrados']['Reptiles']]
                promReptiles=round(sum(Reptiles)/len(Reptiles), 2)
                Anfibios = [q[1] for q in edadAnimales['Vertebrados']['Anfibios']]
                promAnfibios=round(sum(Anfibios)/len(Anfibios), 2)
                return {f'Reptiles': promReptiles, 'Anfibios': promAnfibios}
            elif estructura == 'Invertebrados':
                Anelidos = [q[1] for q in edadAnimales['Invertebrados']['Anelidos']]
                promAnelidos=round(sum(Anelidos)/len(Anelidos), 2)
                Artropodos = [q[1] for q in edadAnimales['Invertebrados']['Artropodos']]
                promArtropodos=round(sum(Artropodos)/len(Artropodos), 2)
                return {f'Anelidos': promAnelidos, 'Artropodos': promArtropodos}
            else:
                return 'La opción ingresada requiere de una estructura animal valida'
        elif opt == 2:
            if estructura == ' ':
                Reptiles = [q[1] for q in edadAnimales['Vertebrados']['Reptiles']]
                Anfibios = [q[1] for q in edadAnimales['Vertebrados']['Anfibios']]
                promVertebrados= round((sum(Reptiles) + sum(Anfibios))/7, 2)
                Anelidos = [q[1] for q in edadAnimales['Invertebrados']['Anelidos']]
                Artropodos = [q[1] for q in edadAnimales['Invertebrados']['Artropodos']]
                promInvertebrados= round((sum(Anelidos) + sum(Artropodos))/7, 2)
                return {f'Vertebrados': promVertebrados, 'Invertebrados': promInvertebrados}
            else:
                return 'La opción no recibe estructura'

except TypeError: print('La opcion no es valida')
except KeyError: print('La opcion no es valida')


#--Pruebas--
print (consultaAnimales (1 , edadAnimales ) )
print (consultaAnimales (1 , edadAnimales , 'Vertebrados') )
print (consultaAnimales (1 , edadAnimales , 'Invertebrados') )
print (consultaAnimales (2 , edadAnimales ) )
print (consultaAnimales (2 , edadAnimales , 'Vertebrados') )
print (consultaAnimales (3 , edadAnimales ) )
print (consultaAnimales (3 , edadAnimales , 'Vertebrados') )
print (consultaAnimales (3 , edadAnimales , 'Invertebrados') )