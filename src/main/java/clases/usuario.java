
package clases;

import java.util.LinkedList;
import java.util.List;



public class Usuario {
    private int idUsuario;
    private String nombre;
    private String apellido;
    private String direccion;
    private String correo;
    private String hashContrasena;
    private int idTipo;

    public Usuario(String nombre, String apellido, String direccion, String correo, String hashContrasena, int idTipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.hashContrasena = hashContrasena;
        this.idTipo = idTipo;
    }

    public Usuario(int idUsuario, String nombre, String apellido, String direccion, String correo, String hashContrasena, int idTipo) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.hashContrasena = hashContrasena;
        this.idTipo = idTipo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public String getHashContrasena() {
        return hashContrasena;
    }

    public void setHashContrasena(String hashContrasena) {
        this.hashContrasena = hashContrasena;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }
    
    
    
    
    
    
    

    
    
}