/***
 * Ejercicio 5
 * Crea un programa que gestione el inventario de una tienda, así como la emisión 
 * de facturas. Utiliza una matriz bidimensional para almacenar los productos disponibles 
 * en la tienda, con información como nombre, precio y cantidad. El programa debe permitir 
 * facturar un producto dado su código, y unidades deseadas. Adicional se debe agregar a la 
 * factura al _15% del IVA_, y si la compra superar los $100, se debe aplicar un descuento. 
_**Nota**_: Considere la alternativa de inexistencias en Stop, para el caso, muestre la alerta respectiva. 
 */
import java.util.Scanner;
public class ejercicio5_Facturacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[][] productos = {
            {"Camisetas", "16.0", "20"},
            {"Pantalones", "25.0", "15"},
            {"Chompas", "23.0", "18"},
            {"Medias", "2.0", "20"},
            {"Zapatos", "16.0", "20"}
        };
        final double iva = 0.15, descuento = 0.10;
        int opcion, codigo, cantidadDeseada, stockDisponible;
        boolean continuar = true;
        double subTotal, totalIva, totalDescuento, precioUnitario = 0;
        while (continuar) {
            System.out.println("\n=== Menu principal ===");
            System.out.println("1. Ver inventario");
            System.out.println("2. Factura");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\n=== Inventario ===");
                    System.out.printf("%-10s %-20s %-10s %-10s%n", "Código", "Nombre", "Precio", "Cantidad");
                    for (int i = 0; i < productos.length; i++) {
                        System.out.printf("%-10d %-20s $%-10s %-10s%n", i, productos[i][0], productos[i][1], productos[i][2]);
                    }
                    break;
                case 2:
                    System.out.print("=== Factura ===");
                    System.out.print("\nIngrese el código del producto (0-" + (productos.length - 1) + "): ");
                    codigo = teclado.nextInt();

                    if (codigo < 0 || codigo >= productos.length) {
                        System.out.println("Codigo invalido");
                        break;
                    }
                    System.out.println("Ingrese la cantidad deseada: ");
                    cantidadDeseada = teclado.nextInt();
                    stockDisponible = Integer.parseInt(productos[codigo][2]);// Utilize esto para transformar de string a int
                    if (cantidadDeseada > stockDisponible) {
                        System.out.println("No hay suficiente stock disponible");
                    } else {
                        precioUnitario = Double.parseDouble(productos[codigo][1]);// Utilize esto para convertir de string a double
                        subTotal = cantidadDeseada * precioUnitario;
                        totalIva = subTotal + (subTotal * iva);
                        totalDescuento = totalIva - (totalIva * descuento);
                        productos[codigo][2] = String.valueOf(stockDisponible - cantidadDeseada);// Utilize esto para convertir de int o double a string 
                        System.out.printf("Producto: %s%n", productos[codigo][0]);
                        System.out.printf("Cantidad: %d%n", cantidadDeseada);
                        System.out.printf("Subtotal: %.2f%n", subTotal * iva);
                        System.out.printf("Iva (15%%): %.2f%n", totalIva * descuento);
                        System.out.printf("Descuento: %.2f%n", totalDescuento);
                        System.out.printf("Total a pagar: %.2f%n", totalDescuento);
                    }
                    break;
                case 3:
                    continuar = false;
                    System.out.println("Saliendo del programa");
                    break;
                default: 
                    System.out.println("opcion invalida, intenta nuevamente");
            }
        }
    }
}
/***
 * run:
 * === Menu principal ===
 * 1. Ver inventario
 * 2. Factura
 * 3. Salir
 * Elige una opcion: 1
 * === Inventario ===
 * C�digo     Nombre               Precio     Cantidad  
 * 0          Camisetas            $16.0       20        
 * 1          Pantalones           $25.0       15        
 * 2          Chompas              $23.0       18        
 * 3          Medias               $2.0        20        
 * 4          Zapatos              $16.0       20        
 * === Menu principal ===
 * 1. Ver inventario
 * 2. Factura
 * 3. Salir
 * Elige una opcion: 2
 * === Factura ===
 * Ingrese el c�digo del producto (0-4): 3
 * Ingrese la cantidad deseada: 3
 * Producto: Medias
 * Cantidad: 3
 * Subtotal: 0,90
 * Iva (15%): 0,69
 * Descuento: 6,21
 * Total a pagar: 6,21
 * === Menu principal ===
 * 1. Ver inventario
 * 2. Factura
 * 3. Salir
 * Elige una opcion: 3
 * Saliendo del programa
 */

