/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.JOptionPane;
import proyecto.pkg1.Funciones;
import proyecto.pkg1.Listas;

/**
 *
 * @author Kevin
 */
public class VentanaGeneral extends javax.swing.JFrame {

    Funciones f;
    Listas listas;
    boolean archivo;

    /**
     * Creates new form VentanaGeneral
     */
    public VentanaGeneral() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        f = new Funciones();
        archivo = false;

    }

    public VentanaGeneral(Listas listas) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.listas = listas;
        f = new Funciones();
        archivo = true;
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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 190, -1));

        cargarArchivo.setText("Cargar archivo ");
        cargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(cargarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 270, -1));

        continuarArchivo.setText("Continuar con archivo predeterminado");
        continuarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(continuarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 270, -1));

        recorrerGrafo.setText("Recorrer grafo");
        jPanel1.add(recorrerGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 270, -1));

        mostrarGrafo.setText("Mostrar grafo");
        mostrarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarGrafoActionPerformed(evt);
            }
        });
        jPanel1.add(mostrarGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 270, -1));

        rolUsuario.setText("Seleccionar rol de usuario");
        rolUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(rolUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 270, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarArchivoActionPerformed
        listas = f.leerTxtCargado();
        if (!listas.getListaClientes().esVacio() && !listas.getListaRestaurantes().esVacio() && !listas.getListaPedidos().esVacio() && !listas.getListaRutas().esVacio()) {
            archivo = true;
        } else {
            archivo = false;
        }
    }//GEN-LAST:event_cargarArchivoActionPerformed

    private void rolUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolUsuarioActionPerformed
        if (archivo) {
            new VentanaRolUsuario(listas).setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Debe cargar un archivo primero para continuar");
        }
    }//GEN-LAST:event_rolUsuarioActionPerformed

    private void continuarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarArchivoActionPerformed
        listas = f.leerTxtPred();
        if (!listas.getListaClientes().esVacio() && !listas.getListaRestaurantes().esVacio() && !listas.getListaPedidos().esVacio() && !listas.getListaRutas().esVacio()) {
            archivo = true;
        } else {
            archivo = false;
        }

    }//GEN-LAST:event_continuarArchivoActionPerformed

    private void mostrarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarGrafoActionPerformed
        if (archivo) {
            f.generarGrafoJpg(listas);
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            new VentanaMostrarGrafo(listas).setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Debe cargar un archivo primero para continuar");
        }
    }//GEN-LAST:event_mostrarGrafoActionPerformed

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
