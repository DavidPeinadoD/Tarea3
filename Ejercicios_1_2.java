import java.util.Scanner;
//Ejercicio 1
/*
public class Tarea_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la temperatura");
        int temperatura = teclado.nextInt();
        if (temperatura < 2) {
            System.out.println("Riesgo de hielo");
        }
    }
}*/
public class Ejercicios_1_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la temperatura");
        int temperatura = teclado.nextInt();
        if (temperatura < 2) {
            System.out.println("Riesgo de hielo");
        } else if (temperatura >= 2 && temperatura < 15) {
            System.out.println("Hace frio");
        } else if (temperatura >= 15 && temperatura < 30) {
            System.out.println("Buena temperatura");
        } else if (temperatura >= 30) {
            System.out.println("Hace calor");
        }
    }
}