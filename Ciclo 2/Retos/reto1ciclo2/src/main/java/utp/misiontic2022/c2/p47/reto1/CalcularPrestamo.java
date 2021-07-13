package utp.misiontic2022.c2.p47.reto1;

public class CalcularPrestamo {
    
    //Atributos
    private double capital;
    private double intereses;
    private int time;
    private double intSimple;
    private double intComp;
    double comPrestamo;


    //constructor
    public CalcularPrestamo() {
    }

    public CalcularPrestamo( int time, double capital, double intereses) {
        this.capital = capital;
        this.intereses = intereses;
        this.time = time;
    }

    //method
    public double calcularInteresSimple() {
        intSimple = capital * (intereses/100) * time;
        return intSimple;
    }

    public double calcularInteresCompuesto() {
        intComp = capital * (Math.pow((1+ intereses/100), time)-1);
        return Math.round(intComp);
    }

    public double compararPrestamo(int pTime, double pMonto, double pInteres) {
        this.time = pTime;
        this.intereses = pInteres;
        this.capital = pMonto;

        calcularInteresSimple();
        calcularInteresCompuesto();

        comPrestamo = intComp - intSimple;

        return Math.round(comPrestamo);
    }

    public double compararPrestamo(){
        comPrestamo = intComp - intSimple;
        return Math.round(comPrestamo);
    }



    public static void main(String[] args) {
        CalcularPrestamo resultadoInversion = new CalcularPrestamo();
        
        // System.out.println(resultadoInversion.calcularInteresSimple());
        // System.out.println(resultadoInversion.calcularInteresCompuesto());
        // System.out.println(resultadoInversion.compararPrestamo(24,5000000.0,4.2));

        CalcularPrestamo resultadoInversion2 = new CalcularPrestamo(24,5000000.0,4.2);
        System.out.println(resultadoInversion2.calcularInteresSimple());
        System.out.println(resultadoInversion2.calcularInteresCompuesto());
        System.out.println(resultadoInversion2.compararPrestamo());
    }
}
