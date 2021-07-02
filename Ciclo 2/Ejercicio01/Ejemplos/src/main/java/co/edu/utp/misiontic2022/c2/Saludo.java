package co.edu.utp.misiontic2022.c2;

public class Saludo {
    public static void main(String[] args) {
        var nombre = "Francisco Sanchez";
        var resultado = saludo(nombre);

        System.out.println(resultado);
    }
    public static String saludo(String nombre) {
        return "Hola " + nombre + "!!";
        
    }
}
