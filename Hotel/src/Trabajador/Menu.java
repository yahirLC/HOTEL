package Trabajador;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbCuartos = new javax.swing.JButton();
        jbClientes = new javax.swing.JButton();
        jlIDPersona = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlPaterno = new javax.swing.JLabel();
        jlMaterno = new javax.swing.JLabel();
        jlAcceso = new javax.swing.JLabel();
        jbReservacion = new javax.swing.JButton();
        jbTrabajadores = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jbEliminados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(282, 297));
        setResizable(false);
        getContentPane().setLayout(null);

        jbCuartos.setText("Cuartos");
        jbCuartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCuartosActionPerformed(evt);
            }
        });
        getContentPane().add(jbCuartos);
        jbCuartos.setBounds(20, 140, 110, 23);

        jbClientes.setText("Clientes");
        jbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClientesActionPerformed(evt);
            }
        });
        getContentPane().add(jbClientes);
        jbClientes.setBounds(140, 140, 110, 23);

        jlIDPersona.setText("jlIDPersona");
        getContentPane().add(jlIDPersona);
        jlIDPersona.setBounds(90, 20, 59, 16);

        jlNombre.setText("jlNombre");
        getContentPane().add(jlNombre);
        jlNombre.setBounds(90, 30, 50, 30);

        jlPaterno.setText("jlPaterno");
        getContentPane().add(jlPaterno);
        jlPaterno.setBounds(90, 50, 60, 30);

        jlMaterno.setText("jlMaterno");
        getContentPane().add(jlMaterno);
        jlMaterno.setBounds(150, 50, 51, 30);

        jlAcceso.setText("jlAcceso");
        getContentPane().add(jlAcceso);
        jlAcceso.setBounds(90, 60, 50, 50);

        jbReservacion.setText("Reservacion");
        jbReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReservacionActionPerformed(evt);
            }
        });
        getContentPane().add(jbReservacion);
        jbReservacion.setBounds(140, 170, 110, 23);

        jbTrabajadores.setText("Trabajadores");
        jbTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTrabajadoresActionPerformed(evt);
            }
        });
        getContentPane().add(jbTrabajadores);
        jbTrabajadores.setBounds(20, 170, 110, 23);

        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(170, 230, 72, 23);

        jLabel1.setText("Rango:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 80, 60, 16);

        jLabel2.setText("ID:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 20, 14, 16);

        jLabel3.setText("Apellidos");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 60, 60, 16);

        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 40, 60, 16);

        jLabel6.setText("Funcion de Admin");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 120, 110, 16);

        jButton1.setText("Pagos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(140, 200, 110, 23);

        jbEliminados.setText("Eliminados");
        jbEliminados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminadosActionPerformed(evt);
            }
        });
        getContentPane().add(jbEliminados);
        jbEliminados.setBounds(20, 200, 110, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCuartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCuartosActionPerformed

        Cuartos ct = new Cuartos();
        ct.setVisible(true);

    }//GEN-LAST:event_jbCuartosActionPerformed

    private void jbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClientesActionPerformed

        
        Clientes clnt = new Clientes();
        clnt.setVisible(true);
    }//GEN-LAST:event_jbClientesActionPerformed

    private void jbReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReservacionActionPerformed

        Reservacion rs = new Reservacion();
        rs.setVisible(true);

        Reservacion.jtfIDtrabajador.setText(jlIDPersona.getText());
        Reservacion.jtfTrabajador.setText(jlNombre.getText() + " " + jlPaterno.getText());
        Reservacion.idusuario = Integer.parseInt(jlIDPersona.getText());
    }//GEN-LAST:event_jbReservacionActionPerformed

    private void jbTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTrabajadoresActionPerformed

        Trabajador tb = new Trabajador();
        tb.setVisible(true);

    }//GEN-LAST:event_jbTrabajadoresActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
        Cliente.Bienvenida cb = new Cliente.Bienvenida();
        cb.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jbEliminadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminadosActionPerformed
        ClientesEliminados ce = new ClientesEliminados();
        ce.setVisible(true);
    }//GEN-LAST:event_jbEliminadosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Pago pg = new Pago();
        pg.setVisible(true);
        
        Pago.jLabel1.setText("");
        Pago.jbNuevo.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JButton jbClientes;
    public static javax.swing.JButton jbCuartos;
    public static javax.swing.JButton jbEliminados;
    public static javax.swing.JButton jbReservacion;
    public static javax.swing.JButton jbTrabajadores;
    public static javax.swing.JLabel jlAcceso;
    public static javax.swing.JLabel jlIDPersona;
    public static javax.swing.JLabel jlMaterno;
    public static javax.swing.JLabel jlNombre;
    public static javax.swing.JLabel jlPaterno;
    // End of variables declaration//GEN-END:variables
}
