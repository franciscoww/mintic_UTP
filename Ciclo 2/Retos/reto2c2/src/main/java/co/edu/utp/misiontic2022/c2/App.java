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
        PrecioTotal(Cafe[] plistaCafe) {
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

        public void adicionCalidadC() {
            if (this.calidadC == 'A') {
                setPrecioBase(getPrecioBase()+ 10);
            } else if (this.calidadC == 'B') {
                setPrecioBase(getPrecioBase()+ 8);
            } else if (this.calidadC == 'C') {
                setPrecioBase(getPrecioBase()+ 6);
            } else if (this.calidadC == 'D') {
                setPrecioBase(getPrecioBase()+ 5);
            } else if (this.calidadC == 'E') {
                setPrecioBase(getPrecioBase()+ 3);
            } else {
                setPrecioBase(getPrecioBase()+ 1);
            }
        }

        public void adicionPeso() {
            if (this.peso >= 0 && this.peso < 19) {
                setPrecioBase(getPrecioBase()+ 10);
            } else if (this.peso > 19 && this.peso < 49) {
                setPrecioBase(getPrecioBase()+ 50);
            } else if (this.peso > 49 && this.peso < 80) {
                setPrecioBase(getPrecioBase()+ 80);
            } else if (this.peso > 79) {
                setPrecioBase(getPrecioBase()+ 100);
            }
        }

        public Double calcularPrecio() {
            // Código
            double totalCafe = getPrecioBase();
            double totalCafeNacional ;
        }

        public Double getPrecioBase() {
            return precioBase;
        }

        public void setPrecioBase(Double precioBase) {
            this.precioBase = precioBase;
        }

        public Integer getPeso() {
            return peso;
        }

        public void setPeso(Integer peso) {
            this.peso = peso;
        }

        public char getCalidadC() {
            return calidadC;
        }

        public void setCalidadC(char calidadC) {
            this.calidadC = calidadC;
        }

    }

    public class CafeNacional extends Cafe {
        // Constantes y Atributos
        private Boolean TOSTADO = false;
        private boolean tostado;

        // Constructor
        public CafeNacional() {
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
            double totalCafeNacional = getPrecioBase();
            if (this.tostado == true) {
                setPrecioBase(totalCafeNacional + 50.0);
            }
            return totalCafeNacional;
        }
    }

    public class CafeExportacion extends Cafe {
        // Constantes y Atributos
        private Integer CIF_BASE = 20;
        private Boolean VERDE_BASE = false;
        private Integer cif;
        private boolean verde;

        // Constructor
        public CafeExportacion() {
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
            double totalCafeExportacion = getPrecioBase();
            if (this.cif > 40) {
                setPrecioBase(totalCafeExportacion * 1.3);
            }
            if (this.verde) {
                setPrecioBase(totalCafeExportacion + 50);
            }
            return totalCafeExportacion;
        }
    }
    // Fin de la solución

    // Esta clase es para las pruebas, no se debe subir como parte de la solución
    // public class App {
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
