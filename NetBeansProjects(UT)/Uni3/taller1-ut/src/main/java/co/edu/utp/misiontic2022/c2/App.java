package co.edu.utp.misiontic2022.c2;

// Crear un programa que use ArrayList de números que permita mostrar 
// un menú donde se pueda agregar un número, buscar un número, eliminar 
// un número, mostrar los elementos guardados y salir. 
// El programa debe permitir realizar estas acciones hasta que el usuario desee salir.

import java.util.ArrayList;
import java.util.Scanner;

public class ListaNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int opt;
        int num;

        do {
            System.out.println("------Seleccione una opción------");
            System.out.println("\t1. Agregar un nuevo numero");
            System.out.println("\t2. Buscar un numero");
            System.out.println("\t3. Eliminar un numero");
            System.out.println("\t4. Mostrar los elementos guardados");
            System.out.println("\t5. Salir");
            System.out.println("---------------------------------");
            System.out.print("Ingrese opción: ");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.print("\tIngrese el numero a agregar: ");
                    num = sc.nextInt();
                    list.add(num);
                    break;
                case 2:
                    System.out.print("\tIngrese el numero a buscar: ");
                    num = sc.nextInt();
                    int indice = list.indexOf(num);
                    if (indice != -1) {
                        System.out.println("La búsqueda está en el índice " + indice + "\n");
                    } else {
                        System.out.println("El elemento no existe\n");
                    }
                    break;
                case 3:
                    System.out.print("\tIngrese el indice de el numero a eliminar: ");
                    num = sc.nextInt();
                    list.remove(num);
                    break;
                case 4:
                    System.out.println("Elementos guardados:");
                    System.out.println(list);
                    break;

                default:
                    break;
            }

        } while (opt != 5);

    }
}
