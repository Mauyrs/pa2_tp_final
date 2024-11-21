/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

/**
 *
 * @author Nacho
 */
public class InterfazAdmin extends javax.swing.JFrame {

    /**
     * Creates new form InterfazUsuario
     */
    public InterfazAdmin() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        lblBienvenido = new javax.swing.JLabel();
        btnProcat = new javax.swing.JButton();
        btnGestionar = new javax.swing.JButton();
        btnListarusuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnPerfil = new javax.swing.JButton();
        btnPronom = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnListarproducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        lblBienvenido.setFont(new java.awt.Font("Dialog", 0, 72)); // NOI18N
        lblBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBienvenido.setText("¡BIENVENIDO!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(lblBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(lblBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 110));

        btnProcat.setText("BUSCAR PRODUCTO POR CATEGORIA");
        jPanel1.add(btnProcat, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 250, 60));

        btnGestionar.setText("GESTIONAR UN PRODUCTO");
        btnGestionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGestionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 250, 60));

        btnListarusuario.setText("LISTAR TODOS LOS USUARIOS");
        jPanel1.add(btnListarusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 250, 60));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿QUE DESEAS HACER?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 390, 40));

        btnPerfil.setText("VER MI PERFIL");
        jPanel1.add(btnPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 250, 60));

        btnPronom.setText("BUSCAR PRODUCTO POR NOMBRE");
        jPanel1.add(btnPronom, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 250, 60));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 68)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ENOL");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 220, 70));

        btnListarproducto.setText("LISTAR TODOS LOS PEDIDOS");
        btnListarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarproductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnListarproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 250, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionarActionPerformed

    private void btnListarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListarproductoActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGestionar;
    private javax.swing.JButton btnListarproducto;
    private javax.swing.JButton btnListarusuario;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnProcat;
    private javax.swing.JButton btnPronom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBienvenido;
    // End of variables declaration//GEN-END:variables
}
