/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Registro;
import Modelo.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class Jframe_EliminarCliente extends javax.swing.JFrame {

    /**
     * Creates new form Jframe_EliminarCliente
     */
    public Jframe_EliminarCliente() {
        initComponents();
        setSize(796, 543);
        setResizable(true);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        list1 = new java.awt.List();
        panel1 = new java.awt.Panel();
        jbtn_cargarUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtn_eliminarReserva = new javax.swing.JButton();
        jtxt_buscarCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_SeleccionarUsuario = new javax.swing.JTable();
        jbtn_buscarReserva = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Jbtn_Regresar_menu = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jbtn_cargarUsuario.setText("Cargar");
        jbtn_cargarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cargarUsuarioActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Cancelacion de Reserva");

        jbtn_eliminarReserva.setText("Eliminar");
        jbtn_eliminarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_eliminarReservaActionPerformed(evt);
            }
        });

        jtxt_buscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_buscarClienteActionPerformed(evt);
            }
        });

        jtbl_SeleccionarUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "Rut", "Nombre", "Apellido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbl_SeleccionarUsuario);

        jbtn_buscarReserva.setText("Actualizar");
        jbtn_buscarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_buscarReservaActionPerformed(evt);
            }
        });

        jLabel2.setText("ingrese el rut");

        Jbtn_Regresar_menu.setBackground(new java.awt.Color(127, 127, 159));
        Jbtn_Regresar_menu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Jbtn_Regresar_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icon_Return.png"))); // NOI18N
        Jbtn_Regresar_menu.setText("Regresar");
        Jbtn_Regresar_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_Regresar_menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel1))
                    .addComponent(Jbtn_Regresar_menu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jbtn_eliminarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtxt_buscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jbtn_buscarReserva))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_buscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtn_eliminarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                .addComponent(Jbtn_Regresar_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jbtn_buscarReserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_eliminarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_eliminarReservaActionPerformed
        // TODO add your handling code here:
        String rut;
        
        //DefaultTableModel modelo = (DefaultTableModel) this.jtbl_SeleccionarUsuario.getModel();
        
        rut = this.jtxt_buscarCliente.getText();
        
        Registro reg = new Registro();
        //modelo.setRowCount(0);
        
        int opcion = JOptionPane.showConfirmDialog(this, "Desea eliminar la reserva?","Eliminar",0);
        
        if (opcion == 0) {
            reg.eliminarCliente(rut);
            JOptionPane.showConfirmDialog(null, "Usuario eliminado", "Eliminar", 1);
        } else {
            JOptionPane.showConfirmDialog(null, "Cancelado", "Eliminar", 2);
        }
//        Registro reg = new Registro();
//        DefaultTableModel modelo = (DefaultTableModel) this.jtbl_SeleccionarUsuario.getModel();
//        
//        modelo.setRowCount(0);
//        
//        ArrayList<Cliente> lista = reg.ListarCliente();
//        for (Cliente cli : lista) {
//            id = cli.getNum_cliente();
//            rut = cli.getRut_cliente();
//            nombre = cli.getNom_cliente();
//            apellido = cli.getAp_cliente();
//            
//            modelo.addRow(new Object[]{id, rut, nombre, apellido});
//        }
    }//GEN-LAST:event_jbtn_eliminarReservaActionPerformed

    private void jtxt_buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_buscarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_buscarClienteActionPerformed

    private void jbtn_cargarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cargarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_cargarUsuarioActionPerformed

    private void jbtn_buscarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_buscarReservaActionPerformed
        // TODO add your handling code here:
        int id;
        String rut;
        String nombre, apellido;
        rut = this.jtxt_buscarCliente.getText();

        Registro reg = new Registro();

        DefaultTableModel modelo = (DefaultTableModel) this.jtbl_SeleccionarUsuario.getModel();

        modelo.setRowCount(0);

        ArrayList<Cliente> lista = reg.ListarCliente();
        for (Cliente cli : lista) {
            id = cli.getNum_cliente();
            rut = cli.getRut_cliente();
            nombre = cli.getNom_cliente();
            apellido = cli.getAp_cliente();

            modelo.addRow(new Object[]{id, rut, nombre, apellido});
        }
    }//GEN-LAST:event_jbtn_buscarReservaActionPerformed

    private void Jbtn_Regresar_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_Regresar_menuActionPerformed
        // TODO add your handling code here:
        this.hide();
        Jframe_ReservaCliente reserva = new Jframe_ReservaCliente();
        reserva.setVisible(false);
    }//GEN-LAST:event_Jbtn_Regresar_menuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jframe_EliminarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jframe_EliminarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jframe_EliminarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jframe_EliminarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jframe_EliminarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbtn_Regresar_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JButton jbtn_buscarReserva;
    private javax.swing.JButton jbtn_cargarUsuario;
    private javax.swing.JButton jbtn_eliminarReserva;
    private javax.swing.JTable jtbl_SeleccionarUsuario;
    private javax.swing.JTextField jtxt_buscarCliente;
    private java.awt.List list1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
