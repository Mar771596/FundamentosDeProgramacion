import java.util.Scanner;

public class Ejercicio26 {


    public class CalculoExpresiones {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Entrada de datos
            System.out.print("Ingrese el valor de A: ");
            int A = scanner.nextInt();

            System.out.print("Ingrese el valor de B: ");
            int B = scanner.nextInt();

            System.out.print("Ingrese el valor de C: ");
            int C = scanner.nextInt();

            System.out.print("Ingrese el valor de D: ");
            int D = scanner.nextInt();

            double resultado;

            // Evaluación de condiciones
            if (D == 0) {
                resultado = Math.pow((A - C), 2);
                System.out.println("D es igual a 0, se calcula (A - C)^2");
            } else if (D > 0) {
                resultado = Math.pow((A - B), 3) / D;
                System.out.println("D es mayor que 0, se calcula (A - B)^3 / D");
            } else {
                System.out.println("D es negativo. No se realiza ninguna operación.");
                scanner.close();
                return;
            }

            // Salida del resultado
            System.out.println("El resultado es: " + resultado);

            scanner.close();
        }
    }
}
