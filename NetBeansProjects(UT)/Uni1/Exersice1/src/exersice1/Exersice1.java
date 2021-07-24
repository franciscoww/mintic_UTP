
package exersice1;

public class Exersice1 {

    public static void main(String[] args) {

int resultado1,resultado2;

        try {
            int arr1[] =new int [2];
                    arr1[0]=50;
                    arr1[1]=10;


             int arr2[] =new int [2];
                    arr2[0]=10;
                    arr2[1]=0;


                    resultado1=(arr1[0]/arr2[0] );
                    System.out.println ("resultado:"+ resultado1);
                    resultado2=(arr1[1]/arr2[1] );
                    System.out.println ("resultado:"+ resultado2);
        }
        catch (ArithmeticException exc) {
           System.out.println ("Recuerda que no puede dividir por cero");
        }
}
}
