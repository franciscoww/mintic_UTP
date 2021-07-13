package co.edu.utp.misiontic2022.c2;

public class Vehiculo 
{
    //atributos
    private String marca;
    private String modelo;
    private Double precio;
    

    //constructor
    public Vehiculo(String marca, String modelo, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }


    public Double getPrecio() {
        return precio;
    }

    public String mostrarDatos() {
        return "Marca: " + marca+"\nModelo: " + modelo+"\nPrecio: " + precio+"\n";
    }
    
}
