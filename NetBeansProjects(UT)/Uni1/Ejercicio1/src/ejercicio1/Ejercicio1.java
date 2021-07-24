/*Desarrolle un programa que defina dos arreglos de enteros 
*y divide cada una de las posiciones del primero por la respectiva posición del segundo. 
*En el caso que se intente realizar una división por cero, se lanzará una excepción desde el 
*bloque try, la cual será atrapada por el catch de la respectiva excepción (ArithmeticException). 
*/
package ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int pnumb;
       int snumb;
       int result;
       
        try{
            System.out.println("Ingrese un numero: ");
            pnumb=entrada.nextInt();
            System.out.println("Ingrese otro numero: ");
            snumb=entrada.nextInt();
            result = pnumb/snumb;
            System.out.println("Resultado: "+result);
       }
       
            catch(ArithmeticException exObj) {
    
             System.out.println ("No es posible dividir por cero");
       }
        
    }
    
}
