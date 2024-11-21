package DAO;

import clases.Pedido;
import conexiones.ConSql;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ImpDAOPedido implements PedidoDAO {

    @Override
    public Pedido obtener(int id) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        Pedido ped = null;

        String sql = "SELECT id, id_estado, entrega_estimada, id_usuario, fecha_pedido FROM pedido WHERE id = ?";

        PreparedStatement prep = con.prepareStatement(sql);

        prep.setInt(1, id);

        ResultSet rs = prep.executeQuery();
        if (rs.next()) {
            int id_estado = rs.getInt("id_estado");
            LocalDate entrega_estimada = rs.getDate("entrega_estimada").toLocalDate();
            int id_usuario = rs.getInt("id_usuario");
            LocalDate fecha_pedido = rs.getDate("fecha_pedido").toLocalDate();
            
            ped = new Pedido(id, id_estado, entrega_estimada, id_usuario, fecha_pedido);

        }

        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        ConSql.cerrarResultSet(rs);

        return ped;

    }

    @Override
    public List<Pedido> listar() throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        List<Pedido> pedidos = new ArrayList();

        String sql = "SELECT id, id_estado, entrega_estimada, id_usuario, fecha_pedido FROM pedido";

        PreparedStatement prep = con.prepareStatement(sql);

        ResultSet rs = prep.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("id");
            int id_estado = rs.getInt("id_estado");
            LocalDate entrega_estimada = rs.getDate("entrega_estimada").toLocalDate();
            int id_usuario = rs.getInt("id_usuario");
            LocalDate fecha_pedido = rs.getDate("fecha_pedido").toLocalDate();
            
            Pedido ped = new Pedido(id, id_estado, entrega_estimada, id_usuario, fecha_pedido);
            pedidos.add(ped);

        }

        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        ConSql.cerrarResultSet(rs);

        return pedidos;    
    }

    @Override
    public int insertar(Pedido ped) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        String sql = "INSERT INTO pedido (id_estado, entrega_estimada, id_usuario, fecha_pedido) VALUES (?, ?, ?, ?)";
        
        PreparedStatement prep = con.prepareStatement(sql);
        prep.setInt(1, ped.getIdEstado());
        prep.setDate(2, Date.valueOf(ped.getEntregaEstimada()));
        prep.setDouble(3, ped.getIdUsuario());
        prep.setDate(4, Date.valueOf(ped.getFechaPedido()));

            
        int camb = prep.executeUpdate();
        
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        
        return camb;        
    }

    @Override
    public int actualizar(Pedido ped) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        String sql = "UPDATE pedido SET id_estado = ?, entrega_estimada = ?, id_usuario = ?, fecha_pedido = ? WHERE id=?";
        
        PreparedStatement prep = con.prepareStatement(sql);
        prep.setInt(1, ped.getIdEstado());
        prep.setDate(2, Date.valueOf(ped.getEntregaEstimada()));
        prep.setDouble(3, ped.getIdUsuario());
        prep.setDate(4, Date.valueOf(ped.getFechaPedido()));
        prep.setInt(5, ped.getIdPedido());
        
        
        int camb = prep.executeUpdate();
        
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        
        return camb;
    }

    @Override
    public int eliminar(Pedido ped) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        String sql = "DELETE FROM pedido WHERE id = ?";
        PreparedStatement prep = con.prepareStatement(sql);
        prep.setInt(1, ped.getIdPedido());
        
        int camb = prep.executeUpdate();
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        
        
        return camb;    }
    
}
