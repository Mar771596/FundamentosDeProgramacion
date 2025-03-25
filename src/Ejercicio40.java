import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args) {

        double montoPagar;
        double luz;
        double aseo;
        double lecturaAnterior;
        double lecturaActual;
        double consumo;

        Scanner recibos = new Scanner(System.in);


        System.out.println("Digite la lectura anterior");
        lecturaAnterior = recibos.nextInt();

        System.out.println("Digite la lectura actual");
        lecturaActual = recibos.nextInt();

        consumo = lecturaAnterior - lecturaActual;
        if (consumo > 0 && consumo <= 100) {
            montoPagar = consumo * 2622.67;

        } else if (consumo >= 101 && consumo <= 300) {
            montoPagar = consumo * 79.78;

        } else if (consumo >= 301 && consumo <= 500) {
            montoPagar = consumo * 89.52;
        } else if (consumo >= 501 && consumo <= 600) {

            montoPagar = consumo * 89.52;
        }


    }

    }


