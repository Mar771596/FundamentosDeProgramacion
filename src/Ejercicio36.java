import java.util.Scanner;

public class Ejercicio36 {
    public class DesgloseBilletes {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Entrada: cantidad total en bolívares
            System.out.print("Ingrese una cantidad en bolívares: ");
            int cantidad = scanner.nextInt();

            // Arreglo con las denominaciones disponibles
            int[] billetes = {50000, 20000, 10000, 5000, 2000, 1000, 500, 100, 50, 20, 10};

            System.out.println("\n--- Desglose de billetes ---");

            for (int billete : billetes) {
                if (cantidad >= billete) {
                    int cantidadBilletes = cantidad / billete;
                    cantidad = cantidad % billete;
                    System.out.println("Billetes de " + billete + ": " + cantidadBilletes);
                }
            }

            // Si sobra alguna cantidad que no puede desglosarse
            if (cantidad > 0) {
                System.out.println("Cantidad restante que no puede desglosarse: Bs. " + cantidad);
            }

            scanner.close();
        }
    }
}
