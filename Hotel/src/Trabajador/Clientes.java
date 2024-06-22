package Trabajador;

import Base.Dcliente;
import Logico.Lcliente;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Clientes extends javax.swing.JFrame {

    public Clientes() {

        initComponents();
        mostrar(""); //para que me muestre toda la tabla clientes
        apagar();

        this.setLocationRelativeTo(null);
        this.jtffechanacimiento.setVisible(false);

    }

    private String opcion = "guardar";

    void ocultar() {

        tblClientes.getColumnModel().getColumn(0).setMaxWidth(0);
        tblClientes.getColumnModel().getColumn(0).setMinWidth(0);
        tblClientes.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    void apagar() {

        jtfIDCliente.setVisible(false);
        jtfIDPersona.setVisible(false);

        // desactivar botones, celdas de texto, etc.
        jtfNombre.setEnabled(false);
        jtfApellidoPaterno.setEnabled(false);
        jtfApellidoMaterno.setEnabled(false);
        jtfTelefono.setEnabled(false);
        jtfCorreo.setEnabled(false);

        this.jdcFECHA.setEnabled(false);

        jbGuardar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbEliminar.setEnabled(false);

        //vaciar celdas de texto
        jtfIDCliente.setText("");
        jtfIDCliente.setEnabled(false);
        this.jtffechanacimiento.setVisible(true);
        this.jtffechanacimiento.setText("");
        jtfIDPersona.setText("");
        jtfNombre.setText("");
        jtfApellidoPaterno.setText("");
        jtfApellidoMaterno.setText("");
        jtfTelefono.setText("");
        jtfCorreo.setText("");

    }

    void encender() {

        jtfIDCliente.setVisible(true);
        jtfIDPersona.setVisible(false);

        // desactivar botones, celdas de texto, etc.
        jtfNombre.setEnabled(true);
        jtfApellidoPaterno.setEnabled(true);
        jtfApellidoMaterno.setEnabled(true);
        jtfTelefono.setEnabled(true);
        jtfCorreo.setEnabled(true);

        this.jdcFECHA.setEnabled(true);

        jbGuardar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbEliminar.setEnabled(true);

        //vaciar celdas de texto
        jtfIDCliente.setText("");
        jtfIDPersona.setText("");
        jtfNombre.setText("");
        jtfApellidoPaterno.setText("");
        jtfApellidoMaterno.setText("");
        jtfTelefono.setText("");
        jtfCorreo.setText("");
        this.jtffechanacimiento.setText("");

    }

    void mostrar(String buscar) {

        try {
            DefaultTableModel modelo;
            Lcliente funcion = new Lcliente();
            modelo = funcion.mostrar(buscar);

            tblClientes.setModel(modelo);
            ocultar();
            //aqui paso el Int a String para mostrarlo
            jlRegistrostotalesCleitne.setText("Registros totales: " + Integer.toString(funcion.totalregistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }

    boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }

        int atPosition = email.indexOf("@");
        int dotPosition = email.indexOf(".", atPosition);

        // Verifica que "@" y "." existan y estén en el orden correcto
        // y que haya al menos un carácter entre "@" y "."
        // y al menos un carácter después del "."
        return atPosition > 0 && dotPosition > atPosition + 1 && dotPosition < email.length() - 1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jtfBuscar = new javax.swing.JTextField();
        jbEliminar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jtfIDPersona = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfApellidoPaterno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfCorreo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfIDCliente = new javax.swing.JTextField();
        jtfApellidoMaterno = new javax.swing.JTextField();
        jtfTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jlRegistrostotalesCleitne = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jtffechanacimiento = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jdcFECHA = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(850, 497));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(97, 167, 161));
        jPanel1.setLayout(null);

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
        tblClientes.setEnabled(false);
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 580, 380);

        jtfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jtfBuscar);
        jtfBuscar.setBounds(70, 20, 190, 22);

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEliminar);
        jbEliminar.setBounds(710, 20, 90, 23);

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jbNuevo);
        jbNuevo.setBounds(620, 20, 80, 23);
        jPanel1.add(jtfIDPersona);
        jtfIDPersona.setBounds(510, 20, 80, 22);

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel2.setText("Codigo:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(350, 20, 60, 20);
        jPanel1.add(jtfNombre);
        jtfNombre.setBounds(620, 50, 80, 22);
        jPanel1.add(jtfApellidoPaterno);
        jtfApellidoPaterno.setBounds(620, 80, 80, 22);

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel7.setText("Apellido Paterno");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(710, 80, 110, 20);

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(710, 50, 70, 20);
        jPanel1.add(jtfCorreo);
        jtfCorreo.setBounds(620, 170, 80, 22);

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel6.setText("Apellido Materno");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(710, 110, 120, 20);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel3.setText("Fecha de Nacimiento");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(620, 210, 170, 20);

        jtfIDCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIDClienteActionPerformed(evt);
            }
        });
        jPanel1.add(jtfIDCliente);
        jtfIDCliente.setBounds(400, 20, 80, 22);
        jPanel1.add(jtfApellidoMaterno);
        jtfApellidoMaterno.setBounds(620, 110, 80, 22);
        jPanel1.add(jtfTelefono);
        jtfTelefono.setBounds(620, 140, 80, 22);

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel8.setText("Telefono");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(710, 140, 110, 20);

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar);
        jbGuardar.setBounds(620, 280, 80, 23);

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jbCancelar);
        jbCancelar.setBounds(710, 280, 90, 23);

        jlRegistrostotalesCleitne.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jlRegistrostotalesCleitne.setText("Registros");
        jPanel1.add(jlRegistrostotalesCleitne);
        jlRegistrostotalesCleitne.setBounds(620, 410, 150, 20);

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel9.setText("Correo");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(710, 170, 110, 20);

        jButton1.setText("🔎");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(270, 20, 60, 23);

        jbSalir.setText("Regresar");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir);
        jbSalir.setBounds(620, 310, 180, 20);

        jtffechanacimiento.setEditable(false);
        jtffechanacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtffechanacimientoActionPerformed(evt);
            }
        });
        jPanel1.add(jtffechanacimiento);
        jtffechanacimiento.setBounds(620, 240, 110, 22);

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel14.setText("Buscar:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(20, 20, 50, 20);
        jPanel1.add(jdcFECHA);
        jdcFECHA.setBounds(620, 240, 130, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 850, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        Lcliente funcionx = new Lcliente();
        int reciente = funcionx.reciente();
        
        encender();
        jbGuardar.setText("Guardar");
        opcion = "guardar";
        Integer continuo = reciente + 1;
        this.jtfIDCliente.setText(continuo.toString());


    }//GEN-LAST:event_jbNuevoActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked

        this.jtffechanacimiento.setVisible(true);
        this.jdcFECHA.setEnabled(true);

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
        jtfIDCliente.setText(tblClientes.getValueAt(fila, 7).toString());
        jtffechanacimiento.setText(tblClientes.getValueAt(fila, 4).toString());
    }//GEN-LAST:event_tblClientesMouseClicked

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        if (!jtfIDPersona.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro de eliminar la habitacion y sus datos?", "Confirmar", 2);

            if (confirmacion == 0) {
                Lcliente funcion = new Lcliente();
                Dcliente dts = new Dcliente();

                dts.setIdPersona(Integer.parseInt(jtfIDPersona.getText()));
                funcion.eliminar(dts);
                mostrar("");
                apagar();
            }
        }

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        
            
        SimpleDateFormat ff = new SimpleDateFormat("dd/MM/yyyy");

        try {
            jtffechanacimiento.setText(ff.format(jdcFECHA.getCalendar().getTime()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese una fecha de nacimiento");
            return;
        }

        if (this.jtfTelefono.getText().length() != 10 || !this.jtfTelefono.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese un numero de telefono valido");
            return;
        }

        // String fechanacimiento = jcFechaNacimiento.getDate().toString();
        if (jtfIDCliente.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar un codigo de cliente");
            jtfIDCliente.requestFocus();
            return;
        }

        if (jtfNombre.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar un Nombre de cliente");
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

        //if (this.jdcFECHA) {
        //}
        //if (!isValidEmail(this.jtfCorreo.getText())) {
        //   return;
        // }
        Dcliente dts = new Dcliente();
        Lcliente funcion = new Lcliente();

        dts.setNombre(jtfNombre.getText());
        dts.setA_paterno(jtfApellidoPaterno.getText());
        dts.setA_materno(jtfApellidoMaterno.getText());
        dts.setFecha_nacimiento(this.jtffechanacimiento.getText());
        dts.setCorreo(jtfCorreo.getText());
        dts.setTelefono(jtfTelefono.getText());

        if (this.isValidEmail(jtfCorreo.getText())) {
            dts.setCorreo(jtfCorreo.getText());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ingrese un correo valido");
            return;
        }

        dts.setNocliente(jtfIDCliente.getText());

        if (opcion.equals("guardar")) {
            if (funcion.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "El cliente ha sido registrado");
                mostrar("");
                apagar();
            }
        } else if (opcion.equals("editar")) {

            dts.setIdPersona(Integer.parseInt(jtfIDPersona.getText()));

            if (funcion.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "El cliente a sido modificado");
                mostrar("");
                apagar();
            }

        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed

        mostrar("");
        apagar();

    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mostrar(jtfBuscar.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBuscarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed

        this.dispose();

    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtffechanacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtffechanacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtffechanacimientoActionPerformed

    private void jtfIDClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIDClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIDClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private com.toedter.calendar.JDateChooser jdcFECHA;
    private javax.swing.JLabel jlRegistrostotalesCleitne;
    private javax.swing.JTextField jtfApellidoMaterno;
    private javax.swing.JTextField jtfApellidoPaterno;
    private javax.swing.JTextField jtfBuscar;
    private javax.swing.JTextField jtfCorreo;
    private javax.swing.JTextField jtfIDCliente;
    private javax.swing.JTextField jtfIDPersona;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfTelefono;
    private javax.swing.JTextField jtffechanacimiento;
    private javax.swing.JTable tblClientes;
    // End of variables declaration//GEN-END:variables
}
