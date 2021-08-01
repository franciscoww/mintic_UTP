package co.edu.utp.misiontic2022.c2;

public class Cafe {
    // Constantes y Atributos
    private static final Integer PESO_BASE = 5;
    private static final Character CALIDAD_C_BASE = 'F';
    private static final Double PRECIO_BASE = 100.0;
    protected Double precioBase;
    protected Integer peso;
    protected Character calidadC;

    // Constructores
    public Cafe() {
        this.precioBase = PRECIO_BASE;
        this.peso = PESO_BASE;
        this.calidadC = CALIDAD_C_BASE;
    }

    public Cafe(Double precioBase, Integer peso) {
        this.peso = peso;
        this.precioBase = precioBase;
        this.calidadC = CALIDAD_C_BASE;
    }

    public Cafe(Double precioBase, Integer peso, char calidadC) {
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarCalidadC(calidadC);
    }

    // Metodos
    public void comprobarCalidadC(char calidadC) {
        if (calidadC != 'F') {
            this.calidadC = calidadC;
        } else {
            this.calidadC = CALIDAD_C_BASE;
        }
    }

    public Double adicionCalidadC(char calidadC) {
        Double adicionxCalidad = 0.0;
        if (calidadC == 'A') {
            adicionxCalidad += 10;
        } else if (calidadC == 'B') {
            adicionxCalidad += 8;
        } else if (calidadC == 'C') {
            adicionxCalidad += 6;
        } else if (calidadC == 'D') {
            adicionxCalidad += 5;
        } else if (calidadC == 'E') {
            adicionxCalidad += 3;
        } else {
            adicionxCalidad += 1;
        }
        return adicionxCalidad;
    }

    public Double adicionPeso(Integer peso) {
        Double adicionxPeso = 0.0;
        if (peso >= 0 && peso < 19) {
            adicionxPeso += 10;
        } else if (peso > 19 && peso < 49) {
            adicionxPeso += 50;
        } else if (peso > 49 && peso < 80) {
            adicionxPeso += 80;
        } else if (peso > 79) {
            adicionxPeso += 100;
        }
        return adicionxPeso;
    }

    public Double calcularPrecio() {
        // Código

        Double addCalidad = adicionCalidadC(calidadC);
        Double addPeso = adicionPeso(peso);

        return addCalidad + addPeso + precioBase;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public Integer getPeso() {
        return peso;
    }

    public Character getCalidadC() {
        return calidadC;
    }
}