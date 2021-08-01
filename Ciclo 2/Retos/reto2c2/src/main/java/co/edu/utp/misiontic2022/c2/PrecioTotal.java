package co.edu.utp.misiontic2022.c2;

public class PrecioTotal {
    // Atributos
    Double totalCafe;
    Double totalCafeNacional;
    Double totalCafeExportacion;
    Cafe[] listaCafe;

    // Constructor
    PrecioTotal(Cafe[] plistaCafe) {
        // Código
    }

    public void mostrarTotales() {
        // Código
        for (Cafe cafe : listaCafe) {

            if (cafe instanceof Cafe) {
                totalCafe = totalCafe + cafe.calcularPrecio();
            }
            if (cafe instanceof CafeNacional) {
                totalCafeNacional = totalCafeNacional + cafe.calcularPrecio();
            }
            if (cafe instanceof CafeExportacion) {
                totalCafeExportacion = totalCafeExportacion + cafe.calcularPrecio();
            }
        }
        // Mostramos los resultados
        System.out.println("La suma del precio del café es de " + totalCafe);
        System.out.println("La suma del precio del café tipo nacional es de " + totalCafeNacional);
        System.out.print("La suma del precio del café tipo exportación es de " + totalCafeExportacion);
    }
}
