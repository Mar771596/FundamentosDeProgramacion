import java.util.Scanner;

public class Ejercicio30 {

    public class RedondearCentena {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Entradas: dígitos individuales
            System.out.print("Ingrese el dígito A (mil): ");
            int A = scanner.nextInt();

            System.out.print("Ingrese el dígito B (centena): ");
            int B = scanner.nextInt();

            System.out.print("Ingrese el dígito C (decena): ");
            int C = scanner.nextInt();

            System.out.print("Ingrese el dígito D (unidad): ");
            int D = scanner.nextInt();

            // Formar el número N = ABCD
            int N = A * 1000 + B * 100 + C * 10 + D;

            // Redondear a la centena más cercana
            int redondeado = (int) (Math.round(N / 100.0) * 100);

            // Mostrar resultados
            System.out.println("\nNúmero formado: " + N);
            System.out.println("Número redondeado a la centena más cercana: " + redondeado);

            scanner.close();
        }
    }
}
