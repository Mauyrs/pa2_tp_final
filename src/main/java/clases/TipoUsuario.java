/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Mauri
 */
public class TipoUsuario {
    private int idTipoUsu;
    private String descripcion;
    
    public TipoUsuario(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoUsuario(int idTipoUsu, String descripcion) {
        this.idTipoUsu = idTipoUsu;
        this.descripcion = descripcion;
    }

    public int getIdTipoUsu() {
        return idTipoUsu;
    }

    public void setIdTipoUsu(int idTipoUsu) {
        this.idTipoUsu = idTipoUsu;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
