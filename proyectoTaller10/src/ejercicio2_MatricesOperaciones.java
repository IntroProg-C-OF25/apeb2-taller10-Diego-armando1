/** *
 * Ejercicio 2
 * Dadas dos matrices _(cuadradas y/o rectangulares)_ de valores enteros aleatorios, desarrollar su procesamiento para calcular y presentar:
 * La suma de las dos matrices _(considerar las restricciones matemáticas para ello)
 * La multiplicación de las dos matrices _(considerar las reglas matemáticas para ello)
 *
 * @author Diego Guaman
 */
import java.util.Scanner;
public class ejercicio2_MatricesOperaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int filas1, columnas1, filas2, columnas2;
            int matriz1[][] = null; 
            int matriz2[][] = null;
            int suma[][]= null;
            while (true) {
                System.out.print("Ingrese el numero de filas de la matriz 1: ");
                filas1 = teclado.nextInt();
                System.out.print("Ingrese el numero de columnas de la matriz 1: ");
                columnas1 = teclado.nextInt();
                matriz1 = new int[filas1][columnas1]; 
                System.out.print("Ingrese el numero de filas de la matriz 2: ");
                filas2 = teclado.nextInt();
                System.out.print("Ingrese el numero de columnas de la matriz 2: ");
                columnas2 = teclado.nextInt();
                matriz2 = new int[filas2][columnas2]; 
                
                if (filas1 != filas2 || columnas1 != columnas2) {
                    System.out.println("No se puede sumar o multiplicar. Las matrices deben tener las mismas dimensiones. Intente nuevamente.");
                } else {
                    suma = new int[filas1][columnas1];
                    break;
                }
            }
         System.out.println("Esta es la matriz 1");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matriz1[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz1[i][j] + "\t"); 
            }
            System.out.println(); 
        }
        System.out.println("\nEsta es la matriz 2");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                matriz2[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println("");
        }
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        System.out.println("\nLa suma es: ");
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[0].length; j++) {
                System.out.print(suma[i][j] + "\t");
            }
            System.out.println("");
        }
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                suma[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }
        System.out.println("\nLa multiplicacion es:");
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[0].length; j++) {
                System.out.print(suma[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
/***
 * run:
 * Ingrese el numero de filas de la matriz 1: 3
 * Ingrese el numero de columnas de la matriz 1: 4
 * Ingrese el numero de filas de la matriz 2: 3
 * Ingrese el numero de columnas de la matriz 2: 3
 * No se puede sumar o multiplicar. Las matrices deben tener las mismas dimensiones. Intente nuevamente.
 * Ingrese el numero de filas de la matriz 1: 3
 * Ingrese el numero de columnas de la matriz 1: 3
 * Ingrese el numero de filas de la matriz 2: 3
 * Ingrese el numero de columnas de la matriz 2: 3
 * Esta es la matriz 1
 * 2	4	8	
 * 3	4	3	
 * 3	4	7	
 *
 * Esta es la matriz 2
 * 0	0	1	
 * 3	9	2	
 * 5	1	8	
 * 
 * La suma es: 
 * 2	4	9	
 * 6	13	5	
 * 8	5	15	
 *
 * La multiplicacion es:
 * 0	0	8	
 * 9	36	6	
 * 15	4	56	
 */