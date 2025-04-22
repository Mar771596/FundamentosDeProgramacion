import java.util.Scanner;

public class Ejercicio25 {




    public class AumentoSueldo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Entrada de datos
            System.out.print("Ingrese el sueldo del trabajador (en Bs.): ");
            double sueldo = scanner.nextDouble();

            double nuevoSueldo;

            // Lógica para aplicar el aumento
            if (sueldo < 40000) {
                nuevoSueldo = sueldo + (sueldo * 0.15); // Aumento del 15%
            } else {
                nuevoSueldo = sueldo + (sueldo * 0.12); // Aumento del 12%
            }

            // Salida del resultado
            System.out.println("El nuevo sueldo del trabajador es: Bs. " + nuevoSueldo);

            scanner.close();
        }
    }
}
