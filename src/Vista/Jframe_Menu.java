
package Vista;

/**
 *
 * @author Vicente
 */
public class Jframe_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Jframe_Menu
     */
    public Jframe_Menu() {
        initComponents();
        setSize(900, 600);
        setResizable(false);
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

        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmn_menu = new javax.swing.JMenu();
        jmn_reservarCliente = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jmn_eliminarReserva = new javax.swing.JMenuItem();
        Jmi_AgregarTatuador = new javax.swing.JMenuItem();
        Jmi_EliminarTatuador = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setAlignmentX(0.3F);

        jmn_menu.setText("Menu");

        jmn_reservarCliente.setText("Reservar cliente");
        jmn_reservarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmn_reservarClienteActionPerformed(evt);
            }
        });
        jmn_menu.add(jmn_reservarCliente);

        jMenuItem2.setText("Modificar reserva");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jmn_menu.add(jMenuItem2);

        jMenuItem5.setText("Modificar perfil");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jmn_menu.add(jMenuItem5);

        jmn_eliminarReserva.setText("Eliminar reserva");
        jmn_eliminarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmn_eliminarReservaActionPerformed(evt);
            }
        });
        jmn_menu.add(jmn_eliminarReserva);

        Jmi_AgregarTatuador.setText("Agregar Tatuador");
        Jmi_AgregarTatuador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jmi_AgregarTatuadorActionPerformed(evt);
            }
        });
        jmn_menu.add(Jmi_AgregarTatuador);

        Jmi_EliminarTatuador.setText("Eliminar Tatuador");
        Jmi_EliminarTatuador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jmi_EliminarTatuadorActionPerformed(evt);
            }
        });
        jmn_menu.add(Jmi_EliminarTatuador);

        jMenuBar1.add(jmn_menu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmn_reservarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmn_reservarClienteActionPerformed
        //  boton de Panel de reserva cliente
        
        Jframe_ReservaCliente reserva = new Jframe_ReservaCliente();
        reserva.setVisible(true);
        
    }//GEN-LAST:event_jmn_reservarClienteActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jmn_eliminarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmn_eliminarReservaActionPerformed
        // codigo para eliminar al sacowea ctm  q cancela la wea a ultima hora
        Jframe_EliminarCliente eliminar = new Jframe_EliminarCliente(); // importante q J y _(letra)en mayus
        eliminar.setVisible(true);
    }//GEN-LAST:event_jmn_eliminarReservaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void Jmi_AgregarTatuadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jmi_AgregarTatuadorActionPerformed
           Jframe_AgregarTatuador agregar = new Jframe_AgregarTatuador();
           agregar.setVisible(true);
    }//GEN-LAST:event_Jmi_AgregarTatuadorActionPerformed

    private void Jmi_EliminarTatuadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jmi_EliminarTatuadorActionPerformed
     Jframe_EliminarTatuador eli_tatto = new Jframe_EliminarTatuador();
        eli_tatto.setVisible(true);
    }//GEN-LAST:event_Jmi_EliminarTatuadorActionPerformed

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
            java.util.logging.Logger.getLogger(Jframe_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jframe_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jframe_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jframe_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jframe_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Jmi_AgregarTatuador;
    private javax.swing.JMenuItem Jmi_EliminarTatuador;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jmn_eliminarReserva;
    private javax.swing.JMenu jmn_menu;
    private javax.swing.JMenuItem jmn_reservarCliente;
    // End of variables declaration//GEN-END:variables
}
