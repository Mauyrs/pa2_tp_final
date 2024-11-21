
package DAO;

import java.sql.SQLException;
import java.util.List;


public interface DAO<T> {
     T obtener(int id) throws SQLException,ClassNotFoundException;
     
     List<T> listar() throws SQLException,ClassNotFoundException;
     
     int insertar(T t) throws SQLException,ClassNotFoundException;
     
     int actualizar(T t) throws SQLException,ClassNotFoundException;
     
     int eliminar(T t) throws SQLException, ClassNotFoundException;
}
