import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el apellido del empleado");
        String apellido = sc.nextLine();
        System.out.println("Introduce el nombre del empleado");
        String nombre = sc.nextLine();
        System.out.println("Introduce el puesto del empleado" + "\n" + "1. Agente de servicio" + "\n" + "2. Empleado de oficina" + "\n" + "3. Directivo");
        int puesto = sc.nextInt();
        String puesto_escrito = null;

        if (puesto == 1) {
            puesto_escrito = "Agente de servicio";
        }if (puesto == 2) {
            puesto_escrito = "Empleado de oficina";
        }if (puesto == 3) {
            puesto_escrito = "Directivo";
        }
        System.out.println("Introduce las horas trabajadas");
        int horas = sc.nextInt();
        System.out.println("Introduce la tarifa por hora");
        double tarifa = sc.nextDouble();
        System.out.println("Introduce el numero de hijos");
        int hijos = sc.nextInt();
        double salarioBruto = 0;
        double primaFamiliar = 0;
        if (horas < 169) {
            salarioBruto = horas * tarifa;
        } else if (horas >= 169 && horas <= 180) {
            salarioBruto = horas * (tarifa * 1.5);
        } else if (horas > 180) {
            salarioBruto = horas * (tarifa * 1.6);
        }
        if (hijos == 1) {
            primaFamiliar = 20;
        } else if (hijos == 2) {
            primaFamiliar = 50;
        } else if (hijos > 2) {
            primaFamiliar = 70 + (20 * (hijos - 2));
        }
        double salarioNeto = salarioBruto + primaFamiliar;
        System.out.println("Nómina simplificada");
        System.out.println("Apellido: " + apellido);
        System.out.println("Nombre: " + nombre);
        System.out.println("Puesto: " + puesto_escrito);
        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("Prima familiar: " + primaFamiliar);
        System.out.println("Salario neto: " + salarioNeto);
    }
}

