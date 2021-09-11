import java.util.InputMismatchException;
import java.util.Scanner;

// programa que genere un numero entre 1 y 10, el
// programa debe solicitarle al usuario predecir el número.
// Cada vez que el usuario introduce un valor, el programa debe
// decirle al usuario si el número que tiene que acertar es mayor o
// menor que el que ha introducido. Cuando consiga adivinarlo, debe
// indicárselo e imprimir en pantalla el número de veces que el usuario
// ha intentado adivinar el número. Si el usuario introduce algo que
// no es un número, se genera una excepción
// InputMismatchException que debe gestionarse e indicarlo en
// pantalla, y contarlo como un intento.

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int numAzar;
        int valor = 11;
        Integer i = 1;

        numAzar = (int) (Math.random() * 11 + 1);

        do {
            try {
                System.out.print("Adivine el numero de 1 a 10: ");
                valor = input.nextInt();
                if (valor == numAzar) {
                    System.out.println("Lo adivinaste, tuviste " + i + " intentos.");
                } else {
                    System.out.println("Intento fallido intenta nuevamente");
                    if (valor < numAzar) {
                        System.out.println("El numero debe ser mayor");
                    } else {
                        System.out.println("El numero debe ser menor");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Fallido por excepción intenta nuevamente.");
                input.next();
            }
            i++;
        } while (valor != numAzar);
        input.close();
    }
}
