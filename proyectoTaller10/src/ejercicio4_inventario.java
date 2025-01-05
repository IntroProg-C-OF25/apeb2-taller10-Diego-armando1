
/** *
 * Crea un programa que gestione el inventario de una tienda. Utiliza
 * una matriz bidimensional para almacenar los productos disponibles
 * en la tienda, con información como nombre, precio y cantidad. El
 * programa debe permitir agregar nuevos productos, actualizar existencias,
 * buscar productos y eliminarlos.
 */
import java.util.Scanner;

public class ejercicio4_inventario {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[][] inventario = new String[100][3];
        double[] precios = new double[100];
        int[] cantidades = new int[100];
        int cont = 0, opcion;
        String nombre, nombreBuscar, nombreEliminar, nombreActualizar;
        double precio;
        int cantidad, nuevaCantidad;
        boolean encontradoBuscar, eliminado, actualizar;
        do {
            System.out.println("\nMenú para gestionar el inventario");
            System.out.println("1. Agregar producto");
            System.out.println("2. Actualizar cantidad");
            System.out.println("3. Buscar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    if (cont < inventario.length) {
                        System.out.print("Ingrese el nombre del producto: ");
                        nombre = teclado.next();
                        System.out.print("Ingrese el precio del producto: ");
                        precio = teclado.nextDouble();
                        System.out.print("Ingrese la cantidad disponible: ");
                        cantidad = teclado.nextInt();
                        inventario[cont][0] = nombre;
                        precios[cont] = precio;
                        cantidades[cont] = cantidad;
                        cont++;
                        System.out.println("Prodcuto agregado exitosamente.");
                    } else {
                        System.out.println("Inventario lleno, no se pueden agregar mas productos");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del producto a actualizar: ");
                    nombreActualizar = teclado.nextLine();
                    actualizar = false;
                    for (int i = 0; i < cont; i++) {
                        if (inventario[i][0].equalsIgnoreCase(nombreActualizar)) {
                            System.out.print("Ingrese la nueva cantidad: ");
                            nuevaCantidad = teclado.nextInt();
                            cantidades[i] = nuevaCantidad;
                            System.out.println("Cantidad de " + nombreActualizar + " actualizada");
                            actualizar = true;
                            break;
                        }
                    }
                    if (!actualizar) {
                        System.out.println("Producto no encontrado");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del a producto a buscar: ");
                    nombreBuscar = teclado.next();
                    encontradoBuscar = false;
                    for (int i = 0; i < cont; i++) {
                        if (inventario[i][0].equalsIgnoreCase(nombreBuscar)) {
                            System.out.println("Producto: " + inventario[i][0]);
                            System.out.println("Presio: " + precios[i]);
                            System.out.println("Cantidad disponible: " + cantidades[i]);
                            encontradoBuscar = true;
                            break;
                        }
                    }
                    if (!encontradoBuscar) {
                        System.out.println("Producto no encontrado");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del producto a eleminar: ");
                    nombreEliminar = teclado.next();
                    eliminado = false;
                    for (int i = 0; i < cont; i++) {
                        if (inventario[i][0].equalsIgnoreCase(nombreEliminar)) {
                            for (int j = 0; j < (cont - 1); j++) {
                                inventario[j][0] = inventario[j + 1][0];
                                precios[j] = precios[j + 1];
                                cantidades[j] = cantidades[j + 1];
                            }
                            cont--;
                            System.out.println("Producto " + nombreEliminar + " eliminado");
                            eliminado = true;
                            break;
                        }
                    }
                    if (!eliminado) {
                        System.out.println("Producto no encontrado");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del menu para gestionar el inventario");
                    break;
                default:
                    System.out.println("Opcion no valida, intenta de nuevo.");
            }
        } while (opcion != 5);
    }
    /**
     * *
     * run: Men� para gestionar el inventario 1. Agregar producto 2. Actualizar
     * cantidad 3. Buscar producto 4. Eliminar producto 5. Salir Elige una
     * opcion: 1 Ingrese el nombre del producto: leche Ingrese el precio del
     * producto: 2 Ingrese la cantidad disponible: 5 Prodcuto agregado
     * exitosamente.
     *
     * Men� para gestionar el inventario 1. Agregar producto 2. Actualizar
     * cantidad 3. Buscar producto 4. Eliminar producto 5. Salir Elige una
     * opcion: 5 Saliendo del menu para gestionar el inventario
     */
}
