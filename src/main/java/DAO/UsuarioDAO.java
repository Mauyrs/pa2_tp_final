package DAO;

import clases.Pedido;
import clases.Producto;
import clases.Usuario;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface UsuarioDAO extends DAO<Usuario>{
    List<Pedido> obtenerPedidosUsu(Usuario usu) throws SQLException,ClassNotFoundException;
    Map<Producto, Integer> obtenerCarrito(Usuario usu) throws SQLException,ClassNotFoundException;

}
