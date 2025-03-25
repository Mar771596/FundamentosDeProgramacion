/*
Determine cuánto dinero hay en un banco que contiene N1 billetes de 50000, N2 billetes de 20000,
N3 billetes de 10000, N4 billetes de 5000, N5 billetes de 2000, N6 billetes 1000,
N7 billetes de 500 y N8 billetes de 100.
 */

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de cada tipo de billete
        System.out.print("Ingrese la cantidad de billetes de 50000: ");
        int N1 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 20000: ");
        int N2 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 10000: ");
        int N3 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 5000: ");
        int N4 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 2000: ");
        int N5 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 1000: ");
        int N6 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 500: ");
        int N7 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de 100: ");
        int N8 = scanner.nextInt();

        // Calcular el total de dinero en el banco
        int total = (N1 * 50000) + (N2 * 20000) + (N3 * 10000) + (N4 * 5000) +
                (N5 * 2000) + (N6 * 1000) + (N7 * 500) + (N8 * 100);

        // Mostrar el resultado
        System.out.println("El total de dinero en el banco es: " + total + " pesos");

        scanner.close();

    }
}
