
package clases;


public class carrito {
    private usuario usuario;
    private int idCarrito;
 
    
    //falta hashmap
    public carrito() {
    }

    public carrito(usuario usuario, int idCarrito) {
        this.usuario = usuario;
        this.idCarrito = idCarrito;
    }

    public usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(usuario usuario) {
        this.usuario = usuario;
    }

    public int getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }
    
}
