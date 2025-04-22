import java.util.Scanner;

public class Ejercicio37 {

    public class TipoTriangulo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Entrada de datos
            System.out.print("Ingrese el lado A: ");
            int A = scanner.nextInt();

            System.out.print("Ingrese el lado B: ");
            int B = scanner.nextInt();

            System.out.print("Ingrese el lado C: ");
            int C = scanner.nextInt();

            // Ordenar lados para aplicar la regla del triángulo (mínimos primero)
            int max = Math.max(A, Math.max(B, C));
            int suma = A + B + C;
            int sumaMenores = suma - max;

            if (sumaMenores > max) {
                // Es un triángulo
                System.out.println("\nLos lados forman un triángulo.");

                // Determinar tipo
                if (A == B && B == C) {
                    System.out.println("Tipo: Equilátero");
                } else if (A == B || A == C || B == C) {
                    System.out.println("Tipo: Isósceles");
                } else {
                    System.out.println("Tipo: Escaleno");
                }

                // Calcular área con fórmula de Herón
                double s = (A + B + C) / 2.0;
                double area = Math.sqrt(s * (s - A) * (s - B) * (s - C));

                System.out.printf("Área del triángulo: %.2f unidades cuadradas\n", area);
            } else {
                // No es un triángulo
                System.out.println("\nLos lados no forman un triángulo válido.");
            }

            scanner.close();
        }
    }
}
