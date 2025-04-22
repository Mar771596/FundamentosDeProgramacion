import java.util.Scanner;
/*  Suponga que un individuo decide invertir su capital en un banco y desea saber cuánto dinero ganará
    después de un mes si el banco paga a razón de 2% mensual.*/

public  class Ejercicio2 {

    public static void main(String[] args) {
        //Definicion de variables
        double capital = 0;
        double interes = 0;
        double ganancia = 0;
        double total = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el capital a invertir: ");
        capital = scan.nextDouble();

        System.out.println("Ingrese la tasa de interes");
        interes = scan.nextDouble();

        //double tasaInteres = 0.02;

        ganancia = capital * interes / 100;
        total = capital + ganancia;

        System.out.println("La ganancia por concepto de intereses después de un mes es: " + ganancia);
        System.out.println("El saldo total despues de un mes es de: " + total);

    }

    }
