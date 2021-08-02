package co.edu.utp.misiontic2022.c2;

public class Cafe {
    // Constantes y Atributos
    static final Integer PESO_BASE = 5;
    static final Character CALIDAD_C_BASE = 'F';
    static final Double PRECIO_BASE = 100.0;
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
        this.precioBase = precioBase;
        this.peso = peso;
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


    public Double calcularPrecio() {
        // Código
        Double precioc = precioBase;
        precioc += adicionCalidadC(calidadC);
        precioc += adicionPeso(peso);

        return precioc;
    }


    public Double adicionCalidadC(char calidadC) {
        Double adicionxCalidad ;
        if (calidadC == 'A') {
            adicionxCalidad = 10.0;
        } else if (calidadC == 'B') {
            adicionxCalidad = 8.0;
        } else if (calidadC == 'C') {
            adicionxCalidad = 6.0;
        } else if (calidadC == 'D') {
            adicionxCalidad = 5.0;
        } else if (calidadC == 'E') {
            adicionxCalidad = 3.0;
        } else {
            adicionxCalidad = 1.0;
        }
        return adicionxCalidad;
    }

    public Double adicionPeso(Integer peso) {
        Double adicionxPeso = 0.0;
        if (peso >= 0 && peso <= 19) {
            adicionxPeso = 10.0;
        } else if (peso > 19 && peso < 49) {
            adicionxPeso = 50.0;
        } else if (peso > 49 && peso < 80) {
            adicionxPeso = 80.0;
        } else if (peso > 79) {
            adicionxPeso = 100.0;
        }
        return adicionxPeso;
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