
package DAO;

import clases.Categoria;
import clases.Producto;
import java.sql.SQLException;
import java.util.List;


public interface ProductoDAO extends DAO<Producto>{
    List<Producto> bucarNombre(String buscado)throws SQLException,ClassNotFoundException;
    List<Producto> bucarCategoria(Categoria categoria)throws SQLException,ClassNotFoundException;
    List<Producto> bucarCategoria(int id)throws SQLException,ClassNotFoundException;
    
}
