/* En un hospital rural existen tres áreas: Ginecología, Pediatría y Traumatología.
El presupuesto anual del hospital se reparte conforme a la siguiente tabla:  Área Porcentaje del presupuesto
Ginecología 40%
Traumatología 30%
Pediatría 30%
Obtener la cantidad de dinero que recibirá cada área, para cualquier monto presupuestado

 */

import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        double presupuestoTotal;
        double presupuestoGinecologia;
        double presupuestoTraumatologia;
        double presupuestoPediatria;

        Scanner scan= new Scanner(System.in);



        System.out.print("Ingrese el presupuesto anual del hospital: ");
        presupuestoTotal = scan.nextDouble();

         presupuestoGinecologia = presupuestoTotal * 0.40;
         presupuestoTraumatologia = presupuestoTotal * 0.30;
         presupuestoPediatria = presupuestoTotal * 0.30;



        System.out.println("Presupuesto total: " + presupuestoTotal + " Bs.");
        System.out.println("Ginecología: " + presupuestoGinecologia + " Bs.");
        System.out.println("Traumatología: " + presupuestoTraumatologia + " Bs.");
        System.out.println("Pediatría: " + presupuestoPediatria + " Bs.");

    }
}
