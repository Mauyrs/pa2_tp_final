/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import clases.Pedido;
import clases.Producto;
import clases.Usuario;
import conexiones.ConSql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Mauri
 */
public class ImpDAOUsuario implements UsuarioDAO{

    @Override
    public List<Pedido> obtenerPedidosUsu(Usuario usu) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Map<Producto, Integer> obtenerCarrito(Usuario usu) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Usuario obtener(int id) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        Usuario usu = null;
        
        String sql = "SELECT id, nombre, apellido, direccion, correo, contrasena_hash, tipo FROM usuario WHERE id = ?";
        
        PreparedStatement prep = con.prepareStatement(sql);
        
        prep.setInt(1, id);
        
        ResultSet rs = prep.executeQuery();
        if(rs.next()){
            String nombre = rs.getString("nombre");
            String apellido = rs.getString("apellido");
            String direccion = rs.getString("direccion");
            String correo = rs.getString("correo");
            String hash_contra = rs.getString("contrasena_hash");
            int tipo = rs.getInt("tipo");
            
            usu = new Usuario(id, nombre, apellido, direccion, correo, hash_contra, tipo);
            
        }
        
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        ConSql.cerrarResultSet(rs);
        
        return usu;
    }

    @Override
    public List<Usuario> listar() throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        List<Usuario> usuarios = new ArrayList();
        
        String sql = "SELECT id, nombre, apellido, direccion, correo, contrasena_hash, tipo FROM usuario";
        
        PreparedStatement prep = con.prepareStatement(sql);
                
        ResultSet rs = prep.executeQuery();
        while(rs.next()){
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String apellido = rs.getString("apellido");
            String direccion = rs.getString("direccion");
            String correo = rs.getString("correo");
            String hash_contra = rs.getString("contrasena_hash");
            int tipo = rs.getInt("tipo");
            
            Usuario usu = new Usuario(id, nombre, apellido, direccion, correo, hash_contra, tipo);
            usuarios.add(usu);
            
        }
        
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        ConSql.cerrarResultSet(rs);
        
        return usuarios;

    }

    @Override
    public int insertar(Usuario usu) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        String sql = "INSERT INTO usuario (nombre, apellido, direccion, correo, contrasena_hash, tipo) VALUES (?, ?, ?, ?, ?, ?)";
        
        PreparedStatement prep = con.prepareStatement(sql);
        prep.setString(1, usu.getNombre());
        prep.setString(2, usu.getApellido());
        prep.setString(3, usu.getDireccion());
        prep.setString(4, usu.getCorreo().toLowerCase());
        prep.setString(5, usu.getHashContrasena());
        prep.setInt(6, usu.getIdTipo());
        
        int camb = prep.executeUpdate();
        
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        
        return camb;

    }

    @Override
    public int actualizar(Usuario usu) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        String sql = "UPDATE usuario SET nombre = ?, apellido = ?, direccion = ?, correo = ?, contrasena_hash = ?, tipo = ? WHERE id=?";
        
        PreparedStatement prep = con.prepareStatement(sql);
        prep.setString(1, usu.getNombre());
        prep.setString(2, usu.getApellido());
        prep.setString(3, usu.getDireccion());
        prep.setString(4, usu.getCorreo());
        prep.setString(5, usu.getHashContrasena());
        prep.setInt(6, usu.getIdTipo());
        prep.setInt(7, usu.getIdUsuario());
        
        int camb = prep.executeUpdate();
        
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        
        return camb;

    }

    @Override
    public int eliminar(Usuario usu) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        String sql = "DELETE FROM usuario WHERE id = ?";
        PreparedStatement prep = con.prepareStatement(sql);
        prep.setInt(1, usu.getIdUsuario());
        
        int camb = prep.executeUpdate();
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        
        
        return camb;    }

    @Override
    public Usuario buscarCorreo(String correo) throws SQLException, ClassNotFoundException {
        Connection con = ConSql.obtener();
        Usuario usu = null;
        
        String sql = "SELECT id, nombre, apellido, direccion, correo, contrasena_hash, tipo FROM usuario WHERE correo = ?";
        
        PreparedStatement prep = con.prepareStatement(sql);
        
        prep.setString(1, correo.toLowerCase());
        
        ResultSet rs = prep.executeQuery();
        if(rs.next()){
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String apellido = rs.getString("apellido");
            String direccion = rs.getString("direccion");
            String hash_contra = rs.getString("contrasena_hash");
            int tipo = rs.getInt("tipo");
            
            usu = new Usuario(id, nombre, apellido, direccion, correo.toLowerCase(), hash_contra, tipo);
            
        }
        
        ConSql.cerrarConexion(con);
        ConSql.cerrarPrepStmt(prep);
        ConSql.cerrarResultSet(rs);
        
        return usu;

    }
    
}
