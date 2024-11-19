/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

import DAO.CategoriaDAO;
import DAO.ImpDAOCategoria;
import clases.Categoria;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Nacho
 */
public class ProductoNuevo extends javax.swing.JFrame {

    /**
     * Creates new form RegistroUsuario
     */
    public ProductoNuevo() {
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
        jLabel4 = new javax.swing.JLabel();
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
        txtUsuario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRODUCTO NUEVO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 360, 70));

        jLabel2.setText("CATEGORIA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel3.setText("NOMBRE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 60, -1));

        jLabel5.setText("PRECIO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel6.setText("CANTIDAD EN STOCK");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        txtId.setForeground(new java.awt.Color(204, 204, 204));
        txtId.setText("Ingrese la ID del producto a buscar");
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
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 200, 20));

        txtPrecio.setForeground(new java.awt.Color(204, 204, 204));
        txtPrecio.setText("Ingrese el precio del producto");
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
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 170, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 190, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 170, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 170, 10));

        txtCantStock.setForeground(new java.awt.Color(204, 204, 204));
        txtCantStock.setText("Ingrese la cantidad en stock");
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
        jPanel1.add(txtCantStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 170, -1));

        jLabel4.setText("CATEGORIA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 60, 10));

        jLabel7.setText("DESCRIPCION");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        txtDescripcion.setForeground(new java.awt.Color(204, 204, 204));
        txtDescripcion.setText("Ingrese una descripcion");
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
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 170, 20));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 170, 10));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 80, -1));

        comboCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriasActionPerformed(evt);
            }
        });
        jPanel1.add(comboCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 130, 20));

        btnGuardar1.setText("Guardar");
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 80, 20));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 80, -1));

        btnModificar1.setText("Modificar");
        btnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        jLabel8.setText("ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 170, 10));

        txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario.setText("Ingrese el nombre del producto");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 180, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel9.setText("BUSCAR PRODUCTO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
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
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtIdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdMousePressed
          if(txtId.getText().equals("Ingrese la ID del producto a buscar")){
            txtId.setText("");
            txtId.setForeground(Color.black);
        }
        
      if(txtPrecio.getText().isEmpty()){
          txtPrecio.setText("Ingrese el precio del producto");
          txtPrecio.setForeground(Color.gray);
      }
      if(txtCantStock.getText().isEmpty()){
          txtCantStock.setText("Ingrese la cantidad en stock");
          txtCantStock.setForeground(Color.gray);
      }
      if(txtDescripcion.getText().isEmpty()){
          txtDescripcion.setText("Ingrese una descripcion");
          txtDescripcion.setForeground(Color.gray);
      }
      if(txtUsuario.getText().isEmpty()){
          txtUsuario.setText("Ingrese el nombre del producto");
          txtUsuario.setForeground(Color.gray);
      }
    }//GEN-LAST:event_txtIdMousePressed

    private void txtPrecioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecioMousePressed
               if(txtPrecio.getText().equals("Ingrese el precio del producto")){
            txtPrecio.setText("");
            txtPrecio.setForeground(Color.black);
        }
        
      if(txtUsuario.getText().isEmpty()){
          txtUsuario.setText("Ingrese el nombre del producto");
          txtUsuario.setForeground(Color.gray);
      }
      if(txtCantStock.getText().isEmpty()){
          txtCantStock.setText("Ingrese la cantidad en stock");
          txtCantStock.setForeground(Color.gray);
      }
     
      if(txtDescripcion.getText().isEmpty()){
          txtDescripcion.setText("Ingrese una descripcion");
          txtDescripcion.setForeground(Color.gray);
      }
       if(txtId.getText().isEmpty()){
          txtId.setText("Ingrese la ID del producto a buscar");
          txtId.setForeground(Color.gray);
      }
    }//GEN-LAST:event_txtPrecioMousePressed

    private void txtCantStockMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantStockMousePressed
       if(txtCantStock.getText().equals("Ingrese la cantidad en stock")){
            txtCantStock.setText("");
            txtCantStock.setForeground(Color.black);
        }
        
      if(txtPrecio.getText().isEmpty()){
          txtPrecio.setText("Ingrese el precio del producto");
          txtPrecio.setForeground(Color.gray);
      }
      if(txtUsuario.getText().isEmpty()){
          txtUsuario.setText("Ingrese el nombre del producto");
          txtUsuario.setForeground(Color.gray);
      }

      if(txtDescripcion.getText().isEmpty()){
          txtDescripcion.setText("Ingrese una descripcion");
          txtDescripcion.setForeground(Color.gray);
      }
       if(txtId.getText().isEmpty()){
          txtId.setText("Ingrese la ID del producto a buscar");
          txtId.setForeground(Color.gray);
      }
    }//GEN-LAST:event_txtCantStockMousePressed

    private void txtDescripcionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescripcionMousePressed
           if(txtDescripcion.getText().equals("Ingrese una descripcion")){
            txtDescripcion.setText("");
            txtDescripcion.setForeground(Color.black);
        }
        
      if(txtPrecio.getText().isEmpty()){
          txtPrecio.setText("Ingrese el precio del producto");
          txtPrecio.setForeground(Color.gray);
      }
      if(txtCantStock.getText().isEmpty()){
          txtCantStock.setText("Ingrese la cantidad en stock");
          txtCantStock.setForeground(Color.gray);
      }
      
      if(txtUsuario.getText().isEmpty()){
          txtUsuario.setText("Ingrese el nombre del producto");
          txtUsuario.setForeground(Color.gray);
      }
       if(txtId.getText().isEmpty()){
          txtId.setText("Ingrese la ID del producto a buscar");
          txtId.setForeground(Color.gray);
      }
      
    }//GEN-LAST:event_txtDescripcionMousePressed

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
 if (txtId.getText().equals("Ingrese la ID del producto a buscar")) {
                    txtId.setText(""); 
                    txtId.setForeground(Color.BLACK); 
                }
    }//GEN-LAST:event_txtIdKeyPressed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificar1ActionPerformed

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
         if(txtUsuario.getText().equals("Ingrese el nombre del producto")){
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.black);
        }
        
      if(txtPrecio.getText().isEmpty()){
          txtPrecio.setText("Ingrese el precio del producto");
          txtPrecio.setForeground(Color.gray);
      }
      if(txtCantStock.getText().isEmpty()){
          txtCantStock.setText("Ingrese la cantidad en stock");
          txtCantStock.setForeground(Color.gray);
      }
      if(txtDescripcion.getText().isEmpty()){
          txtDescripcion.setText("Ingrese una descripcion");
          txtDescripcion.setForeground(Color.gray);
      }
       if(txtId.getText().isEmpty()){
          txtId.setText("Ingrese la ID del producto a buscar");
          txtId.setForeground(Color.gray);
      }
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioKeyPressed

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



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnModificar1;
    private javax.swing.JComboBox<String> comboCategorias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void cargarCategorias(JComboBox comboCategorias) {
        CategoriaDAO categoriaDAO = new ImpDAOCategoria();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        comboCategorias.setModel(modelo);
        
        try {
            for (Categoria cat : categoriaDAO.listar()){
                modelo.addElement(cat.getNombre());
                
            }
        } catch (SQLException | ClassNotFoundException ex) {
            modelo.addElement("Error Consulta SQL");
        }
        
        
    }
}
