
package clases;


public class categoria {
    private String nombre;
    private int idCategoria;

    public categoria() {
    }

    public categoria(String nombre, int idCategoria) {
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
