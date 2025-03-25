/* Un alumno desea saber cuál será su calificación final en la materia de computación. Dicha calificación
se compone de los siguientes porcentajes: 55% del promedio de sus tres calificaciones parciales,
30% de la calificación del examen final y 15% de la calificación de un trabajo final.

 */


import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        double parcial1, parcial2, parcial3,calificacionFinal;
        double trabajoFinal, examenFinal, promedioParciales;

    Scanner scanner = new Scanner(System.in);

    // Solicitar las calificaciones parciales
    System.out.print("Ingrese la primera calificación parcial: ");
     parcial1 = scanner.nextDouble();

    System.out.print("Ingrese la segunda calificación parcial: ");
     parcial2 = scanner.nextDouble();

    System.out.print("Ingrese la tercera calificación parcial: ");
     parcial3 = scanner.nextDouble();

    // Solicitar la calificación del examen final
    System.out.print("Ingrese la calificación del examen final: ");
     examenFinal = scanner.nextDouble();

    // Solicitar la calificación del trabajo final
    System.out.print("Ingrese la calificación del  trabajo final: ");
     trabajoFinal = scanner.nextDouble();

    // Calcular el promedio de las calificaciones parciales
    promedioParciales = (parcial1 + parcial2 + parcial3) / 3;

    // Calcular la calificación final
     calificacionFinal =( promedioParciales * 0.55 + examenFinal * 0.30 + trabajoFinal * 0.15);

    System.out.println("La calificacion final de la materia es: " +calificacionFinal);
}
}





