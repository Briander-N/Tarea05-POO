//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // CASO INICIAL
    Producto p = new Producto(
            "PRD-105",
            "Disco SSD 1TB",
            "Almacenamiento",
            89.50,
            12,
            8
    );

    p.mostrarReporte();

    // ACTUALIZACIÓN VÁLIDA
    System.out.println("\n--- Actualización válida ---");
    p.setPrecioUnitario(95.00);
    p.setStockDisponible(5);

    p.mostrarReporte();

    // CASO INVÁLIDO
    System.out.println("\n--- Intento inválido ---");
    p.setStockDisponible(-3);

    p.mostrarReporte();
}
