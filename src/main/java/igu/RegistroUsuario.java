/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

import java.awt.Color;
import javax.swing.JOptionPane;


public class RegistroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form RegistroUsuario
     */
    public RegistroUsuario() {
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

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtUsuario = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        passUsuario = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();
        jCheckBox1 = new javax.swing.JCheckBox();
        btnRegistro = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        passUsuario1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("CONTRASEÑA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("NOMBRE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 60, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("DIRECCION");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("CORREO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 170, 10));

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
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 170, -1));

        txtDireccion.setForeground(new java.awt.Color(204, 204, 204));
        txtDireccion.setText("Ingrese su direccion");
        txtDireccion.setBorder(null);
        txtDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDireccionMousePressed(evt);
            }
        });
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 170, -1));

        txtCorreo.setForeground(new java.awt.Color(204, 204, 204));
        txtCorreo.setText("Ingrese su correo");
        txtCorreo.setBorder(null);
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 170, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 170, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 170, 10));

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
        jPanel1.add(passUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 170, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 170, 10));

        jCheckBox1.setText("Mostrar contraseña");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        btnRegistro.setText("Confirmar registro");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("CONFIRMAR CONTRASEÑA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 170, 10));

        passUsuario1.setForeground(new java.awt.Color(204, 204, 204));
        passUsuario1.setText("********");
        passUsuario1.setBorder(null);
        passUsuario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passUsuario1MousePressed(evt);
            }
        });
        passUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passUsuario1ActionPerformed(evt);
            }
        });
        jPanel1.add(passUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 170, -1));

        jButton2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 110, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 210, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void passUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passUsuarioActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
 if (jCheckBox1.isSelected()) {
  
                  passUsuario.setEchoChar((char) 0); // Hace visible el texto
                  passUsuario1.setEchoChar((char) 0);
                } else {
                    // Si no está seleccionado, ocultar el texto de la contraseña
                    passUsuario.setEchoChar('*'); // Vuelve a ocultar el texto
                     passUsuario1.setEchoChar('*');
                }        // TODO add your handling code here:
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
      if(txtCorreo.getText().isEmpty()){
          txtCorreo.setText("Ingrese su correo");
          txtCorreo.setForeground(Color.gray.brighter());
      }
      if(txtDireccion.getText().isEmpty()){
          txtDireccion.setText("Ingrese su direccion");
          txtDireccion.setForeground(Color.gray.brighter());
      }
        if(String.valueOf(passUsuario1.getPassword()).isEmpty()){
        passUsuario1.setText("********");
        passUsuario1.setForeground(Color.gray.brighter());
    }
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtDireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDireccionMousePressed
                    if(txtDireccion.getText().equals("Ingrese su direccion")){
            txtDireccion.setText("");
            txtDireccion.setForeground(Color.black);
        }
        
        if(String.valueOf(passUsuario.getPassword()).isEmpty()){
        passUsuario.setText("********");
        passUsuario.setForeground(Color.gray.brighter());
    }
      if(txtCorreo.getText().isEmpty()){
          txtCorreo.setText("Ingrese su correo");
          txtCorreo.setForeground(Color.gray.brighter());
      }
      if(txtUsuario.getText().isEmpty()){
          txtUsuario.setText("Ingrese su nombre de usuario");
          txtUsuario.setForeground(Color.gray.brighter());
      }
        if(String.valueOf(passUsuario1.getPassword()).isEmpty()){
        passUsuario1.setText("********");
        passUsuario1.setForeground(Color.gray.brighter());
    }
    }//GEN-LAST:event_txtDireccionMousePressed

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed
                    if(txtCorreo.getText().equals("Ingrese su correo")){
            txtCorreo.setText("");
            txtCorreo.setForeground(Color.black);
        }
        
        if(String.valueOf(passUsuario.getPassword()).isEmpty()){
        passUsuario.setText("********");
        passUsuario.setForeground(Color.gray.brighter());
    }
      if(txtUsuario.getText().isEmpty()){
          txtUsuario.setText("Ingrese su nombre de usuario");
          txtUsuario.setForeground(Color.gray.brighter());
      }
      if(txtDireccion.getText().isEmpty()){
          txtDireccion.setText("Ingrese su direccion");
          txtDireccion.setForeground(Color.gray.brighter());
      }
       if(String.valueOf(passUsuario1.getPassword()).isEmpty()){
        passUsuario1.setText("********");
        passUsuario1.setForeground(Color.gray.brighter());
    }
    }//GEN-LAST:event_txtCorreoMousePressed

    private void passUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passUsuarioMousePressed
      // TODO add your handling code here:
          if(String.valueOf(passUsuario.getPassword()).equals("********")){
              passUsuario.setText("");
              passUsuario.setForeground(Color.black);
              } else{
            if(txtUsuario.getText().isEmpty()){
              txtUsuario.setText("Ingrese su nombre de usuario");
              txtUsuario.setForeground(Color.gray.brighter());
          }else{
             if(txtCorreo.getText().isEmpty()){
                 txtCorreo.setText("Ingrese su correo");
                 txtCorreo.setForeground(Color.gray.brighter());
             }else{
                 if(txtDireccion.getText().isEmpty()){
                  txtDireccion.setText("Ingrese su direccion");
                  txtDireccion.setForeground(Color.gray.brighter());
                 }
                    else{
                      if(String.valueOf(passUsuario1.getPassword()).isEmpty()){
                        passUsuario1.setText("********");
                        passUsuario1.setForeground(Color.gray.brighter());
                             }
                       }   
                     }
                  }
            } 
  if(txtUsuario.getText().isEmpty()){
                
              txtUsuario.setText("Ingrese su nombre de usuario");
              txtUsuario.setForeground(Color.gray.brighter());
    }
  if(txtDireccion.getText().isEmpty()){
              txtDireccion.setText("Ingrese su direccion");
              txtDireccion.setForeground(Color.gray.brighter());
                 }
  if(txtCorreo.getText().isEmpty()){
              txtCorreo.setText("Ingrese su correo");
              txtCorreo.setForeground(Color.gray.brighter());
             }
  if(String.valueOf(passUsuario1.getPassword()).isEmpty()){
                        passUsuario1.setText("********");
                        passUsuario1.setForeground(Color.gray.brighter());
                 }
  
    }//GEN-LAST:event_passUsuarioMousePressed
          
    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
       if (txtUsuario.getText().equals("Ingrese su nombre de usuario")) {
                    txtUsuario.setText(""); 
                    txtUsuario.setForeground(Color.BLACK); 
                }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void passUsuario1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passUsuario1MousePressed
     if(String.valueOf(passUsuario1.getPassword()).equals("********")){
              passUsuario1.setText("");
              passUsuario1.setForeground(Color.black);
              } else{
            if(txtUsuario.getText().isEmpty()){
              txtUsuario.setText("Ingrese su nombre de usuario");
              txtUsuario.setForeground(Color.gray.brighter());
          }else{
             if(txtCorreo.getText().isEmpty()){
                 txtCorreo.setText("Ingrese su correo");
                 txtCorreo.setForeground(Color.gray.brighter());
             }else{
                 if(txtDireccion.getText().isEmpty()){
                  txtDireccion.setText("Ingrese su direccion");
                  txtDireccion.setForeground(Color.gray.brighter());
                 }
                 else{
                      if(String.valueOf(passUsuario.getPassword()).isEmpty()){
                        passUsuario.setText("********");
                        passUsuario.setForeground(Color.gray.brighter());
                             }
                     }   
                 }
             }   
         }
                                            
  if(txtUsuario.getText().isEmpty()){
                
              txtUsuario.setText("Ingrese su nombre de usuario");
              txtUsuario.setForeground(Color.gray.brighter());
    }
  if(txtDireccion.getText().isEmpty()){
              txtDireccion.setText("Ingrese su direccion");
              txtDireccion.setForeground(Color.gray.brighter());
                 }
  if(txtCorreo.getText().isEmpty()){
              txtCorreo.setText("Ingrese su correo");
              txtCorreo.setForeground(Color.gray.brighter());
             }
  if(String.valueOf(passUsuario.getPassword()).isEmpty()){
                        passUsuario.setText("********");
                        passUsuario.setForeground(Color.gray.brighter());
                             }
  
    }//GEN-LAST:event_passUsuario1MousePressed

    private void passUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passUsuario1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Login log = new Login ();
       log.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
         String contra = String.valueOf(passUsuario.getPassword());
         String confirma = String.valueOf(passUsuario1.getPassword());
         if(txtUsuario.getText().isEmpty() || txtDireccion.getText().isEmpty() || txtCorreo.getText().isEmpty()
                 || contra.isEmpty()|| confirma.isEmpty()){
             JOptionPane.showMessageDialog(null,"Rellene todos los campos solicitados");
         }else{
             if(contra.length()<10){
             JOptionPane.showMessageDialog(null,"Ingresa una contraseña de al menos 10 caracteres");
                }else{
                 if(contra.equals(confirma)){
                  JOptionPane.showMessageDialog(null,"Se ha registrado ");
                 }else{
                     JOptionPane.showMessageDialog(null,"Las contraseñas no son iguales");
                      }
                    }
              }
    }//GEN-LAST:event_btnRegistroActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField passUsuario;
    private javax.swing.JPasswordField passUsuario1;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
