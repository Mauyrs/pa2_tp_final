
package clases;

import DAO.ImpDAOCategoria;
import DAO.ImpDAOProducto;
import DAO.ImpDAOUsuario;
import igu.*;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import seguridad.Contrasena;

public class main {
    public static void main(String [] args ){
        /*
        ImpDAOCategoria categoriaDAO = new ImpDAOCategoria();
        Categoria cate = new Categoria();
            Categoria cate = null;
        //cate.setNombre("Juguete");
        try {
            cate = categoriaDAO.obtener(1);
            System.out.println(cate);
            cate.setNombre("celulares");
            categoriaDAO.actualizar(cate);
            System.out.println(cate);
            List <Categoria> listaCategorias = categoriaDAO.listar();
            for(Categoria cat : listaCategorias){
                System.out.println(cat);
            }
           // categoriaDAO.insertar(cate);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        ImpDAOUsuario usuarioDAO = new ImpDAOUsuario();
        Usuario nuevo = null;
        
        try {
            String contra = "DaniRex29";
            String contraEncriptada = Contrasena.encriptar(contra); // Antes de cargar un nuevo usuario o cambiar su contraseña hay que encriptarla

            nuevo = new Usuario("Daniel", "Kaczka", "Tacuari 2331", "danikaczka@gmail.com", contraEncriptada, 1);
            usuarioDAO.insertar(nuevo);
                    
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        ImpDAOUsuario usuarioDAO = new ImpDAOUsuario();
        String contra = "lolazo";
        String correo = "marioven@gmail.com";
        try {
            Usuario logeado = usuarioDAO.buscarCorreo(correo); // se busca al usuario con X correo
            if(Contrasena.combrobar(contra, logeado.getHashContrasena())){ // se comprueba que el usuario encontrado tenga esa contraseña
                System.out.println("Se logeo correctamente!");
            }else{
                System.out.println("Contraseña incorrecta!");
            }
            
            
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
        ImpDAOProducto productoDAO = new ImpDAOProducto();
        
        try {
            List<Producto> productosCategoria= productoDAO.buscarCategoria(4);
            List<Producto> productosNombre = productoDAO.buscarNombre("lego");
            
            System.out.println("Por categoria: ");
            
            for(Producto prod : productosCategoria){
                System.out.println(prod);
            }
            
            System.out.println("Por nombre: ");
            
            for(Producto prod : productosNombre){
                System.out.println(prod);
            }
            
            
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        Login log = new Login();
        
        log.setVisible(true);
        
    }
}
