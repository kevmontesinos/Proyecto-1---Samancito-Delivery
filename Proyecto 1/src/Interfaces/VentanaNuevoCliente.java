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
public class VentanaNuevoCliente extends javax.swing.JFrame {

    Listas listas;
    Funciones f;

    /**
     * Creates new form VentanaNuevoCliente
     */
    public VentanaNuevoCliente(Listas listas) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.listas = listas;
        f = new Funciones();

        char[] direcciones = f.getDirecciones(listas);

        for (int i = 0; i < direcciones.length; i++) {
            entrada.addItem(String.valueOf(direcciones[i]));
            salida.addItem(String.valueOf(direcciones[i]));
        }

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
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        cedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        entrada = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        salida = new javax.swing.JComboBox<>();
        pesoSalida = new javax.swing.JSpinner();
        pesoEntrada = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        agregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 190, -1));
        jPanel1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 190, -1));
        jPanel1.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 190, -1));

        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel2.setText("Apellido");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel3.setText("Cedula");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel4.setText("Dirección");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));
        jPanel1.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 190, -1));

        jLabel5.setText("Seleccione una direccion de salida: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        jPanel1.add(entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 190, -1));

        jLabel6.setText("Seleccione una direccion de entrada: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));

        jPanel1.add(salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 190, -1));

        pesoSalida.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel1.add(pesoSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 70, -1));

        pesoEntrada.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel1.add(pesoEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 70, -1));

        jLabel7.setText("Distancia:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, -1, -1));

        jLabel8.setText("Distancia:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 100, -1));

        agregar.setText("Agregar cliente");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel1.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        new VentanaCliente(listas).setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        //falta validar que sea una letra la direccion, no sea numero, la letra que se ponga no esté ya escogida, 
        try {
            if (!nombre.getText().isBlank() && !apellido.getText().isBlank() && !cedula.getText().isBlank() && !direccion.getText().isBlank() && f.validaDirecionCliente(direccion.getText())) {
                if (!listas.getListaClientes().existeDireccion(direccion.getText())) {
                    if (!entrada.getSelectedItem().toString().equals(salida.getSelectedItem().toString())) {
                        listas.getListaClientes().agregarFinal(direccion.getText().charAt(0), nombre.getText(), apellido.getText(), Integer.parseInt(cedula.getText()));
                        listas.getListaRutas().agregarFinal(entrada.getSelectedItem().toString().charAt(0), direccion.getText().charAt(0), Integer.parseInt(pesoEntrada.getValue().toString()));
                        listas.getListaRutas().agregarFinal(direccion.getText().charAt(0), salida.getSelectedItem().toString().charAt(0), Integer.parseInt(pesoSalida.getValue().toString()));
                        JOptionPane.showMessageDialog(null, "El cliente fue agregado correctamente");
                        new VentanaCliente(listas).setVisible(true);
                        dispose();

                    } else {
                        JOptionPane.showMessageDialog(null, "La dirección de entrada y salida no pueden coincidir.");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "La dirección ya existe. Por favor, ingrese otra.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, complete los campos correctamente.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo agregar el cliente, complete los campos correctamente.");
        }
    }//GEN-LAST:event_agregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField direccion;
    private javax.swing.JComboBox<String> entrada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    private javax.swing.JSpinner pesoEntrada;
    private javax.swing.JSpinner pesoSalida;
    private javax.swing.JComboBox<String> salida;
    // End of variables declaration//GEN-END:variables
}
