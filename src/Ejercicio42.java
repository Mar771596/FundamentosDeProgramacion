import java.util.Scanner;

public class Ejercicio42 {

    public class AnemiaDetector {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Entradas
            System.out.print("Ingrese edad en años: ");
            int anios = scanner.nextInt();

            System.out.print("Ingrese edad en meses: ");
            int meses = scanner.nextInt();

            System.out.print("Ingrese sexo (M para mujer / H para hombre): ");
            char sexo = scanner.next().toUpperCase().charAt(0);

            System.out.print("Ingrese nivel de hemoglobina (g%): ");
            double hemo = scanner.nextDouble();

            // Determinar rango según edad y sexo
            double min = 0, max = 0;
            boolean datosValidos = true;

            if (anios == 0 && meses <= 1) {
                min = 13; max = 26;
            } else if (anios == 0 && meses > 1 && meses <= 6) {
                min = 10; max = 18;
            } else if (anios == 0 && meses > 6 && meses <= 12) {
                min = 11; max = 15;
            } else if (anios > 1 && anios <= 5) {
                min = 11.5; max = 15;
            } else if (anios > 5 && anios <= 10) {
                min = 12.6; max = 15.5;
            } else if (anios > 10 && anios <= 15) {
                min = 13; max = 15.5;
            } else if (anios > 15 && sexo == 'M') {
                min = 12; max = 16;
            } else if (anios > 15 && sexo == 'H') {
                min = 14; max = 18;
            } else {
                datosValidos = false;
            }

            // Resultado
            if (!datosValidos) {
                System.out.println("Datos no válidos o fuera de rango.");
            } else {
                System.out.printf("Rango normal: %.1f - %.1f g%%\n", min, max);
                if (hemo < min) {
                    System.out.println("Resultado: POSITIVO para anemia.");
                } else {
                    System.out.println("Resultado: NEGATIVO para anemia.");
                }
            }

            scanner.close();
        }
    }
}
