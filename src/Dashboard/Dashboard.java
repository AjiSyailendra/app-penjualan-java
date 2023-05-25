/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboard;

import Login.Login;
import Laporan.LaporanPenjualan;
import Penjualan.DataPenjualan;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Dashboard extends javax.swing.JFrame {

    public GlobalVariable.UserLoginVariable userLoginData = new GlobalVariable.UserLoginVariable();

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
    }

    public void checkLevel() {
        switch (userLoginData.level) {
            case "Admin":
                btnUser.setEnabled(false);
                laporan.setEnabled(false);
                break;
            case "User":
                laporan.setEnabled(false);
                film.setEnabled(false);
                btnUser.setEnabled(false);
                stok.setEnabled(false);
                break;
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
        lblWelcome = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        users = new javax.swing.JButton();
        pelanggan = new javax.swing.JButton();
        film = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnUser = new javax.swing.JButton();
        stok = new javax.swing.JButton();
        laporan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        lblWelcome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setText("Selamat Datang, ");

        btnLogout.setBackground(new java.awt.Color(255, 0, 0));
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 710, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWelcome)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 70));

        users.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        users.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/transaction.png"))); // NOI18N
        users.setText("Penjualan");
        users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersActionPerformed(evt);
            }
        });
        getContentPane().add(users, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 200, 110));

        pelanggan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pelanggan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/customer.png"))); // NOI18N
        pelanggan.setText("Pelanggan");
        pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pelangganActionPerformed(evt);
            }
        });
        getContentPane().add(pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 200, 110));

        film.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        film.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/movie.png"))); // NOI18N
        film.setText("Data Film");
        film.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filmActionPerformed(evt);
            }
        });
        getContentPane().add(film, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 200, 110));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Menu Dashboard");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        btnUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/user.png"))); // NOI18N
        btnUser.setText("Data Users");
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 200, 110));

        stok.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        stok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/stock.png"))); // NOI18N
        stok.setText("Stok Tiket");
        stok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stokActionPerformed(evt);
            }
        });
        getContentPane().add(stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 200, 110));

        laporan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/report.png"))); // NOI18N
        laporan.setText("Laporan");
        laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanActionPerformed(evt);
            }
        });
        getContentPane().add(laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 200, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/bg-dashboard.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersActionPerformed
        // TODO add your handling code here:
        DataPenjualan z = new DataPenjualan();
        z.setVisible(true);
    }//GEN-LAST:event_usersActionPerformed

    private void filmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filmActionPerformed
        // TODO add your handling code here:
        Film.DataFilm z = new Film.DataFilm();
        z.setVisible(true);
    }//GEN-LAST:event_filmActionPerformed

    private void pelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pelangganActionPerformed
        // TODO add your handling code here:
        Pelanggan.DataPelanggan z = new Pelanggan.DataPelanggan();
        z.setVisible(true);
    }//GEN-LAST:event_pelangganActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        // TODO add your handling code here:
        Users.DataUsers z = new Users.DataUsers();
        z.setVisible(true);
    }//GEN-LAST:event_btnUserActionPerformed

    private void stokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokActionPerformed
        // TODO add your handling code here:
        Stok.DataStok z = new Stok.DataStok();
        z.setVisible(true);
    }//GEN-LAST:event_stokActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        lblWelcome.setText("Selamat Datang, " + userLoginData.nama);
        checkLevel();
    }//GEN-LAST:event_formWindowOpened

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(rootPane, "Yakin Logout?");
        if (confirm == JOptionPane.YES_OPTION) {
            dispose();
            userLoginData.nama = "";
            userLoginData.username = "";
            userLoginData.password = "";
            userLoginData.level = "";
            Login z = new Login();
            z.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "batal logout!");
        }

    }//GEN-LAST:event_btnLogoutActionPerformed

    private void laporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanActionPerformed
        // TODO add your handling code here:
        LaporanPenjualan z = new LaporanPenjualan();
        
        z.setVisible(true);
    }//GEN-LAST:event_laporanActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUser;
    private javax.swing.JButton film;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton laporan;
    public javax.swing.JLabel lblWelcome;
    private javax.swing.JButton pelanggan;
    private javax.swing.JButton stok;
    private javax.swing.JButton users;
    // End of variables declaration//GEN-END:variables
}
