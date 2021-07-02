package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

// Escribe un programa Java que lee un número entero por teclado y obtiene y
// muestra por pantalla el doble y el triple de ese número.

public class dobleytriple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite un número entero: ");
        var numero = input.nextInt();
        
        var doble = numero * 2;
        var triple = numero * 3;

        System.out.printf("El doble de %d es %d, y el triple es %d \n", numero, doble, triple);
        input.close();
    }
    
}
