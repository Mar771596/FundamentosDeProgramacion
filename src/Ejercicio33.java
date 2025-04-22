import java.util.Scanner;

public class Ejercicio33 {

    public class DescuentoTienda {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Entrada de datos
            System.out.print("Ingrese el nombre del cliente: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el monto de la compra: $");
            double montoCompra = scanner.nextDouble();

            double descuento = 0;

            // Determinar el porcentaje de descuento
            if (montoCompra >= 500 && montoCompra <= 1000) {
                descuento = montoCompra * 0.05;
            } else if (montoCompra > 1000 && montoCompra <= 7000) {
                descuento = montoCompra * 0.11;
            } else if (montoCompra > 7000 && montoCompra <= 15000) {
                descuento = montoCompra * 0.18;
            } else if (montoCompra > 15000) {
                descuento = montoCompra * 0.25;
            }

            double montoFinal = montoCompra - descuento;

            // Salida
            System.out.println("\n--- Detalle de la Compra ---");
            System.out.println("Cliente: " + nombre);
            System.out.println("Monto original de la compra: $" + montoCompra);
            System.out.println("Descuento aplicado: $" + descuento);
            System.out.println("Monto final a pagar: $" + montoFinal);

            scanner.close();
        }
    }
}
