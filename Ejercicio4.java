import java.util.Scanner;

public class Ejercicio4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el tipo de carne (vaca o cordero): ");
            String tipoCarne = sc.nextLine();
            System.out.println("Introduce el modo de cocción (casi crudo, al punto o bien hecho): ");
            String modoCoccion = sc.nextLine();
            System.out.println("Introduce el peso de la carne en gramos: ");
            int pesoCarne = sc.nextInt();
            int tiempoCoccion = 0;
            if (tipoCarne.equals("vaca")) {
                if (modoCoccion.equals("casi crudo")) {
                    tiempoCoccion = 10 * pesoCarne / 500;
                } else if (modoCoccion.equals("al punto")) {
                    tiempoCoccion = 17 * pesoCarne / 500;
                } else if (modoCoccion.equals("bien hecho")) {
                    tiempoCoccion = 25 * pesoCarne / 500;
                }
            } else if (tipoCarne.equals("cordero")) {
                if (modoCoccion.equals("casi crudo")) {
                    tiempoCoccion = 15 * pesoCarne / 400;
                } else if (modoCoccion.equals("al punto")) {
                    tiempoCoccion = 25 * pesoCarne / 400;
                } else if (modoCoccion.equals("bien hecho")) {
                    tiempoCoccion = 40 * pesoCarne / 400;
                }
            }
            System.out.println("El tiempo de cocción es de " + tiempoCoccion + " segundos.");
        }
}
