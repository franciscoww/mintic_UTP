
package exceptionej2;
/**
 * @author Francisco
 */
public class ExceptionEj2 {

    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = new int[10];
         try {
             arr[1] = 20;   
             arr[11] = 100;
            System.out.println ("Valor de arr[11]" + arr[11] + " no es mostrado");
            }
        catch(ArrayIndexOutOfBoundsException exObj) {
            System.out.println ("Ha intentado asignar un valor fuera de los límites del arreglo");
        } 
    }
    
}
