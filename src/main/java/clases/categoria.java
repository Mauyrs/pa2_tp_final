
package clases;


public class Categoria {
    
    private int idCategoria;
    private String nombre;
    

    public Categoria() {
    }
    
    
  

    public Categoria(int idCategoria, String nombre) {
        this.nombre = nombre;
        this.idCategoria = idCategoria;
    }

    @Override
    public String toString(){
        return "Nombre: "+this.nombre +" ID: "+this.idCategoria;
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
