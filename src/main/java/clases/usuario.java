
package clases;

import java.util.LinkedList;
import java.util.List;



public class Usuario {
  private String nombre;
  private String direccion;
  private String correo;
  private String contrasena;
  private int idUsuario;
  private List<Pedido>listaPedidos;
  private Carrito carritoUsu;
  

    public Usuario() {
        this.listaPedidos = new LinkedList <> () ;
    }

    public Usuario(String nombre, String direccion, String correo, String contrasena, int idUsuario, List<Pedido> listaPedidos, Carrito carritoUsu) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.contrasena = contrasena;
        this.idUsuario = idUsuario;
        this.listaPedidos = listaPedidos;
        this.carritoUsu = carritoUsu;
    }

    public Carrito getCarritoUsu() {
        return carritoUsu;
    }

    public void setCarritoUsu(Carrito carritoUsu) {
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

    public List<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(List<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }
  
    public void enlazarPedidos(Pedido pedi){
    listaPedidos.add(pedi);
        System.out.println("Sus lista de pedidos ha sido actualizada \n");
    
}
    public void mostrarPedios(Pedido pedi){
        System.out.println("Lista de sus pedidos");
        for(Pedido ped: listaPedidos){
            System.out.println("ID "+ ped.getIdPedido()+ " - "+  "monto "+ ped.getMontoPedido()+ "\n" );
        }
    }
    
}