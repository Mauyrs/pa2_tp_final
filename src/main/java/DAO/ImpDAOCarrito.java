
package DAO;

import clases.Carrito;
import clases.Producto;
import conexiones.ConSql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ImpDAOCarrito implements CarritoDAO{

    @Override
    public Carrito obtener(int idProd, int idUsu) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        Carrito car = null;

        String sql = "SELECT cantidad FROM carrito WHERE id_usuario = ? AND id_producto = ?";
        
        PreparedStatement prep = con.prepareStatement(sql);

        prep.setInt(1, idUsu);
        prep.setInt(1, idProd);
        
        ResultSet rs = prep.executeQuery();
        if (rs.next()) {
            car = new Carrito(idUsu, idProd, rs.getInt("cantidad"));

        }

        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        ConSql.cerrarResultSet(rs);

        return car;

    }

    @Override
    public List<Carrito> listar() throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        List<Carrito> carritos = new ArrayList();

        String sql = "SELECT id_usuario, id_producto, cantidad FROM carrito";
        
        PreparedStatement prep = con.prepareStatement(sql);
        
        ResultSet rs = prep.executeQuery();
        if (rs.next()) {
            Carrito car = new Carrito(rs.getInt("id_usuario"), rs.getInt("id_producto"), rs.getInt("cantidad"));
            carritos.add(car);
        }

        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        ConSql.cerrarResultSet(rs);

        return carritos;

    }

    @Override
    public int insertar(Carrito car) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        String sql = "INSERT INTO carrito (id_usuario, id_producto, cantidad) VALUES (?, ?, ?)";
        
        PreparedStatement prep = con.prepareStatement(sql);
        
        
        prep.setInt(1, car.getIdUsuario());
        prep.setInt(2, car.getIdProducto());
        prep.setInt(3, car.getCantidad());    
        int camb = prep.executeUpdate();
        
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        
        return camb;    
    }

    @Override
    public int actualizar(Carrito car) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        String sql = "UPDATE carrito SET cantidad = ? WHERE id_usuario = ? AND id_producto = ?";
        
        PreparedStatement prep = con.prepareStatement(sql);
        prep.setInt(1, car.getCantidad());
        prep.setInt(2, car.getIdUsuario());
        prep.setInt(3, car.getIdProducto());
        
        
        
        int camb = prep.executeUpdate();
        
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        
        return camb;
    }

    @Override
    public int eliminar(Carrito car) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        String sql = "DELETE FROM carrito WHERE id_usuario = ? AND id_producto = ?";
        PreparedStatement prep = con.prepareStatement(sql);
        prep.setInt(1, car.getIdUsuario());
        prep.setInt(2, car.getIdProducto());
                
        int camb = prep.executeUpdate();
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        
        
        return camb;
    }
    
}
