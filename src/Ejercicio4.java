/*Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber cuánto
deberá pagar finalmente por su compra.*/

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double compra;
        double desc = 15;
        double valorDesc;
        double total;

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el valor de la compra");
        compra = scan.nextDouble();
        valorDesc = compra * desc /100;
        total = compra - valorDesc;

        System.out.println(" Su compra total es de: "+compra);
        System.out.println("Usted tiene un descuento de "+desc+" equivalente a: "+valorDesc);
        System.out.println("El total a pagar es de: "+ total);

    }
}
