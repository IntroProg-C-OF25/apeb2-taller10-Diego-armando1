/***
 * Crea un juego de tres en raya utilizando una matriz bidimensional 
 * de _**3x3**_. Permita a dos jugadores marcar sus movimientos alternativamente. 
 * El juego debe verificar si alguno de los jugadores ha ganado o si hay un empate.
 */
import java.util.Scanner;
public class ejercicio6_TresEnRaya {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char tablero[][] = new char[3][3];
        int fila, columna;
        boolean juegoEnCurso = true, ganador, empate;
        char jugadorActual = 'X';
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '-';
            }
        }
        while (juegoEnCurso) {
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Turno de jugador " + jugadorActual);
            System.out.print("Ingrese la fila (0-2): ");
            fila = teclado.nextInt();
            System.out.print("Ingrese la columna (0-2): ");
            columna = teclado.nextInt();
            if (fila >= 0 && fila < tablero.length && columna >= 0 && columna < tablero.length && tablero[fila][columna] == '-') {
                tablero[fila][columna] = jugadorActual;
                ganador = false;
                for (int i = 0; i < 3; i++) {
                    if (tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) {
                        ganador = true;
                        break;
                    }
                }
                for (int j = 0; j < 3; j++) {
                    if (tablero[0][j] == jugadorActual && tablero[1][j] == jugadorActual && tablero[2][j] == jugadorActual) {
                        ganador = true;
                        break;
                    }
                }
                if (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) {
                    ganador = true;
                }
                if (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual) {
                    ganador = true;
                }
                if (ganador) {
                    for (int i = 0; i < tablero.length; i++) {
                        for (int j = 0; j < tablero[i].length; j++) {
                            System.out.print(tablero[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("¡Jugador " + jugadorActual + " gana!");
                    juegoEnCurso = false;
                } else {
                    empate = true;
                    for (int i = 0; i < tablero.length; i++) {
                        for (int j = 0; j < tablero[i].length; j++) {
                            if (tablero[i][j] == '-') {
                                empate = false;
                                break;
                            }
                        }
                    }
                    if (empate) {
                        for (int i = 0; i < tablero.length; i++) {
                            for (int j = 0; j < tablero[i].length; j++) {
                                System.out.print(tablero[i][j] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println("¡Es un empate!");
                        juegoEnCurso = false;
                    } else {
                        jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
                    }
                }
            } else {
                System.out.println("Movimiento inválido. Intenta nuevamente.");
            }
        }
    }
}
/***
 * run:
 * - - - 
 * - - - 
 * - - - 
 * Turno de jugador X
 * Ingrese la fila (0-2): 1
 * Ingrese la columna (0-2): 2
 * - - - 
 * - - X 
 * - - - 
 * Turno de jugador O
 * Ingrese la fila (0-2): 00
 * Ingrese la columna (0-2): 0
 * O - - 
 * - - X 
 * - - - 
 * Turno de jugador X
 * Ingrese la fila (0-2): 0
 * Ingrese la columna (0-2): 0
 * Movimiento inv�lido. Intenta nuevamente.
 * O - - 
 * - - X 
 * - - - 
 * Turno de jugador X
 * Ingrese la fila (0-2): 0
 * Ingrese la columna (0-2): 2
 * O - X 
 * - - X 
 * - - - 
 * Turno de jugador O
 * Ingrese la fila (0-2): 2
 * Ingrese la columna (0-2): 2
 * O - X 
 * - - X 
 * - - O 
 * Turno de jugador X
 * Ingrese la fila (0-2): 1
 * Ingrese la columna (0-2): 1
 * O - X 
 * - X X 
 * - - O 
 * Turno de jugador O
 * Ingrese la fila (0-2): 2
 * Ingrese la columna (0-2): 1
 * O - X 
 * - X X 
 * - O O 
 * Turno de jugador X
 * Ingrese la fila (0-2): 2
 * Ingrese la columna (0-2): 0
 * O - X 
 * - X X 
 * X O O 
 * �Jugador X gana!
 */