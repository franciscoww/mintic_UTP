package co.edu.utp.misiontic2022.c2;

import java.util.LinkedList;

public class Ejercicio_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> cola = new LinkedList<>();
                
        cola.add("Reanult");
        cola.add("Audi");
        cola.add("BMW");
        cola.add("Toyota");
        cola.add("Nissan");
        
        System.out.println("Colas completas: \n\t"+ cola);
        cola.remove(cola.peek());
        cola.remove(cola.getLast());
        System.out.println("Cola sin primera y ultima marca: \n\t"+ cola);
        
    }
}
