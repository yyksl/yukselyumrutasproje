package view;

import controller.EkleDialogYonetici;
import controller.GuncelleDialogYonetici;
import controller.ObsYonetici;
import model.Ogrenci;

public class HibernateFrame extends javax.swing.JFrame {
    public ObsYonetici oy;
    public Ogrenci ogrenci = new Ogrenci();
    EkleDialogYonetici ekleDialogYonetici;
    GuncelleDialogYonetici guncelleDialogYonetici;
    
    public HibernateFrame() {
        initComponents();
        oy = new ObsYonetici(obs);
        oy.ac();
        ekleDialogYonetici =new EkleDialogYonetici(ogrenci, ekleDialog);
        guncelleDialogYonetici =new GuncelleDialogYonetici(ogrenci, guncelleDialog);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ekleDialog = new javax.swing.JDialog();
        ekleDialogButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        ogrenciNoTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        adSoyadTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sehirTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        telTextField = new javax.swing.JTextField();
        guncelleDialog = new javax.swing.JDialog();
        guncelleDialogButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ogrenciNoTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        adSoyadTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sehirTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        telTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ogrenciNoTextField = new javax.swing.JTextField();
        adSoyadTextField = new javax.swing.JTextField();
        bulButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        obs = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        listeleButton = new javax.swing.JButton();
        ekleButton = new javax.swing.JButton();
        silButton = new javax.swing.JButton();
        guncelleButton = new javax.swing.JButton();

        ekleDialog.setTitle("Kayıt Bilgileri");
        ekleDialog.setMinimumSize(new java.awt.Dimension(369, 187));

        ekleDialogButton.setText("Ekle");
        ekleDialogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleDialogButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Ögrenci No:");

        ogrenciNoTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrenciNoTextField1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Ad Soyad:");

        jLabel3.setText("Şehir:");

        jLabel6.setText("Telefon No:");

        javax.swing.GroupLayout ekleDialogLayout = new javax.swing.GroupLayout(ekleDialog.getContentPane());
        ekleDialog.getContentPane().setLayout(ekleDialogLayout);
        ekleDialogLayout.setHorizontalGroup(
            ekleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ekleDialogLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(ekleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ekleDialogLayout.createSequentialGroup()
                        .addGroup(ekleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ekleDialogLayout.createSequentialGroup()
                        .addGroup(ekleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)))
                .addGroup(ekleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sehirTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adSoyadTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ogrenciNoTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ekleDialogLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(ekleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ekleDialogButton))))
                .addGap(40, 40, 40))
        );
        ekleDialogLayout.setVerticalGroup(
            ekleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ekleDialogLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(ekleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ogrenciNoTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(ekleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adSoyadTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ekleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sehirTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ekleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(telTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(ekleDialogButton)
                .addGap(10, 10, 10))
        );

        guncelleDialog.setTitle("Kayıt Bilgileri");
        guncelleDialog.setMinimumSize(new java.awt.Dimension(369, 187));

        guncelleDialogButton.setText("Güncelle");
        guncelleDialogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleDialogButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("Ögrenci No:");

        ogrenciNoTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrenciNoTextField2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Ad Soyad:");

        jLabel4.setText("Şehir:");

        jLabel10.setText("Telefon No:");

        javax.swing.GroupLayout guncelleDialogLayout = new javax.swing.GroupLayout(guncelleDialog.getContentPane());
        guncelleDialog.getContentPane().setLayout(guncelleDialogLayout);
        guncelleDialogLayout.setHorizontalGroup(
            guncelleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guncelleDialogLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(guncelleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(guncelleDialogLayout.createSequentialGroup()
                        .addGroup(guncelleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(guncelleDialogLayout.createSequentialGroup()
                        .addGroup(guncelleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)))
                .addGroup(guncelleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(guncelleDialogLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(guncelleDialogButton))
                    .addGroup(guncelleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sehirTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(adSoyadTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ogrenciNoTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(telTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        guncelleDialogLayout.setVerticalGroup(
            guncelleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guncelleDialogLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(guncelleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ogrenciNoTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(guncelleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adSoyadTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(guncelleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sehirTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(guncelleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(telTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guncelleDialogButton)
                .addGap(10, 10, 10))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Öğrenci No:");

        jLabel2.setText("Ad Soyad:");

        ogrenciNoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrenciNoTextFieldActionPerformed(evt);
            }
        });

        bulButton.setText("Bul");
        bulButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bulButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(ogrenciNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adSoyadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bulButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(ogrenciNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adSoyadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bulButton))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        obs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(obs);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        listeleButton.setText("Listele");
        listeleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listeleButtonActionPerformed(evt);
            }
        });

        ekleButton.setText("Ekle");
        ekleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleButtonActionPerformed(evt);
            }
        });

        silButton.setText("Sil");
        silButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silButtonActionPerformed(evt);
            }
        });

        guncelleButton.setText("Güncelle");
        guncelleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listeleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(ekleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(silButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(guncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listeleButton)
                    .addComponent(ekleButton)
                    .addComponent(silButton)
                    .addComponent(guncelleButton))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ogrenciNoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrenciNoTextFieldActionPerformed
    }//GEN-LAST:event_ogrenciNoTextFieldActionPerformed

    private void bulButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bulButtonActionPerformed
          if (!ogrenciNoTextField.getText().trim().equals("")) {
            oy.ogrenciGetir(ogrenciNoTextField.getText(), "ogrenciNo");
        } else if (!adSoyadTextField.getText().trim().equals("")) {
            oy.ogrenciGetir(adSoyadTextField.getText(), "adSoyad");
        }
    }//GEN-LAST:event_bulButtonActionPerformed

    private void listeleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listeleButtonActionPerformed
        oy.ogrenciListele();
    }//GEN-LAST:event_listeleButtonActionPerformed

        
    private void ekleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleButtonActionPerformed
        
        System.out.println("yuksel");
        ekleDialogYonetici.dialogGoster();
        //System.out.println("YUKSEL");
    }//GEN-LAST:event_ekleButtonActionPerformed

    private void guncelleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleButtonActionPerformed
        guncelleDialogYonetici.dialogGoster();
    }//GEN-LAST:event_guncelleButtonActionPerformed

    private void silButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silButtonActionPerformed
        int selectedRowIndex = obs.getSelectedRow();
        int id =  (int) obs.getValueAt(selectedRowIndex, 0); 
        System.out.println(id);
        oy.ogrenciSil(id);
    }//GEN-LAST:event_silButtonActionPerformed

    private void ekleDialogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleDialogButtonActionPerformed
        ekleDialogYonetici.ogrenciAyarla(ogrenciNoTextField1.getText(), adSoyadTextField1.getText(), sehirTextField.getText(), telTextField.getText());
        oy.ogrenciEkle(ogrenci);
        ekleDialogYonetici.dialogKapat();
    }//GEN-LAST:event_ekleDialogButtonActionPerformed

    private void ogrenciNoTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrenciNoTextField1ActionPerformed
    }//GEN-LAST:event_ogrenciNoTextField1ActionPerformed

    private void guncelleDialogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleDialogButtonActionPerformed
        int id = (int) obs.getValueAt(obs.getSelectedRow(), 0);
        guncelleDialogYonetici.ogrenciAyarla(ogrenciNoTextField2.getText(), adSoyadTextField2.getText(), sehirTextField1.getText(), telTextField1.getText());
        
        oy.ogrenciGuncelle(id, ogrenci);
        guncelleDialogYonetici.dialogKapat();        
    }//GEN-LAST:event_guncelleDialogButtonActionPerformed

    private void ogrenciNoTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrenciNoTextField2ActionPerformed
    }//GEN-LAST:event_ogrenciNoTextField2ActionPerformed

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HibernateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HibernateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HibernateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HibernateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HibernateFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adSoyadTextField;
    private javax.swing.JTextField adSoyadTextField1;
    private javax.swing.JTextField adSoyadTextField2;
    private javax.swing.JButton bulButton;
    private javax.swing.JButton ekleButton;
    private javax.swing.JDialog ekleDialog;
    private javax.swing.JButton ekleDialogButton;
    private javax.swing.JButton guncelleButton;
    private javax.swing.JDialog guncelleDialog;
    private javax.swing.JButton guncelleDialogButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton listeleButton;
    private javax.swing.JTable obs;
    private javax.swing.JTextField ogrenciNoTextField;
    private javax.swing.JTextField ogrenciNoTextField1;
    private javax.swing.JTextField ogrenciNoTextField2;
    private javax.swing.JTextField sehirTextField;
    private javax.swing.JTextField sehirTextField1;
    private javax.swing.JButton silButton;
    private javax.swing.JTextField telTextField;
    private javax.swing.JTextField telTextField1;
    // End of variables declaration//GEN-END:variables
}
