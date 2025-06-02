// Se crea clase de producto
public class Producto {

    // Atributos
    private int id_producto;
    private String descripcion_producto;
    private int precio_producto;

    // Constructor con parametros
    public Producto(int id_producto, String descripcion_producto, int precio_producto) {
        this.precio_producto = precio_producto;
        this.descripcion_producto = descripcion_producto;
        this.id_producto = id_producto;
    }

    //Getters para acceder a los atributos del producto

    public int getId_producto() {
        return id_producto;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public int getPrecio_producto() {
        return precio_producto;
    }
}
