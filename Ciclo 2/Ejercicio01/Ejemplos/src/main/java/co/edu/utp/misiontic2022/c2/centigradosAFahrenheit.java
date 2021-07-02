package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class centigradosAFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite los grados centigrados a convertir: ");
        var gCentigrados = input.nextInt();

        var fahrenheit = 32 + (9 * gCentigrados / 5);
        System.out.printf("%d grados centigrados, equivalen a %d grados Fahreinheit\n", gCentigrados, fahrenheit);

        input.close();
    }
    
}
