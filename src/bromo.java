
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author sheny
 */
public class bromo extends javax.swing.JFrame {

    /**
     * Creates new form bromo
     */
    private tb_login login = new tb_login();
    public bromo() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        blogin = new javax.swing.JButton();
        jpassword = new javax.swing.JPasswordField();
        bexit = new javax.swing.JButton();
        jtuser = new javax.swing.JTextField();
        jcshowpswrd = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jLabel1.setText("WELLCOME TO BROMO TOUR BOOKING");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(65, 34, 381, 22);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Username :");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("Password :");

        jCheckBox1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jCheckBox1.setText("centang jika semua telah di isi");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        blogin.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        blogin.setText("Login");
        blogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloginActionPerformed(evt);
            }
        });

        jpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpasswordActionPerformed(evt);
            }
        });

        bexit.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        bexit.setText("Exit");
        bexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bexitActionPerformed(evt);
            }
        });

        jtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtuserActionPerformed(evt);
            }
        });

        jcshowpswrd.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jcshowpswrd.setText("Show password");
        jcshowpswrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcshowpswrdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jCheckBox1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(jtuser)
                    .addComponent(bexit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(blogin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcshowpswrd)
                .addGap(126, 126, 126))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcshowpswrd)
                .addGap(15, 15, 15)
                .addComponent(jCheckBox1)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bexit)
                    .addComponent(blogin))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\sheny\\OneDrive\\Pictures\\BROMO1.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(593, 593, 593))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void bloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloginActionPerformed
        // TODO add your handling code here:
        String username = jtuser.getText();
        String password = new String(jpassword.getPassword());

        if (username.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Isi Username dan Password Terlebih Dahulu", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return; 
        }
            try {
            // Query untuk memeriksa apakah username sudah ada
            String checkSql = "SELECT password FROM tb_login WHERE username = ?";
            try (
                Connection conn = login.getConnection();
                PreparedStatement checkStmt = conn.prepareStatement(checkSql);
            ) {
                checkStmt.setString(1, username);

                try (ResultSet rs = checkStmt.executeQuery()) {
                    if (rs.next()) {
                        String Password = rs.getString("password");
                        if (!Password.equals(password)) {
                            JOptionPane.showMessageDialog(this, "Password anda salah!.", "Error", JOptionPane.ERROR_MESSAGE);
                            return; 
                        } else {
                            JOptionPane.showMessageDialog(this, "Login berhasil.", "Success", JOptionPane.INFORMATION_MESSAGE);

                            bromo2 bromo = new bromo2();
                            bromo.setVisible(true);
                            dispose();
                            return;
                        }
                    }
                }
            }

            // Menambahkan data baru jika username berbeda
            login.InsertLogin(username, password);
            JOptionPane.showMessageDialog(this, "Login berhasil ditambahkan.", "Success", JOptionPane.INFORMATION_MESSAGE);
            
            bromo2 bromo = new bromo2();
            bromo.setVisible(true);
            dispose();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Kesalahan koneksi database: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_bloginActionPerformed

    private void jpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpasswordActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jpasswordActionPerformed

    private void bexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bexitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bexitActionPerformed

    private void jtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtuserActionPerformed

    private void jcshowpswrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcshowpswrdActionPerformed
        // TODO add your handling code here:
        if (jcshowpswrd.isSelected()){
            jpassword.setEchoChar((char)0);
        }
        else {
            jpassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jcshowpswrdActionPerformed

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
            java.util.logging.Logger.getLogger(bromo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bromo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bromo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bromo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bromo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bexit;
    private javax.swing.JButton blogin;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox jcshowpswrd;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JTextField jtuser;
    // End of variables declaration//GEN-END:variables
}
