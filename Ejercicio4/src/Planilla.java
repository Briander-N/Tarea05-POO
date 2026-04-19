import java.util.Scanner;
public class Planilla {
    String cliente;
    double consumo;
    double costoKW;

    void ingresarDatos() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        cliente = sc.nextLine();

        System.out.print("Ingrese el consumo (kW): ");
        consumo = sc.nextDouble();

        System.out.print("Ingrese el costo por kW: ");
        costoKW = sc.nextDouble();
    }

    double calcularSubtotal() {
        return consumo * costoKW;
    }
    double calcularIVA() {
        return calcularSubtotal() * 0.15;
    }
    double calcularTotal() {
        return calcularSubtotal() + calcularIVA();
    }
    void mostrarPlanilla() {
        System.out.println("\n----------- PLANILLA DE LUZ -----------");
        System.out.println("Cliente: " + cliente);
        System.out.println("Subtotal: " + calcularSubtotal());
        System.out.println("IVA: " + calcularIVA());
        System.out.println("Total a pagar: " + calcularTotal());
        System.out.println("---------------------------------------");
    }
}
