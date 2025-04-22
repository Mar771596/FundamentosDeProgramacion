import java.util.Scanner;

public class Ejercicio43 {

    public class PlanFinanciero {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Entrada: capital actual
            System.out.print("Ingrese el capital actual de la empresa ($): ");
            double capital = scanner.nextDouble();

            double nuevoCapital = 0;
            double prestamo = 0;

            // Evaluar si necesita préstamo y calcular nuevo capital
            if (capital < 0) {
                prestamo = 10000 - capital;
                nuevoCapital = 10000;
            } else if (capital <= 20000) {
                prestamo = 20000 - capital;
                nuevoCapital = 20000;
            } else {
                nuevoCapital = capital;
                prestamo = 0;
            }

            // Gastos fijos
            double computo = 5000;
            double mobiliario = 2000;
            double restante = nuevoCapital - (computo + mobiliario);
            double insumos = restante / 2;
            double incentivos = restante / 2;

            // Salida
            System.out.println("\n--- PLAN FINANCIERO ---");
            System.out.printf("Nuevo capital total: $%.2f\n", nuevoCapital);
            if (prestamo > 0) {
                System.out.printf("Cantidad a solicitar al banco: $%.2f\n", prestamo);
            } else {
                System.out.println("No se necesita solicitar préstamo.");
            }
            System.out.println("Distribución del presupuesto:");
            System.out.printf("- Computadoras: $%.2f\n", computo);
            System.out.printf("- Mobiliario: $%.2f\n", mobiliario);
            System.out.printf("- Insumos: $%.2f\n", insumos);
            System.out.printf("- Incentivos al personal: $%.2f\n", incentivos);

            scanner.close();
        }
    }
}
