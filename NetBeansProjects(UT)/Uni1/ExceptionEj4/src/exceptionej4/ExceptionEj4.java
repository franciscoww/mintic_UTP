
package exceptionej4;

import javax.swing.JOptionPane;

/**
 * @author Francisco
 */
public class ExceptionEj4 {

    public static void main(String[] args) {
        // TODO code application logic here
        int numeros1[] = {100,50,81,20,0,64};
        int numeros2[] = {10,0,9,10};
    int result;
    for(int i = 0; i < numeros1.length; i++) {
    try {
    result = numeros1[i]/numeros2[i];
    JOptionPane.showMessageDialog(null,result);
        }
        catch(ArithmeticException exObj) {
    JOptionPane.showMessageDialog(null,"No se puede dividir por cero");
        }
        catch(ArrayIndexOutOfBoundsException exObj) {
    JOptionPane.showMessageDialog(null,"No se encuentra elememto coincidente");
    }
    }
  }
}
