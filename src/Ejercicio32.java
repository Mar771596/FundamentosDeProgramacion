import java.util.Scanner;

public class Ejercicio32 {

    public class EvaluarExpresion {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Entrada de datos
            System.out.print("Ingrese el valor de P: ");
            int P = scanner.nextInt();

            System.out.print("Ingrese el valor de Q: ");
            int Q = scanner.nextInt();

            // Cálculo de la expresión
            double resultado = Math.pow(P, 3) + Math.pow(Q, 4) - 2 * Math.pow(P, 2);

            // Evaluación
            if (resultado > 680) {
                System.out.println("La expresión se cumple.");
                System.out.println("Valores: P = " + P + ", Q = " + Q);
            } else {
                System.out.println("La expresión NO se cumple con los valores ingresados.");
            }

            scanner.close();
        }
    }
}
