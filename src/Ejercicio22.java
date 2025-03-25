/* Un comerciante de computadores ofrece P precio por compra al contado ó 12 cuotas de T Bolívares
cada una. Desarrolle un programa para calcular y mostrar cuál es el porcentaje que se cobra por el
recargo en el pago del computador por cuotas. */

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {

        double precioContado,cuotaMensual,costoCuotas,recargo,porcentajeRecargo;


        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el precio al contado del computador : ");
         precioContado = scan.nextDouble();

        System.out.print("Ingrese el monto de cada cuota mensual (T en Bs.): ");
         cuotaMensual = scan.nextDouble();

        costoCuotas = 12 * cuotaMensual;

        recargo = costoCuotas - precioContado;
        porcentajeRecargo = (recargo / precioContado) * 100;

        System.out.println("Costo total al pagar en cuotas: " + costoCuotas );
        System.out.println("Recargo total: " + recargo + " Bs.");
        System.out.println("Porcentaje de recargo: " + porcentajeRecargo);


    }
}
