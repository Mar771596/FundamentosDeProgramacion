import java.util.Scanner;

public class Ejercicio46 {
    public class ContadorDescendente {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Leer valores de N y K
            System.out.print("Ingrese el valor de N (entero positivo): ");
            int N = scanner.nextInt();

            System.out.print("Ingrese el valor de K (entero positivo menor que N): ");
            int K = scanner.nextInt();

            // Validar que K sea menor que N
            if (K >= N) {
                System.out.println("K debe ser menor que N.");
            } else {
                System.out.println("\nContando desde N hasta K:");
                for (int i = N; i >= K; i--) {
                    System.out.println(i);
                }
            }

            scanner.close();
        }
    }
}
