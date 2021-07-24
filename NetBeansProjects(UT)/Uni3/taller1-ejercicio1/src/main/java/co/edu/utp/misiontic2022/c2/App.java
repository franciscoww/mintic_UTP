package co.edu.utp.misiontic2022.c2;


// Realice un programa que cree dos clases:
// En la primera defina el método main(), en el cual debe crear
//  un arreglo de tipo String con n posiciones, e inicializarlo.

// En la segunda clase (OperacionesArreglo()), defina un 
// método estático llamado suma(), el cual debe recibir 
// como parámetro un arreglo de tipo String; este método
//  debe convertir a entero cada una de las posiciones 
//  del arreglo que ha recibido como parámetro y devolver
//   la sumatoria en el caso que no se haya presentado alguna 
//   excepcion.

// En el caso que cualquiera de los valores que intente convertir a 
// numérico, presente una inconsistencia, deberá manejar la misma a 
// través de la excepción (NumberFormatException)

// Desde el método main(), llame el método estático suma()
//  de la clase OperacionesArreglo(), y envíele como 
//  parámetro el arreglo que ha definido y muestre la sumatoria
//   del mismo.

public class App {
    public static void main(String[] args) {
        String arreglo[] = new String[5];
        OperacionesArreglo aux = new OperacionesArreglo();

        arreglo[0] = "8";
        arreglo[1] = "10";
        arreglo[2] = "45";
        arreglo[3] = "4";
        arreglo[4] = "2";

        System.out.println(aux.suma(arreglo));
    }
}
