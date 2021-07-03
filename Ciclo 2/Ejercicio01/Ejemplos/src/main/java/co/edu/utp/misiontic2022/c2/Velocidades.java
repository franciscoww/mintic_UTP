package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

// Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por
// teclado.

public class Velocidades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite la velocidad a convertir: ");
        float velok = input.nextFloat();

        float resultado = velok * 1000 / 3600;

        System.out.printf("La velocidad es %f m/s\n", resultado);

        input.close();
        
    }
    
}
