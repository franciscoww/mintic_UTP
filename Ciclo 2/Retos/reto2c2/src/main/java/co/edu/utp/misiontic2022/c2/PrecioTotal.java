package co.edu.utp.misiontic2022.c2;

public class PrecioTotal {
    Double totalCafe = 0.0;
    Double totalCafeNacional = 0.0;
    Double totalCafeExportacion = 0.0;
    Cafe[] listaCafe;

    // Constructor
    PrecioTotal(Cafe[] plistaCafe) {
        this.listaCafe = plistaCafe;
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
    }

    public void mostrarTotales() {
        // Código

        // Mostramos los resultados
        System.out.println("La suma del precio del café es de " + totalCafe);
        System.out.println("La suma del precio del café tipo nacional es de " + totalCafeNacional);
        System.out.print("La suma del precio del café tipo exportación es de " + totalCafeExportacion);
    }
}
