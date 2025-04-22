import java.util.Scanner;

public class Ejercicio41 {

    public class Reforestacion {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Entrada
            System.out.print("Ingrese la cantidad de hectáreas del bosque: ");
            double hectareas = scanner.nextDouble();

            // Convertir a metros cuadrados
            double metrosCuadrados = hectareas * 10000;

            System.out.println("\nSuperficie del bosque: " + metrosCuadrados + " m²");

            // Verificar si se va a reforestar
            if (metrosCuadrados > 1000000) {
                double pino = metrosCuadrados * 0.70;
                double oyamel = metrosCuadrados * 0.20;
                double cedro = metrosCuadrados * 0.10;

                // Salida
                System.out.println("Superficie a sembrar con árboles:");
                System.out.printf("Pino: %.2f m²\n", pino);
                System.out.printf("Oyamel: %.2f m²\n", oyamel);
                System.out.printf("Cedro: %.2f m²\n", cedro);
            } else {
                System.out.println("La superficie no excede 1,000,000 m². No se aplicará esta distribución de árboles.");
            }

            scanner.close();
        }
    }
}
