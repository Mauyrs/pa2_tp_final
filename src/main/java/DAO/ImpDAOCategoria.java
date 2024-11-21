
package DAO;

import clases.Categoria;
import conexiones.ConSql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ImpDAOCategoria implements CategoriaDAO{

    @Override
    public Categoria obtener(int id) throws SQLException,ClassNotFoundException {
        
        Connection con = ConSql.obtener();
        Categoria cat = null;
        String sql = "SELECT id, nombre FROM categoria WHERE id = ?";
        PreparedStatement prep = con.prepareStatement(sql);

        prep.setInt(1, id);

        ResultSet rs = prep.executeQuery();

        if(rs.next()){
            cat = new Categoria(rs.getInt("id"),rs.getString("nombre"));
        }

        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        ConSql.cerrarResultSet(rs);
        return cat;
    }

    @Override
    public List<Categoria> listar() throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        List<Categoria> listaCat = new ArrayList();
        String sql = "SELECT id, nombre FROM categoria";
        PreparedStatement prep = con.prepareStatement(sql);

        ResultSet rs = prep.executeQuery();

        while(rs.next()){
            Categoria cat = new Categoria(rs.getInt("id"),rs.getString("nombre"));
            listaCat.add(cat);
        }

        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        ConSql.cerrarResultSet(rs);
        return listaCat;

    }

    @Override
    public int insertar(Categoria categoria) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        String sql = "INSERT INTO categoria (nombre) VALUES (?)";
        
        PreparedStatement prep = con.prepareStatement(sql);
        
        prep.setString(1, categoria.getNombre());
        
        int camb = prep.executeUpdate();
        
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        
        
        return camb;
        
    }

    @Override
    public int actualizar(Categoria categoria) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        String sql = "UPDATE categoria SET nombre= ? WHERE id = ?";
        
        
        PreparedStatement prep = con.prepareStatement(sql);
        
        prep.setString(1, categoria.getNombre());
        prep.setInt(2, categoria.getIdCategoria());
        
        int camb = prep.executeUpdate();
        
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        
        return camb;
    }

    @Override
    public int eliminar(Categoria categoria) throws ClassNotFoundException, SQLException{
        Connection con = ConSql.obtener();
        String sql = "DELETE FROM categoria WHERE id = ?";
        PreparedStatement prep = con.prepareStatement(sql);
        prep.setInt(1, categoria.getIdCategoria());
        
        int camb = prep.executeUpdate();
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        
        
        return camb;
    }
    
}
