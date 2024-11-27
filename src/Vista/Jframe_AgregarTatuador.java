/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Registro;
import Modelo.Tatuador;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author vina
 */
public class Jframe_AgregarTatuador extends javax.swing.JFrame {

    /**
     * Creates new form Jframe_AgregarTatuador
     */
    public Jframe_AgregarTatuador() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        Jtxt_nombre_tatuador = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Jtxt_rut_tatuador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Jtxt_ApellidoTatuador = new javax.swing.JTextField();
        Jtxt_correoTaTUADOR = new javax.swing.JTextField();
        Jtxt_fonoTatuador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Jbtn_guardar_Tatuador = new javax.swing.JButton();
        Jchb_disponibilidad = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_listarTatuadores = new javax.swing.JTable();
        jbtn_actualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Jtxt_nombre_tatuador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtxt_nombre_tatuadorActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        Jtxt_rut_tatuador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtxt_rut_tatuadorActionPerformed(evt);
            }
        });

        jLabel2.setText("Rut");

        jLabel3.setText("Apellido");

        jLabel4.setText("Correo");

        jLabel5.setText("Fono");

        Jbtn_guardar_Tatuador.setText("Guardar");
        Jbtn_guardar_Tatuador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_guardar_TatuadorActionPerformed(evt);
            }
        });

        Jchb_disponibilidad.setText("Disponibilidad");

        jLabel6.setText("TATUADORES ACTUALES");

        jtbl_listarTatuadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Rut", "Apellido", "Correo", "Telefono", "Disponibilidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbl_listarTatuadores);

        jbtn_actualizar.setBackground(new java.awt.Color(127, 127, 159));
        jbtn_actualizar.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jbtn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icon_Refrescar.png"))); // NOI18N
        jbtn_actualizar.setText("Actualizar");
        jbtn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtn_actualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Jtxt_correoTaTUADOR)
                                .addComponent(Jtxt_fonoTatuador)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Jchb_disponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(24, 24, 24)
                                            .addComponent(Jbtn_guardar_Tatuador))))
                                .addComponent(Jtxt_nombre_tatuador, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                .addComponent(Jtxt_ApellidoTatuador))
                            .addComponent(Jtxt_rut_tatuador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 122, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(167, 167, 167))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(Jtxt_rut_tatuador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(Jtxt_nombre_tatuador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Jtxt_ApellidoTatuador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(32, 32, 32)
                                .addComponent(Jtxt_correoTaTUADOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addComponent(Jtxt_fonoTatuador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(16, 16, 16)
                .addComponent(Jchb_disponibilidad)
                .addGap(18, 18, 18)
                .addComponent(Jbtn_guardar_Tatuador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jtxt_nombre_tatuadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtxt_nombre_tatuadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtxt_nombre_tatuadorActionPerformed

    private void Jbtn_guardar_TatuadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_guardar_TatuadorActionPerformed
        
        String rut_tatuador, nom_tatuador, ap_tatuador,correo_tatuador;
        int fono_tatuador;
        boolean disponibilidad;
        
        nom_tatuador = this.Jtxt_nombre_tatuador.getText();
        ap_tatuador = this.Jtxt_ApellidoTatuador.getText();
        rut_tatuador = this.Jtxt_rut_tatuador.getText();
        correo_tatuador = this.Jtxt_correoTaTUADOR.getText();
        fono_tatuador =Integer.parseInt(this.Jtxt_fonoTatuador.getText());
        disponibilidad = this.Jchb_disponibilidad.isSelected(); //0-1
        
        Tatuador tatuador = new Tatuador(0, rut_tatuador, nom_tatuador, ap_tatuador, correo_tatuador, fono_tatuador, disponibilidad);
        Registro reg = new Registro();
    
        reg.AgregarTatuador(tatuador);
    
        JOptionPane.showConfirmDialog(null, "Tatuador Registrado","Ingreso", 1);
    }//GEN-LAST:event_Jbtn_guardar_TatuadorActionPerformed

    private void jbtn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_actualizarActionPerformed
        // TODO add your handling code here:
        int id;
        String nombre, apellido, rut;
        int fono;
        String correo;
        boolean disponibilidad;

        Registro reg = new Registro();
        DefaultTableModel modelo = (DefaultTableModel) this.jtbl_listarTatuadores.getModel();

        modelo.setRowCount(0);

        ArrayList<Tatuador> lista = reg.ListarTatuador();
        for (Tatuador tat : lista) {
            id = tat.getNum_tatuador();
            nombre = tat.getNom_tatuador();
            apellido = tat.getAp_tatuador();
            rut = tat.getRut_tatuador();
            fono = tat.getFono_tatuador();
            correo = tat.getCorreo_tatuador();
            disponibilidad = tat.isDisponibilidad();

            modelo.addRow(new Object[]{id, nombre, apellido, rut, fono, correo, disponibilidad});
        }
    }//GEN-LAST:event_jbtn_actualizarActionPerformed

    private void Jtxt_rut_tatuadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtxt_rut_tatuadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtxt_rut_tatuadorActionPerformed

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
            java.util.logging.Logger.getLogger(Jframe_AgregarTatuador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jframe_AgregarTatuador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jframe_AgregarTatuador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jframe_AgregarTatuador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jframe_AgregarTatuador().setVisible(true);
            } 
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbtn_guardar_Tatuador;
    private javax.swing.JCheckBox Jchb_disponibilidad;
    private javax.swing.JTextField Jtxt_ApellidoTatuador;
    private javax.swing.JTextField Jtxt_correoTaTUADOR;
    private javax.swing.JTextField Jtxt_fonoTatuador;
    private javax.swing.JTextField Jtxt_nombre_tatuador;
    private javax.swing.JTextField Jtxt_rut_tatuador;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn_actualizar;
    private javax.swing.JTable jtbl_listarTatuadores;
    // End of variables declaration//GEN-END:variables
}
