package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

// Programa que lea la longitud de los catetos de un triángulo rectángulo y
// calcule la longitud de la hipotenusa según el teorema de Pitágoras.

public class Pitagoras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite el primer Cateto: ");
        double pCateto = input.nextDouble();
        System.out.print("Digite el segundo Cateto: ");
        double sCateto = input.nextDouble();

        double hipote = (pCateto * pCateto) + (sCateto * sCateto);
        double hipotenusa = Math.sqrt(hipote);

        System.out.println("Hipotenusa :"+ hipotenusa);

        input.close();
    }
    
}
