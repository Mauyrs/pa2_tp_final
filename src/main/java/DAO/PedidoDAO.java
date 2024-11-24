package DAO;

import clases.DetallePedido;
import clases.Pedido;
import clases.Producto;
import clases.Usuario;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface PedidoDAO extends DAO<Pedido>{
    Pedido insertarCarrito(Usuario usu, Map<Producto, Integer> carrito) throws SQLException, ClassNotFoundException;
    Double recuperarTotal(Pedido ped) throws SQLException, ClassNotFoundException;
    List<DetallePedido> obtenerDetalles(Pedido ped) throws SQLException, ClassNotFoundException;
}
