/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Dispensarios;

import Vista.Hologramas.*;
import Controlador.LibreriaBDControlador;
import Modelo.modeloTablaUsuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yuliana adame
 */
public class catalogoDispensarios extends javax.swing.JFrame {

    /**
     * Creates new form catalogoHologramas
     */
    public String columna[];
    LibreriaBDControlador lbd = new LibreriaBDControlador();
    DefaultTableModel modeloDispenarios;
    modeloTablaUsuario mtu = new modeloTablaUsuario();
    int tipoUsuario = 0;
    public catalogoDispensarios(modeloTablaUsuario mtu) {
        this.mtu = mtu;
        tipoUsuario = mtu.getTipoUsuario();
        getColumnas();
        lbd.openConnection();
        modeloDispenarios = lbd.modeloDispensarios(columna,"","",""); //Cargo el contenido por defecto
        lbd.closeConnection();
        //setFilas(); //Añado las filas
        initComponents();
//        //Valido eltipo de usuario
//        if(tipoUsuario != 0){
//            botonModificarDispensario.setEnabled(false);
//            //botonEliminarFolio.setEnabled(false);
//        }
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = jTable1.rowAtPoint(evt.getPoint());
                int col = 1;
                if (row >= 0 && col >= 0) {
                    String valor = jTable1.getModel().getValueAt(row, col).toString(); //Tomo el valor de el modelo de la tabla
                    folioDispensario.setText(valor); //Obtengo el valor del textfield
                }
                col = 2;
                if (row >= 0 && col >= 0) {
                    String valor = jTable1.getModel().getValueAt(row, col).toString(); //Tomo el valor de el modelo de la tabla
                    folioEstacion.setText(valor); //Obtengo el valor del textfield
                }
//                col = 2;
//                if (row >= 0 && col >= 0) {
//                    String valor = jTable1.getModel().getValueAt(row, col).toString(); //Tomo el valor de el modelo de la tabla
//                    jTextField4.setText(valor); //Obtengo el valor del textfield
//                }
            }
        });
    }
    /*Obtengo los titulos de mi tabla*/
    String[] getColumnas(){ //Columnas
            columna = new String[] {"ID","NUMDISPENSARIO",
            "NÚM.ESTACIÓN",
            "MARCA",
            "MODELO",
            "SERIE",
            "ALCANCEMIN",
            "APROBACIONDGN",
            "ALCANCEMAX",
            "MANG.A",
            "MANG.B",
            "MANG.C",
            "MANG.D",
            "MANG.E",
            "MANG.F",
            "FEC.REG"};
        return columna;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel2 = new javax.swing.JPanel();
        botonAgregarDispensario = new javax.swing.JButton();
        botonModificarDispensario = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        MostrarTodasCH = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        folioDispensario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        marcaGasolina = new javax.swing.JComboBox();
        RefrescarCH = new javax.swing.JButton();
        folioEstacion = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1112, 656));
        setMinimumSize(new java.awt.Dimension(1112, 656));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Times New Roman", 2, 11)); // NOI18N
        jTable1.setModel(modeloDispenarios);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        botonAgregarDispensario.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        botonAgregarDispensario.setText("Agregar");
        botonAgregarDispensario.setFocusable(false);
        botonAgregarDispensario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAgregarDispensario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAgregarDispensario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarDispensarioActionPerformed(evt);
            }
        });

        botonModificarDispensario.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        botonModificarDispensario.setText("Modificar ");
        botonModificarDispensario.setFocusable(false);
        botonModificarDispensario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonModificarDispensario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonModificarDispensario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarDispensarioActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        MostrarTodasCH.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        MostrarTodasCH.setForeground(new java.awt.Color(255, 0, 0));
        MostrarTodasCH.setText("Buscar");
        MostrarTodasCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarTodasCHActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel3.setText("No. Dispensario:");

        folioDispensario.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel1.setText("No Estación");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel2.setText("Marca Gasolina:");

        marcaGasolina.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        marcaGasolina.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "WAYNE", "PETROL & IMPORT", "GILBARCO", "TOKHEIM", "PEGASUS", "TEAM", "GBR", "UNIVERSEL", "BENNETT", "SUPRAMAX" }));

        RefrescarCH.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        RefrescarCH.setText("Refrescar");
        RefrescarCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefrescarCHActionPerformed(evt);
            }
        });

        folioEstacion.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(folioEstacion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(folioDispensario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(marcaGasolina, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RefrescarCH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MostrarTodasCH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(folioDispensario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(folioEstacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(MostrarTodasCH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(marcaGasolina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RefrescarCH))
                .addGap(66, 66, 66))
        );

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(102, 102, 102));
        jTextArea1.setRows(5);
        jTextArea1.setText("Para filtrar los campos primero\ndeben añadir información a los \ncampos y después darle clic a \nbuscar. Nota: Puede seleccionar\ndirectamente en la tabla para\nllenar el número dispensario en \nautomatico.");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonAgregarDispensario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonModificarDispensario, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(botonAgregarDispensario)
                        .addGap(31, 31, 31)
                        .addComponent(botonModificarDispensario))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarTodasCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarTodasCHActionPerformed
        // TODO add your handling code here:
        String folioDispensariob = folioDispensario.getText();
        String folioEstacionb =  folioEstacion.getText();
        String marcaGas = (String) marcaGasolina.getSelectedItem();
        lbd.openConnection();
        modeloDispenarios = lbd.modeloDispensarios(columna, folioDispensariob, folioEstacionb,marcaGas);
        lbd.closeConnection();
        jTable1.setModel(modeloDispenarios);
        modeloDispenarios.fireTableDataChanged();
    }//GEN-LAST:event_MostrarTodasCHActionPerformed

    private void botonAgregarDispensarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarDispensarioActionPerformed
                agregarDispensario dialog = new agregarDispensario(new javax.swing.JFrame(), true);
                dialog.setVisible(true);
    }//GEN-LAST:event_botonAgregarDispensarioActionPerformed

    private void RefrescarCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefrescarCHActionPerformed
        // TODO add your handling code here:
        lbd.openConnection();
        modeloDispenarios = lbd.modeloDispensarios(columna, "", "", "");
        lbd.closeConnection();
        jTable1.setModel(modeloDispenarios);
        modeloDispenarios.fireTableDataChanged();
    }//GEN-LAST:event_RefrescarCHActionPerformed

    private void botonModificarDispensarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarDispensarioActionPerformed
      modificarDispensario dialog = new modificarDispensario(new javax.swing.JFrame(), true);
      dialog.setVisible(true);        // TODO add your handling code here:
//      lbd.openConnection();
//      modeloDispenarios = lbd.modeloGasValid(columna, "", "", "");
//      lbd.closeConnection();
//      jTable1.setModel(modeloDispenarios);
//      modeloDispenarios.fireTableDataChanged();
    }//GEN-LAST:event_botonModificarDispensarioActionPerformed

//    /**
//     * @param args the command line arguments
//     */
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
//            java.util.logging.Logger.getLogger(catalogoHologramas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(catalogoHologramas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(catalogoHologramas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(catalogoHologramas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new catalogoHologramas().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MostrarTodasCH;
    private javax.swing.JButton RefrescarCH;
    private javax.swing.JButton botonAgregarDispensario;
    private javax.swing.JButton botonModificarDispensario;
    private javax.swing.JTextField folioDispensario;
    private javax.swing.JTextField folioEstacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JComboBox marcaGasolina;
    // End of variables declaration//GEN-END:variables
}
