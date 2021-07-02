package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class Ndigitos {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        var numero =input.nextInt();

        var nDigitos = numeroDigitos(numero);
        System.out.println("El numero "+numero+", tiene "+nDigitos+" cifras.");

        input.close();
    }
    public static int numeroDigitos(int numero) {
        var cifras = numero == 0 ? 1 : 0;

        while (numero != 0){
            numero /= 10;
            cifras++;
        }
        return cifras;
        
    }
    
}
