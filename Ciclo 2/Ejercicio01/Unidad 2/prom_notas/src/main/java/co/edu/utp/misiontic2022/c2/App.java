package co.edu.utp.misiontic2022.c2;

public class App 
{
    public static void main( String[] args )
    {
        Asignatura asignatura = new Asignatura("Prueba", 78, 88, 54, 78, 98);
        asignatura.mostrarAsignatura();

        System.out.println(asignatura);
    }
}
