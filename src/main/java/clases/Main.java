
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
        
        CategoriaDAO categoriaDAO = new ImpDAOCategoria();
      //  Categoria cate = new Categoria();
            Categoria cate = null;
        //cate.setNombre("Juguete");
        try {
        /*    cate = categoriaDAO.obtener(1);
            System.out.println(cate);
            cate.setNombre("celulares");
            categoriaDAO.actualizar(cate);
            System.out.println(cate);
          */  List <Categoria> listaCategorias = categoriaDAO.listar();
            for(Categoria cat : listaCategorias){
                System.out.println(cat);
            }
           // categoriaDAO.insertar(cate);
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        ProductoNuevo log = new ProductoNuevo();
        
        log.setVisible(true);
        log.setLocationRelativeTo(null);// para que cuando se abra abre en el medio de la pantalla  
    }
}
