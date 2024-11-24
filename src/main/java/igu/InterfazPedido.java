/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

import DAO.CategoriaDAO;
import DAO.ImpDAOCategoria;
import DAO.ImpDAOEstadoEntrega;
import DAO.ImpDAOPedido;
import DAO.ImpDAOProducto;
import DAO.ImpDAOUsuario;
import DAO.PedidoDAO;
import clases.Categoria;
import clases.DetallePedido;
import clases.EstadoEntrega;
import clases.Pedido;
import clases.Producto;
import clases.Usuario;
import java.awt.CardLayout;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mauri
 */
public class InterfazPedido extends javax.swing.JFrame {

    
    private Pedido pedido;
    private Usuario usuarioInterfaz;
    private final ImpDAOEstadoEntrega estadoEntregaDAO = new ImpDAOEstadoEntrega();
    private final ImpDAOPedido pedidoDAO = new ImpDAOPedido();
    private final ImpDAOUsuario usuarioDAO = new ImpDAOUsuario();
    private final ImpDAOProducto productoDAO = new ImpDAOProducto();
    private Map<Integer, EstadoEntrega> mapComEst = new HashMap();
    
    
    public InterfazPedido(Usuario usu, Pedido ped) {
        
        this.usuarioInterfaz = usu;
        this.pedido = ped;
        
        initComponents();
        modeloTabla = (DefaultTableModel) tablaDetalle.getModel();
        
        modeloTabla.setColumnIdentifiers(new String[]{"Nombre", "Cantidad", "Precio", "Total"});
        cargarDatosPedido();
        cargarEstiloTabla();
        cargarEstados();
        
        CardLayout panelOpcional = (CardLayout) contenedorEstado.getLayout();
        panelOpcional.addLayoutComponent(panelUsuEstado, "usuario");
        panelOpcional.addLayoutComponent(panelAdmEstado, "admin");
        
        switch (usuarioInterfaz.getIdTipo()) {
            case 1:
                panelOpcional.show(contenedorEstado, "admin");
            break;
            case 2:
                panelOpcional.show(contenedorEstado, "usuario");
            break;
            
            
            
        }
        
        
        
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
        scrollDetalle = new javax.swing.JScrollPane();
        tablaDetalle = new javax.swing.JTable();
        lblNombrePedido = new javax.swing.JLabel();
        lblNombreUsu = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        contenedorEstado = new javax.swing.JPanel();
        panelUsuEstado = new javax.swing.JPanel();
        btnCancelarPed = new javax.swing.JButton();
        lblEstadoPed = new javax.swing.JLabel();
        panelAdmEstado = new javax.swing.JPanel();
        comboEstados = new javax.swing.JComboBox<>();
        btnCambiarEstado = new javax.swing.JButton();
        lblFechaPed = new javax.swing.JLabel();
        lblEntregaEstimada = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollDetalle.setViewportView(tablaDetalle);
        if (tablaDetalle.getColumnModel().getColumnCount() > 0) {
            tablaDetalle.getColumnModel().getColumn(0).setResizable(false);
            tablaDetalle.getColumnModel().getColumn(0).setPreferredWidth(200);
            tablaDetalle.getColumnModel().getColumn(1).setResizable(false);
            tablaDetalle.getColumnModel().getColumn(1).setPreferredWidth(1);
            tablaDetalle.getColumnModel().getColumn(2).setResizable(false);
            tablaDetalle.getColumnModel().getColumn(2).setPreferredWidth(1);
            tablaDetalle.getColumnModel().getColumn(3).setResizable(false);
            tablaDetalle.getColumnModel().getColumn(3).setPreferredWidth(1);
        }

        lblNombrePedido.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNombrePedido.setText("Pedido con ID: ");

        lblNombreUsu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombreUsu.setText("Usuario: ");

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTotal.setText("Total: $ ");

        contenedorEstado.setBackground(new java.awt.Color(255, 255, 255));
        contenedorEstado.setLayout(new java.awt.CardLayout());

        panelUsuEstado.setLayout(new java.awt.BorderLayout());

        btnCancelarPed.setText("Cancelar pedido");
        panelUsuEstado.add(btnCancelarPed, java.awt.BorderLayout.SOUTH);

        lblEstadoPed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEstadoPed.setText("EstadoPedido");
        panelUsuEstado.add(lblEstadoPed, java.awt.BorderLayout.CENTER);

        contenedorEstado.add(panelUsuEstado, "card2");

        panelAdmEstado.setBackground(new java.awt.Color(255, 255, 255));
        panelAdmEstado.setLayout(new java.awt.BorderLayout());
        panelAdmEstado.add(comboEstados, java.awt.BorderLayout.PAGE_START);

        btnCambiarEstado.setText("Cambiar estado");
        panelAdmEstado.add(btnCambiarEstado, java.awt.BorderLayout.SOUTH);

        contenedorEstado.add(panelAdmEstado, "card3");

        lblFechaPed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaPed.setText("Fecha del pedido: ");

        lblEntregaEstimada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEntregaEstimada.setText("Entrega estimada: ");

        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(317, 317, 317)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(scrollDetalle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNombrePedido, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblFechaPed, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblEntregaEstimada, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNombreUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contenedorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(contenedorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombrePedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombreUsu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFechaPed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEntregaEstimada)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        int tipoUsuario = usuarioInterfaz.getIdTipo();
            switch(tipoUsuario){
                case 1:
                    InterfazAdmin interAdmin = new InterfazAdmin (usuarioInterfaz);
                    interAdmin.setVisible(true);
                    this.setVisible(false);
                break;
                case 2:
                    InterfazUsuario interUsu = new InterfazUsuario (usuarioInterfaz);
                    interUsu.setVisible(true);
                    this.setVisible(false);
                break; 
              }
    }//GEN-LAST:event_btnVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarEstado;
    private javax.swing.JButton btnCancelarPed;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> comboEstados;
    private javax.swing.JPanel contenedorEstado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEntregaEstimada;
    private javax.swing.JLabel lblEstadoPed;
    private javax.swing.JLabel lblFechaPed;
    private javax.swing.JLabel lblNombrePedido;
    private javax.swing.JLabel lblNombreUsu;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel panelAdmEstado;
    private javax.swing.JPanel panelUsuEstado;
    private javax.swing.JScrollPane scrollDetalle;
    private javax.swing.JTable tablaDetalle;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel modeloTabla;
    private EstadoEntrega estado; 
    private void cargarEstados() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        comboEstados.setModel(modelo);
        Integer i = 0;
        try {
            for (EstadoEntrega est : estadoEntregaDAO.listar()){
                modelo.addElement(est.getDescripcion());
                mapComEst.put(i, est);
                i++;
                
            }
            Integer indexEstado = 0;
            for(Map.Entry<Integer, EstadoEntrega> entry : mapComEst.entrySet()){
                    EstadoEntrega estado = entry.getValue();
                    if(estado.getIdEstado()==pedido.getIdEstado()){
                        indexEstado = entry.getKey();
                    }
            }
            
            comboEstados.setSelectedIndex(indexEstado);
            
            
        } catch (SQLException | ClassNotFoundException ex) {
            modelo.addElement("Error Consulta SQL");
        }
        
        
    }

    private void cargarDatosPedido() {
        try {
            Usuario usuPedido = usuarioDAO.obtener(pedido.getIdUsuario());
            List<DetallePedido> detalles = pedidoDAO.obtenerDetalles(pedido);
            Double totalPedido=0.0;
            for(DetallePedido det : detalles){
                Producto prod = productoDAO.obtener(det.getIdProducto());
                Integer cantidad = det.getCantidad();
                Double precioUnit = det.getPrecioUnitario();
                Double totalFila = cantidad*precioUnit;
                totalPedido += totalFila;
                Object[] fila = {prod.getNombre(),cantidad,precioUnit, totalFila};
                modeloTabla.addRow(fila);
                
            }
            
            this.estado = estadoEntregaDAO.obtener(pedido.getIdEstado());
            
            lblEstadoPed.setText(estado.getDescripcion());
            lblNombreUsu.setText(lblNombreUsu.getText()+usuPedido.getNombre()+" "+usuPedido.getApellido());
            lblNombrePedido.setText(lblNombrePedido.getText()+pedido.getIdPedido());
            lblFechaPed.setText(lblFechaPed.getText()+pedido.getFechaPedido());
            lblEntregaEstimada.setText(lblEntregaEstimada.getText()+pedido.getEntregaEstimada());
            lblTotal.setText(lblTotal.getText() + totalPedido.toString());
            
            
        } catch (SQLException | ClassNotFoundException ex) {
            lblNombrePedido.setText("No se pudo recuperar los datos dele pedido");
        }
        
    }

    private void cargarEstiloTabla() {
        DefaultTableCellRenderer derecha = new DefaultTableCellRenderer();
        derecha.setHorizontalAlignment(SwingConstants.RIGHT);
        tablaDetalle.getColumn("Cantidad").setCellRenderer(derecha);
        tablaDetalle.getColumn("Precio").setCellRenderer(derecha);
        tablaDetalle.getColumn("Total").setCellRenderer(derecha);

    }
    
    
    
}
