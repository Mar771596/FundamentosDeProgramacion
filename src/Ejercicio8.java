import java.util.Scanner;

/*
8. Calcule el área de un triángulo en función de las longitudes de sus lados, utilizando la fórmula:
√p(p­a)(p­b)(p­c) donde p = (a+b+c) / 2

 */
public class Ejercicio8 {
    public static void main(String[] args) {

        double area;
        double lado;
        double ladoA,ladoB,ladoC,valorP;

        Scanner scan= new Scanner(System.in);

        System.out.println("Digite el lado A");
        ladoA= scan.nextInt();
        System.out.println("Digite el lado B");
        ladoB= scan.nextInt();
        System.out.println("Digite el lado C");
        ladoC= scan.nextInt();

        valorP = ladoA+ladoB+ladoC/2;

       area = Math.sqrt(valorP * (valorP-ladoA) * (valorP-ladoB) * (valorP-ladoC));
        System.out.println("El area del triangulo es: "+ area);

    }
}
