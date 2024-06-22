package Trabajador;

import Base.Dcuarto;
import Base.Dreserva;
import Logico.Lcuarto;
import Logico.Lreserva;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Reservacion extends javax.swing.JFrame {

    public Reservacion() {
        initComponents();
        mostrar("");
        apagar();
    }

    private String opcion = "guardar";
    public static int idusuario;

    void ocultar() {

        tblReservaciones.getColumnModel().getColumn(0).setMaxWidth(0);
        tblReservaciones.getColumnModel().getColumn(0).setMinWidth(0);
        tblReservaciones.getColumnModel().getColumn(0).setPreferredWidth(0);

        tblReservaciones.getColumnModel().getColumn(1).setMaxWidth(0);
        tblReservaciones.getColumnModel().getColumn(1).setMinWidth(0);
        tblReservaciones.getColumnModel().getColumn(1).setPreferredWidth(0);

        tblReservaciones.getColumnModel().getColumn(3).setMaxWidth(0);
        tblReservaciones.getColumnModel().getColumn(3).setMinWidth(0);
        tblReservaciones.getColumnModel().getColumn(3).setPreferredWidth(0);

        tblReservaciones.getColumnModel().getColumn(5).setMaxWidth(0);
        tblReservaciones.getColumnModel().getColumn(5).setMinWidth(0);
        tblReservaciones.getColumnModel().getColumn(5).setPreferredWidth(0);
    }

    void apagar() {

        jtfIDReserva.setVisible(false);
        jtfIDcuarto.setVisible(false);
        jtfIDcliente.setVisible(false);
        jtfIDtrabajador.setVisible(false);

        jtfCuarto.setEnabled(false);
        jtfCliente.setEnabled(false);
        jtfTrabajador.setEnabled(false);

        jcTipo.setEnabled(false);
        jcEstado.setEnabled(false);
        jdFreserva.setEnabled(false);
        jdFingreso.setEnabled(false);
        jdFsalida.setEnabled(false);

        jtfCosto.setEnabled(false);

        jbGuardar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbEliminar.setEnabled(false);
        jbBuscarCuarto.setEnabled(false);
        jbBuscarCliente.setEnabled(false);
        ////

        jtfIDReserva.setText("");
        jtfIDcuarto.setText("");
        jtfIDcliente.setText("");
        jtfIDtrabajador.setText("");

        jtfCuarto.setText("");
        jtfCliente.setText("");
        jtfTrabajador.setText("");
        jtfCosto.setText("");
    }

    void encender() {

        jtfIDReserva.setVisible(false);
        jtfIDcuarto.setVisible(false);
        jtfIDcliente.setVisible(false);
        jtfIDtrabajador.setVisible(false);

        jtfCuarto.setEnabled(false);
        jtfCliente.setEnabled(false);
        jtfTrabajador.setEnabled(false);

        jcTipo.setEnabled(true);
        jcEstado.setEnabled(true);
        jdFreserva.setEnabled(true);
        jdFingreso.setEnabled(true);
        jdFsalida.setEnabled(true);

        jtfCosto.setEnabled(true);

        jbGuardar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbEliminar.setEnabled(true);
        jbBuscarCuarto.setEnabled(true);
        jbBuscarCliente.setEnabled(true);
        ////

        jtfIDReserva.setText("");
        jtfIDcuarto.setText("");
        jtfIDcliente.setText("");

        jtfCuarto.setText("");
        jtfCliente.setText("");
        jtfCosto.setText("");
    }

    void mostrar(String buscar) {

        try {
            DefaultTableModel modelo;
            Lreserva funcion = new Lreserva();
            modelo = funcion.mostrar(buscar);

            tblReservaciones.setModel(modelo);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReservaciones = new javax.swing.JTable();
        jtfBuscar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jbEliminar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtfCuarto = new javax.swing.JTextField();
        jtfIDcuarto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfIDReserva = new javax.swing.JTextField();
        jtfCliente = new javax.swing.JTextField();
        jtfIDcliente = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jlRegistrostotalesCleitne = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jtfTrabajador = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jcTipo = new javax.swing.JComboBox<>();
        jdFreserva = new com.toedter.calendar.JDateChooser();
        jdFingreso = new com.toedter.calendar.JDateChooser();
        jdFsalida = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jtfIDtrabajador = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jtfCosto = new javax.swing.JTextField();
        jcEstado = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jbBuscarCuarto = new javax.swing.JButton();
        jbBuscarCliente = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jtfsalida = new javax.swing.JTextField();
        jtfreserva = new javax.swing.JTextField();
        jtfentrada = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(850, 511));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(97, 167, 161));
        jPanel1.setLayout(null);

        tblReservaciones.setModel(new javax.swing.table.DefaultTableModel(
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
        tblReservaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReservacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblReservaciones);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 550, 250);

        jtfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jtfBuscar);
        jtfBuscar.setBounds(70, 20, 190, 22);

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel13.setText("Buscar:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(20, 20, 50, 20);

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEliminar);
        jbEliminar.setBounds(670, 20, 110, 23);

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jbNuevo);
        jbNuevo.setBounds(580, 20, 80, 23);

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel2.setText("IdReserva");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(330, 20, 60, 20);

        jtfCuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCuartoActionPerformed(evt);
            }
        });
        jPanel1.add(jtfCuarto);
        jtfCuarto.setBounds(80, 320, 120, 22);
        jPanel1.add(jtfIDcuarto);
        jtfIDcuarto.setBounds(230, 320, 80, 22);

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel4.setText("Cuarto");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 320, 50, 20);

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel6.setText("Cliente");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 360, 50, 20);
        jPanel1.add(jtfIDReserva);
        jtfIDReserva.setBounds(400, 20, 80, 22);
        jPanel1.add(jtfCliente);
        jtfCliente.setBounds(80, 360, 120, 22);
        jPanel1.add(jtfIDcliente);
        jtfIDcliente.setBounds(230, 360, 80, 22);

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar);
        jbGuardar.setBounds(590, 270, 80, 23);

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jbCancelar);
        jbCancelar.setBounds(690, 270, 90, 23);

        jlRegistrostotalesCleitne.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jlRegistrostotalesCleitne.setText("Registros");
        jPanel1.add(jlRegistrostotalesCleitne);
        jlRegistrostotalesCleitne.setBounds(460, 310, 150, 20);

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel9.setText("Estado");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(690, 230, 110, 20);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(270, 20, 20, 23);

        jtfTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTrabajadorActionPerformed(evt);
            }
        });
        jPanel1.add(jtfTrabajador);
        jtfTrabajador.setBounds(80, 400, 120, 20);

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel10.setText("Trabajador");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(320, 400, 100, 20);

        jcTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "reserva", "alquiler" }));
        jcTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTipoActionPerformed(evt);
            }
        });
        jPanel1.add(jcTipo);
        jcTipo.setBounds(590, 80, 80, 22);
        jPanel1.add(jdFreserva);
        jdFreserva.setBounds(720, 110, 20, 22);
        jPanel1.add(jdFingreso);
        jdFingreso.setBounds(720, 140, 20, 22);
        jPanel1.add(jdFsalida);
        jdFsalida.setBounds(720, 170, 20, 22);

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel12.setText("Tipo");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(680, 80, 110, 20);

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel14.setText("F. Reserva");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(750, 110, 110, 20);

        jLabel15.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel15.setText("F. Entrada");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(750, 140, 110, 20);
        jPanel1.add(jtfIDtrabajador);
        jtfIDtrabajador.setBounds(230, 400, 80, 22);

        jLabel16.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel16.setText("F. Salida");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(750, 170, 110, 20);
        jPanel1.add(jtfCosto);
        jtfCosto.setBounds(590, 200, 80, 22);

        jcEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "alquiler", "pagado" }));
        jcEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(jcEstado);
        jcEstado.setBounds(590, 230, 80, 22);

        jLabel17.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel17.setText("Costo");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(690, 200, 110, 20);

        jbBuscarCuarto.setText("Buscar");
        jbBuscarCuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarCuartoActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscarCuarto);
        jbBuscarCuarto.setBounds(320, 320, 72, 23);

        jbBuscarCliente.setText("Buscar");
        jbBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscarCliente);
        jbBuscarCliente.setBounds(320, 360, 72, 23);

        jButton2.setText("Pagar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(710, 370, 90, 40);

        jbSalir.setText("jButton1");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir);
        jbSalir.setBounds(790, 20, 20, 20);
        jPanel1.add(jtfsalida);
        jtfsalida.setBounds(590, 170, 130, 22);
        jPanel1.add(jtfreserva);
        jtfreserva.setBounds(590, 110, 130, 22);
        jPanel1.add(jtfentrada);
        jtfentrada.setBounds(590, 140, 130, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 850, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblReservacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReservacionesMouseClicked

        jbGuardar.setText("Editar");
        encender();
        jbEliminar.setEnabled(true);
        opcion = "editar";

        int fila = tblReservaciones.rowAtPoint(evt.getPoint());

        jtfIDReserva.setText(tblReservaciones.getValueAt(fila, 0).toString());
        jtfIDcuarto.setText(tblReservaciones.getValueAt(fila, 1).toString());
        jtfCuarto.setText(tblReservaciones.getValueAt(fila, 2).toString());
        jtfIDcliente.setText(tblReservaciones.getValueAt(fila, 3).toString());
        jtfCliente.setText(tblReservaciones.getValueAt(fila, 4).toString());
        jtfIDtrabajador.setText(tblReservaciones.getValueAt(fila, 5).toString());
        jtfTrabajador.setText(tblReservaciones.getValueAt(fila, 6).toString());

        jtfCosto.setText(tblReservaciones.getValueAt(fila, 10).toString());
        jcEstado.setSelectedItem(tblReservaciones.getValueAt(fila, 11).toString());
        jcTipo.setSelectedItem(tblReservaciones.getValueAt(fila, 12).toString());


    }//GEN-LAST:event_tblReservacionesMouseClicked

    private void jtfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBuscarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        if (!jtfIDReserva.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro de eliminar la reserva", "Confirmar", 2);

            if (confirmacion == 0) {
                Lreserva funcion = new Lreserva();
                Dreserva dts = new Dreserva();

                dts.setIdReservacion(Integer.parseInt(jtfIDReserva.getText()));
                funcion.eliminar(dts);
                mostrar("");
                apagar();
            }
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed

        encender();
        jbGuardar.setText("Guardar");
        opcion = "guardar";
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        if (jtfIDcuarto.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "No has seleccionado un Cuarto");
            jtfIDcuarto.requestFocus();
            return;
        }

        if (jtfIDcliente.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecciona un cliente por favor");
            jtfIDcliente.requestFocus();
            return;
        }

        if (jtfCosto.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Ingresa precio del alojamiento");
            jtfCosto.requestFocus();
            return;
        }

        Dreserva dts = new Dreserva();
        Lreserva funcion = new Lreserva();

        dts.setIdCuarto(Integer.parseInt(jtfIDcuarto.getText()));
        dts.setIdCliente(Integer.parseInt(jtfIDcliente.getText()));
        dts.setIdTrabajador(idusuario);

        int seleccionado = jcTipo.getSelectedIndex();
        dts.setTipo((String) jcTipo.getItemAt(seleccionado));

        dts.setFecha_reservacion(jdFreserva.getDateFormatString());
        dts.setFecha_ingreso(jdFingreso.getDateFormatString());
        dts.setFecha_salida(jdFsalida.getDateFormatString());

        dts.setCosto_total(Double.parseDouble(jtfCosto.getText()));

        seleccionado = jcEstado.getSelectedIndex();
        dts.setEstado((String) jcEstado.getItemAt(seleccionado));

        if (opcion.equals("guardar")) {
            if (funcion.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "La reserva ha sido guardada");
                mostrar("");

                Lcuarto f3 = new Lcuarto();
                Dcuarto d3 = new Dcuarto();

                d3.setIdCuarto(Integer.parseInt(jtfIDcuarto.getText()));
                f3.ocupar(d3);
                apagar();
            }
        } else if (opcion.equals("editar")) {

            dts.setIdReservacion(Integer.parseInt(jtfIDReserva.getText()));
            dts.setIdTrabajador(Integer.parseInt(jtfIDtrabajador.getText()));
            if (funcion.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "La reserva ha sido editada");
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

    private void jcEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcEstadoActionPerformed

    private void jbBuscarCuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarCuartoActionPerformed

        CuartosBuscar op = new CuartosBuscar();
        op.setVisible(true);

    }//GEN-LAST:event_jbBuscarCuartoActionPerformed

    private void jbBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarClienteActionPerformed
        ClientesBuscar op = new ClientesBuscar();
        op.setVisible(true);

    }//GEN-LAST:event_jbBuscarClienteActionPerformed

    private void jtfTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTrabajadorActionPerformed

    private void jtfCuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCuartoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCuartoActionPerformed

    private void jcTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcTipoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int fila = tblReservaciones.getSelectedRow();

        Pago.idreserva = tblReservaciones.getValueAt(fila, 0).toString();
        Pago.cliente = tblReservaciones.getValueAt(fila, 4).toString();
        Pago.totalreservacion = Double.parseDouble(tblReservaciones.getValueAt(fila, 10).toString());
        Pago.idcuarto = tblReservaciones.getValueAt(fila, 1).toString();
        Pago.cuarto = tblReservaciones.getValueAt(fila, 2).toString();

        Pago pgg = new Pago();
        pgg.setVisible(true);


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed

        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscarCliente;
    private javax.swing.JButton jbBuscarCuarto;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcEstado;
    private javax.swing.JComboBox<String> jcTipo;
    private com.toedter.calendar.JDateChooser jdFingreso;
    private com.toedter.calendar.JDateChooser jdFreserva;
    private com.toedter.calendar.JDateChooser jdFsalida;
    private javax.swing.JLabel jlRegistrostotalesCleitne;
    private javax.swing.JTextField jtfBuscar;
    public static javax.swing.JTextField jtfCliente;
    private javax.swing.JTextField jtfCosto;
    public static javax.swing.JTextField jtfCuarto;
    private javax.swing.JTextField jtfIDReserva;
    public static javax.swing.JTextField jtfIDcliente;
    public static javax.swing.JTextField jtfIDcuarto;
    public static javax.swing.JTextField jtfIDtrabajador;
    public static javax.swing.JTextField jtfTrabajador;
    private javax.swing.JTextField jtfentrada;
    private javax.swing.JTextField jtfreserva;
    private javax.swing.JTextField jtfsalida;
    private javax.swing.JTable tblReservaciones;
    // End of variables declaration//GEN-END:variables
}
