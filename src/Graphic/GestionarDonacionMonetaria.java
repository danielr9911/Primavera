/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphic;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import primavera.Primavera;

/**
 *
 * @author Daniel
 */
public class GestionarDonacionMonetaria extends javax.swing.JFrame {

    static Connection conn = null;

    /**
     * Creates new form GestionarDonacionMonetaria
     */
    public GestionarDonacionMonetaria() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("--PRIMAVERA--GESTIONAR DONACIONES MONETARIAS--");
        try {
            conn = Primavera.Enlace(conn);
            String sqlinsertar = "select nombre_patr from patrocinador";
            PreparedStatement psta = conn.prepareStatement(sqlinsertar);
            ResultSet rs = psta.executeQuery();
            while (rs.next()) {
                patrocinadorCb.addItem(rs.getString(1));
            }
            sqlinsertar = "select nombre_carro from carrosolar";
            psta = conn.prepareStatement(sqlinsertar);
            rs = psta.executeQuery();
            while (rs.next()) {
                carroCb.addItem(rs.getString(1));
            }
            sqlinsertar = "select nombre_tipomoneda from tipo_moneda";
            psta = conn.prepareStatement(sqlinsertar);
            rs = psta.executeQuery();
            while (rs.next()) {
                divisaCb.addItem(rs.getString(1));
            }
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

        jPanel6 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        cancelarButton = new javax.swing.JButton();
        crearButton = new javax.swing.JButton();
        modificarButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        tasaText = new javax.swing.JTextField();
        anoText = new javax.swing.JTextField();
        mesText = new javax.swing.JTextField();
        diaText = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cantidadCopText = new javax.swing.JTextField();
        cantidadText = new javax.swing.JTextField();
        patrocinadorCb = new javax.swing.JComboBox<>();
        divisaCb = new javax.swing.JComboBox<>();
        carroCb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo50.png"))); // NOI18N

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GestionarDonMonetaria.png"))); // NOI18N

        jLabel34.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel34.setText("ID");

        jLabel35.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel35.setText("Carro");

        jLabel36.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel36.setText("Patrocinador");

        jLabel37.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel37.setText("DD");

        cancelarButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonjButton2ActionPerformed(evt);
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
                modificarButtonjButton3ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Cantidad Original");

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
                idTextjTextField1ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel38.setText("Divisa original");

        jLabel39.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel39.setText("MM");

        jLabel40.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel40.setText("AA");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Tasa de cambio");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("Cantidad en COP");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setText("Fecha");

        patrocinadorCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patrocinadorCbActionPerformed(evt);
            }
        });

        carroCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carroCbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel36)
                            .addComponent(jLabel34)
                            .addComponent(jLabel38)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tasaText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadCopText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(divisaCb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(carroCb, javax.swing.GroupLayout.Alignment.TRAILING, 0, 208, Short.MAX_VALUE)
                                .addComponent(patrocinadorCb, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(idText, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(164, 164, 164)
                                        .addComponent(jLabel37)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(diaText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mesText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel40)
                                        .addGap(27, 27, 27)
                                        .addComponent(anoText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(crearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(modificarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel32)
                .addGap(2, 2, 2)
                .addComponent(jLabel33)
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel36))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(patrocinadorCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(carroCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(divisaCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cantidadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tasaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cantidadCopText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel37)
                    .addComponent(anoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarButton)
                    .addComponent(crearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modificarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarButtonjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonjButton2ActionPerformed
        MenuPrincipal vent = new MenuPrincipal();
        vent.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelarButtonjButton2ActionPerformed

    private void modificarButtonjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarButtonjButton3ActionPerformed
        Primavera.update("donacion_monetaria", "cantidad_mone_original", cantidadText.getText(), "id_monetaria", idText.getText());
        Primavera.update("donacion_monetaria", "tasa_cambio", tasaText.getText(), "id_monetaria", idText.getText());
        Primavera.update("donacion_monetaria", "cantidad_cop", cantidadCopText.getText(), "id_monetaria", idText.getText());
        Primavera.update("donacion_monetaria", "id_patrocinador", patrocinadorCb.getSelectedItem().toString(), "id_monetaria", idText.getText());
        Primavera.update("donacion_monetaria", "id_carro", carroCb.getSelectedItem().toString(), "id_monetaria", idText.getText());
        Primavera.update("donacion_monetaria", "id_tipomoneda", divisaCb.getSelectedItem().toString(), "id_monetaria", idText.getText());
        Primavera.update("donacion_monetaria", "fecha_mone", diaText.getText() + "/" + mesText.getText() + "/" + anoText.getText(), "id_monetaria", idText.getText());
        JOptionPane.showMessageDialog(null, "Modificacion guardada satisfactoriamente");
    }//GEN-LAST:event_modificarButtonjButton3ActionPerformed

    private void idTextjTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextjTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextjTextField1ActionPerformed

    private void patrocinadorCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patrocinadorCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patrocinadorCbActionPerformed

    private void carroCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carroCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carroCbActionPerformed

    private void crearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearButtonActionPerformed
        try {
            conn = Primavera.Enlace(conn);
            String sqlinsertar = "insert into DONACION_MONETARIA values (?,?,?,?,to_date(?,'DD/MM/RR'),?,?,?)";
            PreparedStatement psta = conn.prepareStatement(sqlinsertar);
            psta.setString(1, idText.getText());
            String patr = Primavera.getId("id_patrocinador", "nombre_patr", "patrocinador", patrocinadorCb.getSelectedItem().toString());
            psta.setString(2, patr);
            String car = Primavera.getId("id_carro", "nombre_carro", "carrosolar", carroCb.getSelectedItem().toString());
            psta.setString(3, car);
            String div = Primavera.getId("id_tipomoneda", "nombre_tipomoneda", "tipo_moneda", divisaCb.getSelectedItem().toString());
            psta.setString(6, div);
            psta.setString(4, cantidadText.getText());
            psta.setString(7, tasaText.getText());
            psta.setString(8, cantidadCopText.getText());
            //String date = "to_date('"+diaTxt.getText()+"/"+mesTxt.getText()+"/"+anoTxt.getText()+"','DD/MM/RR')";
            String date = diaText.getText() + "/" + mesText.getText() + "/" + anoText.getText();
            psta.setString(5, date);
            psta.execute();
            psta.close();
            idText.setText("");
            cantidadText.setText("");
            tasaText.setText("");
            cantidadCopText.setText("");
            diaText.setText("");
            mesText.setText("");
            anoText.setText("");
            JOptionPane.showMessageDialog(null, "Registro Guardado Satisfactoriamente");
        } catch (Exception e) {
            System.out.println(e);
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
                String consulta = "select patrocinador.nombre_patr, carrosolar.nombre_carro, tipo_moneda.nombre_tipomoneda, donacion_monetaria.cantidad_mone_original, donacion_monetaria.tasa_cambio, donacion_monetaria.cantidad_cop, donacion_monetaria.fecha_mone "
                        + "from PATROCINADOR, CARROSOLAR,TIPO_MONEDA, DONACION_MONETARIA "
                        + "where DONACION_MONETARIA.ID_PATROCINADOR = PATROCINADOR.ID_PATROCINADOR "
                        + "AND DONACION_MONETARIA.ID_CARRO = CARROSOLAR.ID_CARRO "
                        + "AND DONACION_MONETARIA.ID_TIPOMONEDA = TIPO_MONEDA.ID_TIPOMONEDA "
                        + "AND PATROCINADOR.ID_PATROCINADOR = ?";
                String sqlinsertar = consulta;
                PreparedStatement psta = conn.prepareStatement(sqlinsertar);
                psta.setString(1,idText.getText());
                ResultSet result = psta.executeQuery();
                
                if (result != null && result.next()) {
                    patrocinadorCb.setSelectedItem(result.getString(1));
                    carroCb.setSelectedItem(result.getString(2));
                    divisaCb.setSelectedItem(result.getString(3));
                    cantidadText.setText(result.getString(4));
                    tasaText.setText(result.getString(5));
                    cantidadCopText.setText(result.getString(6));
                    String dia = result.getString(7).substring(0, 2);
                    diaText.setText(dia);
                    String mes = result.getString(7).substring(3, 5);
                    mesText.setText(mes);
                    String ano = result.getString(7).substring(6);
                    anoText.setText(ano);
                    idText.setBackground(Color.LIGHT_GRAY);
                    modificarButton.setEnabled(true);
                    crearButton.setEnabled(false);
                } else {
                    patrocinadorCb.setSelectedItem(0);
                    carroCb.setSelectedItem(0);
                    divisaCb.setSelectedItem(0);
                    cantidadText.setText("");
                    tasaText.setText("");
                    cantidadCopText.setText("");
                    diaText.setText("");
                    mesText.setText("");
                    anoText.setText("");
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
            java.util.logging.Logger.getLogger(GestionarDonacionMonetaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarDonacionMonetaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarDonacionMonetaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarDonacionMonetaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarDonacionMonetaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anoText;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JTextField cantidadCopText;
    private javax.swing.JTextField cantidadText;
    private javax.swing.JComboBox<String> carroCb;
    private javax.swing.JButton crearButton;
    private javax.swing.JTextField diaText;
    private javax.swing.JComboBox<String> divisaCb;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField mesText;
    private javax.swing.JButton modificarButton;
    private javax.swing.JComboBox<String> patrocinadorCb;
    private javax.swing.JTextField tasaText;
    // End of variables declaration//GEN-END:variables
}
