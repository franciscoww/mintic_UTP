def desperdicio_de_gaseosa(amigo_1:dict,amigo_2:dict,amigo_3:dict, capacidad_boton:float)->str:
  
  vaso1 = (amigo_1['capacidad_actual'] + capacidad_boton) -amigo_1['capacidad_vaso']#1.2
  vaso2 = (amigo_2['capacidad_actual'] + capacidad_boton) -amigo_2['capacidad_vaso']#2.2
  vaso3 = (amigo_3['capacidad_actual'] + capacidad_boton) -amigo_3['capacidad_vaso']#3.2

  aux1 = vaso1 > 0
  aux2 = vaso2 > 0
  aux3 = vaso3 > 0

#Que vaso se regó primero?
  amigo_1['reboso1']= amigo_1['capacidad_vaso']-amigo_1['capacidad_actual'] #5.0
  amigo_2['reboso2']= amigo_2['capacidad_vaso']-amigo_2['capacidad_actual'] #4.0
  amigo_3['reboso3']= amigo_3['capacidad_vaso']-amigo_3['capacidad_actual'] #3.0

  primero = min(amigo_1['reboso1'],amigo_2['reboso2'],amigo_3['reboso3'])

  if aux1 and aux2 and aux3:
    if amigo_1['reboso1'] == primero:
      return amigo_1['nombre']
    if amigo_2['reboso2'] == primero:
      return amigo_2['nombre']
    if amigo_3['reboso3'] == primero:
      return amigo_3['nombre']
  elif aux1 and aux2:
    if amigo_1['reboso1'] == primero:
      return amigo_1['nombre']
    if amigo_2['reboso2'] == primero:
      return amigo_2['nombre']
  elif aux1 and aux3:
    if amigo_1['reboso1'] == primero:
      return amigo_1['nombre']
    if amigo_3['reboso3'] == primero:
      return amigo_3['nombre']
  elif aux2 and aux3:
    if amigo_2['reboso2'] == primero:
      return amigo_2['nombre']
    if amigo_3['reboso3'] == primero:
      return amigo_3['nombre']
  elif aux1:
    return amigo_1['nombre']
  elif aux2:
      return amigo_2['nombre']
  elif aux3:
      return amigo_3['nombre']
  else:
    return None

#-------------------------------------
servir = 6.2

amigo1 = {
    'nombre':'Raul',
    'capacidad_actual':7.0,
    'capacidad_vaso':820.0
}

amigo2 = {
    'nombre':'Frank',
    'capacidad_actual':6.0,
    'capacidad_vaso':100.0
}

amigo3 = {
    'nombre':'Jack',
    'capacidad_actual':7.0,
    'capacidad_vaso':10.0
}

print(desperdicio_de_gaseosa(amigo1,amigo2,amigo3,servir))
