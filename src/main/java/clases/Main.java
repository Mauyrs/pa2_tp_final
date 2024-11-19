
package clases;

import DAO.CategoriaDAO;
import DAO.ImpDAOCategoria;
import igu.*;
import java.sql.SQLException;
import java.util.List;

public class main {
    public static void main(String [] args ){
        
        CategoriaDAO categoriaDAO = new ImpDAOCategoria();
        
        
        ProductoNuevo log = new ProductoNuevo();
        
        log.setVisible(true);
        log.setLocationRelativeTo(null);// para que cuando se abra abre en el medio de la pantalla  
    }
}
