package co.edu.utp.misiontic2022.c2;

// Programa que lea un número entero y muestre si el número es
// múltiplo de 10.

import java.util.Scanner;

public class MultiploDiez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite un numero");
        int numero = input.nextInt();

        if (numero%10==0){
            System.out.println("Es multiplo de 10");
        }
        else{
            System.out.println("No es multiplo de 10");
        }

        
        input.close();
    }
    
}
