package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class SwitchEj 
{
    public static void main( String[] args )
    {
        System.out.print( "Ingrese un numero: " );
        Scanner inp = new Scanner(System.in);

        int numero = inp.nextInt();

        switch (numero)
        {
            case 47:
            System.out.println("Estamos en el mejor grupo");
            break;
            case 77:
            System.out.println("Grupo 77");
            break;
            default:
            System.out.printf("Es el grupo: %d", numero);
        }

        
        inp.close();
    }
}
