package igu;

import DAO.ImpDAOUsuario;
import clases.Producto;
import clases.Usuario;
import java.awt.Font;
import java.sql.SQLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
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
        Double totalCarrito = 0.0;
        String nombreCompleto = usu.getNombre().trim()+ " " + usu.getApellido().trim();
        Font fuente = new Font("Kameron",Font.BOLD,15);
        tblCarrito.setFont(fuente);
        try {
            Map<Producto, Integer> carritoUsu = usuarioDAO.obtenerCarrito(usu);
            DefaultTableModel tabla = (DefaultTableModel) tblCarrito.getModel();
            tabla.setColumnIdentifiers(new String[]{"Nombre", "Cantidad", "Precio", "Total"});
            
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
                
                
                totalCarrito += totalFila;
                Object[] nuevaFila = {prod.getNombre(), cant, celdaPrecio,celdaTotal};
                tabla.addRow(nuevaFila);
            }
            
            
            lblTotal.setText("$ "+totalCarrito.toString());
            lblTitulo.setText("Carrito de: "+nombreCompleto);
            
          
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CarritoIGU.class.getName()).log(Level.SEVERE, null, ex);
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
        btnPago = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Monto total:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 110, 40));

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTotal.setText("000.000 $");
        lblTotal.setBorder(null);
        lblTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblTotalActionPerformed(evt);
            }
        });
        jPanel1.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 150, 20));

        tblCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Precio unitario", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Carrito de: ");
        jPanel2.add(lblTitulo);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 790, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPagoActionPerformed

    private void lblTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTotalActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPago;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField lblTotal;
    private javax.swing.JTable tblCarrito;
    // End of variables declaration//GEN-END:variables
}
