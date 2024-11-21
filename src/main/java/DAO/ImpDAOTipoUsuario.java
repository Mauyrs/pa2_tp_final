
package DAO;

import clases.TipoUsuario;
import conexiones.ConSql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ImpDAOTipoUsuario implements TipoUsuarioDAO{

    @Override
    public TipoUsuario obtener(int id) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        TipoUsuario tipoUsu = null;
        
        String sql = "SELECT id, descripcion FROM tipo_usuario WHERE id = ?";
        
        PreparedStatement prep = con.prepareStatement(sql);
        
        prep.setInt(1, id);
        
        ResultSet rs = prep.executeQuery();
        if(rs.next()){
            tipoUsu = new TipoUsuario(rs.getInt("id"),rs.getString("descripcion"));
        }
        
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        ConSql.cerrarResultSet(rs);
        
        return tipoUsu;
        
    }

    @Override
    public List<TipoUsuario> listar() throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        List<TipoUsuario> tiposUsuario = new ArrayList();
        
        String sql = "SELECT id, descripcion FROM tipo_usuario";
        
        PreparedStatement prep = con.prepareStatement(sql);        
        ResultSet rs = prep.executeQuery();
        while(rs.next()){
            TipoUsuario tipoUsu = new TipoUsuario(rs.getInt("id"),rs.getString("descripcion"));
            tiposUsuario.add(tipoUsu);
        }
        
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        ConSql.cerrarResultSet(rs);
        
        return tiposUsuario;


    }

    @Override
    public int insertar(TipoUsuario tipo) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        String sql = "INSERT INTO tipo_usuario (descripcion) VALUES (?)";
        
        PreparedStatement prep = con.prepareStatement(sql);
        prep.setString(1, tipo.getDescripcion());
        
        int camb = prep.executeUpdate();
        
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        
        return camb;

    }

    @Override
    public int actualizar(TipoUsuario tipo) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        String sql = "UPDATE tipo_usuario SET descripcion = ? WHERE id=?";
        
        PreparedStatement prep = con.prepareStatement(sql);
        prep.setString(1, tipo.getDescripcion());
        prep.setInt(2, tipo.getIdTipoUsu());
        
        int camb = prep.executeUpdate();
        
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        
        return camb;

    }

    @Override
    public int eliminar(TipoUsuario tipo) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        String sql = "DELETE FROM tipo_usuario WHERE id = ?";
        PreparedStatement prep = con.prepareStatement(sql);
        prep.setInt(1, tipo.getIdTipoUsu());
        
        int camb = prep.executeUpdate();
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        
        
        return camb;
    }
    
}
