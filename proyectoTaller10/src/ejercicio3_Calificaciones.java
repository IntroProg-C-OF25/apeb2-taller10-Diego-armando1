/***
 * Ejercicio 3
 * El primer ciclo _paralelo C_, cuenta con **28** estudiantes, de los cuáles al 
 * finalizar el periodo, la Dirección de la carrera de Computación a solicitado 
 * las siguientes estadísticas de la materia **INTRODUCCIÓN A LA PROGRAMACIÓN** 
 * en función a los promedios por estudiante, dichos promedios se deben 
 * calcular _(ponderar, ya que el docente ingresa todo sobre 10pts.)_ de 3 
 * calificaciones _(**ACD** que representa el **35%** de la nota, **APE** del **35%** 
 * y la nota del **AA** con un peso del **30%**)_. En resumen, los requerimientos son los siguientes: 
 * - Registre los nombres de cada estudiante de dicho paralelo.
 * - Genere aleatoriamente las notas **ACD**, **APE**, **AA**, para cada uno de los 28 estudiantes de 0-10 pts. 
 * - Calcule el promedio de cada uno de los estudiantes del paralelo dada la siguiente ponderación: **ACD**->35%, **APE**->35%, y el **AA**->30%.
 * - Obtenga el promedio del curso, del _paralelo C_. 
 * - Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por encima del promedio del curso. 
 * - Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por debajo del promedio del curso. 
 * - Muestre el estudiante con su calificación, si es el del mayor promedio _(el más alto de la clase)_. 
 * - Muestre el estudiante con su calificación, si es el del menor promedio _(el más bajo de la clase)_. 
 * @author Diego Guaman
 */
import java.util.Random;
public class ejercicio3_Calificaciones {
    public static void main(String[] args) {
        int totalEstudiantes = 28, mayor = 0, menor = 0;
        double[] acd = new double[totalEstudiantes];
        double[] ape = new double[totalEstudiantes];
        double[] aa = new double[totalEstudiantes];
        double[] promedios = new double[totalEstudiantes];
        double sumaPromedios = 0, promedioCurso = 0, mayorPromedio, menorPromedio;
        String[] nombres = new String[totalEstudiantes];
        Random random = new Random();
        for (int i = 0; i < totalEstudiantes; i++) {
            nombres[i] = "Estudiantes" + (i + 1);
            acd[i] = (int) (Math.random() * 10);
            ape[i] = (int) (Math.random() * 10);
            aa[i] = (int) (Math.random() * 10);
            promedios[i] = (acd[i] * 0.35) + (ape[i] * 0.35) + (aa[i] * 0.30);
            sumaPromedios += promedios[i];
        }
        promedioCurso = sumaPromedios / totalEstudiantes;
        mayorPromedio = promedios[0];
        menorPromedio = promedios[0];
        for (int i = 0; i < totalEstudiantes; i++) {
            if (promedios[i] > mayorPromedio) {
                mayorPromedio = promedios[i];
                mayor = i;
            }
        }
        for (int i = 0; i < totalEstudiantes; i++) {
            if (promedios[i] < menorPromedio) {
                menorPromedio = promedios[i];
                menor = i;
            }
        }
        System.out.printf("Promedio del curso es: %.2f%n ", promedioCurso);
        System.out.println("\nListado de estudiantes con promedio por encima del promedio del curso:");
        for (int i = 0; i < totalEstudiantes; i++) {
            if (promedios[i] > promedioCurso) {
                System.out.printf("%s con promedio de: %.2f%n", nombres[i], promedios[i]);
            }
        }
        System.out.println("\nListado de estudiantes con promedio por debajo del promedio del curso:");
        for (int i = 0; i < totalEstudiantes; i++) {
            if (promedios[i] < promedioCurso) {
                System.out.printf("%s con promedio de: %.2f%n", nombres[i], promedios[i]);
            }
        }
        System.out.printf("El estudiante con el mayor promedio es %s con un promedio de %.2f%n", nombres[mayor], mayorPromedio);
        System.out.printf("El estudiante con el menor promedio es %s con un promedio de %.2f%n", nombres[menor], menorPromedio);
    }
}
/***
 * run:
 * Promedio del curso es: 4,87
 *
 * Listado de estudiantes con promedio por encima del promedio del curso:
 * Estudiantes1 con promedio de: 6,20
 * Estudiantes2 con promedio de: 5,25
 * Estudiantes4 con promedio de: 5,25
 * Estudiantes10 con promedio de: 5,35
 * Estudiantes12 con promedio de: 5,55
 * Estudiantes14 con promedio de: 5,65
 * Estudiantes16 con promedio de: 5,45
 * Estudiantes17 con promedio de: 7,30
 * Estudiantes18 con promedio de: 5,40
 * Estudiantes19 con promedio de: 8,00
 * Estudiantes20 con promedio de: 5,10
 * Estudiantes23 con promedio de: 7,35
 * Estudiantes24 con promedio de: 7,25
 * Estudiantes25 con promedio de: 5,95
 * Estudiantes26 con promedio de: 6,35
 * Estudiantes27 con promedio de: 5,00
 * 
 * Listado de estudiantes con promedio por debajo del promedio del curso:
 * Estudiantes3 con promedio de: 3,60
 * Estudiantes5 con promedio de: 2,25
 * Estudiantes6 con promedio de: 4,15
 * Estudiantes7 con promedio de: 4,20
 * Estudiantes8 con promedio de: 4,70
 * Estudiantes9 con promedio de: 2,00
 * Estudiantes11 con promedio de: 3,75
 * Estudiantes13 con promedio de: 4,65
 * Estudiantes15 con promedio de: 2,75
 * Estudiantes21 con promedio de: 2,70
 * Estudiantes22 con promedio de: 1,80
 * Estudiantes28 con promedio de: 3,40
 * El estudiante con el mayor promedio es Estudiantes19 con un promedio de 8,00
 * El estudiante con el menor promedio es Estudiantes22 con un promedio de 1,80
 */

