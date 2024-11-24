package conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConSql {
    
    private static final String url = "jdbc:mysql://localhost:3306/tienda";
    private static final String usu = "root";
    private static final String contra = "";
    
    public static Connection obtener() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,usu,contra);
        return con;
    }
    
    public static void cerrarConexion(Connection conexion) throws SQLException{
        conexion.close();
    }
    
    public static void cerrarPrepStmt(PreparedStatement statement) throws SQLException{
        statement.close();
    }
    
    
    public static void cerrarResultSet(ResultSet rs)throws SQLException{
        rs.close();
    }
    
}
