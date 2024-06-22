package Trabajador;

import Logico.Lcuarto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class CuartosBuscar extends javax.swing.JFrame {

    /**
     * Creates new form CuartosBuscar
     */
    public CuartosBuscar() {
        initComponents();
        mostrar("");
        this.setLocationRelativeTo(null);
    }

    void ocultar() {

        tblCuartosb.getColumnModel().getColumn(0).setMaxWidth(0);
        tblCuartosb.getColumnModel().getColumn(0).setMinWidth(0);
        tblCuartosb.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    void mostrar(String buscar) {
        String T = "Seleccione un cuarto";
        try {
            DefaultTableModel modelo;
            Lcuarto funcion = new Lcuarto();
            modelo = funcion.mostrar(buscar, T);

            tblCuartosb.setModel(modelo);
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
        tblCuartosb = new javax.swing.JTable();
        jlRegistros = new javax.swing.JLabel();
        jtfBuscar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jlbtitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblCuartosb.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCuartosb.setEditingColumn(0);
        tblCuartosb.setEditingRow(0);
        tblCuartosb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCuartosbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblCuartosbMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblCuartosbMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblCuartosb);

        jlRegistros.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jlRegistros.setText("Registros");

        jtfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBuscarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel13.setText("Buscar:");

        jlbtitulo.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jlbtitulo)))
                .addContainerGap(269, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 590, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlbtitulo)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 171, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jtfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(58, 58, 58)
                    .addComponent(jlRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblCuartosbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCuartosbMouseClicked


    }//GEN-LAST:event_tblCuartosbMouseClicked

    private void tblCuartosbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCuartosbMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCuartosbMouseEntered

    private void jtfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBuscarActionPerformed

        mostrar(jtfBuscar.getText());
    }//GEN-LAST:event_jtfBuscarActionPerformed

    private void tblCuartosbMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCuartosbMousePressed
        if (evt.getClickCount() == 2) {

            int fila = tblCuartosb.getSelectedRow();
            String cod;
            String valor;

            cod = tblCuartosb.getValueAt(fila, 0).toString();
            valor = tblCuartosb.getValueAt(fila, 1).toString();

            Reservacion.jtfIDcuarto.setText(cod);
            Reservacion.jtfCuarto.setText(valor);
            this.dispose();
        }
    }//GEN-LAST:event_tblCuartosbMousePressed

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
            java.util.logging.Logger.getLogger(CuartosBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CuartosBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CuartosBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CuartosBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CuartosBuscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel13;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlRegistros;
    private javax.swing.JLabel jlbtitulo;
    private javax.swing.JTextField jtfBuscar;
    private javax.swing.JTable tblCuartosb;
    // End of variables declaration//GEN-END:variables
}
