package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class Principal {

    public static int indiceCocheBarato(Vehiculo coches[]){
        Double precio;
        int indice=0;

        precio = coches[0].getPrecio();
        for (int i=1;i<coches.length;i++){
            if(coches[i].getPrecio()<precio){
                precio=coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String marca;
        String modelo;
        Double precio;
        Integer numVehiculos;
        Integer indiceCBarato;

        System.out.print("Cuantos vehiculos: ");
        numVehiculos = sc.nextInt();

        Vehiculo coches[] = new Vehiculo[numVehiculos];

        for (int i=0; i<coches.length; i++){
            sc.nextLine();
            System.out.println("\n Digite el coche"+(i+1)+":");
            System.out.print("Marca: ");
            marca = sc.nextLine();
            System.out.print("Modelo: ");
            modelo = sc.nextLine();
            System.out.print("Precio: ");
            precio = sc.nextDouble();
            coches[i] = new Vehiculo(marca, modelo, precio);
        }
        
        indiceCBarato = indiceCocheBarato(coches);
        System.out.println("\nEl coche mas barato es: ");
        System.out.println(coches[indiceCBarato].mostrarDatos());
    }
}
