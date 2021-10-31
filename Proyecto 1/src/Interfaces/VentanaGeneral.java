/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import proyecto.pkg1.Funciones;
import proyecto.pkg1.Listas;

/**
 *
 * @author Kevin
 */
public class VentanaGeneral extends javax.swing.JFrame {
    Funciones f;
    Listas listas;

    /**
     * Creates new form VentanaGeneral
     */
    public VentanaGeneral() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        f = new Funciones();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cargarArchivo = new javax.swing.JButton();
        continuarArchivo = new javax.swing.JButton();
        recorrerGrafo = new javax.swing.JButton();
        mostrarGrafo = new javax.swing.JButton();
        rolUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Bienvenido a Samancito Delivery");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 190, -1));

        cargarArchivo.setText("Cargar archivo ");
        cargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(cargarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 240, -1));

        continuarArchivo.setText("Continuar con archivo predeterminado");
        continuarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(continuarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 240, -1));

        recorrerGrafo.setText("Recorrer grafo");
        jPanel1.add(recorrerGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 240, -1));

        mostrarGrafo.setText("Mostrar grafo");
        jPanel1.add(mostrarGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 240, -1));

        rolUsuario.setText("Seleccionar rol de usuario");
        rolUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(rolUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 240, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarArchivoActionPerformed
       
    }//GEN-LAST:event_cargarArchivoActionPerformed

    private void rolUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolUsuarioActionPerformed
        new VentanaRolUsuario(listas).setVisible(true);
        dispose();
    }//GEN-LAST:event_rolUsuarioActionPerformed

    private void continuarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarArchivoActionPerformed
        listas = f.leerTxtPred();
        
    }//GEN-LAST:event_continuarArchivoActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(VentanaGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VentanaGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VentanaGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VentanaGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VentanaGeneral().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cargarArchivo;
    private javax.swing.JButton continuarArchivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mostrarGrafo;
    private javax.swing.JButton recorrerGrafo;
    private javax.swing.JButton rolUsuario;
    // End of variables declaration//GEN-END:variables
}
