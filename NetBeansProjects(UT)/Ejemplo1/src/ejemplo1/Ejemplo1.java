
package ejemplo1;

public class Ejemplo1 {

    public static void main(String[] args) {
        Persona person =new Persona();
        
        person.codigo ="084800602021";
        person.nombre="Alvaro Jimenez";
        person.direccion="Mz B Casa 1";
        person.telefono="3163455678";
        person.peso=70;
        person.altura=1.82;
        
        System.out.println("Nombre: " +person.nombre);
        System.out.println("Su IMC es: " + person.indiceMasaCorporal());
        
    }
    
}
