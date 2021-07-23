
package prueba;

/**
 * @author Francisco
 */
public class Prueba {

    public static void main(String[] args) {
        int num1,num2,result;
    try {
        num1 = 100;
        num2 = 0;
        result = num1/num2;
        System.out.println (result);
        }
    
 catch(ArithmeticException exObj) {

    }
    System.out.println ("No es posible dividir por cero");
}
}
