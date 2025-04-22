public class Ejercicio47 {

    public class ImparesNoDivisiblesPor7 {
        public static void main(String[] args) {
            System.out.println("Números impares menores que 100 y no divisibles por 7:");

            for (int i = 1; i < 100; i += 2) { // Solo números impares
                if (i % 7 != 0) { // No divisibles por 7
                    System.out.print(i + " ");
                }
            }
        }
    }
}
