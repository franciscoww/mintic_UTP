
package exceptionej3;

/**
 * @author Francisco
 */
public class GenException {
        static void generaException() {
        int numeros[] = new int[10];
        System.out.println ("ESTAMOS DENTRO DEL METODOD generaException()");
        numeros[11] = 100;
        System.out.println ("Esta instruccion no es ejecutada");
    }
    }


 class ExceptionEj3 {

    public static void main(String[] args) {
        // TODO code application logic here

        try {
            GenException.generaException();
            System.out.println ("Instruccion despues de llamar el método generaException()");
            }
            catch(ArrayIndexOutOfBoundsException exObj) {
                System.out.println ("Ha intentado asignar un valor fuera de los límites del arrreglo");
}
}
    }
    