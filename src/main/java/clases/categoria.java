
package clases;


public class Categoria {
    private String nombre;
    private int idCategoria;

    public Categoria() {
    }

    public Categoria(String nombre, int idCategoria) {
        this.nombre = nombre;
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    
}
