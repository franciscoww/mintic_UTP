package co.edu.utp.misiontic2022.c2;

public class CafeNacional extends Cafe {
    // Constantes y Atributos
    private static final Boolean TOSTADO = false;
    private Boolean tostado;

    // Constructor
    public CafeNacional() {
        super();
        this.tostado = TOSTADO;
    }

    public CafeNacional(Double precioBase, Integer peso) {
        super(precioBase, peso);
        this.tostado = TOSTADO;
    }

    public CafeNacional(Double precioBase, Integer peso, char calidadC, boolean tostado) {
        super(precioBase, peso, calidadC);
        this.tostado = tostado;
    }

    // Métodos


    public Double calcularPrecio() {
        // Código
        Double addCalidad = adicionCalidadC(getCalidadC());
        Double addPeso = adicionPeso(getPeso());
        Double adicionTostado = 0.0;
        if (this.tostado == true) {
            adicionTostado += 50;
        }
        return addCalidad + addPeso + adicionTostado + getPrecioBase();
    }
}