package ejemplotutoria2;

import java.util.ArrayList;
import java.util.Scanner;

public class EjemploArray {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int num;
        
        do {            
            System.out.println("Introduzca numeros enteros y cero (0) para terminar");
            System.out.print("Numero: ");
            num = sc.nextInt();
            
            if (num != 0) 
                numeros.add(num);
            
            System.out.println("Ha introducido: " + numeros.size() + " numeros.");
            
        } while (num != 0);
        
    }
    
}
