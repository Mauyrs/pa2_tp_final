package DAO;

import clases.DetallePedido;
import clases.Pedido;
import clases.Producto;
import clases.Usuario;
import conexiones.ConSql;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
        
        PreparedStatement prep = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        prep.setInt(1, ped.getIdEstado());
        prep.setDate(2, Date.valueOf(ped.getEntregaEstimada()));
        prep.setDouble(3, ped.getIdUsuario());
        prep.setDate(4, Date.valueOf(ped.getFechaPedido()));

            
        int camb = prep.executeUpdate();
        ResultSet rs= prep.getGeneratedKeys();
        if(rs.next()){
            ped.setIdPedido(rs.getInt(1));
        }
        
        
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        ConSql.cerrarResultSet(rs);
        
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

    @Override
    public Pedido insertarCarrito(Usuario usu, Map<Producto, Integer> carrito) throws SQLException, ClassNotFoundException {
        
        LocalDate hoy = LocalDate.now();
        
        Pedido ped = new Pedido(6, hoy.plusDays(10), usu.getIdUsuario(), hoy);
        insertar(ped);
        
        Connection con = ConSql.obtener();
        
        String sql = "INSERT into detalle_pedido (id_pedido, id_producto, precio_unitario, cantidad) VALUES (?, ?, ?, ?)";
        
        PreparedStatement prep = con.prepareStatement(sql);
        prep.setInt(1, ped.getIdPedido());
        
        for(Map.Entry<Producto, Integer> entry : carrito.entrySet()){
            Integer cant = entry.getValue();
            Producto prod = entry.getKey();
            
            prep.setInt(2, prod.getIdProducto());
            prep.setDouble(3, prod.getPrecio());
            prep.setInt(4, cant);
            
            prep.addBatch();
            
        }
        
        prep.executeBatch();
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        
        return ped; 

    }

    @Override
    public Double recuperarTotal(Pedido ped) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        String sql = "SELECT SUM(precio_unitario * cantidad) AS total FROM detalle_pedido WHERE id_pedido = ?";
        Double total = 0.0;
        PreparedStatement prep = con.prepareStatement(sql);
        prep.setInt(1, ped.getIdPedido());
        
        ResultSet rs = prep.executeQuery();
        
        if(rs.next()){
            total = rs.getDouble("total");
        }
        
        
        
        return total;
    }
    
    
    
    
}
