
package clases;

import java.util.LinkedList;
import java.util.List;



public class usuario {
  private String nombre;
  private String direccion;
  private String correo;
  private String contrasena;
  private int idUsuario;
  private List<pedido>listaPedidos;
  private carrito carritoUsu;
  

    public usuario() {
        this.listaPedidos = new LinkedList <> () ;
    }

    public usuario(String nombre, String direccion, String correo, String contrasena, int idUsuario, List<pedido> listaPedidos, carrito carritoUsu) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.contrasena = contrasena;
        this.idUsuario = idUsuario;
        this.listaPedidos = listaPedidos;
        this.carritoUsu = carritoUsu;
    }

    public carrito getCarritoUsu() {
        return carritoUsu;
    }

    public void setCarritoUsu(carrito carritoUsu) {
        this.carritoUsu = carritoUsu;
    }

   

  
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public List<pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(List<pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }
  
    
    
    
}
