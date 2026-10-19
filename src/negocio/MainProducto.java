package negocio;

public class MainProducto {
        public static void main(String[] args) {

            System.out.println("\nNumero de Objetos antes de crearlos: " + Producto.getTotalCreados());
            Producto producto1 = new Producto("Mouse", 20, "Tecnologia");

            System.out.println("Numero de Objetos luego de crear 1: " + Producto.getTotalCreados());

            Producto producto2 = new Producto("Silla Ergonomica", 150, "Muebles");
            Producto producto3 = new Producto("Audifonos", 45.50, "Audio");

            System.out.println("Numero de Objetos luego de crear 3: " + Producto.getTotalCreados());

            System.out.println("\n=== PRODUCTOS ====");
            System.out.println("ID: " + producto1.getId());
            System.out.println("Nombre: " + producto1.getNombre());
            System.out.println("Precio: " + producto1.getPrecio());
            System.out.println("Categoria: " + producto1.getCategoria());
            System.out.println("");

            System.out.println("ID: " + producto2.getId());
            System.out.println("Nombre: " + producto2.getNombre());
            System.out.println("Precio: " + producto2.getPrecio());
            System.out.println("Categoria: " + producto2.getCategoria());
            System.out.println("");

            System.out.println("ID: " + producto3.getId());
            System.out.println("Nombre: " + producto3.getNombre());
            System.out.println("Precio: " + producto3.getPrecio());
            System.out.println("Categoria: " + producto3.getCategoria());

            // Consultar el total de objetos creados
            System.out.println("\n====== RESULTADOS CONTADOR =====");
            System.out.println("Total de productos creados: " + Producto.getTotalCreados());

        }
}



