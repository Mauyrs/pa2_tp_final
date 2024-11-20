
package DAO;

import clases.Categoria;
import clases.Producto;
import java.sql.SQLException;
import java.util.List;


public interface ProductoDAO extends DAO<Producto>{
    List<Producto> buscarNombre(String buscado)throws SQLException,ClassNotFoundException;
    List<Producto> buscarCategoria(Categoria categoria)throws SQLException,ClassNotFoundException;
    List<Producto> buscarCategoria(int id)throws SQLException,ClassNotFoundException;
    
}
