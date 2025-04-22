import java.util.Scanner;

public class Ejercicio31 {
    public class AlquilerAuto {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Entrada: kilómetros recorridos
            System.out.print("Ingrese la cantidad de kilómetros recorridos: ");
            int km = scanner.nextInt();

            int totalPagar = 0;

            if (km <= 300) {
                totalPagar = 5000;
            } else if (km <= 1000) {
                totalPagar = 5000 + (km - 300) * 200;
            } else {
                int tramo1 = 1000 - 300; // km entre 300 y 1000
                int tramo2 = km - 1000;  // km superiores a 1000

                totalPagar = 5000 + (tramo1 * 200) + (tramo2 * 150);
            }

            // Salida
            System.out.println("Total a pagar: Bs. " + totalPagar);

            scanner.close();
        }
    }
}
