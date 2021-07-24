
package ejemplo1;

public class Persona {
    
    String codigo;
    String nombre;
    double peso;
    double altura;
    String direccion;
    String telefono;
    
    double indiceMasaCorporal(){
        return peso/(altura*altura);
    }
    
}
