
package clases;

import java.util.List;


public class gestorUsuario {
    private List <usuario> listaUsuarios;

    public gestorUsuario() {
    }

    public gestorUsuario(List<usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public List<usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
}
