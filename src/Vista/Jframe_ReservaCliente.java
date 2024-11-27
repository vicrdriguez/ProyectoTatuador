/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import ConexionBD.Conexion;
import Controlador.Registro;
import Modelo.Cliente;
import Modelo.Tatuador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Vicente
 */
public class Jframe_ReservaCliente extends javax.swing.JFrame {
        Registro reg = new Registro();
    /**
     * Creates new form Jframe_ReservaCliente
     */
    public Jframe_ReservaCliente() {
        initComponents();
        setSize(796, 543);
        setResizable(true);
        setLocationRelativeTo(null);
        reg.RellenarCombo("nom_tatuador", jcbox_tatuadores);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Jtxt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Jtxt_Apellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Jtxt_rut = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Jtxt_Fono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Jtxt_correo = new javax.swing.JTextField();
        Jbtn_guardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jcbox_tatuadores = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        Jbtn_Eliminar_cita = new javax.swing.JButton();
        Jbtn_Regresar_menu = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_listarClientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jbtn_actualizar = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(153, 153, 0));

        jPanel2.setBackground(new java.awt.Color(92, 94, 117));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reservar cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Symbol", 0, 36))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        Jtxt_nombre.setToolTipText("");
        Jtxt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtxt_nombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido :");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rut :");

        Jtxt_rut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtxt_rutActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fono :");

        Jtxt_Fono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtxt_FonoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Correo electronico :");

        Jtxt_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtxt_correoActionPerformed(evt);
            }
        });

        Jbtn_guardar.setBackground(new java.awt.Color(127, 127, 159));
        Jbtn_guardar.setText("Guardar");
        Jbtn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_guardarActionPerformed(evt);
            }
        });

        jLabel4.setText("Seleccione Tatuador: ");

        jcbox_tatuadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione--" }));
        jcbox_tatuadores.setToolTipText("");
        jcbox_tatuadores.setName(""); // NOI18N
        jcbox_tatuadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbox_tatuadoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Jtxt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Jtxt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Jtxt_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Jtxt_Fono, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jtxt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbox_tatuadores, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(Jbtn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Jtxt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Jtxt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Jtxt_rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Jtxt_Fono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Jtxt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jcbox_tatuadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Jbtn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(92, 94, 117));
        jPanel1.setForeground(new java.awt.Color(51, 204, 255));
        jPanel1.setToolTipText("");

        Jbtn_Eliminar_cita.setBackground(new java.awt.Color(127, 127, 159));
        Jbtn_Eliminar_cita.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Jbtn_Eliminar_cita.setText("Eliminar cita");
        Jbtn_Eliminar_cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_Eliminar_citaActionPerformed(evt);
            }
        });

        Jbtn_Regresar_menu.setBackground(new java.awt.Color(127, 127, 159));
        Jbtn_Regresar_menu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Jbtn_Regresar_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icon_Return.png"))); // NOI18N
        Jbtn_Regresar_menu.setText("Regresar");
        Jbtn_Regresar_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_Regresar_menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Jbtn_Eliminar_cita)
                .addGap(119, 119, 119))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jbtn_Regresar_menu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(Jbtn_Eliminar_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jbtn_Regresar_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtbl_listarClientes.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "Nombre", "Apellido", "Rut", "Fono", "Correo", "Tatuador"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbl_listarClientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtbl_listarClientes);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Citas Pendientes");

        jbtn_actualizar.setBackground(new java.awt.Color(127, 127, 159));
        jbtn_actualizar.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jbtn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icon_Refrescar.png"))); // NOI18N
        jbtn_actualizar.setText("Actualizar");
        jbtn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jbtn_actualizar)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jbtn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jbtn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_guardarActionPerformed
        //         TODO add your handling code here:

        //capturar datos

        String Nombre, Apellido,Correo, Rut;
        int  Fono;
        
        if (this.Jtxt_nombre.getText().trim().isEmpty()|| this.Jtxt_Apellido.getText().trim().isEmpty() || this.Jtxt_rut.getText().trim().isEmpty()  || this.Jtxt_correo.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Falta rellenar campos", "Campos vacio", JOptionPane.WARNING_MESSAGE);
        }
        else{
            
        Nombre = this.Jtxt_nombre.getText();
        Apellido = this.Jtxt_Apellido.getText();
        Rut = this.Jtxt_rut.getText();
        Fono = Integer.parseInt(this.Jtxt_Fono.getText()); 
        Correo = this.Jtxt_correo.getText();
        

        Cliente cliente = new Cliente(0, Rut, Nombre, Apellido, Fono, Correo);
        Registro reg = new Registro();

        reg.agregarCliente(cliente);

        JOptionPane.showMessageDialog(null, "Reserva de tatuaje realizado con exito!", "Ingreso", 1);
        }
        

    }//GEN-LAST:event_Jbtn_guardarActionPerformed

    private void Jtxt_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtxt_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtxt_correoActionPerformed

    private void Jtxt_FonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtxt_FonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtxt_FonoActionPerformed

    private void Jtxt_rutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtxt_rutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtxt_rutActionPerformed

    private void Jtxt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtxt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtxt_nombreActionPerformed

    private void jbtn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_actualizarActionPerformed
        // TODO add your handling code here:
        int id;
        String nombre, apellido, rut;
        int fono;
        String correo;

        Registro reg = new Registro();
        DefaultTableModel modelo = (DefaultTableModel) this.jtbl_listarClientes.getModel();

        modelo.setRowCount(0);

        ArrayList<Cliente> lista = reg.ListarCliente();
        for (Cliente cli : lista) {
            id = cli.getNum_cliente();
            nombre = cli.getNom_cliente();
            apellido = cli.getAp_cliente();
            rut = cli.getRut_cliente();
            fono = cli.getFono_cliente();
            correo = cli.getCorreo_cliente();

            modelo.addRow(new Object[]{id, nombre, apellido, rut, fono, correo});
        }
    }//GEN-LAST:event_jbtn_actualizarActionPerformed

    private void Jbtn_Eliminar_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_Eliminar_citaActionPerformed
        // TODO add your handling code here:

        Jframe_EliminarCliente eliminar_cliente = new Jframe_EliminarCliente();
        eliminar_cliente.setVisible(true);
    }//GEN-LAST:event_Jbtn_Eliminar_citaActionPerformed

    private void Jbtn_Regresar_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_Regresar_menuActionPerformed
        // TODO add your handling code here:
        this.hide();
        Jframe_ReservaCliente reserva = new Jframe_ReservaCliente();
        reserva.setVisible(false);
    }//GEN-LAST:event_Jbtn_Regresar_menuActionPerformed

    private void jcbox_tatuadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbox_tatuadoresActionPerformed
         //TODO add your handling code here:
         
         
//        try {
//            Conexion con = new Conexion();
//            Connection cnx = con.obtenerConexion();
//            
//            jcbox_tatuadores.removeAllItems(); //remover items 
//            DefaultComboBoxModel tatuadores = new DefaultComboBoxModel();
//            String consulta = "SELECT nom_tatuador FROM proyectoTatuador.Tatuador WHERE disponible = true";
//            PreparedStatement stmt = cnx.prepareStatement(consulta);
//            
//            ResultSet rs = stmt.executeQuery();
//            
//            while (rs.next()){
//                jcbox_tatuadores.addItem(rs.getString(consulta));
//            }
//            rs.close();
//            stmt.close();
//            cnx.close();
//            
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error al cargar tatuadores", "Error Tatuadores", 1);
//        }
//        
//
    }//GEN-LAST:event_jcbox_tatuadoresActionPerformed

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
            java.util.logging.Logger.getLogger(Jframe_ReservaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jframe_ReservaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jframe_ReservaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jframe_ReservaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jframe_ReservaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbtn_Eliminar_cita;
    private javax.swing.JButton Jbtn_Regresar_menu;
    private javax.swing.JButton Jbtn_guardar;
    private javax.swing.JTextField Jtxt_Apellido;
    private javax.swing.JTextField Jtxt_Fono;
    private javax.swing.JTextField Jtxt_correo;
    private javax.swing.JTextField Jtxt_nombre;
    private javax.swing.JTextField Jtxt_rut;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn_actualizar;
    private javax.swing.JComboBox<String> jcbox_tatuadores;
    private javax.swing.JTable jtbl_listarClientes;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo(JComboBox c) {
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        Registro reg = new Registro();
        c.setModel(combo);
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            String consulta = "SELECT nom_tatuador FROM proyectoTatuador.Tatuador WHERE disponible = true";
            PreparedStatement stmt = cnx.prepareStatement(consulta);
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                Tatuador tat = new Tatuador();
                tat.setNom_tatuador(rs.getString(1));
                reg.ListarTatuador(tat);
                combo.addElement(tat.getNom_tatuador());
                System.out.println("Tatuador agregado con éxito a las opciones");
            }
            rs.close();
            stmt.close();
            cnx.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar tatuadores", "Error Tautadores", 1);
        }            
        
        }
        
    }

