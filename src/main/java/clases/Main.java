
package clases;

import DAO.CategoriaDAO;
import DAO.ImpDAOCategoria;
import DAO.ImpDAOTipoUsuario;
import igu.*;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class main {
    public static void main(String [] args ){
        
        ImpDAOCategoria categoriaDAO = new ImpDAOCategoria();
        ImpDAOTipoUsuario tipoUsuDAO = new ImpDAOTipoUsuario();
        
        TipoUsuario nuevo = null;
        
        try {
            nuevo = tipoUsuDAO.obtener(3);
            tipoUsuDAO.eliminar(nuevo);
            
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        ProductoNuevo log = new ProductoNuevo();
        
        log.setVisible(true);
        log.setLocationRelativeTo(null);// para que cuando se abra abre en el medio de la pantalla  
    }
}
