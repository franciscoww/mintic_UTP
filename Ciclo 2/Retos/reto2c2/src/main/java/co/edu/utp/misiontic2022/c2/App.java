package co.edu.utp.misiontic2022.c2;

public class App {

    // Inicio de la solución
public class PrecioTotal {
    // Atributos
    Double totalCafe;
    Double totalCafeNacional;
    Double totalCafeExportacion;
    Cafe[] listaCafe;

    // Constructor
    PrecioTotal(Cafe[] pElectrodomesticos) {
    // Código
    }
    public void mostrarTotales() {
    // Código
    
    // Mostramos los resultados
    System.out.println("La suma del precio del café es de " + totalCafe);
    System.out.println("La suma del precio del café tipo nacional es de " + totalCafeNacional);
    System.out.print("La suma del precio del café tipo exportación es de " + totalCafeExportacion);
    }
}


public class Cafe {
    // Constantes y Atributos
    private Integer PESO_BASE = 5;
    private Character CALIDAD_C_BASE = 'F';
    private Double PRECIO_BASE = 100.0;
    private Double precioBase;
    private Integer peso;
    private char calidadC;

    // Constructores
    public Cafe() {
        this.precioBase = PRECIO_BASE;
        this.peso = PESO_BASE;
        this.calidadC = CALIDAD_C_BASE;
    }

    public Cafe(Double precioBase, Integer peso) {
        this.peso = peso;
        this.precioBase = precioBase;
    }

    public Cafe(Double precioBase, Integer peso, char calidadC) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.calidadC = calidadC;
        comprobarCalidadC(calidadC);
    }

    // Metodos
    public void comprobarCalidadC(char calidadC) {
        if (calidadC == 'A') {
            this.calidadC = calidadC;
        } else {
            this.calidadC = CALIDAD_C_BASE;
        }
    }

    public Double calcularPrecio() {
        // Código
        Double adicion = 0.0;
        return precioBase + adicion;
    }
}

public class CafeNacional extends Cafe {
    // Constantes y Atributos
    private Boolean TOSTADO = false;
    private boolean tostado;

    // Constructor
    public CafeNacional() {
        // Código
    }

    public CafeNacional(Double precioBase, Integer peso) {
        // Código
    }

    public CafeNacional(Double precioBase, Integer peso, char calidadC, boolean tostado) {
        // Código
    }

    // Métodos
    public Double calcularPrecio() {
        // Código
    }
}

public class CafeExportacion extends Cafe {
    // Constantes y Atributos
    private Integer CIF_BASE = 20;
    private Integer cif;
    private boolean verde = false;

    // Constructor
    public CafeExportacion() {
        // Código
    }

    public CafeExportacion(Double precioBase, Integer peso) {
        // Código
    }

    public CafeExportacion(Double precioBase, Integer peso, char calidadC, Integer cif, boolean verde) {
        // Código
    }

    // Métodos
    public Double calcularPrecio() {
        // Código
    }
}
// Fin de la solución

// Esta clase es para las pruebas, no se debe subir como parte de la solución

    public static void main(String[] args) {
        // Prueba 1
        Cafe cafe[] = new Cafe[5];
        cafe[0] = new Cafe(250.0, 50, 'D');
        cafe[1] = new CafeNacional(180.0, 30);
        cafe[2] = new CafeExportacion(550.0, 80, 'B', 42, false);
        cafe[3] = new Cafe();
        cafe[4] = new Cafe(550.0, 20, 'D');
        PrecioTotal solucion1 = new PrecioTotal(cafe);
        solucion1.mostrarTotales();
    }


}
