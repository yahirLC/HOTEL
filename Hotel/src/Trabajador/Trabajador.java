package Trabajador;

import Base.Dtrabajador;
import Logico.Ltrabajador;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Trabajador extends javax.swing.JFrame {

    public Trabajador() {
        initComponents();
        mostrar(""); //para que me muestre toda la tabla clientes
        apagar();

        this.setLocationRelativeTo(null);
    }

    private String opcion = "guardar";

    void ocultar() {

        tblClientes.getColumnModel().getColumn(0).setMaxWidth(0);
        tblClientes.getColumnModel().getColumn(0).setMinWidth(0);
        tblClientes.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    void apagar() {

        jtfIDPersona.setVisible(false);

        // desactivar botones, celdas de texto, etc.
        jtfLogin.setEnabled(false);
        jtfContra.setEnabled(false);
        jtfSueldo.setEnabled(false);
        jtfTelefono.setEnabled(false);
        jtfCorreo.setEnabled(false);

        jtfNombre.setEnabled(false);
        jtfApellidoPaterno.setEnabled(false);
        jtfApellidoMaterno.setEnabled(false);

        jcAcceso.setEnabled(false);

        jbGuardar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbEliminar.setEnabled(false);

        //vaciar celdas de texto
        jtfIDPersona.setText("");
        jtfLogin.setText("");
        jtfContra.setText("");
        jtfSueldo.setText("");
        jtfTelefono.setText("");
        jtfCorreo.setText("");
        jtfNombre.setText("");
        jtfApellidoPaterno.setText("");

        jtfApellidoMaterno.setText("");

        jcFechaNacimiento.setEnabled(false);
    }

    void encender() {

        jtfIDPersona.setVisible(true);

        // desactivar botones, celdas de texto, etc.
        jtfLogin.setEnabled(true);
        jtfContra.setEnabled(true);
        jtfSueldo.setEnabled(true);
        jtfTelefono.setEnabled(true);
        jtfCorreo.setEnabled(true);

        jtfNombre.setEnabled(true);
        jtfApellidoPaterno.setEnabled(true);
        jtfApellidoMaterno.setEnabled(true);

        jcAcceso.setEnabled(true);

        jbGuardar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbEliminar.setEnabled(true);

        //vaciar celdas de texto
        jtfIDPersona.setText("");
        jtfLogin.setText("");
        jtfContra.setText("");
        jtfSueldo.setText("");
        jtfTelefono.setText("");
        jtfCorreo.setText("");

        jcFechaNacimiento.setEnabled(true);
    }

    void mostrar(String buscar) {

        try {
            DefaultTableModel modelo;
            Ltrabajador funcion = new Ltrabajador();
            modelo = funcion.mostrar(buscar);

            tblClientes.setModel(modelo);
            ocultar();
            //aqui paso el Int a String para mostrarlo
            jlRegistrostotalesCleitne.setText("Registros totales: " + Integer.toString(funcion.totalregistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtfLogin = new javax.swing.JTextField();
        jtfContra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfSueldo = new javax.swing.JTextField();
        jcAcceso = new javax.swing.JComboBox<>();
        jbNuevo1 = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jtfBuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jbSalir2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jtfNombre = new javax.swing.JTextField();
        jtfApellidoPaterno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtfCorreo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtfApellidoMaterno = new javax.swing.JTextField();
        jtfTelefono = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jlRegistrostotalesCleitne = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jcFechaNacimiento = new com.toedter.calendar.JCalendar();
        jLabel15 = new javax.swing.JLabel();
        jtfIDPersona = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1150, 480));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(97, 167, 161));
        jPanel1.setLayout(null);

        jtfLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jtfLogin);
        jtfLogin.setBounds(10, 170, 80, 22);
        jPanel1.add(jtfContra);
        jtfContra.setBounds(10, 210, 80, 22);

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel7.setText("Contraseña");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(100, 210, 110, 20);

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel4.setText("Login");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 170, 70, 20);

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel6.setText("Acceso");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 290, 120, 20);
        jPanel1.add(jtfSueldo);
        jtfSueldo.setBounds(10, 250, 80, 22);

        jcAcceso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Editor", "Admin" }));
        jPanel1.add(jcAcceso);
        jcAcceso.setBounds(10, 290, 80, 22);

        jbNuevo1.setText("Nuevo");
        jbNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevo1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbNuevo1);
        jbNuevo1.setBounds(130, 120, 80, 23);

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEliminar);
        jbEliminar.setBounds(10, 120, 110, 23);

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel13.setText("Buscar:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(10, 80, 50, 20);

        jtfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jtfBuscar);
        jtfBuscar.setBounds(60, 80, 120, 22);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(190, 80, 20, 23);

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jbCancelar);
        jbCancelar.setBounds(120, 350, 90, 23);

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel8.setText("Sueldo");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(100, 250, 120, 20);

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar);
        jbGuardar.setBounds(20, 350, 80, 23);

        jbSalir2.setText("jButton1");
        jbSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalir2ActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir2);
        jbSalir2.setBounds(190, 10, 20, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(920, 0, 230, 480);

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(240, 50, 670, 420);

        jPanel2.setBackground(new java.awt.Color(97, 167, 161));
        jPanel2.setLayout(null);

        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });
        jPanel2.add(jtfNombre);
        jtfNombre.setBounds(10, 60, 80, 22);
        jPanel2.add(jtfApellidoPaterno);
        jtfApellidoPaterno.setBounds(10, 90, 80, 22);

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel10.setText("Apellido Paterno");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(100, 90, 110, 20);

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel11.setText("Nombre");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(100, 60, 70, 20);
        jPanel2.add(jtfCorreo);
        jtfCorreo.setBounds(10, 180, 80, 22);

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel12.setText("Apellido Materno");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(100, 120, 120, 20);

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel14.setText("Fecha de Nacimiento");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(10, 220, 170, 20);
        jPanel2.add(jtfApellidoMaterno);
        jtfApellidoMaterno.setBounds(10, 120, 80, 22);
        jPanel2.add(jtfTelefono);
        jtfTelefono.setBounds(10, 150, 80, 22);

        jLabel16.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel16.setText("Telefono");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(100, 150, 110, 20);

        jlRegistrostotalesCleitne.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jlRegistrostotalesCleitne.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlRegistrostotalesCleitne.setText("Registros");
        jPanel2.add(jlRegistrostotalesCleitne);
        jlRegistrostotalesCleitne.setBounds(70, 440, 150, 20);

        jLabel17.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel17.setText("Correo");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(100, 180, 110, 20);
        jPanel2.add(jcFechaNacimiento);
        jcFechaNacimiento.setBounds(10, 250, 191, 141);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 230, 480);

        jLabel15.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel15.setText("Id:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(810, 20, 20, 20);
        getContentPane().add(jtfIDPersona);
        jtfIDPersona.setBounds(840, 20, 70, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked

        String fecha = jcFechaNacimiento.getDate().toString();

        jbGuardar.setText("Editar");
        encender();
        jbEliminar.setEnabled(true);
        opcion = "editar";

        int fila = tblClientes.rowAtPoint(evt.getPoint());

        jtfIDPersona.setText(tblClientes.getValueAt(fila, 0).toString());
        jtfNombre.setText(tblClientes.getValueAt(fila, 1).toString());
        jtfApellidoPaterno.setText(tblClientes.getValueAt(fila, 2).toString());
        jtfApellidoMaterno.setText(tblClientes.getValueAt(fila, 3).toString());
        jtfTelefono.setText(tblClientes.getValueAt(fila, 5).toString());
        jtfCorreo.setText(tblClientes.getValueAt(fila, 6).toString());

        jtfLogin.setText(tblClientes.getValueAt(fila, 7).toString());
        jtfContra.setText(tblClientes.getValueAt(fila, 8).toString());
        jtfSueldo.setText(tblClientes.getValueAt(fila, 10).toString());

        jcAcceso.setSelectedItem(tblClientes.getValueAt(fila, 9).toString());

    }//GEN-LAST:event_tblClientesMouseClicked

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        if (!jtfIDPersona.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro de eliminar el trabajador y sus datos?", "Confirmar", 2);

            if (confirmacion == 0) {
                Ltrabajador funcion = new Ltrabajador();
                Dtrabajador dts = new Dtrabajador();

                dts.setIdPersona(Integer.parseInt(jtfIDPersona.getText()));
                funcion.eliminar(dts);
                mostrar("");
                apagar();
            }
        }

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mostrar(jtfBuscar.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBuscarActionPerformed

    private void jbNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevo1ActionPerformed
        encender();
        jbGuardar.setText("Guardar");
        opcion = "guardar";
    }//GEN-LAST:event_jbNuevo1ActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        String fechanacimiento = jcFechaNacimiento.getDate().toString();

        if (jtfNombre.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar un Nombre de trabajador ");
            jtfNombre.requestFocus(); // esto hace que al volver a el frame, se va a resaltar el jtfNocuarto
            return;
        }

        if (jtfApellidoPaterno.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar almenos un apellido");
            jtfApellidoPaterno.requestFocus();
            return;
        }

        if (jtfApellidoMaterno.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar un apellido materno");
            jtfApellidoMaterno.requestFocus();
            return;
        }

        if (jtfTelefono.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Para confirmar identidad, ingresar por favor un numero de telefono");
            jtfTelefono.requestFocus();
            return;
        }

        if (jtfCorreo.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Para confirmar identidad, ingresar por favor un correo electronico");
            jtfCorreo.requestFocus();
            return;
        }

        if (jtfSueldo.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese un sueldo para el empleado");
            jtfSueldo.requestFocus();
            return;
        }

        if (jtfLogin.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Por favor, ingrese un login para el empleado");
            jtfLogin.requestFocus();
            return;
        }

        if (jtfContra.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Por favor, ingrese una contraseña de usuario para el empleado");
            jtfContra.requestFocus();
            return;
        }

        Dtrabajador dts = new Dtrabajador();
        Ltrabajador funcion = new Ltrabajador();

        dts.setNombre(jtfNombre.getText());
        dts.setA_paterno(jtfApellidoPaterno.getText());
        dts.setA_materno(jtfApellidoMaterno.getText());
        dts.setFecha_nacimiento(fechanacimiento);
        dts.setTelefono(jtfTelefono.getText());
        dts.setCorreo(jtfCorreo.getText());

        dts.setLogin(jtfLogin.getText());
        dts.setContra(jtfContra.getText());
        dts.setSueldo(Double.parseDouble(jtfSueldo.getText()));

        int seleccionado = jcAcceso.getSelectedIndex();
        dts.setAcceso((String) jcAcceso.getItemAt(seleccionado));

        if (opcion.equals("guardar")) {
            if (funcion.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "El trabajador ha sido registrado");
                mostrar("");
                apagar();
            }
        } else if (opcion.equals("editar")) {

            dts.setIdPersona(Integer.parseInt(jtfIDPersona.getText()));

            if (funcion.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "El trabajador a sido modificado");
                mostrar("");
                apagar();
            }

        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        mostrar("");
        apagar();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtfLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfLoginActionPerformed

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreActionPerformed

    private void jbSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalir2ActionPerformed

        this.dispose();

    }//GEN-LAST:event_jbSalir2ActionPerformed

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
            java.util.logging.Logger.getLogger(Trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbSalir1;
    private javax.swing.JButton jbSalir2;
    private javax.swing.JComboBox<String> jcAcceso;
    private com.toedter.calendar.JCalendar jcFechaNacimiento;
    private javax.swing.JLabel jlRegistrostotalesCleitne;
    private javax.swing.JTextField jtfApellidoMaterno;
    private javax.swing.JTextField jtfApellidoPaterno;
    private javax.swing.JTextField jtfBuscar;
    private javax.swing.JTextField jtfContra;
    private javax.swing.JTextField jtfCorreo;
    private javax.swing.JTextField jtfIDPersona;
    private javax.swing.JTextField jtfLogin;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfSueldo;
    private javax.swing.JTextField jtfTelefono;
    private javax.swing.JTable tblClientes;
    // End of variables declaration//GEN-END:variables
}
