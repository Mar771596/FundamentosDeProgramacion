import java.util.Scanner;

public class Ejercicio24 {




    public class InversionBancaria {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Entradas
            System.out.print("Ingrese el monto de la inversión: ");
            double inversion = scanner.nextDouble();

            System.out.print("Ingrese la tasa de interés anual (en porcentaje): ");
            double tasaInteres = scanner.nextDouble();

            System.out.print("Ingrese el número de años de la inversión: ");
            int anios = scanner.nextInt();

            // Cálculo del interés
            double interes = inversion * (tasaInteres / 100) * anios;

            System.out.println("\nIntereses generados: $" + interes);

            // Decisión sobre reinversión
            if (interes > 7000) {
                double totalFinal = inversion + interes;
                System.out.println("Como los intereses superan $7000, se reinvierten.");
                System.out.println("Monto total en la cuenta: $" + totalFinal);
            } else {
                System.out.println("Los intereses no superan $7000, no se reinvierten.");
                System.out.println("Monto total en la cuenta: $" + inversion);
            }

            scanner.close();
        }
    }
}
