package Trabajador;

import Base.Dcuarto;
import Base.Dpago;
import Base.Dreserva;
import Logico.Lcuarto;
import Logico.Lpago;
import Logico.Lreserva;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pago extends javax.swing.JFrame {

    public Pago() {
        initComponents();

        mostrar(idreserva);
        apagar();
        jtfIDReserva.setText(idreserva);
        jtfCliente.setText(cliente);
        jtfCuarto.setText(cuarto);
        jtfIDCuarto.setText(idcuarto);
        jtfTotalReserva.setText(Double.toString(totalreservacion));
        jtfIVA.setText(Double.toString(totalreservacion * .016));
        jtfTotalPago.setText(Double.toString(totalreservacion + totalreservacion * .016));

    }

    private String opcion = "guardar";

    public static String idreserva;
    public static String cliente;
    public static String idcuarto;
    public static String cuarto;
    public static Double totalreservacion;
    public static Double finalprecio;
    public static Double ivavalor;

    void ocultar() {

        tblPagos.getColumnModel().getColumn(0).setMaxWidth(0);
        tblPagos.getColumnModel().getColumn(0).setMinWidth(0);
        tblPagos.getColumnModel().getColumn(0).setPreferredWidth(0);

        tblPagos.getColumnModel().getColumn(3).setMaxWidth(0);
        tblPagos.getColumnModel().getColumn(3).setMinWidth(0);
        tblPagos.getColumnModel().getColumn(3).setPreferredWidth(0);

    }

    void apagar() {

        jtfIDPago.setVisible(false);
        jtfIDReserva.setVisible(false);

        jtfCliente.setEnabled(false);
        jtfNoComprobante.setEnabled(false);
        jtfIVA.setEnabled(false);
        jtfTotalReserva.setEnabled(false);
        jtfTotalPago.setEnabled(false);

        jtfCuarto.setEnabled(false);
        jtfIDCuarto.setEnabled(false);

        jbGuardar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbEliminar.setEnabled(false);
        jtffecha.setEnabled(false);
        //vaciar celdas de texto
        jtfIDPago.setText("");
        jtfIDReserva.setText("");
        jtfCliente.setText("");
        jtfTotalReserva.setText("");
        jtfNoComprobante.setText("");
        jtfCuarto.setText("");

    }

    void encender() {

        jtfIDPago.setVisible(false);
        jtfIDReserva.setVisible(true);

        jtfCliente.setEnabled(true);
        jtfNoComprobante.setEnabled(true);
        jtfIVA.setEnabled(false);
        jtfTotalReserva.setEnabled(true);
        jtfTotalPago.setEnabled(true);

        jtfCuarto.setEnabled(true);
        jtfIDCuarto.setEnabled(true);

        jbGuardar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbEliminar.setEnabled(true);

        //vaciar celdas de texto
    }

    void mostrar(String buscar) {

        try {
            DefaultTableModel modelo;
            Lpago funcion = new Lpago();
            modelo = funcion.mostrar(buscar);

            tblPagos.setModel(modelo);
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
        tblPagos = new javax.swing.JTable();
        jbEliminar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jtfIDPago = new javax.swing.JTextField();
        jtfIDReserva = new javax.swing.JTextField();
        jtfCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfCuarto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfTotalReserva = new javax.swing.JTextField();
        jtfNoComprobante = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jlRegistrostotalesCleitne = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jdFechaPago = new com.toedter.calendar.JDateChooser();
        jtfIDCuarto = new javax.swing.JTextField();
        jtfIVA = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfTotalPago = new javax.swing.JTextField();
        jcTipopago = new javax.swing.JComboBox<>();
        jToggleButton1 = new javax.swing.JToggleButton();
        jtffecha = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(97, 167, 161));
        jPanel1.setLayout(null);

        tblPagos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPagosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPagos);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 580, 400);

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEliminar);
        jbEliminar.setBounds(700, 20, 110, 23);

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jbNuevo);
        jbNuevo.setBounds(610, 20, 80, 23);
        jPanel1.add(jtfIDPago);
        jtfIDPago.setBounds(510, 20, 80, 22);

        jtfIDReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIDReservaActionPerformed(evt);
            }
        });
        jPanel1.add(jtfIDReserva);
        jtfIDReserva.setBounds(660, 60, 80, 22);
        jPanel1.add(jtfCliente);
        jtfCliente.setBounds(750, 60, 80, 22);

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel4.setText("Reserva");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(600, 60, 70, 20);
        jPanel1.add(jtfCuarto);
        jtfCuarto.setBounds(750, 120, 80, 22);

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel6.setText("Pago Reserva");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(600, 90, 110, 20);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel3.setText("FECHA PAGO:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(600, 290, 90, 20);

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel5.setText("Id:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(490, 20, 20, 20);
        jPanel1.add(jtfTotalReserva);
        jtfTotalReserva.setBounds(750, 90, 80, 22);
        jPanel1.add(jtfNoComprobante);
        jtfNoComprobante.setBounds(610, 180, 230, 22);

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel8.setText("Cuarto");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(600, 120, 80, 20);

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar);
        jbGuardar.setBounds(650, 360, 80, 23);

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jbCancelar);
        jbCancelar.setBounds(740, 360, 90, 23);

        jlRegistrostotalesCleitne.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jlRegistrostotalesCleitne.setText("Registros");
        jPanel1.add(jlRegistrostotalesCleitne);
        jlRegistrostotalesCleitne.setBounds(600, 430, 150, 20);

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel9.setText("No Comprobante");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(600, 150, 110, 20);
        jPanel1.add(jdFechaPago);
        jdFechaPago.setBounds(810, 290, 20, 22);
        jPanel1.add(jtfIDCuarto);
        jtfIDCuarto.setBounds(660, 120, 80, 22);

        jtfIVA.setText("jTextField1");
        jPanel1.add(jtfIVA);
        jtfIVA.setBounds(690, 220, 71, 22);

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel7.setText("IVA:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(600, 220, 40, 20);

        jtfTotalPago.setText("jTextField1");
        jPanel1.add(jtfTotalPago);
        jtfTotalPago.setBounds(690, 250, 71, 22);

        jcTipopago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta", "Efectivo" }));
        jcTipopago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTipopagoActionPerformed(evt);
            }
        });
        jPanel1.add(jcTipopago);
        jcTipopago.setBounds(690, 320, 76, 22);

        jToggleButton1.setText("Ticket");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1);
        jToggleButton1.setBounds(770, 390, 61, 23);
        jPanel1.add(jtffecha);
        jtffecha.setBounds(690, 290, 120, 22);

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel10.setText("TOTAL PAGO:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(600, 250, 90, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPagosMouseClicked

        jbGuardar.setText("Editar");
        encender();
        jbEliminar.setEnabled(true);
        opcion = "editar";

        int fila = tblPagos.rowAtPoint(evt.getPoint());

        jtfIDPago.setText(tblPagos.getValueAt(fila, 0).toString());
        jtffecha.setText(tblPagos.getValueAt(fila, 4).toString());
        jcTipopago.setSelectedItem(tblPagos.getValueAt(fila, 1).toString());
        jtfNoComprobante.setText(tblPagos.getValueAt(fila, 5).toString());
        jtfTotalPago.setText(tblPagos.getValueAt(fila, 2).toString());

        jtfIVA.setText(tblPagos.getValueAt(fila, 6).toString());
    }//GEN-LAST:event_tblPagosMouseClicked

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        if (!jtfIDPago.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro de eliminar el pago "
                    + "seleccionado?", "Confirmar", 2);

            if (confirmacion == 0) {
                Lpago funcion = new Lpago();
                Dpago dts = new Dpago();

                dts.setIdPago(Integer.parseInt(jtfIDPago.getText()));
                funcion.eliminar(dts);
                mostrar(idreserva);
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

        if (jtfNoComprobante.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Para confirmar identidad, ingresar por favor un numero de telefono");
            jtfNoComprobante.requestFocus();
            return;
        }

        Dpago dts = new Dpago();
        Lpago funcion = new Lpago();

        dts.setIdReservacion(Integer.parseInt(jtfIDReserva.getText()));

        int seleccionado = jcTipopago.getSelectedIndex();
        dts.setTipo((String) jcTipopago.getItemAt(seleccionado));

        dts.setNo_comprobante(jtfNoComprobante.getText());
        dts.setIva(Double.parseDouble(jtfIVA.getText()));

        dts.setFecha_pago(jdFechaPago.getDateFormatString());
        dts.setMonto(Double.parseDouble(jtfTotalReserva.getText()));

        if (opcion.equals("guardar")) {
            if (funcion.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "El pago ha sido generado");
                mostrar(idreserva);
                apagar();

                Lcuarto f2 = new Lcuarto();
                Dcuarto d2 = new Dcuarto();

                d2.setIdCuarto(Integer.parseInt(jtfIDCuarto.getText()));
                f2.desocupar(d2);

                ////7
                Lreserva f3 = new Lreserva();
                Dreserva d3 = new Dreserva();

                d3.setIdReservacion(Integer.parseInt(jtfIDReserva.getText()));
                f3.pagar(d3);

            }
        } else if (opcion.equals("editar")) {

            dts.setIdPago(Integer.parseInt(jtfIDPago.getText()));

            if (funcion.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "El pago sido modificado");
                mostrar(idreserva);
                apagar();
            }

        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed

        apagar();
        this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtfIDReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIDReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIDReservaActionPerformed

    private void jcTipopagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTipopagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcTipopagoActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        
        Ticket tk = new Ticket();
        tk.setVisible(true);
        
        Ticket.jlIDreserva.setText(jtfIDReserva.getText());
        Ticket.jlCLiente.setText(jtfCliente.getText());
        
        Ticket.jlFechareserva.setText(jtfIDReserva.getText());//modificar
        
        Ticket.jlIDcuarto.setText(jtfIDCuarto.getText());
        Ticket.jlNoCuarto.setText(jtfCuarto.getText());
        
        Ticket.jlNoComprobante.setText(jtfNoComprobante.getText());
        

        Ticket.jlMonto.setText(jtfTotalReserva.getText());
        Ticket.jlIVA.setText(jtfIVA.getText());
        Ticket.jltotal.setText(jtfTotalPago.getText());
        
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JComboBox<String> jcTipopago;
    private com.toedter.calendar.JDateChooser jdFechaPago;
    private javax.swing.JLabel jlRegistrostotalesCleitne;
    private javax.swing.JTextField jtfCliente;
    private javax.swing.JTextField jtfCuarto;
    private javax.swing.JTextField jtfIDCuarto;
    private javax.swing.JTextField jtfIDPago;
    private javax.swing.JTextField jtfIDReserva;
    private javax.swing.JTextField jtfIVA;
    private javax.swing.JTextField jtfNoComprobante;
    private javax.swing.JTextField jtfTotalPago;
    private javax.swing.JTextField jtfTotalReserva;
    private javax.swing.JTextField jtffecha;
    private javax.swing.JTable tblPagos;
    // End of variables declaration//GEN-END:variables
}
