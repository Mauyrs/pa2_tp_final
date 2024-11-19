/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Mauri
 */
public interface DAO<T> {
     T obtener(int id) throws SQLException;
     
     List<T> listar() throws SQLException;
     
     int guardar(T t) throws SQLException;
     
     int insertar(T t) throws SQLException;
     
     int actualizar(T t) throws SQLException;
     
     int eliminar(T t);
}
