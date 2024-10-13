
package clases;


public class producto {
   
    private String nombre;
    private int idProducto;
    private String descripcion;
    private double precio;
    private categoria categoria;
    private int cantidadStock;

    public producto() {
    }

    public producto(String nombre, int idProducto, String descripcion, double precio, categoria categoria, int cantidadStock) {
        this.nombre = nombre;
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.cantidadStock = cantidadStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
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

    public categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(categoria categoria) {
        this.categoria = categoria;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }
    
    
}
