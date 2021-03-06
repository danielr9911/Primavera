/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphic;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import primavera.Primavera;

/**
 *
 * @author Daniel
 */
public class GestionarPersonal extends javax.swing.JFrame {

    static Connection conn = null;

    /**
     * Creates new form GestionarPersonal
     */
    public GestionarPersonal() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("--PRIMAVERA--GESTIONAR PERSONAL--");
        crearButton.setEnabled(false);
        modificarButton.setEnabled(false);
        estadoCb.addItem("ACTIVO");
        estadoCb.addItem("INACTIVO");

        try {
            conn = Primavera.Enlace(conn);
            String sqlinsertar = "select nomb_tipopersona from tipo_persona";
            PreparedStatement psta = conn.prepareStatement(sqlinsertar);
            ResultSet rs = psta.executeQuery();
            while (rs.next()) {
                tipoCb.addItem(rs.getString(1));
            }
            sqlinsertar = "select gs from tipo_sangre";
            psta = conn.prepareStatement(sqlinsertar);
            rs = psta.executeQuery();
            while (rs.next()) {
                gsCb.addItem(rs.getString(1));
            }
            sqlinsertar = "select nombre_eps from eps";
            psta = conn.prepareStatement(sqlinsertar);
            rs = psta.executeQuery();
            while (rs.next()) {
                epsCb.addItem(rs.getString(1));
            }
            sqlinsertar = "select rh from tipo_sangre";
            psta = conn.prepareStatement(sqlinsertar);
            rs = psta.executeQuery();
            while (rs.next()) {
                rhCb.addItem(rs.getString(1));
            }
            sqlinsertar = "select nombre_profesion from profesion";
            psta = conn.prepareStatement(sqlinsertar);
            rs = psta.executeQuery();
            while (rs.next()) {
                profesionCb.addItem(rs.getString(1));
            }
            sqlinsertar = "select nombre_subs from subsistema";
            psta = conn.prepareStatement(sqlinsertar);
            rs = psta.executeQuery();
            while (rs.next()) {
                subsistemaCb.addItem(rs.getString(1));
            }
            estadoCb.addItem("ACTIVO");
            estadoCb.addItem("INACTIVO");
            //System.out.println(Primavera.getId("id_patrocinador", "nombre_patr","PATROCINADOR","ADDICT"));
        } catch (Exception e) {
            System.out.println(e);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        crearButton = new javax.swing.JButton();
        modificarButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        nombreText = new javax.swing.JTextField();
        telefonoText = new javax.swing.JTextField();
        correoText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        salarioText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tipoCb = new javax.swing.JComboBox<>();
        epsCb = new javax.swing.JComboBox<>();
        profesionCb = new javax.swing.JComboBox<>();
        subsistemaCb = new javax.swing.JComboBox<>();
        estadoCb = new javax.swing.JComboBox<>();
        rhCb = new javax.swing.JComboBox<>();
        gsCb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo50.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GestionarPersonal.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Identificacion");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Telefono");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Nombre");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Correo");

        jButton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        crearButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        crearButton.setText("Crear");
        crearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearButtonActionPerformed(evt);
            }
        });

        modificarButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        modificarButton.setText("Modificar");
        modificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Tipo");

        idText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idTextFocusLost(evt);
            }
        });
        idText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Profesión");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Estado");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("Subsistema");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setText("EPS");

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setText("Salario (COP)");

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel15.setText("RH");

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel16.setText("GS");

        tipoCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoCbActionPerformed(evt);
            }
        });

        epsCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epsCbActionPerformed(evt);
            }
        });

        profesionCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profesionCbActionPerformed(evt);
            }
        });

        subsistemaCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subsistemaCbActionPerformed(evt);
            }
        });

        estadoCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoCbActionPerformed(evt);
            }
        });

        rhCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rhCbActionPerformed(evt);
            }
        });

        gsCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gsCbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(gsCb, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(idText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                        .addComponent(nombreText, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(telefonoText, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(correoText, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addGap(18, 18, 18)
                            .addComponent(rhCb, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tipoCb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salarioText)
                    .addComponent(profesionCb, javax.swing.GroupLayout.Alignment.TRAILING, 0, 188, Short.MAX_VALUE)
                    .addComponent(subsistemaCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(epsCb, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(estadoCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(crearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(modificarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(194, 194, 194))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel8)
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel7)
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addComponent(telefonoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addComponent(correoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel14)
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel13)
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11))
                                    .addComponent(tipoCb, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(gsCb, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rhCb, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(profesionCb, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salarioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(epsCb, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(subsistemaCb, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(estadoCb, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(crearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modificarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MenuPrincipal vent = new MenuPrincipal();
        vent.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void modificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarButtonActionPerformed
        Primavera.update("personal", "nombre_pers", nombreText.getText(), "identificacion", idText.getText());
        Primavera.update("personal", "telefono_pers", telefonoText.getText(), "identificacion", idText.getText());
        Primavera.update("personal", "correo_pers", correoText.getText(), "identificacion", idText.getText());
        Primavera.update("personal", "salario_pers", salarioText.getText(), "identificacion", idText.getText());
        Primavera.update("personal", "id_patrocinador", tipoCb.getSelectedItem().toString(), "identificacion", idText.getText());
        Primavera.update("personal", "id_carro", gsCb.getSelectedItem().toString(), "identificacion", idText.getText());
        Primavera.update("personal", "id_tipomoneda", rhCb.getSelectedItem().toString(), "identificacion", idText.getText());
        Primavera.update("personal", "id_tipomoneda", epsCb.getSelectedItem().toString(), "identificacion", idText.getText());
        Primavera.update("personal", "id_tipomoneda", subsistemaCb.getSelectedItem().toString(), "identificacion", idText.getText());
        Primavera.update("personal", "id_tipomoneda", estadoCb.getSelectedItem().toString(), "identificacion", idText.getText());
        Primavera.update("personal", "id_tipomoneda", profesionCb.getSelectedItem().toString(), "identificacion", idText.getText());
        JOptionPane.showMessageDialog(null, "Modificacion guardada satisfactoriamente");

    }//GEN-LAST:event_modificarButtonActionPerformed

    private void idTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextActionPerformed

    private void tipoCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoCbActionPerformed

    private void epsCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_epsCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_epsCbActionPerformed

    private void profesionCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profesionCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profesionCbActionPerformed

    private void subsistemaCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subsistemaCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subsistemaCbActionPerformed

    private void estadoCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoCbActionPerformed

    private void rhCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rhCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rhCbActionPerformed

    private void gsCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gsCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gsCbActionPerformed

    private void crearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearButtonActionPerformed
        if (idText.getText().equals("") | nombreText.getText().equals("")
                | telefonoText.getText().equals("") | correoText.getText().equals("") | salarioText.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor completa todas las casillas");
        } else {
            try {
                conn = Primavera.Enlace(conn);
                String sqlinsertar = "insert into Personal values (?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement psta = conn.prepareStatement(sqlinsertar);
                psta.setString(1, idText.getText());
                String idSubs = Primavera.getId("id_subsistema", "nombre_subs", "subsistema", subsistemaCb.getSelectedItem().toString());
                psta.setString(2, idSubs);
                psta.setString(3, nombreText.getText());
                psta.setString(4, telefonoText.getText());
                psta.setString(5, correoText.getText());
                psta.setString(6, estadoCb.getSelectedItem().toString());
                psta.setString(7, salarioText.getText());
                String idProf = Primavera.getId("id_profesion", "nombre_profesion", "profesion", profesionCb.getSelectedItem().toString());
                psta.setString(8, idProf);
                String idEps = Primavera.getId("id_eps", "nombre_eps", "eps", epsCb.getSelectedItem().toString());
                psta.setString(9, idEps);
                String idPers = Primavera.getId("id_tipopersona", "nomb_tipopersona", "tipo_persona", tipoCb.getSelectedItem().toString());
                psta.setString(11, idPers);
                String consulta = "select id_sangre from tipo_sangre "
                        + "where GS = ? "
                        + "and RH = ?";
                conn = Primavera.Enlace(conn);
                String idSangre = "";
                PreparedStatement psta2 = conn.prepareStatement(consulta);
                psta2.setString(1, gsCb.getSelectedItem().toString());
                psta2.setString(2, rhCb.getSelectedItem().toString());
                ResultSet rs = psta2.executeQuery();
                if (rs.next()) {
                    idSangre = rs.getString(1);
                }
                psta.setString(10, idSangre);
                psta.execute();
                psta.close();
                idText.setText("");
                nombreText.setText("");
                telefonoText.setText("");
                correoText.setText("");
                salarioText.setText("");

                JOptionPane.showMessageDialog(null, "Registro Guardado Satisfactoriamente");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_crearButtonActionPerformed

    private void idTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idTextFocusGained
        idText.setBackground(Color.WHITE);
    }//GEN-LAST:event_idTextFocusGained

    private void idTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idTextFocusLost
        if (idText.getText().equals("")) {
            idText.requestFocusInWindow();
        } else {
            try {
                conn = Primavera.Enlace(conn);
                String consulta = "SELECT PERSONAL.NOMBRE_PERS, PERSONAL.TELEFONO_PERS, PERSONAL.CORREO_PERS, PERSONAL.CORREO_PERS, TIPO_PERSONA.NOMB_TIPOPERSONA, TIPO_SANGRE.GS, TIPO_SANGRE.RH, PROFESION.NOMBRE_PROFESION, PERSONAL.SALARIO_PERS, EPS.NOMBRE_EPS, SUBSISTEMA.NOMBRE_SUBS, PERSONAL.ESTADO_PERS "
                        + "  FROM PERSONAL, PROFESION, EPS, SUBSISTEMA, TIPO_PERSONA, TIPO_SANGRE "
                        + "  WHERE PERSONAL.ID_PROFESION = PROFESION.ID_PROFESION "
                        + "  AND PERSONAL.ID_EPS = EPS.ID_EPS "
                        + "  AND PERSONAL.ID_SUBSISTEMA = SUBSISTEMA.ID_SUBSISTEMA "
                        + "  AND PERSONAL.ID_TIPOPERSONA = TIPO_PERSONA.ID_TIPOPERSONA "
                        + "  AND PERSONAL.TIPO_SANGRE = TIPO_SANGRE.ID_SANGRE "
                        + "  AND PERSONAL.IDENTIFICACION = ? ";
                String sqlinsertar = consulta;
                PreparedStatement psta = conn.prepareStatement(sqlinsertar);
                psta.setString(1, idText.getText());
                ResultSet result = psta.executeQuery();

                if (result != null && result.next()) {
                    nombreText.setText(result.getString(2));
                    telefonoText.setText(result.getString(3));
                    correoText.setText(result.getString(4));
                    tipoCb.setSelectedItem(result.getString(5));
                    gsCb.setSelectedItem(result.getString(6));
                    rhCb.setSelectedItem(result.getString(7));
                    profesionCb.setSelectedItem(result.getString(8));
                    salarioText.setText(result.getString(9));
                    epsCb.setSelectedItem(result.getString(10));
                    subsistemaCb.setSelectedItem(result.getString(11));
                    estadoCb.setSelectedItem(result.getString(12));
                    System.out.println();
                    idText.setBackground(Color.LIGHT_GRAY);
                    estadoCb.setEnabled(true);
                    modificarButton.setEnabled(true);
                    crearButton.setEnabled(false);
                } else {
                    nombreText.setText("");
                    telefonoText.setText("");
                    correoText.setText("");
                    tipoCb.setSelectedItem(0);
                    gsCb.setSelectedItem(0);
                    rhCb.setSelectedItem(0);
                    profesionCb.setSelectedItem(0);
                    salarioText.setText("");
                    epsCb.setSelectedItem(0);
                    subsistemaCb.setSelectedItem(0);
                    estadoCb.setSelectedItem(0);
                    estadoCb.setEnabled(false);
                    idText.setBackground(Color.WHITE);
                    modificarButton.setEnabled(false);
                    crearButton.setEnabled(true);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_idTextFocusLost

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
            java.util.logging.Logger.getLogger(GestionarPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarPersonal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField correoText;
    private javax.swing.JButton crearButton;
    private javax.swing.JComboBox<String> epsCb;
    private javax.swing.JComboBox<String> estadoCb;
    private javax.swing.JComboBox<String> gsCb;
    private javax.swing.JTextField idText;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modificarButton;
    private javax.swing.JTextField nombreText;
    private javax.swing.JComboBox<String> profesionCb;
    private javax.swing.JComboBox<String> rhCb;
    private javax.swing.JTextField salarioText;
    private javax.swing.JComboBox<String> subsistemaCb;
    private javax.swing.JTextField telefonoText;
    private javax.swing.JComboBox<String> tipoCb;
    // End of variables declaration//GEN-END:variables
}
