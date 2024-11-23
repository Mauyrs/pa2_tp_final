/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import clases.Categoria;
import clases.EstadoEntrega;
import conexiones.ConSql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mauri
 */
public class ImpDAOEstadoEntrega implements EstadoEntregaDAO {

    @Override
    public EstadoEntrega obtener(int id) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        EstadoEntrega est = null;
        String sql = "SELECT descripcion FROM categoria WHERE id = ?";
        PreparedStatement prep = con.prepareStatement(sql);

        prep.setInt(1, id);

        ResultSet rs = prep.executeQuery();

        if(rs.next()){
            est = new EstadoEntrega(id,rs.getString("descripcion"));
        }

        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        ConSql.cerrarResultSet(rs);
        return est;
        
    }

    @Override
    public List<EstadoEntrega> listar() throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        List<EstadoEntrega> estados = new ArrayList();
        String sql = "SELECT id, descripcion FROM categoria ";
        PreparedStatement prep = con.prepareStatement(sql);

        ResultSet rs = prep.executeQuery();

        while(rs.next()){
            Integer id = rs.getInt("id");
            EstadoEntrega est = new EstadoEntrega(id,rs.getString("descripcion"));
            estados.add(est);
            
        }

        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        ConSql.cerrarResultSet(rs);
        return estados;
        
    }

    @Override
    public int insertar(EstadoEntrega estado) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int actualizar(EstadoEntrega estado) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int eliminar(EstadoEntrega estado) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
