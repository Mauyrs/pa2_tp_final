package igu;

import DAO.ImpDAOUsuario;
import clases.Producto;
import clases.Usuario;
import java.sql.SQLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class CarritoIGU extends javax.swing.JFrame {

  private Usuario usu;
    public CarritoIGU(Usuario usu) {
        this.usu = usu;
        initComponents();
        inicializarCarrito();
    }

    private void inicializarCarrito(){
        ImpDAOUsuario usuarioDAO = new ImpDAOUsuario();
        
        
        try {
            Map<Producto, Integer> carritoUsu = usuarioDAO.obtenerCarrito(usu);
            DefaultTableModel tabla = (DefaultTableModel) tblCarrito.getModel();
            
            for(Map.Entry<Producto, Integer> entry : carritoUsu.entrySet()){
                Producto prod = entry.getKey();
                Integer cant = entry.getValue();
                
                
                Double totalFila = prod.getPrecio()*cant;
              
                Object[] nuevaFila = {prod.getNombre(), cant, prod.getPrecio(),totalFila};
                tabla.addRow(nuevaFila);
            }
          
            
            
          
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CarritoIGU.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarrito = new javax.swing.JTable();
        btnPago = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Monto total:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 90, 40));

        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 240, 20));

        tblCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio unitario", "Total"
            }
        ));
        jScrollPane1.setViewportView(tblCarrito);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 770, 200));

        btnPago.setText("Realizar pago");
        btnPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagoActionPerformed(evt);
            }
        });
        jPanel1.add(btnPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 120, 30));

        jButton1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton1.setText("Volver");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 110, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Carrito de: ");
        jPanel2.add(jLabel2);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 790, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPagoActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPago;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblCarrito;
    // End of variables declaration//GEN-END:variables
}
