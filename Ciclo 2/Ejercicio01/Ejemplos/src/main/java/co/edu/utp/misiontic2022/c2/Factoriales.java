package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class Factoriales {
    public static void main(String[] args) {
        int numero;
        double factorial, suma = 0;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Ingresa un numero entero: ");
            numero = sc.nextInt();
        }while(numero < 0);
        sc.close();

        for (int i = 0; i <= numero; i++){
            factorial = 1;
            for (int j = 1; j <= i; j++){
                factorial *= j;
            }
        
            System.out.printf("%n%2d! = %.0f %n", i, factorial);
            suma += factorial;
        }
        System.out.printf("Suma de los factoriales desde 0 hasta %d: %.0f%n", numero, suma);
    }
    
}
