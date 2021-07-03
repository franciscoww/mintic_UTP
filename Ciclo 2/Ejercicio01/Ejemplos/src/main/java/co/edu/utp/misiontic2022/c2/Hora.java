package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

// Programa que lea por teclado tres números enteros H, M, S
// correspondientes a hora, minutos y segundos respectivamente, y
// comprueba si la hora que indican es una hora válida.

public class Hora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite la hora: ");
        int horas = sc.nextInt();
        System.out.print("Digite los minutos: ");
        int minutos = sc.nextInt();
        System.out.print("Digite los segundos: ");
        int segundos = sc.nextInt();

        if (horas>=0 && horas<24 && minutos >=0 && minutos <60 && segundos >= 0 && segundos < 60){
            System.out.printf("Son las %d:%d:%d \n", horas, minutos, segundos);
        }
        else{
            System.out.println("Hora incorrecta >:(");
        }
        
        sc.close();
    }
    
}
