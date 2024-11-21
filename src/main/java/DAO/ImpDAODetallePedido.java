package DAO;

import clases.Carrito;
import clases.DetallePedido;
import conexiones.ConSql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ImpDAODetallePedido implements DetallePedidoDAO{

    @Override
    public DetallePedido obtener(int idProd, int idPed) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        DetallePedido det = null;

        String sql = "SELECT precio_unitario, cantidad FROM detalle_pedido WHERE id_pedido = ? AND id_producto = ?";
        
        PreparedStatement prep = con.prepareStatement(sql);

        prep.setInt(1, idPed);
        prep.setInt(1, idProd);
        
        ResultSet rs = prep.executeQuery();
        if (rs.next()) {
            det = new DetallePedido(idPed, idProd, rs.getDouble("precio_unitario"), rs.getInt("cantidad"));
            

        }

        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        ConSql.cerrarResultSet(rs);

        return det;
    }

    @Override
    public List<DetallePedido> listar() throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        List<DetallePedido> detalles = new ArrayList();

        String sql = "SELECT id_pedido, id_producto, precio_unitario, cantidad FROM detalle_pedido";
        
        PreparedStatement prep = con.prepareStatement(sql);

        
        ResultSet rs = prep.executeQuery();
        while(rs.next()) {
            int idPed = rs.getInt("id_pedido");
            int idProd = rs.getInt("id_producto");
            
            
            DetallePedido det = new DetallePedido(idPed, idProd, rs.getDouble("precio_unitario"), rs.getInt("cantidad"));
            detalles.add(det);

        }

        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        ConSql.cerrarResultSet(rs);

        return detalles;
    }

    @Override
    public int insertar(DetallePedido det) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        String sql = "INSERT INTO detalle_pedido (id_pedido, id_producto, precio_unitario, cantidad) VALUES (?, ?, ?, ?)";
        
        PreparedStatement prep = con.prepareStatement(sql);
        
        prep.setInt(1, det.getIdPedido());
        prep.setInt(2, det.getIdProducto());
        prep.setDouble(3, det.getPrecioUnitario());
        prep.setInt(4, det.getCantidad());
        
        int camb = prep.executeUpdate();
        
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        
        return camb;
        
        
    }

    @Override
    public int actualizar(DetallePedido det) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        String sql = "UPDATE detalle_pedido SET precio_unitario = ? cantidad = ? WHERE id_pedido = ? AND id_producto = ?";

        PreparedStatement prep = con.prepareStatement(sql);
        
        prep.setDouble(1, det.getPrecioUnitario());
        prep.setInt(2, det.getCantidad());
        prep.setInt(3, det.getIdPedido());
        prep.setInt(4, det.getIdProducto());
        
        
        int camb = prep.executeUpdate();

        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);

        return camb;

    }

    @Override
    public int eliminar(DetallePedido det) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        String sql = "DELETE FROM detalle_pedido WHERE id_pedido = ? AND id_producto = ?";
        PreparedStatement prep = con.prepareStatement(sql);
        prep.setInt(1, det.getIdPedido());
        prep.setInt(2, det.getIdProducto());
                
        int camb = prep.executeUpdate();
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        
        
        return camb;

    }
    
}
