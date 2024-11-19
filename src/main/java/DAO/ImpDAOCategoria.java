/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import clases.Categoria;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Mauri
 */
public class ImpDAOCategoria implements CategoriaDAO{

    @Override
    public Categoria obtener(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Categoria> listar() throws SQLException {
        return null;

    }

    @Override
    public int guardar(Categoria categoria) throws SQLException {
        return 0;

    }

    @Override
    public int insertar(Categoria categoria) throws SQLException {
        return 0;
        
    }

    @Override
    public int actualizar(Categoria categoria) throws SQLException {
        return 0;
    }

    @Override
    public int eliminar(Categoria categoria) {
        return 0;
    }
    
}
