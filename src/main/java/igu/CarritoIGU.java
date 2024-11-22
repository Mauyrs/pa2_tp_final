package igu;

import DAO.ImpDAOCarrito;
import DAO.ImpDAOProducto;
import DAO.ImpDAOUsuario;
import clases.Carrito;
import clases.Producto;
import clases.Usuario;
import java.awt.Font;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class CarritoIGU extends javax.swing.JFrame {

    private Usuario usu;
    private Map<Integer, Producto> mapFilaProducto;
    private final ImpDAOUsuario usuarioDAO = new ImpDAOUsuario();
    private final ImpDAOProducto productoDAO = new ImpDAOProducto();
    private final ImpDAOCarrito carritoDAO = new ImpDAOCarrito();
    
    public CarritoIGU(Usuario usu) {
        this.usu = usu;
        initComponents();
        inicializarCarrito();
    }

    private void inicializarCarrito(){
        
        Double totalCarrito = 0.0;
        String nombreCompleto = usu.getNombre().trim()+ " " + usu.getApellido().trim();
        Font fuente = new Font("Kameron",Font.BOLD,15);
        tblCarrito.setFont(fuente);
        try {
            Map<Producto, Integer> carritoUsu = usuarioDAO.obtenerCarrito(usu);
            DefaultTableModel tabla = (DefaultTableModel) tblCarrito.getModel();
            tabla.setRowCount(0);
            tabla.setColumnIdentifiers(new String[]{"Nombre", "Cantidad", "Precio", "Total"});
            Map<Integer, Producto> mapRow= new HashMap();
            Integer fila = 0;
            
            DefaultTableCellRenderer derecha = new DefaultTableCellRenderer();
            derecha.setHorizontalAlignment(SwingConstants.RIGHT);
            tblCarrito.getColumn("Nombre").setResizable(false);
            tblCarrito.getColumn("Nombre").setPreferredWidth(200);
            
            tblCarrito.getColumn("Cantidad").setCellRenderer(derecha);
            tblCarrito.getColumn("Cantidad").setPreferredWidth(1);
            
            
            tblCarrito.getColumn("Precio").setCellRenderer(derecha);
            tblCarrito.getColumn("Precio").setPreferredWidth(1);
            tblCarrito.getColumn("Total").setCellRenderer(derecha);
            tblCarrito.getColumn("Total").setPreferredWidth(1);
            
            
            for(Map.Entry<Producto, Integer> entry : carritoUsu.entrySet()){
                Producto prod = entry.getKey();
                Integer cant = entry.getValue();
                
                
                Double totalFila = (prod.getPrecio()*cant);
                String celdaTotal = "$ "+totalFila.toString();
                String celdaPrecio = "$ "+Double.toString(prod.getPrecio());
                
                mapRow.put(fila, prod);
                
                totalCarrito += totalFila;
                Object[] nuevaFila = {prod.getNombre(), cant, celdaPrecio, celdaTotal};
                
                tabla.addRow(nuevaFila);
                fila++;
            }
            
            mapFilaProducto = mapRow;
            lblTotal.setText("$ "+totalCarrito.toString());
            lblTitulo.setText("Carrito de: "+nombreCompleto);
            
            
            
          
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(tblCarrito, "No se pudo conectar con la base de datos");
        }
        
        
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarrito = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnPago = new javax.swing.JButton();
        btnCambiar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        txtNuevaCantidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Monto total:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 110, 40));

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTotal.setText("000.000 $");
        lblTotal.setBorder(null);
        lblTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblTotalActionPerformed(evt);
            }
        });
        jPanel1.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 140, 20));

        tblCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Precio unitario", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCarrito.setGridColor(new java.awt.Color(255, 255, 255));
        tblCarrito.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblCarrito);
        if (tblCarrito.getColumnModel().getColumnCount() > 0) {
            tblCarrito.getColumnModel().getColumn(0).setResizable(false);
            tblCarrito.getColumnModel().getColumn(0).setPreferredWidth(200);
            tblCarrito.getColumnModel().getColumn(1).setResizable(false);
            tblCarrito.getColumnModel().getColumn(1).setPreferredWidth(1);
            tblCarrito.getColumnModel().getColumn(2).setResizable(false);
            tblCarrito.getColumnModel().getColumn(2).setPreferredWidth(1);
            tblCarrito.getColumnModel().getColumn(3).setResizable(false);
            tblCarrito.getColumnModel().getColumn(3).setPreferredWidth(1);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 770, 230));

        jButton1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 110, 40));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Carrito de: ");
        jPanel2.add(lblTitulo);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 790, 60));

        btnPago.setText("Realizar pago");
        btnPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagoActionPerformed(evt);
            }
        });
        jPanel1.add(btnPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 120, 30));

        btnCambiar.setText("Cambiar cantidad");
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 140, 30));

        btnBorrar.setText("<html><div style='text-align: center;'>Borrar producto seleccionado</html>");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 140, 40));

        txtNuevaCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNuevaCantidadKeyTyped(evt);
            }
        });
        jPanel1.add(txtNuevaCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 140, 30));

        jLabel2.setText("<html>Seleccione un producto e ingrese una nueva cantidad:</html>");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 150, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int tipoUsuario = usu.getIdTipo();
            switch(tipoUsuario){
                case 1:
                      InterfazAdmin interAdmin = new InterfazAdmin (usu);
                      interAdmin.setVisible(true);
                     this.setVisible(false);
                      break;
                    case 2:
                        InterfazUsuario interUsu = new InterfazUsuario (usu);
                        interUsu.setVisible(true);
                        this.setVisible(false);
                    break; 
              }
               
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lblTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTotalActionPerformed

    private void btnPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPago1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPago1ActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        Integer fila = tblCarrito.getSelectedRow();
        String textoNuevaCantidad = txtNuevaCantidad.getText();
        if(fila!=-1 && !textoNuevaCantidad.isEmpty()&&Integer.parseInt(textoNuevaCantidad)!=0){
            Producto productoSelec = mapFilaProducto.get(fila);
            Integer cantidadNueva = Integer.valueOf(txtNuevaCantidad.getText());            
            
            
            try {
                
                Carrito carrito = carritoDAO.obtener(productoSelec.getIdProducto(), usu.getIdUsuario());
                
                if(productoDAO.obtener(productoSelec.getIdProducto()).getCantidadStock()>=cantidadNueva){
                    carrito.setCantidad(cantidadNueva);
                    carritoDAO.actualizar(carrito);
                    inicializarCarrito();
                    
                }else{
                JOptionPane.showMessageDialog(tblCarrito, "No existe stock suficiente para cubrir el pedido");
                }
                
                
                
                
            } catch (SQLException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(tblCarrito, "No se pudo conectar con la base de datos");
            }
            
            
            
        }else if(textoNuevaCantidad.isEmpty()||Integer.parseInt(textoNuevaCantidad)==0){
            JOptionPane.showMessageDialog(tblCarrito, "No se ingreso una nueva cantidad");
        }else{
            JOptionPane.showMessageDialog(tblCarrito, "No se selecciono una fila");
        }
        
        
    }//GEN-LAST:event_btnCambiarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        Integer fila = tblCarrito.getSelectedRow();
        
        if(fila!=-1){
            Producto productoSelec = mapFilaProducto.get(fila);
            try {
                
                Carrito carrito = carritoDAO.obtener(productoSelec.getIdProducto(), usu.getIdUsuario());
                carritoDAO.eliminar(carrito);
                inicializarCarrito();
            } catch (SQLException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(tblCarrito, "No se pudo conectar con la base de datos" + ex.getMessage());
            }
            
            
            
        }else{
            JOptionPane.showMessageDialog(tblCarrito, "No se selecciono una fila");
        }
        
        
        
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void txtNuevaCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNuevaCantidadKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtNuevaCantidadKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnPago;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField lblTotal;
    private javax.swing.JTable tblCarrito;
    private javax.swing.JTextField txtNuevaCantidad;
    // End of variables declaration//GEN-END:variables
}
