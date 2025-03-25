/*
Calcular el salario neto de un trabajador en función del número de horas trabajadas,
el precio de la hora y  considerando un descuento fijo al sueldo base por concepto de
 impuestos del 20%.
 */
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        double horasTrabajadas;
        double preciosHora;
        double salarioBruto,salarioNeto;
        double descuento;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de horas trabajadas: ");
        horasTrabajadas = scanner.nextDouble();

        System.out.print("Ingrese el valor por hora: ");
        preciosHora = scanner.nextDouble();

        salarioBruto = horasTrabajadas * preciosHora;
        descuento = salarioBruto * 20 / 100;
        salarioNeto = salarioBruto - descuento;

        System.out.println("El Salario Bruto es de: " + salarioBruto);
        System.out.println("El descuento del 20% es de: "+ descuento);
        System.out.println("El Salario Neto del empleado es de: " + salarioNeto);


    }
}
