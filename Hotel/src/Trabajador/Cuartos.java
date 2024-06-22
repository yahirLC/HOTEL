package Trabajador;

import Base.Dcuarto;
import Logico.Lcuarto;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Cuartos extends javax.swing.JFrame {

    public Cuartos() {
        initComponents();

        this.setLocationRelativeTo(null);
        mostrar("");
        apagar();
    }

    private String opcion = "guardar";

    void ocultar() {

        tblCuartos.getColumnModel().getColumn(0).setMaxWidth(0);
        tblCuartos.getColumnModel().getColumn(0).setMinWidth(0);
        tblCuartos.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        tblCuartos.getColumnModel().getColumn(8).setMaxWidth(0);
        tblCuartos.getColumnModel().getColumn(8).setMinWidth(0);
        tblCuartos.getColumnModel().getColumn(8).setPreferredWidth(0);
    }

    void apagar() {

        jtfID.setVisible(false);

        // desactivar botones, celdas de texto, etc.
        jtfNoCuarto.setEnabled(false);
        jtfPrecioPorDia.setEnabled(false);
        jtaCaracteristicas.setEnabled(false);
        jtaDescripcion.setEnabled(false);
        jbGuardar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbEliminar.setEnabled(false);
        jbcPiso.setEnabled(false);
        jbcEstado.setEnabled(false);
        txtnomimagen.setVisible(false);

        //vaciar celdas de texto
        jtfID.setText("");
        jtfPrecioPorDia.setText("");
        jtaCaracteristicas.setText("");
        jtaDescripcion.setText("");
    }

    void encender() {

        jtfID.setVisible(false);

        //activar botones, celdas de texto, etc.
        jtfNoCuarto.setEnabled(true);
        jtfPrecioPorDia.setEnabled(true);
        jtaCaracteristicas.setEnabled(true);
        jtaDescripcion.setEnabled(true);
        jbGuardar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbEliminar.setEnabled(true);
        jbcPiso.setEnabled(true);
        jbcEstado.setEnabled(true);
        txtnomimagen.setVisible(false);

        //vaciar celdas de texto
        jtfID.setText("");
        jtfPrecioPorDia.setText("");
        jtfNoCuarto.setText("");
        jtaCaracteristicas.setText("");
        jtaDescripcion.setText("");

    }

    void mostrar(String buscar) {

        try {
            DefaultTableModel modelo;
            Lcuarto funcion = new Lcuarto();
            modelo = funcion.mostrar(buscar);

            tblCuartos.setModel(modelo);
            ocultar();
            //aqui paso el Int a String para mostrarlo
            jlRegistros.setText("Registros totales: " + Integer.toString(funcion.totalregistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jtfID = new javax.swing.JTextField();
        lblfoto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbcEstado = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtaCaracteristicas = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jbcPiso = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jbcTipo = new javax.swing.JComboBox<>();
        jbCancelar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtaDescripcion = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jbNuevo = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jtfNoCuarto = new javax.swing.JTextField();
        jtfPrecioPorDia = new javax.swing.JTextField();
        jbImagen = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        txtnomimagen = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCuartos = new javax.swing.JTable();
        jtfBuscar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jlRegistros = new javax.swing.JLabel();
        jbEliminar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 510));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jtfID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIDActionPerformed(evt);
            }
        });
        jPanel1.add(jtfID);
        jtfID.setBounds(30, 260, 71, 22);

        lblfoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfoto.setText("Imagen");
        lblfoto.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(97, 167, 161)));
        lblfoto.setPreferredSize(new java.awt.Dimension(460, 240));
        jPanel1.add(lblfoto);
        lblfoto.setBounds(10, 10, 460, 240);

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel2.setText("Id:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 260, 20, 20);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel3.setText("Caracteristicas:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(500, 100, 110, 20);

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel4.setText("No. Cuarto:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(110, 260, 70, 20);

        jbcEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Ocupado" }));
        jbcEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(jbcEstado);
        jbcEstado.setBounds(550, 210, 100, 22);

        jtaCaracteristicas.setColumns(20);
        jtaCaracteristicas.setRows(5);
        jScrollPane4.setViewportView(jtaCaracteristicas);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(500, 120, 300, 70);

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel6.setText("Descripcion:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(500, 10, 90, 20);

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel7.setText("$ x Dia");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(380, 260, 50, 20);

        jbcPiso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        jbcPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcPisoActionPerformed(evt);
            }
        });
        jPanel1.add(jbcPiso);
        jbcPiso.setBounds(330, 260, 40, 22);

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel8.setText("Tipo:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(670, 210, 40, 20);

        jbcTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual", "Matrimonial", "Familiar", "Fiesta" }));
        jbcTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcTipoActionPerformed(evt);
            }
        });
        jPanel1.add(jbcTipo);
        jbcTipo.setBounds(710, 210, 90, 22);

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jbCancelar);
        jbCancelar.setBounds(710, 260, 90, 23);

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar);
        jbGuardar.setBounds(620, 260, 80, 23);

        jtaDescripcion.setColumns(20);
        jtaDescripcion.setRows(5);
        jScrollPane5.setViewportView(jtaDescripcion);

        jPanel1.add(jScrollPane5);
        jScrollPane5.setBounds(500, 30, 300, 70);

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel11.setText("Estado:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(500, 210, 50, 20);

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jbNuevo);
        jbNuevo.setBounds(540, 260, 70, 23);

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel12.setText("No. Piso:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(270, 260, 60, 20);

        jtfNoCuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNoCuartoActionPerformed(evt);
            }
        });
        jPanel1.add(jtfNoCuarto);
        jtfNoCuarto.setBounds(190, 260, 71, 22);
        jPanel1.add(jtfPrecioPorDia);
        jtfPrecioPorDia.setBounds(430, 260, 80, 22);

        jbImagen.setText("jButton1");
        jbImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbImagenActionPerformed(evt);
            }
        });
        jPanel1.add(jbImagen);
        jbImagen.setBounds(470, 230, 20, 20);

        jbSalir.setText("jButton1");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir);
        jbSalir.setBounds(810, 10, 20, 20);

        txtnomimagen.setText("Ruta");
        jPanel1.add(txtnomimagen);
        txtnomimagen.setBounds(290, 230, 180, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 850, 290);

        jPanel2.setBackground(new java.awt.Color(97, 167, 161));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        tblCuartos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCuartos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCuartosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblCuartosMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tblCuartos);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 10, 580, 160);

        jtfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(jtfBuscar);
        jtfBuscar.setBounds(620, 70, 210, 22);

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel9.setText("Estado:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(500, 210, 50, 20);

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel10.setText("Estado:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(500, 210, 50, 20);

        jlRegistros.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jlRegistros.setText("Registros");
        jPanel2.add(jlRegistros);
        jlRegistros.setBounds(610, 150, 150, 20);

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jbEliminar);
        jbEliminar.setBounds(740, 100, 90, 23);

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel13.setText("Buscar:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(620, 50, 50, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(-10, 290, 850, 200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBuscarActionPerformed

        mostrar(jtfBuscar.getText());

    }//GEN-LAST:event_jtfBuscarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        if (!jtfID.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro de eliminar la habitacion y sus datos?", "Confirmar", 2);

            if (confirmacion == 0) {
                Lcuarto funcion = new Lcuarto();
                Dcuarto dts = new Dcuarto();

                dts.setIdCuarto(Integer.parseInt(jtfID.getText()));
                funcion.eliminar(dts);
                mostrar("");
                apagar();
            }
        }


    }//GEN-LAST:event_jbEliminarActionPerformed

    private void tblCuartosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCuartosMouseClicked

        jbGuardar.setText("Editar");
        encender();
        jbEliminar.setEnabled(true);
        opcion = "editar";

        int fila = tblCuartos.rowAtPoint(evt.getPoint());

        jtfID.setText(tblCuartos.getValueAt(fila, 0).toString());
        jtfNoCuarto.setText(tblCuartos.getValueAt(fila, 1).toString());
        jbcPiso.setSelectedItem(tblCuartos.getValueAt(fila, 2).toString());
        jtaDescripcion.setText(tblCuartos.getValueAt(fila, 3).toString());
        jtaCaracteristicas.setText(tblCuartos.getValueAt(fila, 4).toString());
        jtfPrecioPorDia.setText(tblCuartos.getValueAt(fila, 5).toString());
        jbcEstado.setSelectedItem(tblCuartos.getValueAt(fila, 6).toString());
        jbcTipo.setSelectedItem(tblCuartos.getValueAt(fila, 7).toString());
        txtnomimagen.setText(tblCuartos.getValueAt(fila,8).toString());
        
        Image foto = getToolkit().createImage(txtnomimagen.getText());
        foto = foto.getScaledInstance(460, 240, Image.SCALE_DEFAULT);
        
        lblfoto.setIcon(new ImageIcon(foto));
    }//GEN-LAST:event_tblCuartosMouseClicked

    private void jtfNoCuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNoCuartoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNoCuartoActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed

        encender();
        jbGuardar.setText("Guardar");
        opcion = "guardar";

    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        if (jtfNoCuarto.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar un numero de cuarto");
            jtfNoCuarto.requestFocus(); // esto hace que al volver a el frame, se va a resaltar el jtfNocuarto
            return;
        }

        if (jtfPrecioPorDia.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar un precio por dia");
            jtfPrecioPorDia.requestFocus();
            return;
        }

        if (jtaCaracteristicas.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar caracteristicas del cuarto");
            jtaCaracteristicas.requestFocus();
            return;
        }

        if (jtaDescripcion.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar una descripcion");
            jtaDescripcion.requestFocus();
            return;
        }

        Dcuarto dts = new Dcuarto();
        Lcuarto funcion = new Lcuarto();

        dts.setNumero(jtfNoCuarto.getText());

        int selec = jbcPiso.getSelectedIndex();
        dts.setPiso((String) jbcPiso.getItemAt(selec));

        selec = jbcEstado.getSelectedIndex();
        dts.setEstado((String) jbcEstado.getItemAt(selec));

        selec = jbcTipo.getSelectedIndex();
        dts.setTipocuarto((String) jbcTipo.getItemAt(selec));

        dts.setCaracteristicas(jtaCaracteristicas.getText());
        
        dts.setNomimagen(txtnomimagen.getText());

        dts.setDescripcion(jtaDescripcion.getText());

        dts.setPrecio_diario(Double.parseDouble(jtfPrecioPorDia.getText()));

        if (opcion.equals("guardar")) {
            if (funcion.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "El cuarto ha sido registrado");
                mostrar("");
                apagar();
            }
        } else if (opcion.equals("editar")) {

            dts.setIdCuarto(Integer.parseInt(jtfID.getText()));

            if (funcion.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "El cuarto a sido modificado");
                mostrar("");
                apagar();
            }

        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed

        mostrar("");
        apagar();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbcTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbcTipoActionPerformed

    private void jbcPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcPisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbcPisoActionPerformed

    private void jbcEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbcEstadoActionPerformed

    private void jtfIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIDActionPerformed

    private void tblCuartosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCuartosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCuartosMouseEntered

    private void jbImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbImagenActionPerformed
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Formatos de Archivos JPEG(*.JPG;*.JPEG)","jpg","jpeg");
        JFileChooser archivo = new JFileChooser();
        archivo.addChoosableFileFilter(filtro);
        archivo.setDialogTitle("Abrir Archivo");
       
        File ruta = new File("C:\\Users\\narda\\Desktop\\PROYECTO PARADIGMAS\\CuartosImagenes");
        archivo.setCurrentDirectory(ruta);
        
        int ventana = archivo.showOpenDialog(null);
        if (ventana == JFileChooser.APPROVE_OPTION) {
            
            File file = archivo.getSelectedFile();
            txtnomimagen.setText(String.valueOf(file));
            Image foto = getToolkit().createImage(txtnomimagen.getText());
            foto = foto.getScaledInstance(460, 240, Image.SCALE_DEFAULT);
            lblfoto.setIcon(new ImageIcon(foto));
        }
        
        
    }//GEN-LAST:event_jbImagenActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Cuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cuartos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbImagen;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jbcEstado;
    private javax.swing.JComboBox<String> jbcPiso;
    private javax.swing.JComboBox<String> jbcTipo;
    private javax.swing.JLabel jlRegistros;
    private javax.swing.JTextArea jtaCaracteristicas;
    private javax.swing.JTextArea jtaDescripcion;
    private javax.swing.JTextField jtfBuscar;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfNoCuarto;
    private javax.swing.JTextField jtfPrecioPorDia;
    private javax.swing.JLabel lblfoto;
    private javax.swing.JTable tblCuartos;
    private javax.swing.JTextField txtnomimagen;
    // End of variables declaration//GEN-END:variables
}
