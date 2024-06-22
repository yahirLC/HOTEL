package Trabajador;

import Base.Dtrabajador;
import Logico.Ltrabajador;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setTitle("Acceso");
        this.setLocationRelativeTo(null);
       
    }
    
    int x=0;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jftUsuario = new javax.swing.JFormattedTextField();
        jpfContraseña = new javax.swing.JPasswordField();
        jbInicio = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLista = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("aqui logo");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 510));
        jPanel1.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO_n.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(550, 60, 180, 70);

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Inicio de sesion");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(490, 120, 320, 60);

        jftUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        jftUsuario.setText("elon");
        jftUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jftUsuarioMouseClicked(evt);
            }
        });
        jftUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jftUsuario);
        jftUsuario.setBounds(500, 230, 290, 40);

        jpfContraseña.setToolTipText("");
        jpfContraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        jpfContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpfContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(jpfContraseña);
        jpfContraseña.setBounds(500, 280, 290, 40);

        jbInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_iniciarsesion.png"))); // NOI18N
        jbInicio.setBorder(null);
        jbInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInicioActionPerformed(evt);
            }
        });
        jPanel1.add(jbInicio);
        jbInicio.setBounds(480, 350, 330, 58);

        jPanel2.setBackground(new java.awt.Color(0, 54, 144));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bahía de Oro");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 0, 100, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(750, 0, 100, 30);

        jtLista.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtLista);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(450, 520, 40, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hotel_fondo_cuadro.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-20, 0, 460, 510);

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(745, 470, 90, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jftUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftUsuarioActionPerformed

    private void jpfContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpfContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpfContraseñaActionPerformed

    private void jbInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInicioActionPerformed

        try {
            DefaultTableModel modelo;
            Ltrabajador func = new Ltrabajador();
            Dtrabajador dts = new Dtrabajador();

            dts.setLogin(jftUsuario.getText());
            dts.setContra(jpfContraseña.getText());

            modelo = func.login(dts.getLogin(), dts.getContra());

            jtLista.setModel(modelo);

            if (func.totalregistros > 0) {

                this.dispose();
                Menu men = new Menu();
                men.setVisible(true);
                Menu.jlIDPersona.setText(jtLista.getValueAt(0, 0).toString());
                Menu.jlNombre.setText(jtLista.getValueAt(0, 1).toString());
                Menu.jlPaterno.setText(jtLista.getValueAt(0, 2).toString());
                Menu.jlMaterno.setText(jtLista.getValueAt(0, 3).toString());
                Menu.jlAcceso.setText(jtLista.getValueAt(0, 6).toString());

                if (Menu.jlAcceso.getText().equals("Admin")) {

                }else{
                    
                    Menu.jbTrabajadores.setEnabled(false);
                    Menu.jbCuartos.setEnabled(false);
                    
                    
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Verifique sus datos");
            }

        } catch (Exception e) {
        }


    }//GEN-LAST:event_jbInicioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Cliente.Bienvenida bn = new Cliente.Bienvenida();
        bn.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jftUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jftUsuarioMouseClicked
  
        if (x == 0) {
            
            jftUsuario.setText("");
        }
            
    }//GEN-LAST:event_jftUsuarioMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbInicio;
    private javax.swing.JFormattedTextField jftUsuario;
    private javax.swing.JPasswordField jpfContraseña;
    private javax.swing.JTable jtLista;
    // End of variables declaration//GEN-END:variables
}
