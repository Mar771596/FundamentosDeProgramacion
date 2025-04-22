import java.util.Scanner;

public class Ejercicio44 {

    public class NegocioInversion {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Entrada de datos
            System.out.print("Ingrese el monto total de la inversión ($): ");
            double inversionTotal = scanner.nextDouble();

            System.out.print("Ingrese el monto que el banco ofrece por la hipoteca ($): ");
            double hipoteca = scanner.nextDouble();

            double inversionPersona = 0;
            double inversionSocio = 0;

            if (hipoteca < 1000000) {
                // Inversión mitad y mitad
                inversionPersona = inversionTotal / 2;
                inversionSocio = inversionTotal / 2;

                System.out.println("\nEl monto de la hipoteca es menor a $1,000,000.");
                System.out.println("La persona y el socio invertirán 50% cada uno.");
            } else {
                System.out.println("\nEl monto de la hipoteca es mayor o igual a $1,000,000.");
                if (hipoteca >= inversionTotal) {
                    inversionPersona = inversionTotal;
                    inversionSocio = 0;
                    System.out.println("La hipoteca cubre toda la inversión. El socio no necesita invertir.");
                } else {
                    double restante = inversionTotal - hipoteca;
                    inversionPersona = hipoteca + (restante / 2);
                    inversionSocio = restante / 2;
                    System.out.println("La persona invertirá el monto de la hipoteca y la mitad del resto.");
                }
            }

            // Resultados
            System.out.printf("\nInversión de la persona: $%.2f\n", inversionPersona);
            System.out.printf("Inversión del socio: $%.2f\n", inversionSocio);

            scanner.close();
        }
    }
}
