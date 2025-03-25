
/* Calcule qué tanto por ciento anual cobraron por un préstamo de Bolívares X, si se pagaron Bolívares Y de intereses
en 4 años. La fórmula del interés es: Capital. Tiempo. Razón
I = 100  */
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        double capital;
        double intereses;
        int tiempo = 4;
        double tasaInteres;


        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el monto del préstamo ");
         capital = scan.nextDouble();

        System.out.print("Ingrese el total de intereses pagados  ");
         intereses = scan.nextDouble();

        tasaInteres = (intereses * 100) / (capital * tiempo);
        System.out.println("Tasa de interés anual: " + tasaInteres );

    }
}
