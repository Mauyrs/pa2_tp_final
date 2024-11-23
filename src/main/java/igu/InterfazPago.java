/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

import DAO.ImpDAOPago;
import DAO.ImpDAOProducto;
import clases.Pago;
import clases.Producto;
import clases.Usuario;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Nacho
 */
public class InterfazPago extends javax.swing.JFrame {
     private final ImpDAOPago pagoDAO = new ImpDAOPago ();
     private Usuario usuario;
     private final ImpDAOProducto productoDAO = new ImpDAOProducto ();
    public InterfazPago(Usuario usuario) {
        this.usuario= usuario;
        initComponents();
        inicializarNombre();
    }
private void inicializarNombre(){
        lblNombre.setText(this.usuario.getNombre().trim().toUpperCase());
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
        lblNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        cvv = new javax.swing.JFormattedTextField();
        btnVolver = new javax.swing.JButton();
        numTar = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 480, 70));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("CVV");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 180, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("AÑO:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 30, 30));

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setText("Fulano Andres Martinez Gimenez de Jesus");
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
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 290, 40));

        jLabel4.setText("NUMERO DE TARJETA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 180, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("NOMBRE ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 180, 30));

        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setText("Realizar pago");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 130, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "25", "26", "27", "28", "29", "30", "31", "32", "33", "34" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 110, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("FECHA DE VENCIMIENTO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 180, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("MES:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 30, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 110, 30));

        try {
            cvv.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cvv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cvvMousePressed(evt);
            }
        });
        cvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvvActionPerformed(evt);
            }
        });
        cvv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cvvKeyTyped(evt);
            }
        });
        jPanel1.add(cvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 230, 40));

        btnVolver.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnVolver.setText("SALIR");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 110, 40));

        try {
            numTar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        numTar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                numTarMousePressed(evt);
            }
        });
        numTar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numTarKeyTyped(evt);
            }
        });
        jPanel1.add(numTar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 230, 40));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PROCEDEREMOS CON EL PAGO");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 850, 80));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        CarritoIGU carrito = new CarritoIGU(usuario);
        carrito.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        if(txtNombre.getText().equals("Fulano Andres Martinez Gimenez de Jesus")){
            txtNombre.setText("");
            txtNombre.setForeground(Color.black);
        }        
    }//GEN-LAST:event_txtNombreMousePressed

    private void cvvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cvvKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_cvvKeyTyped

    private void numTarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numTarKeyTyped
     if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_numTarKeyTyped

    private void cvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvvActionPerformed

    private void cvvMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cvvMousePressed
        if(txtNombre.getText().isEmpty()){
           txtNombre.setText("Fulano Andres Martinez Gimenez de Jesus");
           txtNombre.setForeground(Color.gray.brighter());
       }
    }//GEN-LAST:event_cvvMousePressed

    private void numTarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numTarMousePressed
       if(txtNombre.getText().isEmpty()){
           txtNombre.setText("Fulano Andres Martinez Gimenez de Jesus");
           txtNombre.setForeground(Color.gray.brighter());
       }
    }//GEN-LAST:event_numTarMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       /*     Usuario nuevo=null;
        try{
            if(txtNombre.getText().isEmpty() || numTar.getText().isEmpty() || cvv.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Rellene todos los campos solicitados");
           
                }else{
                Pago pago = new Pago();
                Producto pro = new Producto ();
                
            }catch(){
                    
                    }
                
            
                
        }
        */
    }//GEN-LAST:event_jButton1ActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JFormattedTextField cvv;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JFormattedTextField numTar;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}