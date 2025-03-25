import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        sumar(3,4);
        double v = sumarNumeros(3, 8);
        System.out.println(v);

        promediarEdad();

    }

    public static void sumar(double a, double b){
        System.out.println(a+b);
    }
    
    public static double sumarNumeros(double a, double b){
        //double suma = a + b;
        //return suma;
        return a+b;
    }

    public static void promediarEdad(){
        int edad1 = 0;
        int edad2 = 0;
        int edad3 = 0;
        Scanner lapiz=new Scanner(System.in);
        System.out.println("Digite la edad de la primera persona: ");
        edad1=lapiz.nextInt();
        System.out.println("Digite la edad de la segunda persona: ");
        edad2=lapiz.nextInt();
        System.out.println("Digite la edad de la tercera persona: ");
        edad3=lapiz.nextInt();

        double promedio =(edad1+edad2+edad3)/3;

        System.out.println("El promedio de las edades es: "+ promedio);

    }

    }


