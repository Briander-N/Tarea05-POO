import java.util.Scanner;
public class Pedido {
    String cliente;
    String plato;
    Double precio;
    int cantidad;

    void ingresarDatos(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Cliente: ");
        cliente = sc.nextLine();

        System.out.println("Plato: ");
        plato = sc.nextLine();

        System.out.println("Precio: ");
        precio = sc.nextDouble();

        System.out.println("Cantidad: ");
        cantidad = sc.nextInt();

    }
    double calcularSubtotal(){
        return precio * cantidad;
    }
    double descuento(){
        Double Subtotal = calcularSubtotal();
        if (Subtotal > 25){
            return Subtotal * 0.10;
        }else{
            return 0;
        }
    }
    double calcularTotal(){
        return calcularSubtotal() - descuento();
    }
    void mostrarCuenta() {
        System.out.println("\n----------- REPORTE DE EMPLEADO -----------");
        System.out.println("Cliente: " + cliente);
        System.out.println("Plato: " + plato);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: " + calcularSubtotal());
        System.out.println("Descuento: " + descuento());
        System.out.println("Precio Final: " + calcularTotal());
        System.out.println("-------------------------------------------");
    }
}
