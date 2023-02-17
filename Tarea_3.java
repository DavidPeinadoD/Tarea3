import java.util.Scanner;
//Ejercicio 1
public class Tarea_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la temperatura");
        int temperatura = teclado.nextInt();
        if (temperatura < 2) {
            System.out.println("Riesgo de hielo");
        }
    }
}