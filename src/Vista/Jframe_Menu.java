
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        FondoMenu = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmn_menu = new javax.swing.JMenu();
        jmn_reservarCliente = new javax.swing.JMenuItem();
        jmn_eliminarReserva = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        Jmi_AgregarTatuador = new javax.swing.JMenuItem();
        Jmi_EliminarTatuador = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ink special 2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 205, -1));

        jPanel1.setBackground(new java.awt.Color(199, 166, 75));

        jLabel2.setFont(new java.awt.Font("Snap ITC", 1, 40)); // NOI18N
        jLabel2.setText("Tatuatesta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 350, 110));

        jButton2.setBackground(new java.awt.Color(173, 216, 230));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton2.setText("Eliminar Reserva");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 140, 70));

        jButton3.setBackground(new java.awt.Color(173, 216, 230));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton3.setText("Agendar Reserva");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 140, 70));

        jButton4.setBackground(new java.awt.Color(173, 216, 230));
        jButton4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton4.setText("Agregar Tatuador");
        jButton4.setPreferredSize(new java.awt.Dimension(115, 23));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 140, 70));

        jButton6.setBackground(new java.awt.Color(173, 216, 230));
        jButton6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton6.setText("Modificar Perfil");
        jButton6.setMaximumSize(new java.awt.Dimension(115, 23));
        jButton6.setMinimumSize(new java.awt.Dimension(115, 23));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 140, 70));

        jButton1.setBackground(new java.awt.Color(173, 216, 230));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton1.setText("Eliminar Tatuador");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 140, 70));

        FondoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo 3.png"))); // NOI18N
        FondoMenu.setPreferredSize(new java.awt.Dimension(900, 600));
        getContentPane().add(FondoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 570));

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenuBar1.setAlignmentX(0.3F);

        jmn_menu.setBackground(new java.awt.Color(0, 0, 0));
        jmn_menu.setBorder(null);
        jmn_menu.setText("Menu");

        jmn_reservarCliente.setText("Agendar Reserva");
        jmn_reservarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmn_reservarClienteActionPerformed(evt);
            }
        });
        jmn_menu.add(jmn_reservarCliente);

        jmn_eliminarReserva.setText("Eliminar reserva");
        jmn_eliminarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmn_eliminarReservaActionPerformed(evt);
            }
        });
        jmn_menu.add(jmn_eliminarReserva);

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Jframe_ReservaCliente reserva = new Jframe_ReservaCliente();
        reserva.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Jframe_AgregarTatuador agregar = new Jframe_AgregarTatuador();
        agregar.setVisible(true);

        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Jframe_EliminarCliente eliminar = new Jframe_EliminarCliente(); // importante q J y _(letra)en mayus
        eliminar.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Jframe_ModificarDtos1 modi = new  Jframe_ModificarDtos1();
        modi.setVisible(true);

        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Jframe_EliminarTatuador eli_tatto = new Jframe_EliminarTatuador();
        eli_tatto.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JLabel FondoMenu;
    private javax.swing.JMenuItem Jmi_AgregarTatuador;
    private javax.swing.JMenuItem Jmi_EliminarTatuador;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jmn_eliminarReserva;
    private javax.swing.JMenu jmn_menu;
    private javax.swing.JMenuItem jmn_reservarCliente;
    // End of variables declaration//GEN-END:variables
}
