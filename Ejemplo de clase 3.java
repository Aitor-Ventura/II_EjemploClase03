import java.util.Scanner;
public class Excercise {
    public static void main (String [] Args) {
        Scanner input = new Scanner(System.in);

        // Se lee un array bidimensional de elementos de tipo int
        int[][] mat = Internal.loadIntArray2D(input);
        // array que almacena el número de valores pares en cada fila de mat
        int [] valores = new int[mat.length];
        
        // Se llama al método pares para cada fila de mat
        for (int i = 0; i < valores.length; i++) {
            valores[i] = pares(mat[i]);
        }

        // Se muestra el número de valores pares de cada fila de mat
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }

    public static int pares(int[] valores) {
        //-->> Poner aquí su código <<--//
        int c = 0;
        for (int i = 0; i < valores.length; i++){
            if (valores[i] % 2 == 0){
                c++;
            }
        }
        return c;
    }    
}