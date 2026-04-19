import java.util.Scanner;
public class Calificacion {
    String nombre;
    double nota1, nota2, nota3;


    void ingresarDatos(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre: ");
        nombre = sc.nextLine();

        System.out.println("Nota 1: ");
        nota1 = sc.nextDouble();

        System.out.println("Nota 2: ");
        nota2 = sc.nextDouble();

        System.out.println("Nota 3: ");
        nota3 = sc.nextDouble();
    }

    double calcularPromedio(){
        return (nota1 + nota2 + nota3) / 3;
    }

    String obtenerEstado() {
        double promedio = calcularPromedio();

        if (promedio >= 7) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    void mostrarReporte() {
        System.out.println("\n-------- REPORTE ACADÉMICO --------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio final: " + calcularPromedio());
        System.out.println("Estado: " + obtenerEstado());
        System.out.println("-----------------------------------");
    }


}
