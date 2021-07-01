package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Condicionales 
{
    public static void main( String[] args )
    {
        System.out.print( "Ingrese un numero: " );
        Scanner input  = new Scanner(System.in);

        int numero = input.nextInt();
        
        if (numero == 47)
        {
            System.out.println("Estamos en el mejor grupo, es decir, el grupo 47.");
        } else if (numero == 77)
        {
            System.out.print("Es el grupo 77.");
        } else if (numero == 17)
        {
            System.out.print("Es el grupo 17.");
        } else
        {
            System.out.printf("Estamos en el grupo %d", numero);
        }

        input.close();

    }
}
