package ejemplotutoria2;

import java.util.HashSet;

public class EjemploTutoria2 {

    public static void main(String[] args) {
        HashSet<String> colores = new HashSet<String>();
        
        colores.add("Naranja");
        colores.add("Verde");
        colores.add("Azul");
        colores.add("Rojo");
        colores.add("Naranja");
        colores.add(null);
        
        System.out.println(colores);
        
    }
    
}
