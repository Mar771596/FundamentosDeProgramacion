import java.util.Scanner;

/* Dados como datos el precio final pagado por un producto y su precio de venta al público (PVP),
se requiere que calcule y muestre el porcentaje
de descuento que le ha sido aplicado.

 */
public class Ejercicio17 {
    public static void main(String[] args) {
        double precioFinal, pvp, descuento, porcentajeDescuento;

        Scanner scan = new Scanner(System.in);


        // Solicitar datos al usuario
        System.out.print("Ingrese el precio de venta al público (PVP): ");
        pvp = scan.nextDouble();

        System.out.print("Ingrese el precio final pagado: ");
        precioFinal = scan.nextDouble();

        // Verificar que los valores sean correctos
        if (precioFinal > pvp) {
            System.out.println(" El precio final no puede ser mayor que el PVP ");
        } else {
            // Calcular el descuento
            descuento = pvp - precioFinal;
            porcentajeDescuento = (descuento / pvp) * 100;

            // Mostrar resultados

            System.out.println("Descuento aplicado: " + descuento);
            System.out.println("Porcentaje de descuento: " + porcentajeDescuento);


        }
    }
}