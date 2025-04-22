import java.util.Scanner;

public class Ejercicio29 {
    public class IncentivosVendedores {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Entradas
            System.out.print("Ingrese el salario mensual de cada vendedor: ");
            double salario = scanner.nextDouble();

            System.out.print("Ingrese las ventas del Departamento 1: ");
            double ventas1 = scanner.nextDouble();

            System.out.print("Ingrese las ventas del Departamento 2: ");
            double ventas2 = scanner.nextDouble();

            System.out.print("Ingrese las ventas del Departamento 3: ");
            double ventas3 = scanner.nextDouble();

            // Cálculo del total
            double totalVentas = ventas1 + ventas2 + ventas3;
            double umbral = totalVentas * 0.33;

            // Comparación y resultados
            System.out.println("\n--- Pago a Vendedores ---");

            double pagoDept1 = ventas1 > umbral ? salario + (salario * 0.20) : salario;
            double pagoDept2 = ventas2 > umbral ? salario + (salario * 0.20) : salario;
            double pagoDept3 = ventas3 > umbral ? salario + (salario * 0.20) : salario;

            System.out.println("Vendedores del Departamento 1 recibirán: $" + pagoDept1);
            System.out.println("Vendedores del Departamento 2 recibirán: $" + pagoDept2);
            System.out.println("Vendedores del Departamento 3 recibirán: $" + pagoDept3);

            scanner.close();
        }
    }
}
