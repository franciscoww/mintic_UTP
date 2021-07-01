package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class EjWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean band = true;
        int cont = 0;
        while (band) {
            System.out.print("\nIngrese un numero: ");
            int numero = input.nextInt();

            if (cont == 4) {
                band = false;
            }
            cont += 1;

            switch (numero) {
                case 47:
                    System.out.println("Estamos en el mejor grupo");
                    break;
                case 77:
                    System.out.println("Grupo 77");
                    break;
                default:
                    System.out.printf("Es el grupo: %d", numero);
            }
        }

        band = false;
        do {

            if (cont == 5)
            {
                band = false;
            }
            
            cont += 1;

            System.out.printf("\nIngrese un numero: ");
            int numero = input.nextInt();
            switch (numero)
            {
                case 47:
                    System.out.print("Estamos en el grupo 47.");
                    break;
                case 77:
                    System.out.print("Estamos en el grupo 77.");
                    break;
                case 17:
                    System.out.print("Estamos en el grupo 17.");
                    break;
                default:
                    System.out.printf("Estamos en el grupo %d", numero);
                    break;
            }
        } while (band);

        input.close();
    }
}
