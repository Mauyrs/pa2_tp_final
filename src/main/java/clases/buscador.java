
package clases;

import java.util.LinkedList;
import java.util.List;


public class buscador {
    private List <producto> listaProductos;

    public buscador() {
        this.listaProductos = new LinkedList <>();
    }

    public buscador(List<producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public List<producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
}
