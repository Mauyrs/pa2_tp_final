
package conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConSql {
    
    private static final String url = "jdbc:mysql://localhost:3306/tienda";
    private static final String usu = "root";
    private static final String contra = "";
    
    public static Connection obtener() throws ClassNotFoundException, SQLException{
        Connection con = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url,usu,contra);
        
        return con;
    }
}
