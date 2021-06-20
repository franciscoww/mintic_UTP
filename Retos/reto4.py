edadAnimales = {
    'Vertebrados': {
        'Reptiles': [('Cocodrilo', 70), ('Tortuga', 150), 
            ('Tuatara ', 117), ('Yacare', 80)],
        'Anfibios': [('Triton ', 8), ('Tapalcua', 12), ('Rana',10)]
},
    'Invertebrados': {
        'Anelidos': [('Errantes', 50), ('Lombriz', 4), ('Sanguijuela', 26)],
        'Artropodos': [('Escorpion', 6), ('Libelula', .5), 
        ('Cigarra', 10), ('Mariposa', 1)]
    }
}


def long_animal(db, struc):
    resp = ()
    may = 0
    if struc == '':
        return 'La opción ingresada requiere de una estructura animal valida'
    else:
        data = db.get(struc)
        for line in data.values():
            for a in line:
                if a[1] > may:
                    may = a[1]
                    resp = (a[0], a[1])
        return resp


def prom_edad(db, estruc):
    resp = {}
    if estruc != '':
        return 'La opción no recibe estructura'
    else:
        for key in db.keys():
            age = 0
            count = 0
            estruc = db.get(key)
            for v in estruc.values():
                for b in v:
                    age += b[1]
                    count += 1
            resp[key] = round(age/count, 2)
        return resp


def prom_anim_edad(db, estruc):
    resp = {}
    if estruc == '':
        return 'La opción ingresada requiere de una estructura animal valida'
    else:
        data = db.get(estruc)
        for k,v in data.items():
            age = 0
            count = 0
            for line in v:
                age += line[1]
                count += 1
            resp[k] = round(age/count, 2)
        return resp


def consultaAnimales ( opt :int , db:dict , estructura : str = ''):
    if opt == 1:
        return long_animal(db, estructura)

    elif opt == 2:
        return prom_edad(db, estructura)

    elif opt == 3:
        return prom_anim_edad(db, estructura)
    else:
        return 'La opción no es valida'


print (consultaAnimales (1 , edadAnimales ) )
print (consultaAnimales (1 , edadAnimales , 'Vertebrados') )
print (consultaAnimales (1 , edadAnimales , 'Invertebrados') )
print (consultaAnimales (2 , edadAnimales ) )
print (consultaAnimales (2 , edadAnimales , 'Vertebrados') )
print (consultaAnimales (3 , edadAnimales ) )
print (consultaAnimales (3 , edadAnimales , 'Vertebrados') )
print (consultaAnimales (3 , edadAnimales , 'Invertebrados') )