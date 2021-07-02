package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;


public class MayusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un solo caracter: ");
        char caracter = sc.nextLine().charAt(0);

        if (Character.isUpperCase(caracter)){
            System.out.println("Es mayuscula.");
        }
        else{
            System.out.println("Es minuscula.");
        }

        sc.close();
    }
    
}
