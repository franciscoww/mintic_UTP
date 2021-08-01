package co.edu.utp.misiontic2022.c2;

public class CafeExportacion extends Cafe {
    // Constantes y Atributos
    private static final Integer CIF_BASE = 20;
    private static final Boolean VERDE_BASE = false;
    private Integer cif;
    private Boolean verde;

    // Constructor
    public CafeExportacion() {
        super();
        this.cif = CIF_BASE;
        this.verde = VERDE_BASE;
    }

    public CafeExportacion(Double precioBase, Integer peso) {
        super(precioBase, peso);
        this.cif = CIF_BASE;
        this.verde = VERDE_BASE;
    }

    public CafeExportacion(Double precioBase, Integer peso, char calidadC, Integer cif, boolean verde) {
        super(precioBase, peso, calidadC);
        this.cif = cif;
        this.verde = verde;
    }

    // Métodos
    public Double calcularPrecio() {
        // Código
        Double adicionCif = 0.0;
        Integer addVerde = 0;
        if (this.cif > 40) {
            adicionCif = getPrecioBase() * 0.3;
        }
        if (this.verde == true) {
            addVerde += 50;
        }
        Double addCalidad = adicionCalidadC(getCalidadC());
        Double addPeso = adicionPeso(getPeso());

        return addCalidad + addPeso + addVerde + adicionCif + getPrecioBase();
    }
}