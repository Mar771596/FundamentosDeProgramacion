

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double determinante, x, y ;


        // Solicitar coeficientes de las ecuaciones
        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese el valor de c: ");
        double c = scanner.nextDouble();
        System.out.print("Ingrese el valor de d: ");
        double d = scanner.nextDouble();
        System.out.print("Ingrese el valor de e: ");
        double e = scanner.nextDouble();
        System.out.print("Ingrese el valor de f: ");
        double f = scanner.nextDouble();

        // Calcular el determinante
         determinante = (a * e) - (b * d);

        // Verificar si el sistema tiene solución única
        if (determinante == 0) {
            System.out.println("El sistema no tiene solución única.");
        } else {
            // Calcular los valores de X y Y
             x = ((c * e) - (b * f)) / determinante;
             y = ((a * f) - (c * d)) / determinante;

            // Mostrar los resultados
            System.out.println("El valor de X es: " + x);
            System.out.println("El valor de Y es: " + y);
        }

        scanner.close();
    }
}

