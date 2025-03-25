import java.util.Scanner;

/*  Dada una cantidad en metros, se requiere que la convierta a pies y pulgadas, considerando lo
siguiente: 1 metro = 39.27 pulgadas; 1 pie = 12 pulgadas.

 */
public class Ejercicio7 {
    public static void main(String[] args) {

        double metros,pulgadas,pies;

            Scanner scan= new Scanner(System.in);

        System.out.println("Digite la cantidada en metros");
        metros = scan.nextInt();

        pulgadas= metros * 39.27;
        pies = pulgadas * 12;

        System.out.println("La cantidad de metros ingresas es: " + metros);
        System.out.println("La cantidad de pulgadas  ingresas es: " + pulgadas);


    }
}
