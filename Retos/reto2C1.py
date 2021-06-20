def rent_car ( opcion : int , idCliente : int = 0 , idContrato : int =0, pago : float = 0 , db: dict ={}) -> dict :

    porCancelar=0

    if opcion == 3:
            return {'db': 'estado de contratos'}, db

    if opcion == 0 and not (idCliente in db.keys()) and pago == 0:
            db[idCliente] = {}
            return {f'{idCliente}': 'Cliente creado'}, db

    elif idCliente in db.keys():
        if opcion ==  1:
            db[idCliente][idContrato] = pago
            return {f'cliente': idCliente, 'contrato': idContrato, 'abono': 0, 'pago': pago}, db

        if opcion == 2 and (idContrato in db[idCliente].keys()):
            porCancelar=db[idCliente][idContrato] - pago
            if pago == db[idCliente][idContrato]:
                db[idCliente].pop(idContrato)
                return {f'cliente': idCliente, 'contrato': idContrato, 'abono': pago, 'pago': porCancelar}, db
            else:
                db[idCliente][idContrato] = porCancelar
            return {f'cliente': idCliente, 'contrato': idContrato, 'abono': pago, 'pago': porCancelar}, db
        else:
            return {f'{idContrato}': 'No existe el contrato'}, db
    else:
        return {f'{idCliente}': 'No existe el cliente'}, db

#---Pruebas---


msj , dbContratos = rent_car (0 , 1088)
print (msj , dbContratos )

msj , dbContratos = rent_car(1 , 1088 , 1, 300000, db=dbContratos)  
print (msj , dbContratos )

msj , dbContratos = rent_car(2 , 1088 , 1, 25000.25487, db=dbContratos)
print (msj , dbContratos)




msj , dbContratos = rent_car(1 , 1088 , 2, 500000 , db=dbContratos )
print (msj , dbContratos )

msj , dbContratos = rent_car(2 , 2054 , 5, 25000.25487 ,db= dbContratos )
print (msj , dbContratos )

msj , dbContratos = rent_car(1 , 2054 , 1, 700000 , db=dbContratos )
print (msj , dbContratos )

msj , dbContratos = rent_car(2 , 2054 , 1, 700000 , db=dbContratos )
print (msj , dbContratos )

msj , dbContratos = rent_car(0 , 2054 , 1, 700000 , db=dbContratos )
print (msj , dbContratos )

msj , dbContratos = rent_car(0 , 2054 , db= dbContratos )
print (msj , dbContratos )

msj , dbContratos = rent_car(1 , 2054 , 1, 700000 , db=dbContratos )
print (msj , dbContratos )

msj , dbContratos = rent_car(2 , 1088 , 1,274999.74513 , db=dbContratos )
print (msj , dbContratos )

msj , dbContratos = rent_car(3 , db= dbContratos )
print (msj , dbContratos )
