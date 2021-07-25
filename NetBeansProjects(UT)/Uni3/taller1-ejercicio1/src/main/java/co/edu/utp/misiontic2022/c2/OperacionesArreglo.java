package co.edu.utp.misiontic2022.c2;




public class OperacionesArreglo {


    public static Integer suma(String[] arreglo){
        Integer[] arreglo2 = new Integer[arreglo.length]; 
        int result = 0;
        
        try {
            for(int i = 0; i < arreglo.length;i++){
                arreglo2[i] =Integer.parseInt(arreglo [i]);
            
            }
            for (Integer aux : arreglo2) {
                result += aux;
            }

        } catch (NumberFormatException e) {
            //TODO: handle exception
            System.out.println("Opción invalida");
        }
        

        return result;
            
    }
}
