
package igu;

import clases.Producto;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ItemProducto extends javax.swing.JPanel {

    private Producto producto;
    public ItemProducto(Producto prod) {
        this.producto = prod;
        initComponents();
        lblNombre.setText(prod.getNombre());
        lblPrecio.setText("$ " + String.valueOf(prod.getPrecio()));
        lblStock.setText(String.valueOf(prod.getCantidadStock()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        lblNombre.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblNombre.setText("Freidora de Aire Midea Doble Zona AF-D211BAR1 11Lts");
        lblNombre.setMaximumSize(new java.awt.Dimension(492, 22));
        lblNombre.setMinimumSize(new java.awt.Dimension(492, 22));

        lblPrecio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrecio.setText("$000000000");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Stock:");

        lblStock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblStock.setText("0000");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPrecio)))
                .addGap(45, 74, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblStock)
                    .addComponent(lblPrecio))
                .addGap(17, 17, 17))
        );

        add(panelPrincipal, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblStock;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    
}
