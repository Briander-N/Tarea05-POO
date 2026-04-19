import java.util.Scanner;
public class Empleado {
    String nombre;
    int horasTrabajadas;
    double pagoPorHora;

    void ingresarDatos() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese las horas trabajadas: ");
        horasTrabajadas = sc.nextInt();

        System.out.print("Ingrese el pago por hora: ");
        pagoPorHora = sc.nextDouble();
    }

    double calcularSueldoBase(){
        return horasTrabajadas * pagoPorHora;
    }
    double calcularSueldoFinal() {
        return calcularSueldoBase() + calcularBono();
    }
    double calcularBono() {
        double sueldoBase = calcularSueldoBase();

        if (sueldoBase < 500) {
            return 20;
        } else {
            return 0;
        }
    }
    void mostrarReporte() {
        System.out.println("\n----------- REPORTE DE EMPLEADO -----------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo base: " + calcularSueldoBase());
        System.out.println("Bono: " + calcularBono());
        System.out.println("Sueldo final: " + calcularSueldoFinal());
        System.out.println("-------------------------------------------");
    }
}
