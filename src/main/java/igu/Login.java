/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

import DAO.ImpDAOUsuario;
import clases.Usuario;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import seguridad.Contrasena;

/**
 *
 * @author Nacho
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Igu
     */
    public Login() {
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

        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        passUsuario = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" INICIAR SESIÓN ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Usuario:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Contraseña:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario.setText("Ingrese su nombre de usuario");
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
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 240, 24));

        btnLogin.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 120, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 240, 10));

        passUsuario.setForeground(new java.awt.Color(204, 204, 204));
        passUsuario.setText("********");
        passUsuario.setBorder(null);
        passUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passUsuarioMousePressed(evt);
            }
        });
        passUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(passUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 240, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 287, 240, 10));

        jCheckBox1.setText("Mostrar contraseña");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));

        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setText("Registrarse");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void passUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passUsuarioActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()) {
  
                  passUsuario.setEchoChar((char) 0); // Hace visible el texto
                } else {
                    // Si no está seleccionado, ocultar el texto de la contraseña
                    passUsuario.setEchoChar('*'); // Vuelve a ocultar el texto
                }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        // TODO add your handling code here:
        if(txtUsuario.getText().equals("Ingrese su nombre de usuario")){
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.black);
        }
        
        if(String.valueOf(passUsuario.getPassword()).isEmpty()){
        passUsuario.setText("********");
        passUsuario.setForeground(Color.gray.brighter());
    }
      
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void passUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passUsuarioMousePressed
        // TODO add your handling code here:
          if(String.valueOf(passUsuario.getPassword()).equals("********")){
              passUsuario.setText("");
              passUsuario.setForeground(Color.black);
              } else{
            if(txtUsuario.getText().isEmpty()){
                
              txtUsuario.setText("Ingrese su nombre de usuario");
              txtUsuario.setForeground(Color.gray.brighter());
          } 
    }//GEN-LAST:event_passUsuarioMousePressed
  if(txtUsuario.getText().isEmpty()){
                
              txtUsuario.setText("Ingrese su nombre de usuario");
              txtUsuario.setForeground(Color.gray.brighter());
    } 
   } 
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
         ImpDAOUsuario usuarioDAO = new ImpDAOUsuario();
         String correo = txtUsuario.getText().trim();
         String contra = String.valueOf(passUsuario.getPassword());
      
        try {
            Usuario logueado = usuarioDAO.buscarCorreo(correo); // se busca al usuario con X correo
            if(  logueado!=null && Contrasena.comprobar(contra, logueado.getHashContrasena())){ // se comprueba que el usuario encontrado tenga esa contraseña
              int tipoUsuario = logueado.getIdTipo();
              switch(tipoUsuario){
                  case 1:
                      InterfazAdmin interAdmin = new InterfazAdmin (logueado);
                      interAdmin.setVisible(true);
                     this.setVisible(false);
                      break;
                  case 2:
                      InterfazUsuario interUsu = new InterfazUsuario (logueado);
                      interUsu.setVisible(true);
                       this.setVisible(false);
                     break; 
              }
               
            }else{
                JOptionPane.showMessageDialog(null,"Credenciales incorrectas");
            }
            
            
            
        } catch (SQLException | ClassNotFoundException ex) {
            
        }
        
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        // TODO add your handling code here:
         if (txtUsuario.getText().equals("Ingrese su nombre de usuario")) {
                    txtUsuario.setText(""); 
                    txtUsuario.setForeground(Color.BLACK); 
                }
    }//GEN-LAST:event_txtUsuarioKeyPressed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField passUsuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
