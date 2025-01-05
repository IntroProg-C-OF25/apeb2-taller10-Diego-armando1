/***
 * Ejercicio 1
 * Dada una matriz cuadrada (m X m) de valores enteros aleatorios, desarrollar su procesamiento para presentar los elementos:
 * De la diagonal principal.
 * De la diagonal segundaria.
 * Ubicados bajo la diagonal principal.
 * Ubicados sobre la diagonal principal.
 * Ubicados bajo la diagonal secundaria.
 * Ubicados sobre la diagonal secundaria.
 * @author Diego Guaman
 */
import java.util.Scanner;
public class ejercicio1_DiagonalMatriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamañoMatriz = 0;
        System.out.print("Deme el tamaño de la matriz: ");
        tamañoMatriz = teclado.nextInt();
        int matriz[][] = new int[tamañoMatriz][tamañoMatriz];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("\nDiagonal principal");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + "\t");
        }
        System.out.println("\nDiagonal secundaria");
        for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][matriz.length - 1 - i] + "\t");
        }
        System.out.println("\nElementos bajo la diagonal principal");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println("\nElementos encima de la diagonal principal");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i + 1; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println("\nElementos por debajo de la diagonal secundaria");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i + j > matriz.length - 1)
                    System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println("\nElementos por encima de la diagonal secundaria");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i + j < matriz.length - 1)
                    System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println("");
    }
}
/***
 * Deme el tama�o de la matriz: 3
 * 4	6	8	
 * 6	8	0	
 * 9	8	1	
 *
 * Diagonal principal
 * 4	8	1	
 * Diagonal secundaria
 * 8	8	9	
 * Elementos bajo la diagonal principal
 * 6	9	8	
 * Elementos encima de la diagonal principal
 * 6	8	0	
 * Elementos por debajo de la diagonal secundaria
 * 0	8	1	
 * Elementos por encima de la diagonal secundaria
 * 4	6	6	
 */