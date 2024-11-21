package DAO;

import clases.Pago;
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

public class ImpDAOPago implements PagoDAO{

    @Override
    public Pago obtener(int id) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        Pago pag = null;

        String sql = "SELECT monto, fecha_pago, id_pedido FROM pago WHERE id = ?";

        PreparedStatement prep = con.prepareStatement(sql);

        prep.setInt(1, id);

        ResultSet rs = prep.executeQuery();
        if (rs.next()) {
            
            Double monto = rs.getDouble("monto");
            LocalDate fecha_pago = rs.getDate("fecha_pago").toLocalDate();
            int id_pedido = rs.getInt("id_pedido");
            
            pag = new Pago(id, monto, fecha_pago,id_pedido);

        }

        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        ConSql.cerrarResultSet(rs);

        return pag;

    }

    @Override
    public List<Pago> listar() throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        List<Pago> pagos = new ArrayList();

        String sql = "SELECT id, monto, fecha_pago, id_pedido FROM pago";

        PreparedStatement prep = con.prepareStatement(sql);

        ResultSet rs = prep.executeQuery();
        while (rs.next()) {
            Integer id = rs.getInt("id");
            Double monto = rs.getDouble("monto");
            LocalDate fecha_pago = rs.getDate("fecha_pago").toLocalDate();
            int id_pedido = rs.getInt("id_pedido");
            
            Pago pag = new Pago(id, monto, fecha_pago,id_pedido);
            pagos.add(pag);
        }

        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        ConSql.cerrarResultSet(rs);

        return pagos;

    }

    @Override
    public int insertar(Pago pag) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        String sql = "INSERT INTO pago (monto, fecha_pago, id_pedido) VALUES (?, ?, ?)";
        
        PreparedStatement prep = con.prepareStatement(sql);
        prep.setDouble(1, pag.getMonto());
        prep.setDate(2, Date.valueOf(pag.getFechaPago()));
        prep.setInt(3, pag.getIdPedido());
            
        int camb = prep.executeUpdate();
        
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        
        return camb;        
    }

    @Override
    public int actualizar(Pago pag) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        String sql = "UPDATE pago SET monto = ?, fecha_pago = ?, id_pedido = ? WHERE id=?";
        
        PreparedStatement prep = con.prepareStatement(sql);
        
        prep.setDouble(1, pag.getMonto());
        prep.setDate(2, Date.valueOf(pag.getFechaPago()));
        prep.setInt(3, pag.getIdPedido());
        prep.setInt(4, pag.getIdPago());
        
        
        int camb = prep.executeUpdate();
        
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        
        return camb;
    }

    @Override
    public int eliminar(Pago pag) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        String sql = "DELETE FROM pago WHERE id = ?";
        PreparedStatement prep = con.prepareStatement(sql);
        prep.setInt(1, pag.getIdPago());
        
        int camb = prep.executeUpdate();
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        
        
        return camb;

    }
    
}
