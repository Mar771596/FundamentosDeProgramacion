import java.util.Scanner;

public class Ejercicio28 {
    public class CompraEmpresa {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Entrada: monto total de la compra
            System.out.print("Ingrese el monto total de la compra: ");
            double montoCompra = scanner.nextDouble();

            double inversionPropia;
            double prestamoBanco = 0;
            double creditoFabricante;
            double intereses;

            // Condición para calcular según el monto
            if (montoCompra > 500000) {
                inversionPropia = montoCompra * 0.55;
                prestamoBanco = montoCompra * 0.30;
                creditoFabricante = montoCompra - inversionPropia - prestamoBanco;
            } else {
                inversionPropia = montoCompra * 0.70;
                creditoFabricante = montoCompra - inversionPropia;
            }

            // Intereses sobre el crédito
            intereses = creditoFabricante * 0.20;

            // Resultados
            System.out.println("\n--- Detalles del Pago ---");
            System.out.println("Monto total de la compra: $" + montoCompra);
            System.out.println("Inversión propia de la empresa: $" + inversionPropia);
            if (montoCompra > 500000) {
                System.out.println("Préstamo solicitado al banco: $" + prestamoBanco);
            }
            System.out.println("Cantidad a pagar a crédito al fabricante: $" + creditoFabricante);
            System.out.println("Intereses sobre el crédito (20%): $" + intereses);

            scanner.close();
        }
    }
}
