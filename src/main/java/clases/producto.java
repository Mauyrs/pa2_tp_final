
package clases;


public class Producto {
    private int idProducto;   
    private String nombre;
    private String descripcion;
    private double precio;
    private int idCategoria;
    private int cantidadStock;

    @Override
    public String toString() {
        return "ID: " + idProducto + ", Nombre: " + nombre + ", \n Descripcion: " + descripcion + "\nPrecio:" + precio + ", ID categoria: " + idCategoria + ", Stock: " + cantidadStock;
    }
    
    
    
    
    public Producto(String nombre, String descripcion, double precio, int idCategoria, int cantidadStock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.idCategoria = idCategoria;
        this.cantidadStock = cantidadStock;
    }
    
    
    public Producto(int idProducto, String nombre, String descripcion, double precio, int idCategoria, int cantidadStock) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.idCategoria = idCategoria;
        this.cantidadStock = cantidadStock;
    }

    
    
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }
    
    
    
    
    
    
    
}
