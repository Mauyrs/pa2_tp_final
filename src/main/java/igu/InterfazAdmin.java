/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

import clases.Usuario;

/**
 *
 * @author Nacho
 */
public class InterfazAdmin extends javax.swing.JFrame {

  private Usuario usuario;
    public InterfazAdmin(Usuario usuario) {
        this.usuario = usuario;
        initComponents();
        inicializarNombre();
    }
 private void inicializarNombre(){
        lblNombre.setText("ADMIN " +this.usuario.getNombre().trim().toUpperCase());
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
        lblNombre = new javax.swing.JLabel();
        btnListarproducto = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));

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
        btnProcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcatActionPerformed(evt);
            }
        });
        jPanel1.add(btnProcat, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 250, 60));

        btnGestionar.setText("GESTIONAR UN PRODUCTO");
        btnGestionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGestionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 250, 60));

        btnListarusuario.setText("LISTAR TODOS LOS USUARIOS");
        btnListarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarusuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnListarusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 250, 60));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿QUE DESEAS HACER?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 390, 40));

        btnPerfil.setText("VER MI PERFIL");
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });
        jPanel1.add(btnPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 250, 60));

        btnPronom.setText("BUSCAR PRODUCTO POR NOMBRE");
        btnPronom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPronomActionPerformed(evt);
            }
        });
        jPanel1.add(btnPronom, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 250, 60));

        lblNombre.setFont(new java.awt.Font("Dialog", 0, 68)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 520, 70));

        btnListarproducto.setText("LISTAR TODOS LOS PRODUCTOS");
        btnListarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarproductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnListarproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 250, 60));

        btnVolver.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnVolver.setText("SALIR");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarActionPerformed
      ProductoNuevo pro = new ProductoNuevo (usuario);
      pro.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_btnGestionarActionPerformed

    private void btnListarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarproductoActionPerformed
      ListaProductos listapro = new ListaProductos(usuario);
      listapro.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_btnListarproductoActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
      PerfilUsuario per = new PerfilUsuario(usuario);
      per.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnListarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarusuarioActionPerformed
    ListaUsuarios listausu = new ListaUsuarios(usuario);
    listausu.setVisible(true);
    this.setVisible(false);
    
    }//GEN-LAST:event_btnListarusuarioActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Login log = new Login ();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnPronomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPronomActionPerformed
        BusquedaNombre busque = new BusquedaNombre (usuario);
        busque.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPronomActionPerformed

    private void btnProcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcatActionPerformed
       BusquedaCategoria busque = new BusquedaCategoria(usuario);
       busque.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnProcatActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGestionar;
    private javax.swing.JButton btnListarproducto;
    private javax.swing.JButton btnListarusuario;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnProcat;
    private javax.swing.JButton btnPronom;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
