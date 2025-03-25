/* Un mayorista compra a un agricultor un lote de X naranjas a Bs. Y la docena. Después de vender
todas las naranjas a los detallistas, obtiene Bs. K. Calcular el porcentaje de ganancia obtenida en la
inversión. Pruebe su programa con los siguientes valores: X=48000, Y=6, K=42000 para obtener 75%
como resultado. */

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {

        int cantidadNaranjas;
        double precioPorDocena,ingresoTotal,costoCompra,ganancia, porcentajeGanancia;

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de naranjas compradas (X): ");
        cantidadNaranjas = scan.nextInt();

        System.out.print("Ingrese el precio de la docena de naranjas (Y en Bs.): ");
         precioPorDocena = scan.nextDouble();

        System.out.print("Ingrese el ingreso total obtenido de la venta (K en Bs.): ");
         ingresoTotal = scan.nextDouble();

        costoCompra = (cantidadNaranjas / 12.0) * precioPorDocena;

        ganancia = ingresoTotal - costoCompra;

        // Calcular el porcentaje de ganancia
         porcentajeGanancia = (ganancia / costoCompra) * 100;

        // Mostrar el resultado
        System.out.printf("Porcentaje de ganancia: %.2f%%\n", porcentajeGanancia);

    }
}
