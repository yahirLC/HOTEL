package Trabajador;

import Base.Dcliente;
import Logico.Lcliente;
import Logico.Lcuarto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class ClientesEliminados extends javax.swing.JFrame {

    int fila;
    public ClientesEliminados() {
        initComponents();
        mostrar("");
        this.setLocationRelativeTo(null);
        this.jButton2.setVisible(false);
    }

    void ocultar() {

        tblClientesb.getColumnModel().getColumn(0).setMaxWidth(0);
        tblClientesb.getColumnModel().getColumn(0).setMinWidth(0);
        tblClientesb.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    void mostrar(String buscar) {

        try {
            DefaultTableModel modelo;
            Lcliente funcion = new Lcliente();
            modelo = funcion.mostrar(buscar,1);

            tblClientesb.setModel(modelo);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientesb = new javax.swing.JTable();
        jlRegistros = new javax.swing.JLabel();
        jtfBuscar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jlbtitulo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblClientesb.setModel(new javax.swing.table.DefaultTableModel(
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
        tblClientesb.setEditingColumn(0);
        tblClientesb.setEditingRow(0);
        tblClientesb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblClientesbMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblClientesbMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientesb);

        jlRegistros.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jlRegistros.setText("Registros");

        jtfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBuscarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel13.setText("Buscar:");

        jlbtitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlbtitulo.setText("CLIENTES ELIMINADOS");

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Restaurar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbtitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton2)
                                .addComponent(jtfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jlbtitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblClientesbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesbMouseClicked
 fila = tblClientesb.rowAtPoint(evt.getPoint());
 this.jButton2.setVisible(true);

    }//GEN-LAST:event_tblClientesbMouseClicked

    private void tblClientesbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesbMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblClientesbMouseEntered

    private void jtfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBuscarActionPerformed

        mostrar(jtfBuscar.getText());
    }//GEN-LAST:event_jtfBuscarActionPerformed

    private void tblClientesbMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesbMousePressed
        this.jButton2.setVisible(true);
        if (evt.getClickCount() == 2) {
            
            fila = tblClientesb.getSelectedRow();
            String cod;
            String valor;

            cod = tblClientesb.getValueAt(fila, 7).toString();
            valor = tblClientesb.getValueAt(fila, 1).toString() + " " + tblClientesb.getValueAt(fila, 2).toString();

            Reservacion.jtfIDcliente.setText(cod);
            Reservacion.jtfCliente.setText(valor);
            this.dispose();
        }
    }//GEN-LAST:event_tblClientesbMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 if (!tblClientesb.getValueAt(fila, 6).toString().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro de restaurar?", "Confirmar", 2);

            if (confirmacion == 0) {
                Lcliente funcion = new Lcliente();
                Dcliente dts = new Dcliente();

                dts.setNocliente(tblClientesb.getValueAt(fila, 7).toString());
                funcion.restaurar(dts);
                 mostrar("");
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ClientesEliminados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientesEliminados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientesEliminados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientesEliminados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientesEliminados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlRegistros;
    private javax.swing.JLabel jlbtitulo;
    private javax.swing.JTextField jtfBuscar;
    private javax.swing.JTable tblClientesb;
    // End of variables declaration//GEN-END:variables
}
