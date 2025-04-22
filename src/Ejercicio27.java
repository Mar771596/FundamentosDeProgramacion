import java.util.Scanner;

public class Ejercicio27 {

    public class AnalisisFiguras {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Entrada de datos
            System.out.print("Ingrese el valor 1: ");
            double valor1 = scanner.nextDouble();

            System.out.print("Ingrese el valor 2: ");
            double valor2 = scanner.nextDouble();

            System.out.print("Ingrese el valor 3 (área a comparar): ");
            double valor3 = scanner.nextDouble();

            // Cálculos de áreas
            double areaTriangulo = (valor1 * valor2) / 2;
            double areaCirculo = valor2 * Math.pow(valor1, 2); // valor1: radio, valor2: pi
            double areaRectangulo = valor1 * valor2;

            boolean encontrado = false;

            // Comparaciones
            if (Math.abs(areaTriangulo - valor3) < 0.0001) {
                System.out.println("Coincide con el área de un TRIÁNGULO.");
                encontrado = true;
            }

            if (Math.abs(areaCirculo - valor3) < 0.0001) {
                System.out.println("Coincide con el área de un CÍRCULO.");
                encontrado = true;
            }

            if (Math.abs(areaRectangulo - valor3) < 0.0001) {
                System.out.println("Coincide con el área de un RECTÁNGULO.");
                encontrado = true;
            }

            if (!encontrado) {
                System.out.println("No coincide con ninguna figura conocida.");
            }

            scanner.close();
        }
    }
}


