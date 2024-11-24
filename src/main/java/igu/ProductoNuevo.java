/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

import DAO.CategoriaDAO;
import DAO.ImpDAOCategoria;
import DAO.ImpDAOProducto;
import clases.Categoria;
import clases.Producto;
import clases.Usuario;
import java.awt.Color;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Nacho
 */
public class ProductoNuevo extends javax.swing.JFrame {

    private Usuario usuario;
    private final ImpDAOProducto productoDAO = new ImpDAOProducto();
    private Map<Integer, Categoria> mapComCat= new HashMap();

    public ProductoNuevo(Usuario usuario) {
        this.usuario = usuario;
        initComponents();
        cargarCategorias(comboCategorias);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        txtCantStock = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JButton();
        comboCategorias = new javax.swing.JComboBox<>();
        btnGuardar1 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        txtNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRODUCTO NUEVO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 70));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("CATEGORIA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("NOMBRE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 60, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("PRECIO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("CANTIDAD EN STOCK");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        txtId.setForeground(new java.awt.Color(204, 204, 204));
        txtId.setBorder(null);
        txtId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIdMousePressed(evt);
            }
        });
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 200, 20));

        txtPrecio.setForeground(new java.awt.Color(204, 204, 204));
        txtPrecio.setBorder(null);
        txtPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPrecioMousePressed(evt);
            }
        });
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 170, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 190, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 170, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 170, 10));

        txtCantStock.setForeground(new java.awt.Color(204, 204, 204));
        txtCantStock.setBorder(null);
        txtCantStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCantStockMousePressed(evt);
            }
        });
        txtCantStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantStockActionPerformed(evt);
            }
        });
        txtCantStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantStockKeyTyped(evt);
            }
        });
        jPanel1.add(txtCantStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 170, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 60, 10));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setText("DESCRIPCION");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        txtDescripcion.setForeground(new java.awt.Color(204, 204, 204));
        txtDescripcion.setBorder(null);
        txtDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDescripcionMousePressed(evt);
            }
        });
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 250, 40));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 250, 10));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 120, 40));

        comboCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriasActionPerformed(evt);
            }
        });
        jPanel1.add(comboCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 190, 20));

        btnGuardar1.setText("Guardar");
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 120, 40));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 120, 40));

        btnModificar1.setText("Modificar");
        btnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 120, 40));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setText("ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 170, 10));

        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 180, 20));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel9.setText("BUSCAR PRODUCTO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        jButton1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtCantStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantStockActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            Integer indexCategoria =0;
            Integer idProducto = Integer.parseInt(txtId.getText());
            Producto encontrado = productoDAO.obtener(idProducto);
            if(encontrado!=null){
                txtNombre.setText(encontrado.getNombre());
                txtPrecio.setText(String.valueOf(encontrado.getPrecio()) );
                txtCantStock.setText(String.valueOf(encontrado.getCantidadStock()));
                for(Map.Entry<Integer, Categoria> entry : mapComCat.entrySet()){
                    Categoria cat = entry.getValue();
                    if(cat.getIdCategoria()==encontrado.getIdCategoria()){
                        indexCategoria = entry.getKey();
                    }
                }
                comboCategorias.setSelectedIndex(indexCategoria);
                txtDescripcion.setText(encontrado.getDescripcion());
                
            }else{
                JOptionPane.showMessageDialog(this, "No se encontro el producto con ID: "+idProducto);
            }
            
            
            
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos"+ex);
        }
        
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtIdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdMousePressed
      
    }//GEN-LAST:event_txtIdMousePressed

    private void txtPrecioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecioMousePressed

    }//GEN-LAST:event_txtPrecioMousePressed

    private void txtCantStockMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantStockMousePressed
 
    }//GEN-LAST:event_txtCantStockMousePressed

    private void txtDescripcionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescripcionMousePressed

      
    }//GEN-LAST:event_txtDescripcionMousePressed

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
 if (txtId.getText().equals("Ingrese la ID del producto a buscar")) {
                    txtId.setText(""); 
                    txtId.setForeground(Color.BLACK); 
                }
    }//GEN-LAST:event_txtIdKeyPressed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        String nombre = txtNombre.getText();
        Double precio;
        Integer stock;
        Categoria categoria = mapComCat.get(comboCategorias.getSelectedIndex());
        String descripcion = txtDescripcion.getText();
        
        if(!txtPrecio.getText().isBlank()){
            precio = Double.parseDouble(txtPrecio.getText());
        }else{
            precio = 0.0;
        }
        if(!txtCantStock.getText().isBlank()){
            stock = Integer.parseInt(txtCantStock.getText());            
        }else{
            stock = 0;
        }
        
        if(!(nombre.isBlank()||precio==0.0||descripcion.isBlank())){
            try {
                Producto nuevo = new Producto(nombre, descripcion, precio, categoria.getIdCategoria(), stock);
                
                productoDAO.insertar(nuevo);
                
                JOptionPane.showMessageDialog(this, "Producto Registrado con exito");

                
            } catch (SQLException ex) {
                if(ex.getErrorCode()==1062){
                    JOptionPane.showMessageDialog(this, "El nombre de producto ingresado ya esta registrado");

                }
            } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos"+ex);
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Ingrese todos los datos antes de guardar el nuevo producto");

        }
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            Integer idProducto = Integer.parseInt(txtId.getText());
            Producto encontrado = productoDAO.obtener(idProducto);
            if(encontrado!=null){
                productoDAO.eliminar(encontrado);
                JOptionPane.showMessageDialog(this, "Se elimino: " + encontrado.getNombre());

            }else{
                JOptionPane.showMessageDialog(this, "No se encontro el producto con ID: "+idProducto);
            }
            
            
            
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos"+ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar1ActionPerformed
        
        Categoria categoria = mapComCat.get(comboCategorias.getSelectedIndex());
        
        
       
        
        try {
            Integer idProducto = Integer.parseInt(txtId.getText());
            Producto encontrado = productoDAO.obtener(idProducto);
            if(encontrado!=null){
                
                if(!txtPrecio.getText().isBlank()){
                    encontrado.setPrecio(Double.parseDouble(txtPrecio.getText()));
                }
                
                if(!txtNombre.getText().isBlank()){
                    encontrado.setNombre(txtNombre.getText());
                }
                
                if(!txtDescripcion.getText().isBlank()){
                    encontrado.setDescripcion(txtDescripcion.getText());
                }
                
                if(!txtCantStock.getText().isBlank()){
                    encontrado.setCantidadStock(Integer.parseInt(txtCantStock.getText()));
                }
                
                encontrado.setIdCategoria(categoria.getIdCategoria());
                
                
                
                productoDAO.actualizar(encontrado);
                JOptionPane.showMessageDialog(this, "Se modifico: " + encontrado.getNombre());

            }else{
                JOptionPane.showMessageDialog(this, "No se encontro el producto con ID: "+idProducto);
            }
            
            
            
        } catch (SQLException ex) {
                if(ex.getErrorCode()==1062){
                    JOptionPane.showMessageDialog(this, "El nombre de producto ingresado ya esta registrado");

                }
            } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos"+ex);
            }

    }//GEN-LAST:event_btnModificar1ActionPerformed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
      char tipeado = evt.getKeyChar();
        String txtBox = txtPrecio.getText();
        if(!Character.isDigit(tipeado) && (txtBox.contains(".") || tipeado!='.' || txtBox.isEmpty()) ){
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtCantStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantStockKeyTyped
    if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtCantStockKeyTyped

    private void comboCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCategoriasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int tipoUsuario = usuario.getIdTipo();
              switch(tipoUsuario){
                  case 1:
                      InterfazAdmin interAdmin = new InterfazAdmin (usuario);
                      interAdmin.setVisible(true);
                     this.setVisible(false);
                      break;
                  case 2:
                      InterfazUsuario interUsu = new InterfazUsuario (usuario);
                      interUsu.setVisible(true);
                       this.setVisible(false);
                     break; 
              }
               
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnModificar1;
    private javax.swing.JComboBox<String> comboCategorias;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField txtCantStock;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    private void cargarCategorias(JComboBox comboCategorias) {
        CategoriaDAO categoriaDAO = new ImpDAOCategoria();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        comboCategorias.setModel(modelo);
        Integer i = 0;
        try {
            for (Categoria cat : categoriaDAO.listar()){
                modelo.addElement(cat.getNombre());
                mapComCat.put(i, cat);
                i++;
                
            }
        } catch (SQLException | ClassNotFoundException ex) {
            modelo.addElement("Error Consulta SQL");
        }
        
        
    }
}
