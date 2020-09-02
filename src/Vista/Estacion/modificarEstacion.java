/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Estacion;

import Controlador.LibreriaBDControlador;
import Controlador.LibreriaToolsControlador;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author joseluis.caamal
 */
public class modificarEstacion extends javax.swing.JDialog {

    /**
     * Creates new form agregarEstacion
     */
    LibreriaBDControlador lbd = new LibreriaBDControlador();
    LibreriaToolsControlador ltc = new LibreriaToolsControlador();
    public modificarEstacion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        campoEstacion = new javax.swing.JTextField();
        campoResponsable = new javax.swing.JTextField();
        campoRazonSocial = new javax.swing.JTextField();
        campoRegFedCausante = new javax.swing.JTextField();
        campoDomicilio = new javax.swing.JTextField();
        campoColonia = new javax.swing.JTextField();
        campoCiudad = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        campoCoordenadasUTM = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        campoCodigoPostal = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        campoNumeroCRE = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        campoMarcaGasolina = new javax.swing.JComboBox<>();
        campoEstado = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        campoTotalMagna = new javax.swing.JTextField();
        campoTotalPremium = new javax.swing.JTextField();
        campoTotalDiesel = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        campoEstatusManguera = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(556, 697));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel1.setText("No. de la CRE:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel3.setText("Nombre Responsable:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel4.setText("Razón Social:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel5.setText("Reg. Fed. Causantes:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel6.setText("Domicilio:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel7.setText("Colonia:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel8.setText("Ciudad:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel9.setText("Estado:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel10.setText("Teléfonos:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel11.setText("Email:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel12.setText("Coordenas UTM:");

        campoEstacion.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        campoEstacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoEstacionKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoEstacionKeyPressed(evt);
            }
        });

        campoResponsable.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        campoResponsable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoResponsableKeyTyped(evt);
            }
        });

        campoRazonSocial.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        campoRegFedCausante.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        campoRegFedCausante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRegFedCausanteActionPerformed(evt);
            }
        });

        campoDomicilio.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        campoColonia.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        campoCiudad.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        campoTelefono.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        campoTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTelefonoKeyTyped(evt);
            }
        });

        campoEmail.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        campoCoordenadasUTM.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        campoCoordenadasUTM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCoordenadasUTMActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel13.setText("Código Postal:");

        campoCodigoPostal.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        campoCodigoPostal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoCodigoPostalKeyTyped(evt);
            }
        });

        botonGuardar.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        botonGuardar.setForeground(new java.awt.Color(51, 51, 255));
        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/modify.png"))); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel14.setText("No. de la estación:");

        campoNumeroCRE.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("Modificar Estaciones");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel15.setText("Marca Gasolina:");

        campoMarcaGasolina.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        campoMarcaGasolina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pemex", "Oxxo Gas", "Mobil", "British Petroleum", "Repsol", "Shell", "Petro Seven", "G-500", "Hidrosina", "Akron", "Grupo Eco" }));

        campoEstado.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        campoEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jalisco", "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Coahuila de Zaragoza", "Colima", "Chiapas", "Chihuahua", "Distrito Federal", "Durango", "Guanajuato", "Guerrero", "Hidalgo", "México", "Michoacán de Ocampo", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz de Ignacio de la Llave", "Yucatán", "Zacatecas" }));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel16.setText("Estatus de Manguera:");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel17.setText("Mangueras Instaladas:");

        campoTotalMagna.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        campoTotalMagna.setText("0");
        campoTotalMagna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTotalMagnaKeyTyped(evt);
            }
        });

        campoTotalPremium.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        campoTotalPremium.setText("0");
        campoTotalPremium.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTotalPremiumKeyTyped(evt);
            }
        });

        campoTotalDiesel.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        campoTotalDiesel.setText("0");
        campoTotalDiesel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTotalDieselKeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel18.setText("Magna");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel19.setText("Premium");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel20.setText("Diesel");

        campoEstatusManguera.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        campoEstatusManguera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VIGENTE", "CANCELADO", "EN_REPARACION", "DESCONTINUADO", "FUERA_DE_SERVICIO", "ASIGNADA", "NO_ASIGNADA" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addGap(26, 26, 26)
                                    .addComponent(campoDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel14))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(campoEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                                                .addComponent(campoCoordenadasUTM, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(campoCodigoPostal, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(campoNumeroCRE, javax.swing.GroupLayout.Alignment.LEADING)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(42, 42, 42)
                                                        .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(campoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                            .addGap(36, 36, 36)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(campoColonia)
                                                                .addComponent(campoMarcaGasolina, 0, 422, Short.MAX_VALUE))))))
                                            .addGap(0, 0, Short.MAX_VALUE)))))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel16))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel18)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(campoTotalMagna, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(27, 27, 27)
                                            .addComponent(jLabel19)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(campoTotalPremium, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel20)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(campoTotalDiesel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(campoEstatusManguera, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(campoRegFedCausante, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel4))
                                        .addGap(23, 23, 23)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(campoResponsable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                                            .addComponent(campoRazonSocial)
                                            .addComponent(campoEstacion)))))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel12)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoEstacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(campoResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoRegFedCausante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(campoMarcaGasolina, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(campoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoEstado)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoCoordenadasUTM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNumeroCRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(campoTotalMagna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(campoTotalPremium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTotalDiesel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEstatusManguera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonGuardar)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoRegFedCausanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRegFedCausanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoRegFedCausanteActionPerformed

    private void campoCoordenadasUTMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCoordenadasUTMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCoordenadasUTMActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        // TODO add your handling code here:
        /* Se inica el guardado de datos del cliente
        Jose Luis Caamal Ic
        Since: 12/07/2020 */
        //Se recupera la información a guardar.
        String estacion = campoEstacion.getText();
        String idEstacion = estacion;//JLCI 19/07/2020
        Date obtenFecha = new Date();
        String fechaRegistro = ltc.convertirFecha(obtenFecha);
        String nombreResponsable = campoResponsable.getText();
        String razonSocial = campoRazonSocial.getText();
        String registroFedCausante = campoRegFedCausante.getText();
        String domicilio = campoDomicilio.getText();
        String colonia = campoColonia.getText();
        String ciudad = campoCiudad.getText();
        String estado = (String) campoEstado.getSelectedItem();
        String telefono = campoTelefono.getText();
        String correoElectronico = campoEmail.getText();
        String coordenadasUTM = campoCoordenadasUTM.getText();
        String codigoPostal = campoCodigoPostal.getText();
        String numeroCRE = campoNumeroCRE.getText();
        String marcaGasolina = (String) campoMarcaGasolina.getSelectedItem();
        int totalGasMagna = Integer.valueOf(campoTotalMagna.getText());
        int totalGasDiesel = Integer.valueOf(campoTotalDiesel.getText());
        int totalGasPremium = Integer.valueOf(campoTotalPremium.getText());
        String estatusManguera  = (String) campoEstatusManguera.getSelectedItem();
        
        //abro conexión
        lbd.openConnection();
        //Se crea el modificador en el controlador
        lbd.modificarEstaciones(idEstacion, fechaRegistro,
            nombreResponsable,
            razonSocial,
            registroFedCausante,
            domicilio,
            colonia,
            ciudad,
            estado,
            telefono,
            correoElectronico,
            coordenadasUTM,
            codigoPostal,
            numeroCRE,
            marcaGasolina,
            totalGasMagna,
            totalGasDiesel,
            totalGasPremium,
            estatusManguera);
        lbd.closeConnection();
        this.dispose();
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void campoEstacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoEstacionKeyTyped
  //Saul Arenas Ramirez 17/07/2020
        if(false){

JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");}        }//GEN-LAST:event_campoEstacionKeyTyped

    private void campoResponsableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoResponsableKeyTyped
  //Saul Arenas Ramirez 17/07/2020
        char sololetra=evt.getKeyChar();
if (Character.isDigit(sololetra)){
getToolkit().beep();
evt.consume();
    JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras");  
}      // TODO add your handling code here:
    }//GEN-LAST:event_campoResponsableKeyTyped

    private void campoTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTelefonoKeyTyped
  //Saul Arenas Ramirez 17/07/2020
   char solonumeros=evt.getKeyChar();
if(Character.isLetter(solonumeros)){
getToolkit().beep();
evt.consume();
JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");}        
    }//GEN-LAST:event_campoTelefonoKeyTyped

    private void campoCodigoPostalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCodigoPostalKeyTyped
  //Saul Arenas Ramirez 17/07/2020
        char solonumeros=evt.getKeyChar();
if(Character.isLetter(solonumeros)){
getToolkit().beep();
evt.consume();
JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");}                // TODO add your handling code here:
    }//GEN-LAST:event_campoCodigoPostalKeyTyped

    private void campoTotalMagnaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTotalMagnaKeyTyped
 //Saul Arenas Ramirez 17/07/2020
        char solonumeros=evt.getKeyChar();
if(Character.isLetter(solonumeros)){
getToolkit().beep();
evt.consume();
JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");}    }//GEN-LAST:event_campoTotalMagnaKeyTyped

    private void campoTotalPremiumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTotalPremiumKeyTyped
 //Saul Arenas Ramirez 17/07/2020
        char solonumeros=evt.getKeyChar();
if(Character.isLetter(solonumeros)){
getToolkit().beep();
evt.consume();
JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");}    }//GEN-LAST:event_campoTotalPremiumKeyTyped

    private void campoTotalDieselKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTotalDieselKeyTyped
 //Saul Arenas Ramirez 17/07/2020
        char solonumeros=evt.getKeyChar();
        if(Character.isLetter(solonumeros)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");} 
    }//GEN-LAST:event_campoTotalDieselKeyTyped

    private void campoEstacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoEstacionKeyPressed
        // TODO add your handling code here:
                if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
                // something like...
               //mTextField.getText();
               // or...
               //mButton.doClick();
               //Aquí va la consulta :(
               String obtenerNCRE = campoEstacion.getText();
               Object [] arrObjetos = null;
               int validaEstacion = 0;
               lbd.openConnection();
               validaEstacion = lbd.obtenerEstaciones(obtenerNCRE);
               System.out.println("campoEstacionKeyPressed: "+validaEstacion);
               lbd.closeConnection();
               
               if(validaEstacion !=0){
                 lbd.openConnection();
                 arrObjetos = lbd.obtenerArrEstaciones(obtenerNCRE);
//                   for (Object arrObjeto : arrObjetos) {
//                       System.out.println(arrObjeto);
//                   }
                 campoResponsable.setText((String) arrObjetos[2]);
                 campoRazonSocial.setText((String) arrObjetos[3]);
                 campoRegFedCausante.setText((String) arrObjetos[4]);
                 campoDomicilio.setText((String) arrObjetos[5]);
                 campoColonia.setText((String) arrObjetos[6]);
                 campoCiudad.setText((String) arrObjetos[7]);
                 campoEstado.setSelectedItem(arrObjetos[8]);
                 campoTelefono.setText((String)arrObjetos[9]);
                 campoEmail.setText((String)arrObjetos[10]);
                 campoCoordenadasUTM.setText((String)arrObjetos[11]);
                 campoCodigoPostal.setText((String)arrObjetos[12]);
                 campoNumeroCRE.setText((String)arrObjetos[13]);
                 campoMarcaGasolina.setSelectedItem(arrObjetos[14]);
                 int tm = (int) arrObjetos[15];
                 campoTotalMagna.setText(String.valueOf(tm));
                 int tp = (int) arrObjetos[16];
                 campoTotalPremium.setText(String.valueOf(tp));
                 int td = (int) arrObjetos[17];
                 campoTotalDiesel.setText(String.valueOf(td));
                 campoEstatusManguera.setSelectedItem(arrObjetos[18]);
                 
               }
               else{
                   JOptionPane.showMessageDialog(null,"No existe la estación, verifique en el catalogo por favor.");
                   lbd.closeConnection();
               }
               lbd.closeConnection();
            } 
    }//GEN-LAST:event_campoEstacionKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField campoCiudad;
    private javax.swing.JTextField campoCodigoPostal;
    private javax.swing.JTextField campoColonia;
    private javax.swing.JTextField campoCoordenadasUTM;
    private javax.swing.JTextField campoDomicilio;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEstacion;
    private javax.swing.JComboBox<String> campoEstado;
    private javax.swing.JComboBox<String> campoEstatusManguera;
    private javax.swing.JComboBox<String> campoMarcaGasolina;
    private javax.swing.JTextField campoNumeroCRE;
    private javax.swing.JTextField campoRazonSocial;
    private javax.swing.JTextField campoRegFedCausante;
    private javax.swing.JTextField campoResponsable;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JTextField campoTotalDiesel;
    private javax.swing.JTextField campoTotalMagna;
    private javax.swing.JTextField campoTotalPremium;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
