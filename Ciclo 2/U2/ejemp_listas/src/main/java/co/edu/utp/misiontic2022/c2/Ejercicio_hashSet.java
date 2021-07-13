package co.edu.utp.misiontic2022.c2;

import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio_hashSet {
    public static void main(String[] args) {
        HashSet<Integer> numerosIn = new HashSet<Integer>();
        Scanner input = new Scanner(System.in);
        int num;
        
        do {
            System.out.print("Digite un numero: ");
            num = input.nextInt();
            numerosIn.add(num);
            
        } while (numerosIn.size() < 10);
        input.close();
    }
}
