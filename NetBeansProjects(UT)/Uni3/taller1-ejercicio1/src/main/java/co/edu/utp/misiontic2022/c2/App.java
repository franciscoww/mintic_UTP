package co.edu.utp.misiontic2022.c2;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String arreglo[] = new String[4];
        OperacionesArreglo aux = new OperacionesArreglo();

        arreglo[0] = "8";
        arreglo[1] = "2";
        arreglo[2] = "45";
        arreglo[3] = "4";

        System.out.println(aux.suma(arreglo));
    }
}
