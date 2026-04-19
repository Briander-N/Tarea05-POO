import java.util.Scanner;
public class Estudiante {
    String nombre;
    String carrera;
    int edad;

    void registrarDatos(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nombre: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese carrera: ");
        carrera = sc.nextLine();

        System.out.print("Ingrese edad: ");
        edad = sc.nextInt();

    }
    void mostrarDatos(){
        System.out.println("----- DATOS DEL ESTUDIANTE -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Edad: " + edad);
    }
}
