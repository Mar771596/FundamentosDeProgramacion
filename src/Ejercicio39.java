import java.util.Scanner;

public class Ejercicio39 {

    public class CompraAutoOTerreno {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Entradas
            System.out.print("Ingrese el valor actual del automóvil y del terreno (Bs): ");
            double valorInicial = scanner.nextDouble();

            System.out.print("Ingrese el valor del automóvil después de 3 años (Bs): ");
            double valorAuto = scanner.nextDouble();

            System.out.print("Ingrese el valor del terreno después de 3 años (Bs): ");
            double valorTerreno = scanner.nextDouble();

            // Cálculos
            double devaluacionAuto = valorInicial - valorAuto;
            double incrementoTerreno = valorTerreno - valorInicial;

            System.out.println("\nDevaluación del automóvil: Bs " + devaluacionAuto);
            System.out.println("Incremento del valor del terreno: Bs " + incrementoTerreno);

            // Comparación según condición
            if (devaluacionAuto <= incrementoTerreno / 2) {
                System.out.println("=> La persona debe comprar el AUTOMÓVIL.");
            } else {
                System.out.println("=> La persona NO debe comprar el automóvil, es mejor el TERRENO.");
            }

            scanner.close();
        }
    }
}
