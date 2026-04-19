public class Producto {

    public String codigo;
    public String nombre;
    public String categoria;
    private double precioUnitario;
    private int stockDisponible;
    private int stockMinimo;

    public Producto(String codigo, String nombre, String categoria, double precioUnitario, int stockDisponible, int stockMinimo) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;

        setPrecioUnitario(precioUnitario);
        setStockDisponible(stockDisponible);
        setStockMinimo(stockMinimo);
    }

    public boolean setPrecioUnitario(double precio) {
        if (precio > 0) {
            this.precioUnitario = precio;
            return true;
        } else {
            System.out.println("Precio inválido!!! Debe ser mayor a 0.");
            return false;
        }
    }
    public boolean setStockDisponible(int stock) {
        if (stock >= 0) {
            this.stockDisponible = stock;
            return true;
        } else {
            System.out.println("Stock inválido. No puede ser negativo.");
            return false;
        }
    }
    public boolean setStockMinimo(int stockMin) {
        if (stockMin >= 0) {
            this.stockMinimo = stockMin;
            return true;
        } else {
            System.out.println("Stock mínimo inválido.");
            return false;
        }
    }

    public double calcularValorInventario() {
        return precioUnitario * stockDisponible;
    }
    public String evaluarEstadoStock() {
        if (stockDisponible == 0) {
            return "Producto agotado";
        } else if (stockDisponible < stockMinimo) {
            return "Requiere reposición";
        } else {
            return "Stock suficiente";
        }
    }
    public void mostrarReporte() {
        System.out.println("\n========= REPORTE DE INVENTARIO =========");
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Categoría: " + categoria);
        System.out.println("Precio unitario: " + precioUnitario);
        System.out.println("Stock disponible: " + stockDisponible);
        System.out.println("Stock mínimo: " + stockMinimo);
        System.out.println("Valor total: " + calcularValorInventario());
        System.out.println("Estado: " + evaluarEstadoStock());
        System.out.println("=========================================");
    }

}
