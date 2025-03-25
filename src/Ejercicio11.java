import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        String  nombre;
        int numHijos;
        double horasNormales;
        double pagoHoraNormal;
        double horasExtras;
        double sueldoBase;
        double pagoHoraExtra;
        double sueldoHorasExtras;

        Scanner scan = new Scanner(System.in);

        // // Solicitar datos del trabajador
        System.out.println("Ingrese el nombre de el trabajador");
        nombre = scan.nextLine();
        System.out.print("Ingrese el número de horas normales trabajadas: ");
         horasNormales = scan.nextDouble();

        System.out.print("Ingrese el pago por hora normal: ");
         pagoHoraNormal = scan.nextDouble();

        System.out.print("Ingrese el número de horas extras trabajadas: ");
         horasExtras = scan.nextDouble();

        System.out.print("Ingrese el número de hijos: ");
        numHijos = scan.nextInt();

        // Calcular sueldo base
         sueldoBase = horasNormales * pagoHoraNormal;

        // Calcular pago de horas extras (25% más por hora extra)
         pagoHoraExtra = pagoHoraNormal * 1.25;
        sueldoHorasExtras = horasExtras * pagoHoraExtra;


    }
}
