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
 * @author dsernae
 */
public class GestionarDonacionMaterial extends javax.swing.JFrame {

    static Connection conn = null;

    /**
     * Creates new form GestionarDonacionMaterial
     */
    public GestionarDonacionMaterial() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("--PRIMAVERA--GESTIONAR DONACIONES MATERIALES--");
        crearButton.setEnabled(false);
        modificarButton.setEnabled(false);
        try {
            conn = Primavera.Enlace(conn);
            String sqlinsertar = "select nombre_patr from patrocinador";
            PreparedStatement psta = conn.prepareStatement(sqlinsertar);
            ResultSet rs = psta.executeQuery();
            while (rs.next()) {
                patrocinadorCb.addItem(rs.getString(1));
            }
            sqlinsertar = "select nombre_subs from subsistema";
            psta = conn.prepareStatement(sqlinsertar);
            rs = psta.executeQuery();
            while (rs.next()) {
                subsistemaCb.addItem(rs.getString(1));
            }
            sqlinsertar = "select nombre_material from material";
            psta = conn.prepareStatement(sqlinsertar);
            rs = psta.executeQuery();
            while (rs.next()) {
                materialCb.addItem(rs.getString(1));
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        modificarButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        crearButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cantidadText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        diaText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        mesText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        anoText = new javax.swing.JTextField();
        patrocinadorCb = new javax.swing.JComboBox();
        materialCb = new javax.swing.JComboBox();
        subsistemaCb = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo50.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GestionarDonMaterial.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("ID");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Subsistema");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Patrocinador");

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

        modificarButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        modificarButton.setText("Modificar");
        modificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarButtonActionPerformed(evt);
            }
        });

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

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Cantidad");

        cantidadText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadTextActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Material");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Fecha:");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("DD");

        diaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaTextActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("MM");

        mesText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesTextActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("AA");

        anoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anoTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(crearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(modificarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diaText, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mesText, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(anoText, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cantidadText, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(idText)
                                        .addComponent(patrocinadorCb, 0, 289, Short.MAX_VALUE)
                                        .addComponent(materialCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(subsistemaCb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(patrocinadorCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subsistemaCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(materialCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cantidadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(diaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificarButton)
                    .addComponent(jButton2)
                    .addComponent(crearButton))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextActionPerformed

    private void modificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarButtonActionPerformed
        Primavera.update("donacion_material", "cantidad_mat", cantidadText.getText(), "id_donmaterial", idText.getText());
        Primavera.update("donacion_material", "id_patrocinador", patrocinadorCb.getSelectedItem().toString(), "id_donmaterial", idText.getText());
        Primavera.update("donacion_material", "id_subsistema", subsistemaCb.getSelectedItem().toString(), "id_donmaterial", idText.getText());
        Primavera.update("donacion_material", "id_material", materialCb.getSelectedItem().toString(), "id_donmaterial", idText.getText());
        Primavera.update("donacion_material", "fecha_donmat", diaText.getText() + "/" + mesText.getText() + "/" + anoText.getText(), "id_donmaterial", idText.getText());
        JOptionPane.showMessageDialog(null, "Modificacion guardada satisfactoriamente");
    }//GEN-LAST:event_modificarButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MenuPrincipal vent = new MenuPrincipal();
        vent.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void crearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearButtonActionPerformed
        if (idText.getText().equals("")
                | cantidadText.getText().equals("")
                | diaText.getText().equals("")
                | mesText.getText().equals("")
                | anoText.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor completa todas las casillas");
        } else {
            try {
                conn = Primavera.Enlace(conn);
                String sqlinsertar = "insert into Donacion_Material values (?,?,?,?,to_date(?,'DD/MM/RR'),?)";
                PreparedStatement psta = conn.prepareStatement(sqlinsertar);
                psta.setString(1, idText.getText());
                String patr = Primavera.getId("id_patrocinador", "nombre_patr", "patrocinador", patrocinadorCb.getSelectedItem().toString());
                psta.setString(2, patr);
                String subs = Primavera.getId("id_subsistema", "nombre_subs", "subsistema", subsistemaCb.getSelectedItem().toString());
                psta.setString(3, subs);
                String mat = Primavera.getId("id_material", "nombre_material", "material", materialCb.getSelectedItem().toString());
                psta.setString(6, mat);
                String date = diaText.getText() + "/" + mesText.getText() + "/" + anoText.getText();
                psta.setString(5, date);
                psta.setString(4, cantidadText.getText());
                psta.execute();
                psta.close();
                idText.setText("");
                patrocinadorCb.setSelectedItem(0);
                subsistemaCb.setSelectedItem(0);
                materialCb.setSelectedItem(0);
                cantidadText.setText("");
                diaText.setText("");
                mesText.setText("");
                anoText.setText("");
                JOptionPane.showMessageDialog(null, "Registro Guardado Satisfactoriamente");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_crearButtonActionPerformed

    private void cantidadTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadTextActionPerformed

    private void diaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaTextActionPerformed

    private void mesTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesTextActionPerformed

    private void anoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anoTextActionPerformed

    private void idTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idTextFocusLost
        if (idText.getText().equals("")) {
            idText.requestFocusInWindow();
        } else {
            try {
                conn = Primavera.Enlace(conn);
                String consulta = "select patrocinador.nombre_patr, subsistema.nombre_subs, material.nombre_material, donacion_material.cantidad_mat, donacion_material.fecha_donmat \n"
                        + "                        from PATROCINADOR, SUBSISTEMA, MATERIAL, DONACION_MATERIAL \n"
                        + "                        where DONACION_MATERIAL.ID_PATROCINADOR = PATROCINADOR.ID_PATROCINADOR \n"
                        + "                        AND DONACION_MATERIAL.ID_SUBSISTEMA = SUBSISTEMA.ID_SUBSISTEMA \n"
                        + "                        AND DONACION_MATERIAL.ID_MATERIAL = MATERIAL.ID_MATERIAL\n"
                        + "                        AND DONACION_MATERIAL.ID_DONMATERIAL = ? ";
                String sqlinsertar = consulta;
                PreparedStatement psta = conn.prepareStatement(sqlinsertar);
                psta.setString(1, idText.getText());
                ResultSet result = psta.executeQuery();

                if (result != null && result.next()) {
                    patrocinadorCb.setSelectedItem(result.getString(1));
                    subsistemaCb.setSelectedItem(result.getString(2));
                    materialCb.setSelectedItem(result.getString(3));
                    cantidadText.setText(result.getString(4));
                    String dia = result.getString(5).substring(8, 10);
                    diaText.setText(dia);
                    String mes = result.getString(5).substring(5, 7);
                    mesText.setText(mes);
                    String ano = result.getString(5).substring(2, 4);
                    anoText.setText(ano);
                    idText.setBackground(Color.LIGHT_GRAY);
                    modificarButton.setEnabled(true);
                    crearButton.setEnabled(false);
                } else {
                    patrocinadorCb.setSelectedItem(0);
                    subsistemaCb.setSelectedItem(0);
                    materialCb.setSelectedItem(0);
                    cantidadText.setText("");
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

    private void idTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idTextFocusGained
        idText.setBackground(Color.WHITE);
    }//GEN-LAST:event_idTextFocusGained

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
            java.util.logging.Logger.getLogger(GestionarDonacionMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarDonacionMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarDonacionMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarDonacionMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarDonacionMaterial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anoText;
    private javax.swing.JTextField cantidadText;
    private javax.swing.JButton crearButton;
    private javax.swing.JTextField diaText;
    private javax.swing.JTextField idText;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox materialCb;
    private javax.swing.JTextField mesText;
    private javax.swing.JButton modificarButton;
    private javax.swing.JComboBox patrocinadorCb;
    private javax.swing.JComboBox subsistemaCb;
    // End of variables declaration//GEN-END:variables
}
