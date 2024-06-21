/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Equipo;
import model.Municipio;

/**
 *
 * @author Elver
 */
public class FrmTorneo extends javax.swing.JFrame {
    private ArrayList<Municipio> listaMunicipios = new ArrayList<>();
    private ArrayList<Equipo> listaEquipos = new ArrayList<>();
    
    public FrmTorneo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdMunicipio = new javax.swing.JTextField();
        txtNombreMunicipio = new javax.swing.JTextField();
        btnCrearMunicipio = new javax.swing.JButton();
        btnBuscarMunicipio = new javax.swing.JButton();
        btnActualizarMunicipio = new javax.swing.JButton();
        btnEliminarMunicipio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstMunicipios = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        txtIdEquipo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDtEquipo = new javax.swing.JTextField();
        btnCrearEquipo = new javax.swing.JButton();
        btnBuscarEquipo = new javax.swing.JButton();
        btnActualizarEquipo = new javax.swing.JButton();
        btnEliminarEquipo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtNombreEquipo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxMunicipios = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstEquipos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Torneo");
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Id Municipio");

        jLabel2.setText("Nombre Municipio");

        btnCrearMunicipio.setText("Crear");
        btnCrearMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearMunicipioActionPerformed(evt);
            }
        });

        btnBuscarMunicipio.setText("Buscar");
        btnBuscarMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMunicipioActionPerformed(evt);
            }
        });

        btnActualizarMunicipio.setText("Actualizar");
        btnActualizarMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarMunicipioActionPerformed(evt);
            }
        });

        btnEliminarMunicipio.setText("Eliminar");
        btnEliminarMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMunicipioActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstMunicipios);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCrearMunicipio)
                        .addGap(29, 29, 29)
                        .addComponent(btnBuscarMunicipio)
                        .addGap(30, 30, 30)
                        .addComponent(btnActualizarMunicipio)
                        .addGap(28, 28, 28)
                        .addComponent(btnEliminarMunicipio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearMunicipio)
                    .addComponent(btnBuscarMunicipio)
                    .addComponent(btnActualizarMunicipio)
                    .addComponent(btnEliminarMunicipio))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Municipio", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Id Equipo");

        jLabel4.setText("Nombre Equipo");

        btnCrearEquipo.setText("Crear");
        btnCrearEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearEquipoActionPerformed(evt);
            }
        });

        btnBuscarEquipo.setText("Buscar");
        btnBuscarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEquipoActionPerformed(evt);
            }
        });

        btnActualizarEquipo.setText("Actualizar");
        btnActualizarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEquipoActionPerformed(evt);
            }
        });

        btnEliminarEquipo.setText("Eliminar");
        btnEliminarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEquipoActionPerformed(evt);
            }
        });

        jLabel5.setText("D:T");

        jLabel6.setText("Municipio Equipo");

        jScrollPane2.setViewportView(lstEquipos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnCrearEquipo)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarEquipo)
                                .addGap(18, 18, 18)
                                .addComponent(btnActualizarEquipo)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarEquipo))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxMunicipios, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDtEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDtEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxMunicipios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearEquipo)
                    .addComponent(btnBuscarEquipo)
                    .addComponent(btnActualizarEquipo)
                    .addComponent(btnEliminarEquipo))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Equipo", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearMunicipioActionPerformed
        int id = Integer.parseInt(txtIdMunicipio.getText());
        String nombre = txtNombreMunicipio.getText();
        Municipio  objMunicipio = new Municipio(id, nombre);
        listaMunicipios.add(objMunicipio);
        llenarListaMunicipios();

    }//GEN-LAST:event_btnCrearMunicipioActionPerformed

    private void btnBuscarMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMunicipioActionPerformed
        int id = Integer.parseInt(txtIdMunicipio.getText());
        boolean econtrado = false;
        for (Municipio objMunicipio : listaMunicipios){
            if(id == objMunicipio.getId()){
                txtNombreMunicipio.setText(objMunicipio.getNombre());
                econtrado = true;
                break;
            }
        }
        if(econtrado == false){
            JOptionPane.showMessageDialog(this, "El municipio no fue encontrado");
        }
    }//GEN-LAST:event_btnBuscarMunicipioActionPerformed

    private void btnActualizarMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarMunicipioActionPerformed
        int id = Integer.parseInt(txtIdMunicipio.getText());
        //String nombre = txtNombreMunicipio.getText();
        boolean encontrado = false;
        for(Municipio objMunicipio : listaMunicipios){
            if(id == objMunicipio.getId()){
                objMunicipio.setNombre(txtNombreMunicipio.getText());
                encontrado = true;
                llenarListaMunicipios();
                break;
            }
        }
        if(encontrado == false){
            JOptionPane.showMessageDialog(this, "El municipio no fue encontrado");
        }
    }//GEN-LAST:event_btnActualizarMunicipioActionPerformed

    private void btnEliminarMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMunicipioActionPerformed
        int id = Integer.parseInt(txtIdMunicipio.getText());
        boolean encontrado = false;
        for(Municipio obMunicipio : listaMunicipios){
            if(id == obMunicipio.getId()){
                if(JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar el equipo") ==0){
                    listaMunicipios.remove(obMunicipio);
                    llenarListaMunicipios();
                }
                encontrado = true;
                break;
            }
        }
        if(encontrado ==false){
            JOptionPane.showMessageDialog(this, "No se encontro el municipio");
        }
        
    }//GEN-LAST:event_btnEliminarMunicipioActionPerformed

    private void btnCrearEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearEquipoActionPerformed
        int id = Integer.parseInt(txtIdEquipo.getText());
        String nombre = txtNombreEquipo.getText();
        String dt = txtDtEquipo.getText();
        Municipio objMunicipio = (Municipio) cbxMunicipios.getSelectedItem();
        Equipo objEquipo = new Equipo(id, nombre, dt, objMunicipio);
        listaEquipos.add(objEquipo);
        llenarListaEquipos();
    }//GEN-LAST:event_btnCrearEquipoActionPerformed
    
    public void llenarListaEquipos(){
        DefaultListModel modeloListEquipos = new DefaultListModel();
        for (Equipo objEquipo : listaEquipos){
            modeloListEquipos.addElement(objEquipo);
        }
        lstEquipos.setModel(modeloListEquipos);
       
    }
    
    private void btnBuscarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarEquipoActionPerformed

    private void btnActualizarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarEquipoActionPerformed

    private void btnEliminarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarEquipoActionPerformed
    
    public void llenarListaMunicipios(){
        DefaultListModel modeloListMunicipios = new DefaultListModel();
        DefaultComboBoxModel modeloCbxMunicipios = new DefaultComboBoxModel();
        for (Municipio objMunicipio : listaMunicipios){
            modeloListMunicipios.addElement(objMunicipio);
            modeloCbxMunicipios.addElement(objMunicipio);
        }
        lstMunicipios.setModel(modeloListMunicipios);
        cbxMunicipios.setModel(modeloCbxMunicipios);
    }
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
            java.util.logging.Logger.getLogger(FrmTorneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTorneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTorneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTorneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTorneo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarEquipo;
    private javax.swing.JButton btnActualizarMunicipio;
    private javax.swing.JButton btnBuscarEquipo;
    private javax.swing.JButton btnBuscarMunicipio;
    private javax.swing.JButton btnCrearEquipo;
    private javax.swing.JButton btnCrearMunicipio;
    private javax.swing.JButton btnEliminarEquipo;
    private javax.swing.JButton btnEliminarMunicipio;
    private javax.swing.JComboBox<String> cbxMunicipios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> lstEquipos;
    private javax.swing.JList<String> lstMunicipios;
    private javax.swing.JTextField txtDtEquipo;
    private javax.swing.JTextField txtIdEquipo;
    private javax.swing.JTextField txtIdMunicipio;
    private javax.swing.JTextField txtNombreEquipo;
    private javax.swing.JTextField txtNombreMunicipio;
    // End of variables declaration//GEN-END:variables
}