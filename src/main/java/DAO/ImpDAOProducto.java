
package DAO;

import clases.Categoria;
import clases.Producto;
import conexiones.ConSql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ImpDAOProducto implements ProductoDAO {

    @Override
    public List<Producto> buscarNombre(String buscado) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        List<Producto> productos= new ArrayList();
        
        String sql = "SELECT id, nombre, descripcion, precio, id_categoria, stock FROM producto WHERE nombre LIKE ?";
        
        PreparedStatement prep = con.prepareStatement(sql);
        
        prep.setString(1, "%"+buscado+"%");
        
        ResultSet rs = prep.executeQuery();
        
        while(rs.next()){
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String descripcion = rs.getString("descripcion");
            Double precio = rs.getDouble("precio");
            int id_categoria = rs.getInt("id_categoria");
            int stock = rs.getInt("stock");
            
            Producto prod = new Producto(id, nombre, descripcion, precio, id_categoria, stock);
            productos.add(prod);
        }
        
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        ConSql.cerrarResultSet(rs);

        return productos;
        
    }

    @Override
    public List<Producto> buscarCategoria(int id_cat) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        List<Producto> productos = new ArrayList();

        String sql = "SELECT id, nombre, descripcion, precio, id_categoria, stock FROM producto WHERE id_categoria = ?";

        PreparedStatement prep = con.prepareStatement(sql);

        prep.setInt(1, id_cat);
        
        ResultSet rs = prep.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String descripcion = rs.getString("descripcion");
            Double precio = rs.getDouble("precio");
            int id_categoria = rs.getInt("id_categoria");
            int stock = rs.getInt("stock");

            Producto prod = new Producto(id, nombre, descripcion, precio, id_categoria, stock);
            productos.add(prod);

        }

        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        ConSql.cerrarResultSet(rs);

        return productos;
    }
    
    @Override
    public List<Producto> buscarCategoria(Categoria categoria) throws SQLException, ClassNotFoundException {
        return this.buscarCategoria(categoria.getIdCategoria());
    }

    

    @Override
    public Producto obtener(int id) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        Producto prod = null;

        String sql = "SELECT id, nombre, descripcion, precio, id_categoria, stock FROM producto WHERE id = ?";

        PreparedStatement prep = con.prepareStatement(sql);

        prep.setInt(1, id);

        ResultSet rs = prep.executeQuery();
        if (rs.next()) {
            String nombre = rs.getString("nombre");
            String descripcion = rs.getString("descripcion");
            Double precio = rs.getDouble("precio");
            int id_categoria = rs.getInt("id_categoria");
            int stock = rs.getInt("stock");

            prod = new Producto(id, nombre, descripcion, precio, id_categoria, stock);

        }

        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        ConSql.cerrarResultSet(rs);

        return prod;
    }

    @Override
    public List<Producto> listar() throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        List<Producto> productos = new ArrayList();

        String sql = "SELECT id, nombre, descripcion, precio, id_categoria, stock FROM producto";

        PreparedStatement prep = con.prepareStatement(sql);

        ResultSet rs = prep.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String descripcion = rs.getString("descripcion");
            Double precio = rs.getDouble("precio");
            int id_categoria = rs.getInt("id_categoria");
            int stock = rs.getInt("stock");

            Producto prod = new Producto(id, nombre, descripcion, precio, id_categoria, stock);
            productos.add(prod);

        }

        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        ConSql.cerrarResultSet(rs);

        return productos;    
    }

    @Override
    public int insertar(Producto prod) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        String sql = "INSERT INTO producto (nombre, descripcion, precio, id_categoria, stock) VALUES (?, ?, ?, ?, ?)";
        
        PreparedStatement prep = con.prepareStatement(sql);
        prep.setString(1, prod.getNombre());
        prep.setString(2, prod.getDescripcion());
        prep.setDouble(3, prod.getPrecio());
        prep.setInt(4, prod.getIdCategoria());
        prep.setInt(5, prod.getCantidadStock());
            
        int camb = prep.executeUpdate();
        
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        
        return camb;    
    }

    @Override
    public int actualizar(Producto prod) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        String sql = "UPDATE producto SET nombre = ?, descripcion = ?, precio = ?, id_categoria = ?, stock = ? WHERE id=?";
        
        PreparedStatement prep = con.prepareStatement(sql);
        prep.setString(1, prod.getNombre());
        prep.setString(2, prod.getDescripcion());
        prep.setDouble(3, prod.getPrecio());
        prep.setInt(4, prod.getIdCategoria());
        prep.setInt(5, prod.getCantidadStock());
        prep.setInt(6, prod.getIdProducto());
        
        
        int camb = prep.executeUpdate();
        
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        
        return camb;    }

    @Override
    public int eliminar(Producto prod) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        String sql = "DELETE FROM producto WHERE id = ?";
        PreparedStatement prep = con.prepareStatement(sql);
        prep.setInt(1, prod.getIdProducto());
        
        int camb = prep.executeUpdate();
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        
        
        return camb;    
    }

}
