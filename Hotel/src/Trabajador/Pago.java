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
        jtfIDReservapago.setText(idreserva);
        jtfCliente.setText(cliente);
        jtfCuarto.setText(cuarto);
        jtfIDCuarto.setText(idcuarto);
        jtfTotalReserva.setText(Float.toString(totalreservacion));
        jtfIVA.setText(Float.toString((float) (totalreservacion * 0.16)));
        jtfTotalPago.setText(Float.toString(totalreservacion + (float)(totalreservacion * 0.16)));
        this.jbEliminar.setVisible(false);
        
        Lpago funcionx = new Lpago();
        Integer reciente = funcionx.reciente();
        reciente = reciente+1;
        
        this.jtfIDPago.setText(reciente.toString());
    }

    private String opcion = "guardar";

    public static String idreserva;
    public static String cliente;
    public static String idcuarto;
    public static String cuarto;
    public static Float totalreservacion;
    public static Float finalprecio;
    public static Float ivavalor;

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
        jtfIDReservapago.setVisible(false);

        jtfCliente.setEnabled(false);

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
        jtfIDReservapago.setText("");
        jtfCliente.setText("");
        jtfTotalReserva.setText("");

        jtfCuarto.setText("");

    }

    void encender() {

        jtfIDPago.setVisible(true);
        jtfIDReservapago.setVisible(true);

        jtfCliente.setEnabled(true);

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
        jtfIDReservapago = new javax.swing.JTextField();
        jtfCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfCuarto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfTotalReserva = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jlRegistrostotalesCleitne = new javax.swing.JLabel();
        jdFechaPago = new com.toedter.calendar.JDateChooser();
        jtfIDCuarto = new javax.swing.JTextField();
        jtfIVA = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfTotalPago = new javax.swing.JTextField();
        jcTipopago = new javax.swing.JComboBox<>();
        jToggleButton1 = new javax.swing.JToggleButton();
        jtffecha = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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
        jScrollPane1.setBounds(10, 50, 550, 400);

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEliminar);
        jbEliminar.setBounds(300, 20, 110, 23);

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jbNuevo);
        jbNuevo.setBounds(590, 50, 240, 23);

        jtfIDPago.setEditable(false);
        jPanel1.add(jtfIDPago);
        jtfIDPago.setBounds(480, 20, 80, 22);

        jtfIDReservapago.setEditable(false);
        jtfIDReservapago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIDReservapagoActionPerformed(evt);
            }
        });
        jPanel1.add(jtfIDReservapago);
        jtfIDReservapago.setBounds(650, 90, 80, 22);

        jtfCliente.setEditable(false);
        jPanel1.add(jtfCliente);
        jtfCliente.setBounds(740, 90, 90, 22);

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel4.setText("Reserva");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(590, 90, 70, 20);

        jtfCuarto.setEditable(false);
        jPanel1.add(jtfCuarto);
        jtfCuarto.setBounds(740, 150, 90, 22);

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel6.setText("Pago Reserva");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(590, 120, 110, 20);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel3.setText("FECHA PAGO:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(590, 240, 90, 17);

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel5.setText("Id:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(430, 20, 20, 20);

        jtfTotalReserva.setEditable(false);
        jPanel1.add(jtfTotalReserva);
        jtfTotalReserva.setBounds(740, 120, 90, 22);

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel8.setText("Cuarto");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(590, 150, 80, 20);

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar);
        jbGuardar.setBounds(690, 300, 140, 20);

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jbCancelar);
        jbCancelar.setBounds(590, 270, 90, 20);

        jlRegistrostotalesCleitne.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jlRegistrostotalesCleitne.setText("Registros");
        jPanel1.add(jlRegistrostotalesCleitne);
        jlRegistrostotalesCleitne.setBounds(570, 430, 150, 20);
        jPanel1.add(jdFechaPago);
        jdFechaPago.setBounds(690, 240, 140, 22);

        jtfIDCuarto.setEditable(false);
        jPanel1.add(jtfIDCuarto);
        jtfIDCuarto.setBounds(650, 150, 80, 22);

        jtfIVA.setEditable(false);
        jPanel1.add(jtfIVA);
        jtfIVA.setBounds(740, 180, 90, 20);

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel7.setText("IVA:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(590, 180, 40, 17);

        jtfTotalPago.setEditable(false);
        jPanel1.add(jtfTotalPago);
        jtfTotalPago.setBounds(740, 210, 90, 20);

        jcTipopago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta", "Efectivo" }));
        jcTipopago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTipopagoActionPerformed(evt);
            }
        });
        jPanel1.add(jcTipopago);
        jcTipopago.setBounds(690, 270, 140, 20);

        jToggleButton1.setText("Ticket");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1);
        jToggleButton1.setBounds(590, 300, 90, 20);

        jtffecha.setEditable(false);
        jPanel1.add(jtffecha);
        jtffecha.setBounds(690, 240, 120, 20);

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel10.setText("TOTAL PAGO:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(590, 210, 90, 17);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PAGOS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 100, 16);

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
        jtfTotalPago.setText(tblPagos.getValueAt(fila, 2).toString());

        jtfIVA.setText(tblPagos.getValueAt(fila, 5).toString());
        
        this.jbGuardar.setVisible(false);
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
        jbGuardar.setText("PAGAR");
        opcion = "PAGAR";
        this.jbGuardar.setVisible(true);
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        if (jtfIDPago.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Para confirmar identidad, ingresar por favor un numero de telefono");
            jtfIDPago.requestFocus();
            return;
        }

        Dpago dts = new Dpago();
        Lpago funcion = new Lpago();

        dts.setIdReservacion(Integer.parseInt(jtfIDReservapago.getText()));
        int seleccionado = jcTipopago.getSelectedIndex();
        dts.setTipo((String) jcTipopago.getItemAt(seleccionado));
        dts.setIva(Float.parseFloat(jtfIVA.getText()));

        dts.setFecha_pago(jdFechaPago.getDateFormatString());
        dts.setMonto(Float.parseFloat(jtfTotalReserva.getText()));

        if (opcion.equals("PAGAR")) {
            if (funcion.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "El pago ha sido generado");
                mostrar(idreserva);

                Lcuarto f2 = new Lcuarto();
                Dcuarto d2 = new Dcuarto();

                d2.setIdCuarto(Integer.parseInt(jtfIDCuarto.getText()));
                f2.desocupar(d2);

                ////7
                Lreserva f3 = new Lreserva();
                Dreserva d3 = new Dreserva();

                JOptionPane.showMessageDialog(rootPane, jtfIDReservapago.getText().toString());
                
                d3.setIdReservacion(jtfIDReservapago.getText().toString());
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

    private void jtfIDReservapagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIDReservapagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIDReservapagoActionPerformed

    private void jcTipopagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTipopagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcTipopagoActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        
        Ticket tk = new Ticket();
        tk.setVisible(true);
        
        Ticket.jlIDreserva.setText(jtfIDReservapago.getText());
        Ticket.jlCLiente.setText(jtfCliente.getText());
        
        Ticket.jlFechareserva.setText(jtfIDReservapago.getText());//modificar
        
        Ticket.jlIDcuarto.setText(jtfIDCuarto.getText());
        Ticket.jlNoCuarto.setText(jtfCuarto.getText());
        

        

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
    private javax.swing.JTextField jtfIDReservapago;
    private javax.swing.JTextField jtfIVA;
    private javax.swing.JTextField jtfTotalPago;
    private javax.swing.JTextField jtfTotalReserva;
    private javax.swing.JTextField jtffecha;
    private javax.swing.JTable tblPagos;
    // End of variables declaration//GEN-END:variables
}
