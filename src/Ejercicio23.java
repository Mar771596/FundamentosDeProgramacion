/* Suponga que a partir de una Tonelada de maíz una planta productora obtiene M kilogramos de
harina y N litros de aceite. La planta vende cada bulto de 24 paquetes de un kilogramo de harina en
Bs. B1 y cada caja de 15 envases de aceite en Bs. B2. Suponiendo que la planta vende todo lo que
produce, calcular el ingreso total por la venta de cada tonelada de maíz, sabiendo además que cada
kilogramo de harina y cada litro de aceite que restan del embalaje se venden al detal a los precios de
Bs. B3 y Bs. B4 respectivamente. Pruebe su algoritmo o programa con los sig. Valores: M=452,
N=197, B1=132, B2= 180, B3= 7,50 y B4= 14,50. Respuesta: 4895 */

import java.util.Scanner;

public class Ejercicio23 {
    // 1 bulto =24kg
    // B1 precio por bulto
    //1 caja de aceite = 15 envases  litros
    // B2 = al precio por caja de aceite
    // B3 precio al detal de los kilos de harina
    // B4 precio añ detal de los litros de aceite
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N,cantidadBultosHarina, CantHarinaDetal,CantCajasAceite,aceiteDetal ;
        double B1,B2,B3,B4,ingresoTotal;

        System.out.print("Ingrese la cantidad de kilogramos de harina producidos (M): ");
        int M = scanner.nextInt();

        System.out.print("Ingrese el precio de un bulto de harina (B1 en Bs.): ");
        B1 = scanner.nextDouble();

        System.out.print("Ingrese el precio de un kg de harina al detal (B3 en Bs.): ");
        B3 = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de litros de aceite producidos (N): ");
        N = scanner.nextInt();

        System.out.print("Ingrese el precio de una caja de aceite (B2 en Bs.): ");
         B2 = scanner.nextDouble();

        System.out.print("Ingrese el precio de un litro de aceite al detal (B4 en Bs.): ");
        B4 = scanner.nextDouble();

        // hallo la cantidad de bultos de harina que hay
         cantidadBultosHarina = M / 24;
        System.out.println(cantidadBultosHarina);
        // halla la cantidad kilos de harina restantes
        // Modulo que me devuelve el residuo de una division
        CantHarinaDetal = M % 24;
        System.out.println(CantHarinaDetal);

        //Hallo la cantidad de cajas de aceite que hay
        CantCajasAceite = N / 15;
        System.out.println(CantCajasAceite);
        //Hallo la cantidad de litros de aceite restantes
        aceiteDetal = N % 15;

         ingresoTotal = (cantidadBultosHarina * B1) + (CantCajasAceite * B2) + (CantHarinaDetal * B3) + (aceiteDetal * B4);


        System.out.println("Bultos de harina vendidos: " + cantidadBultosHarina);
        System.out.println("Kilogramos de harina vendidos al detal: " + CantHarinaDetal);
        System.out.println("Cajas de aceite vendidas: " + CantCajasAceite);
        System.out.println("Litros de aceite vendidos al detal: " + aceiteDetal);
        System.out.println("Ingreso total: " + ingresoTotal + " Bs.");

    }

}
