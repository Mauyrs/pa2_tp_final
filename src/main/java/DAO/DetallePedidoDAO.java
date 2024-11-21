
package DAO;

import clases.DetallePedido;
import java.sql.SQLException;
import java.util.List;

public interface DetallePedidoDAO {
    DetallePedido obtener(int idProd, int idPed) throws SQLException,ClassNotFoundException;
     
    List<DetallePedido> listar() throws SQLException,ClassNotFoundException;
     
    int insertar(DetallePedido det) throws SQLException,ClassNotFoundException;
     
    int actualizar(DetallePedido det) throws SQLException,ClassNotFoundException;
     
    int eliminar(DetallePedido det) throws SQLException, ClassNotFoundException;
}
