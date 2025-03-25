
import java.util.Scanner;
/* Un vendedor recibe un sueldo base, más un 10% extra por comisiones de sus ventas. El vendedor
desea saber cuánto dinero obtendrá por concepto de comisiones por las tres ventas que realizó en
el mes y el total que recibirá tomando en cuenta su sueldo base y sus comisiones.
*/

public class Ejercicio3 {

    public static void main(String[] args) {
        //Definicion de variables
        double sueldoBase;
        double comision;
        double venta1;
        double venta2;
        double venta3;
        double totalSueldo;

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el sueldo base del vendedor: ");
        sueldoBase = leer.nextDouble();

        System.out.println("Ingrese el valor de la venta 1: ");
        venta1 = leer.nextDouble();

        System.out.println("Ingrese el valor de la venta 2: ");
        venta2 = leer.nextDouble();

        System.out.println("Ingrese el valor de la venta 3: ");
        venta3 = leer.nextDouble();

        comision = (venta1+venta2+venta3)*10/100;
        totalSueldo = sueldoBase + comision;

        System.out.println("Sueldo Base: "+ sueldoBase);
        System.out.println("Comision: "+comision);
        System.out.println("Sueldo total: " + totalSueldo);

    }
}