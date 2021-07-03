package co.edu.utp.misiontic2022.c2;

public class AbecedarioInverso {
    public static void main(String[] args) {
        for (char x = 'Z'; x >= 'A'; x--){
            for (char y = x; y >= 'A'; y--){
                System.out.print(y);
            }
        System.out.println();
        }
    }
    
}
