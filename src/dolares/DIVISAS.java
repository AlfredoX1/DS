/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolares;

import javax.swing.JOptionPane;

/**
 *
 * @author Vongola V1
 */
public class DIVISAS extends javax.swing.JFrame {

    DOLARESDIVISAS dpl=  new DOLARESDIVISAS() ;
    public DIVISAS() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cambiardivisas = new javax.swing.JButton();
        nuevasdivisas = new javax.swing.JButton();
        salirdeaqui = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelpesos = new javax.swing.JLabel();
        labelcolones = new javax.swing.JLabel();
        labeleuros = new javax.swing.JLabel();
        labellibras = new javax.swing.JLabel();
        méxico = new javax.swing.JLabel();
        elsalvador = new javax.swing.JLabel();
        europa = new javax.swing.JLabel();
        reinounido = new javax.swing.JLabel();
        DOLARESTXT = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vongola V1\\Downloads\\divisas.jpg")); // NOI18N

        cambiardivisas.setText("CONVERTIR");
        cambiardivisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiardivisasActionPerformed(evt);
            }
        });

        nuevasdivisas.setText("NUEVO");
        nuevasdivisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevasdivisasActionPerformed(evt);
            }
        });

        salirdeaqui.setText("SALIR");
        salirdeaqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirdeaquiActionPerformed(evt);
            }
        });

        jLabel2.setText("DOLARES");

        labelpesos.setText("PESOS( MÉXICO)");

        labelcolones.setText("COLONES (EL SALVADOR)");

        labeleuros.setText("EUROS(EUROPA)");

        labellibras.setText("LIBRA ESTERLINA (REINO UNIDO)");

        europa.setText(" ");

        reinounido.setText(" ");

        DOLARESTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOLARESTXTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cambiardivisas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nuevasdivisas)
                                .addGap(44, 44, 44)
                                .addComponent(salirdeaqui)
                                .addGap(19, 19, 19))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labellibras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelpesos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelcolones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labeleuros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(méxico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(elsalvador, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(europa, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(reinounido, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(DOLARESTXT))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(DOLARESTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelpesos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(méxico, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelcolones)
                    .addComponent(elsalvador, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeleuros)
                    .addComponent(europa))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labellibras)
                    .addComponent(reinounido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cambiardivisas)
                    .addComponent(nuevasdivisas)
                    .addComponent(salirdeaqui))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cambiardivisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiardivisasActionPerformed

     if (DOLARESTXT.getText().isEmpty()){
         
         JOptionPane.showMessageDialog(null,"No Ingresaste Datos");
     }
     else{
     dpl.dolarespesos();
     dpl.dolarescolones();
     dpl.dolareseuros();
     dpl.dolareslibras(); 
     }
        
        
    }//GEN-LAST:event_cambiardivisasActionPerformed

    private void nuevasdivisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevasdivisasActionPerformed
      dpl.limpiar();
    }//GEN-LAST:event_nuevasdivisasActionPerformed

    private void salirdeaquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirdeaquiActionPerformed
      System.exit(0);
    }//GEN-LAST:event_salirdeaquiActionPerformed

    private void DOLARESTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOLARESTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DOLARESTXTActionPerformed

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
            java.util.logging.Logger.getLogger(DIVISAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DIVISAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DIVISAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DIVISAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DIVISAS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField DOLARESTXT;
    private javax.swing.JButton cambiardivisas;
    public static javax.swing.JLabel elsalvador;
    public static javax.swing.JLabel europa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelcolones;
    private javax.swing.JLabel labeleuros;
    private javax.swing.JLabel labellibras;
    private javax.swing.JLabel labelpesos;
    public static javax.swing.JLabel méxico;
    private javax.swing.JButton nuevasdivisas;
    public static javax.swing.JLabel reinounido;
    private javax.swing.JButton salirdeaqui;
    // End of variables declaration//GEN-END:variables
}
