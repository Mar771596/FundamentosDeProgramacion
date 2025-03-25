
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tasas de conversión
        double chelinesAPesetas = 956.871 / 100;
        double dracmasAfrancosFranceses = (88.607 / 100) / 20.110;
        double pesetasADolares = 1 / 122.499;
        double pesetasALiras = 100 / 9.289;

        // Conversión de chelines austríacos a pesetas
        System.out.print("Ingrese la cantidad en chelines austríacos: ");
        double chelines = scanner.nextDouble();
        double pesetasDesdeChelines = chelines * chelinesAPesetas;
        System.out.printf("%.2f chelines austríacos equivalen a %.2f pesetas\n", chelines, pesetasDesdeChelines);

        // Conversión de dracmas griegos a francos franceses
        System.out.print("Ingrese la cantidad en dracmas griegos: ");
        double dracmas = scanner.nextDouble();
        double francosFranceses = dracmas * dracmasAfrancosFranceses;
        System.out.printf("%.2f dracmas griegos equivalen a %.2f francos franceses\n", dracmas, francosFranceses);

        // Conversión de pesetas a dólares y liras italianas
        System.out.print("Ingrese la cantidad en pesetas: ");
        double pesetas = scanner.nextDouble();
        double dolares = pesetas * pesetasADolares;
        double liras = pesetas * pesetasALiras;
        System.out.printf("%.2f pesetas equivalen a %.2f dólares\n", pesetas, dolares);
        System.out.printf("%.2f pesetas equivalen a %.2f liras italianas\n", pesetas, liras);

        scanner.close();
    }
}