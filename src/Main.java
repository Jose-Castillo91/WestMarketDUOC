import java.util.Scanner;

/**
 * Trabajo creado por:
 * Estefania Andrea Neira Sepúlveda
 * Moises Alfredo Martinez Vidal
 * José Ignacio Castillo Farias
 */


public class Main {
    public static void main(String[] args) {

        // Se crea el objeto Scanner para leer entrada por consola
        Scanner scanner = new Scanner(System.in);

        // Se piden datos al usuario
        int id_producto = solicitaEntero(scanner, "Ingrese el codgio del producto: ");
        if (id_producto == -1)return;

        String descripcion_producto = solicitarTexto(scanner, "Ingresa la descripción del producto: ");
        if (descripcion_producto == null) return;

        int precio_producto = solicitaEntero(scanner, "Ingresa el precio del producto: ");
        if (precio_producto == -1) return;

        int cantidad = solicitaEntero(scanner, "Ingrese la cantidad del producto: ");
        if (cantidad == -1) return;


        // Se crea el objeto producto con los datos ingresados
        Producto producto = new Producto(id_producto, descripcion_producto, precio_producto);

        // Muestra el detalle del producto y el total a pagar
        System.out.println("\n----- DETALLE DEL PRODUCTO -----");
        System.out.println("Id Producto: " + producto.getId_producto());
        System.out.println("Descripción: " + producto.getDescripcion_producto());
        System.out.println("Precio unitario: $" + producto.getPrecio_producto());
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total a pagar: $" + (producto.getPrecio_producto() * cantidad));
    }

    // Método para solicitar un numero entero hasta 3 intentos
    private static int solicitaEntero(Scanner scanner, String mensaje) {
        int intentos = 0;
        while (intentos < 3) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine();
            try {
                return Integer.parseInt(entrada); // Convierte la entrada a entero
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Debe ingresar un número entero.");
                intentos++;
            }
        }
        System.out.println("Se ha excedido el número de intentos. Finalizando aplicación.");
        return -1;
    }

    // Método para solicitar texto no vacío hasta 3 intentos
    private static String solicitarTexto(Scanner scanner, String mensaje) {
        int intentos = 0;
        while (intentos < 3) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine();
            if (!entrada.trim().isEmpty()) {
                return entrada;
            } else {
                System.out.println("La descripción no puede estar vacía.");
                intentos++;
            }
        }
        System.out.println("Se ha excedido el número de intentos. Finalizando aplicación.");
        return null;
    }

}