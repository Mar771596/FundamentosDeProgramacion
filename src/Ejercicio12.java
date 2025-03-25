import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        double examenMatematica, promedioTareasMat ;
        double tareaMat1,promedioTareasFis;
        double tareaMat2,promedioTareasQui;
        double promedioMatematica;
        double tareaMat3,promedioFisica;
        double examenFisicapromedioQuimica;
        double tareaFis1, examenFisica;
        double tareaFis2, promedioQuimica;
        double examenQuimica,promedioGeneral;
        double tareaQui1;
        double tareaQui2;
        double tareaQui3;

        Scanner scanner = new Scanner(System.in);

        // Solicitar calificaciones de Matemática
        System.out.print("Ingrese la calificación del examen de Matemática: ");
         examenMatematica = scanner.nextDouble();

        System.out.print("Ingrese la calificación de la tarea 1 de Matemática: ");
         tareaMat1 = scanner.nextDouble();

        System.out.print("Ingrese la calificación de la tarea 2 de Matemática: ");
         tareaMat2 = scanner.nextDouble();

        System.out.print("Ingrese la calificación de la tarea 3 de Matemática: ");
         tareaMat3 = scanner.nextDouble();

        // Solicitar calificaciones de Física
        System.out.print("Ingrese la calificación del examen de Física: ");
         examenFisica = scanner.nextDouble();

        System.out.print("Ingrese la calificación de la tarea 1 de Física: ");
         tareaFis1 = scanner.nextDouble();

        System.out.print("Ingrese la calificación de la tarea 2 de Física: ");
         tareaFis2 = scanner.nextDouble();

        // Solicitar calificaciones de Química
        System.out.print("Ingrese la calificación del examen de Química: ");
         examenQuimica = scanner.nextDouble();

        System.out.print("Ingrese la calificación de la tarea 1 de Química: ");
         tareaQui1 = scanner.nextDouble();

        System.out.print("Ingrese la calificación de la tarea 2 de Química: ");
         tareaQui2 = scanner.nextDouble();

        System.out.print("Ingrese la calificación de la tarea 3 de Química: ");
         tareaQui3 = scanner.nextDouble();

        // Calcular promedios de tareas
        promedioTareasMat = (tareaMat1 + tareaMat2 + tareaMat3) / 3;
         promedioTareasFis = (tareaFis1 + tareaFis2) / 2;
         promedioTareasQui = (tareaQui1 + tareaQui2 + tareaQui3) / 3;

        // Calcular promedios finales
         promedioMatematica = (examenMatematica * 0.90) + (promedioTareasMat * 0.10);
         promedioFisica = (examenFisica * 0.80) + (promedioTareasFis * 0.20);
         promedioQuimica = (examenQuimica * 0.85) + (promedioTareasQui * 0.15);

        // Calcular promedio general
        promedioGeneral = (promedioMatematica + promedioFisica + promedioQuimica) / 3;


        // Mostrar resultados
        System.out.println("Resultados ---");
        System.out.println("Promedio de Matemática: " + promedioMatematica);
        System.out.println("Promedio de Física: " + promedioFisica);
        System.out.println("Promedio de Química: " + promedioQuimica);
        System.out.println("Promedio General: " + promedioGeneral);


    }
}
