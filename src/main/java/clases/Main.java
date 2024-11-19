
package clases;

import conexiones.ConSql;
import igu.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class main {
    public static void main(String [] args ){
        
        try {
            Connection con = ConSql.obtener();
            if (con!=null) {
                System.out.println("YEEEEEEEEEEIIIIII");
            }
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        ProductoNuevo log = new ProductoNuevo();
        
        log.setVisible(true);
        log.setLocationRelativeTo(null);// para que cuando se abra abre en el medio de la pantalla  
    }
}
