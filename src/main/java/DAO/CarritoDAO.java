package DAO;

import clases.Carrito;
import java.sql.SQLException;
import java.util.List;



public interface CarritoDAO {
    Carrito obtener(int idProd, int idUsu) throws SQLException,ClassNotFoundException;
     
    List<Carrito> listar() throws SQLException,ClassNotFoundException;
     
    int insertar(Carrito car) throws SQLException,ClassNotFoundException;
     
    int actualizar(Carrito car) throws SQLException,ClassNotFoundException;
     
    int eliminar(Carrito car) throws SQLException, ClassNotFoundException;
}
