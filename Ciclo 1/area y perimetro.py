while True:
    print("-----------MENU-----------")
    print("\t1. Calcular area.")
    print("\t2. Calcular perimetro.")
    print("\t3. Salir")
    print("--------------------------\n")

    opcion = input("Ingrese una opción: ")

    if opcion == '1':
        L = float(input("Ingrese el valor del lado: "))
        area = L * L
        print("El area del cuadrado es: \n", area)
    elif opcion == '2':
        L = float(input("Ingrese el valor del lado: "))
        perimetro = L * 4
        print(f"El perimetro del cuadrado es: {perimetro} \n")
    elif opcion == '3':
        print("Hasta luego! A finalizado la ejecución del programa.")
        break
    else:
        print("Ingreso una opción no valida.")
