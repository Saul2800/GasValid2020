/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Solicitud;

import Controlador.LibreriaBDControlador;
import Controlador.LibreriaToolsControlador;
import java.text.SimpleDateFormat;

import java.text.DateFormat;
import java.util.Date;
import Modelo.modeloTablaUsuario;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Saul
 */
public class registroSolicitudContrato extends javax.swing.JDialog {
    LibreriaBDControlador lbd = new LibreriaBDControlador();
    modeloTablaUsuario mtu = new modeloTablaUsuario();
    public String Usuario;
    
    public registroSolicitudContrato(java.awt.Frame parent, boolean modal,modeloTablaUsuario mtu) {
                super(parent, modal);
        this.mtu = mtu;
     Usuario = mtu.getNombreCompleto();
             initComponents();             
    }



    /**
     * Creates new form registroSolicitud
     */
  /*  public registroSolicitudContrato(java.awt.Frame parent, boolean modal) {
       super(parent, modal);
        initComponents();
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        guardarRSC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        nombreSolicitanteRSC = new javax.swing.JTextField();
        razonSocialRSC = new javax.swing.JTextField();
        domicilioRSC = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        estacionRSC = new javax.swing.JTextField();
        regfedCausantesRSC = new javax.swing.JTextField();
        telefonoRSC = new javax.swing.JTextField();
        estadoRSC = new javax.swing.JTextField();
        emailRSC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        manguerasaVerificarRSC = new javax.swing.JTextField();
        magnaRSC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        premiumRSC = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        diselRSC = new javax.swing.JTextField();
        tiposolicitudRSC = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        tecnicoRSC = new javax.swing.JTextField();
        fechaRCS = new com.toedter.calendar.JDateChooser();
        folioSolicitudRSC = new javax.swing.JTextField();
        noEstacionRSC = new javax.swing.JTextField();
        fechaPropuestaRSC = new com.toedter.calendar.JDateChooser();
        referenciaSolicitudRSC = new javax.swing.JTextField();
        observacionesRSC = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(593, 712));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        guardarRSC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/save.png"))); // NOI18N
        guardarRSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarRSCActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel1.setText("Folio de solicitud");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel2.setText("Tipo de solicitud");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel3.setText("No. Estacion");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel4.setText("Fecha Propuesta");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel5.setText("Referencia de Solicitud");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel6.setText("Observaciones");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel11.setText("Nombre de solicitante");

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel12.setText("Razon social");

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel13.setText("Reg.Fed.Causantes");

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel14.setText("Domicilio");

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel15.setText("Telefono");

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel16.setText("Estado");

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel17.setText("Email");

        nombreSolicitanteRSC.setEditable(false);
        nombreSolicitanteRSC.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        razonSocialRSC.setEditable(false);
        razonSocialRSC.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        domicilioRSC.setEditable(false);
        domicilioRSC.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel19.setText("Estacion No.");

        estacionRSC.setEditable(false);
        estacionRSC.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        regfedCausantesRSC.setEditable(false);
        regfedCausantesRSC.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        telefonoRSC.setEditable(false);
        telefonoRSC.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        estadoRSC.setEditable(false);
        estadoRSC.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        emailRSC.setEditable(false);
        emailRSC.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel7.setText("Mangueras a verificar");

        manguerasaVerificarRSC.setEditable(false);

        magnaRSC.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel8.setText("Magna");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel9.setText("Premium");

        premiumRSC.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel10.setText("Disel");

        diselRSC.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(nombreSolicitanteRSC, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addComponent(razonSocialRSC, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(regfedCausantesRSC, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                    .addComponent(jLabel19)
                                    .addGap(18, 18, 18)
                                    .addComponent(estacionRSC, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(domicilioRSC, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                            .addComponent(telefonoRSC)
                            .addComponent(estadoRSC)
                            .addComponent(emailRSC))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(1, 1, 1)
                        .addComponent(manguerasaVerificarRSC, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(magnaRSC, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(premiumRSC, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diselRSC, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 36, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(magnaRSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diselRSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(premiumRSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manguerasaVerificarRSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(nombreSolicitanteRSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(razonSocialRSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel19)
                    .addComponent(regfedCausantesRSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estacionRSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(domicilioRSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(telefonoRSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(estadoRSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(emailRSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tiposolicitudRSC.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        tiposolicitudRSC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inicial", "Periodica", "Extraordinaria" }));

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel18.setText("Fecha");

        jLabel20.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel20.setText("Tecnico");

        tecnicoRSC.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        folioSolicitudRSC.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        noEstacionRSC.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        noEstacionRSC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                noEstacionRSCKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                noEstacionRSCKeyPressed(evt);
            }
        });

        referenciaSolicitudRSC.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        observacionesRSC.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 102, 0));
        jLabel21.setText("Registro Solicitud/Contrato");

        jLabel22.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel22.setText("Presione enter al terminar");

        jLabel23.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel23.setText("de ingresar el No.Estacion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tiposolicitudRSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(folioSolicitudRSC)))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(fechaRCS, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(guardarRSC, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel20))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tecnicoRSC, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(observacionesRSC, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(referenciaSolicitudRSC)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(fechaPropuestaRSC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(noEstacionRSC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23))
                                .addGap(0, 6, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guardarRSC)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(folioSolicitudRSC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tiposolicitudRSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(noEstacionRSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(fechaPropuestaRSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fechaRCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel23)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(referenciaSolicitudRSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(observacionesRSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(tecnicoRSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void noEstacionRSCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noEstacionRSCKeyPressed
Object  Datos[]=null;
if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
String idestacion=noEstacionRSC.getText();
 
int validaEstacion = 0;

       lbd.openConnection();
               validaEstacion = lbd.validaDispensario(idestacion);
               lbd.closeConnection();
               if(validaEstacion!=0 && !idestacion.equals("")){
                                  System.out.println("Si existe la estación, se procedera a consultar los datos.");
                                                     lbd.openConnection();
                                                     Datos=lbd.obtenerdatosparasolicitud(idestacion);
                                                     lbd.closeConnection();
                                                     
                                                     
                                                     magnaRSC.setText((String) String.valueOf(Datos[15]));
                                                     premiumRSC.setText((String)String.valueOf(Datos[16]));
                                                     diselRSC.setText((String)String.valueOf(Datos[17]));
                                                     
                                                     int magna=Integer.parseInt(magnaRSC.getText());
                                                     int premium=Integer.parseInt(premiumRSC.getText());
                                                     int disel=Integer.parseInt(diselRSC.getText());
                                                     
                                                     int total=magna+premium+disel;
                                                     
                                                     manguerasaVerificarRSC.setText((String)String.valueOf(total));
                                                     
                                                     nombreSolicitanteRSC.setText((String)Datos[2]);
                                                     razonSocialRSC.setText((String)Datos[3]);
                                                     regfedCausantesRSC.setText((String)Datos[4]);
                                                     estacionRSC.setText((String)String.valueOf(Datos[0]));
                                                     domicilioRSC.setText((String)Datos[5]);
                                                     telefonoRSC.setText((String)Datos[9]);
                                                     estadoRSC.setText((String)Datos[8]);
                                                     emailRSC.setText((String)Datos[10]);
                                                       
                                                     
                                                     
               }
 
}
        // TODO add your handling code here:
    }//GEN-LAST:event_noEstacionRSCKeyPressed

    private void guardarRSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarRSCActionPerformed
 String  Foliodesolicitud,Tipodesolicitud,Fecha2, NoEstacion,/*Usuario,*/FechaPropuesta2;
 String ReferenciadeSolicitud,Observaciones,Tecnico;
 String   total_mangueras;

 Foliodesolicitud=folioSolicitudRSC.getText();
 Tipodesolicitud=(String)tiposolicitudRSC.getSelectedItem();
 
        Date  fecha=fechaRCS.getDate();
          DateFormat f=new SimpleDateFormat("dd-MM-yyyy");
          Fecha2=f.format(fecha);
       
       Date FechaPropuesta=fechaPropuestaRSC.getDate();
       DateFormat F=new SimpleDateFormat("dd-MM-yyyy");
       FechaPropuesta2=F.format(FechaPropuesta);
       
       
 
 NoEstacion=noEstacionRSC.getText();
 //Usuario=solicitanteRSC.getText();
//Usuario=mtu.getNombreUsuario();
 
 
 ReferenciadeSolicitud=referenciaSolicitudRSC.getText();
    Observaciones=observacionesRSC.getText();
    Tecnico=tecnicoRSC.getText();
    
    total_mangueras=manguerasaVerificarRSC.getText();
    
    
    lbd.openConnection();
    
    lbd.subirDatosSolicitud(Foliodesolicitud, Usuario, Tecnico, Fecha2, FechaPropuesta2, Tipodesolicitud,NoEstacion,total_mangueras,ReferenciadeSolicitud,Observaciones);
    
    
    lbd.closeConnection();
 

    }//GEN-LAST:event_guardarRSCActionPerformed

    private void noEstacionRSCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noEstacionRSCKeyTyped
char solonumero=evt.getKeyChar();

//if(Character.isLetter(solonumero)){
//        getToolkit().beep();
//        evt.consume();
//        JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");}
    }//GEN-LAST:event_noEstacionRSCKeyTyped

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField diselRSC;
    private javax.swing.JTextField domicilioRSC;
    private javax.swing.JTextField emailRSC;
    private javax.swing.JTextField estacionRSC;
    private javax.swing.JTextField estadoRSC;
    private com.toedter.calendar.JDateChooser fechaPropuestaRSC;
    private com.toedter.calendar.JDateChooser fechaRCS;
    private javax.swing.JTextField folioSolicitudRSC;
    private javax.swing.JButton guardarRSC;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField magnaRSC;
    private javax.swing.JTextField manguerasaVerificarRSC;
    private javax.swing.JTextField noEstacionRSC;
    private javax.swing.JTextField nombreSolicitanteRSC;
    private javax.swing.JTextField observacionesRSC;
    private javax.swing.JTextField premiumRSC;
    private javax.swing.JTextField razonSocialRSC;
    private javax.swing.JTextField referenciaSolicitudRSC;
    private javax.swing.JTextField regfedCausantesRSC;
    private javax.swing.JTextField tecnicoRSC;
    private javax.swing.JTextField telefonoRSC;
    private javax.swing.JComboBox<String> tiposolicitudRSC;
    // End of variables declaration//GEN-END:variables
}
       // String  Foliodesolicitud,Tipodesolicitud,Fecha,NoEstacion,Solicitante,FechaPropuesta,ReferenciadeSolicitud,Observaciones,Tecnico;
