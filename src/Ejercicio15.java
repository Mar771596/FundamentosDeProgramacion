// Calcular y mostrar el monto total a pagar en un mes de luz eléctrica,
// teniendo como dato la lectura anterior, la lectura actual y el costo por kilovatio

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        double lecturaAnterior, lecturaActual, costoPorKilovatio, consumo, montoTotal;

        Scanner scan = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese la lectura anterior del medidor : ");
        lecturaAnterior = scan.nextDouble();

        System.out.print("Ingrese la lectura actual del medidor : ");
        lecturaActual = scan.nextDouble();

        System.out.print("Ingrese el costo por kilovatio : ");
        costoPorKilovatio = scan.nextDouble();

        // Calcular el consumo
        consumo = lecturaActual - lecturaAnterior;

        if (consumo < 0) {
            System.out.println(" La lectura actual no puede ser menor que la lectura anterior.");
        } else {

            // Calcular el monto total a pagar
            montoTotal = consumo * costoPorKilovatio;

            System.out.println("Consumo del mes: " + consumo  );
            System.out.println("Monto total a pagar: " + montoTotal );


        }
    }
}
