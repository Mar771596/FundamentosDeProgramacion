/* Un maestro desea saber qué porcentaje de hombres y qué porcentaje de mujeres hay en un grupo
 de estudiantes.
*/


import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        int hombres;
        int mujeres,total;
        double porcentajeHombres,porcentajeMujeres;
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de hombres y mujeres
        System.out.print("Ingrese el número de hombres: ");
         hombres = scanner.nextInt();

        System.out.print("Ingrese el número de mujeres: ");
         mujeres = scanner.nextInt();

        // Calcular el total de estudiantes
         total = hombres + mujeres;

        // Verificar que el total no sea cero para evitar división por cero
        if (total == 0) {
            System.out.println("No hay estudiantes en el grupo.");
        } else {
            // Calcular los porcentajes
            porcentajeHombres = (hombres * 100.0) / total;
            porcentajeMujeres = (mujeres * 100.0) / total;

            // Mostrar los resultados
            System.out.printf("Porcentaje de hombres: %.2f%%\n", porcentajeHombres);
            System.out.printf("Porcentaje de mujeres: %.2f%%\n", porcentajeMujeres);

        }

    }
    }



