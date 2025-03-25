
/* Una empresa X trabaja con láminas de hierro para fabricar una pieza. Se conoce que (a) la lámina mide en promedio 4
metros de largo por 1.5  metros de ancho; (b) la pieza a fabricar  consume 0.5 metros en total.  Se requiere que calcule y muestre
cuántas piezas se fabrican con una lámina y cuánto será el desperdicio.
*/

public class Ejercicio16 {
    public static void main(String[] args) {
        // Dimensiones de la lámina
        double largoLamina = 4.0;
        double anchoLamina = 1.5;
        double areaLamina = largoLamina * anchoLamina;
        double desperdicio;
        int cantidadPiezas;

        // Consumo de material por pieza
        double consumoPorPieza = 0.5;

        // Calcular cantidad de piezas y desperdicio
         cantidadPiezas = (int) (areaLamina / consumoPorPieza);
         desperdicio = areaLamina - (cantidadPiezas * consumoPorPieza);

        // Mostrar resultados
        System.out.println("Cantidad de piezas que se pueden fabricar: " + cantidadPiezas);
        System.out.println("Desperdicio de material en metros cuadrados: " + desperdicio);
    }
}
