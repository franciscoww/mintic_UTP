package co.edu.utp.misiontic2022.c2;

public class Cafe {
    // Constantes y Atributos
    private static final Integer PESO_BASE = 5;
    private static final Character CALIDAD_C_BASE = 'F';
    private static final Double PRECIO_BASE = 100.0;
    private Double precioBase;
    private Integer peso;
    private Character calidadC;

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
        if (calidadC < 'F' && calidadC >= 'A') {
            this.calidadC = calidadC;
        } else {
            this.calidadC = CALIDAD_C_BASE;
        }
    }

    public Double adicionCalidadC() {
        Double adicionxCalidad = 0.0;
        if (this.calidadC == 'A') {
            adicionxCalidad += 10;
        } else if (this.calidadC == 'B') {
            adicionxCalidad += 8;
        } else if (this.calidadC == 'C') {
            adicionxCalidad += 6;
        } else if (this.calidadC == 'D') {
            adicionxCalidad += 5;
        } else if (this.calidadC == 'E') {
            adicionxCalidad += 3;
        } else {
            adicionxCalidad += 1;
        }
        return adicionxCalidad;
    }

    public Double adicionPeso() {
        Double adicionxPeso = 0.0;
        if (this.peso >= 0 && this.peso < 19) {
            adicionxPeso += 10;
        } else if (this.peso > 19 && this.peso < 49) {
            adicionxPeso += 50;
        } else if (this.peso > 49 && this.peso < 80) {
            adicionxPeso += 80;
        } else if (this.peso > 79) {
            adicionxPeso += 100;
        }
        return adicionxPeso;
    }

    public Double calcularPrecio() {
        // Código
        CafeNacional cafeNacional = new CafeNacional();
        CafeExportacion cafeExportacion = new CafeExportacion();

        Double additionalparam = adicionCalidadC() + adicionPeso();
        double pbaseCafe = getPrecioBase();
        double cnac = cafeNacional.calcularPrecio();
        double cexp = cafeExportacion.calcularPrecio();

        double totalCafe = additionalparam + cnac + cexp;
        return totalCafe;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

}