
/* Resuelva el problema que tienen en una gasolinera. Los surtidores de la misma registran lo que surten en
 galones, pero el precio de la gasolina está fijado en litros. Se requiere que calcule y muestre lo que hay
 que cobrarle a un cliente, considerando que: (a) cada galón tiene 3.785 litros; (b) el precio
 del litro es de 100 Bolívares
*/
import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {

        double  LitrosPorGalon = 3.785;
        double PrecioPorLitro = 100.0;
        double galones,litros,totalPagar ;



        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de galones surtidos: ");
        galones = scan.nextDouble();

        // Calcular los litros surtidos
         litros = galones * 3.758;

        // Calcular el monto total a pagar
        totalPagar = litros * 100.0;


        System.out.println("Galones surtidos: " + galones);
        System.out.println("Litros surtidos: " + litros);
        System.out.println("Total a pagar: " + totalPagar + " Bs.");







    }
}
