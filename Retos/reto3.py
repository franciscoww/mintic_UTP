from math import ceil

def rendimientoEmpleado ( nuip : int , depositos : list) -> tuple :

    ahorroTotal=sum(depositos)
    
    interes=0
    monto=0
    interesMeses=0

    for A in depositos:
        monto += A
        if A >= 200000:
            interes = (monto * 7)/100
            monto += interes
            interesMeses += interes
            
    if ahorroTotal > 2400000:
        interesAhorroTotal=ahorroTotal*0.15
    else:
        interesAhorroTotal=ahorroTotal*0.09

    interesGenerado=interesMeses+interesAhorroTotal
    montoFinal=ahorroTotal+interesGenerado


    return nuip , ahorroTotal , ceil( interesGenerado ) , ceil(montoFinal )



#--pruebas--

print ( rendimientoEmpleado (2548512 ,[0 ,250000 ,0 ,450000 ,120000 ,0 ,500000 ,0 ,0 ,400000 ,0 ,420000]) )

print ( rendimientoEmpleado (421158 ,
[1000000 ,0 ,360000 ,0 ,100000 ,0 ,250000 ,0 ,380000 ,0 ,500000 ,150000])
)

print (rendimientoEmpleado (10254852 ,
[200000 ,0 ,310000 ,0 ,0 ,450000 ,250000 ,0 ,0 ,0 ,260000 ,0 ,2140000])
)
