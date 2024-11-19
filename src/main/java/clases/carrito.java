
package clases;


public class Carrito {
    private Usuario usuario;
    private int idCarrito;
 
    
    //falta hashmap
    public Carrito() {
    }

    public Carrito(Usuario usuario, int idCarrito) {
        this.usuario = usuario;
        this.idCarrito = idCarrito;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }
    
}
