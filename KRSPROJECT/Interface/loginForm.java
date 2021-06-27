/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Konektor.Koneksi;
import javax.swing.JFrame;
/**
 * @author Kelompok 3
 * -Mar'atus Sholihah
 * -Sallma Diana Putri
 * -Azka Septia Rahman
 * -Indah Nurhayati
 * -Lhutfia Ichsan
 */
public class loginForm extends javax.swing.JFrame {
private Connection conn = new Koneksi().connect();
    /**
     * Creates new form loginForm
     */
    public loginForm() {
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
        UsernameField = new javax.swing.JTextField();
        LoginBtn = new javax.swing.JButton();
        ShowBtn = new javax.swing.JCheckBox();
        PasswordField = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APLIKASI KRS V.1.0");

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UsernameField.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        UsernameField.setToolTipText("Username");
        jPanel1.add(UsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 540, 50));

        LoginBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LoginBtn.setText("LOGIN");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 560, 170, 50));

        ShowBtn.setBackground(new java.awt.Color(181, 193, 130));
        ShowBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShowBtn.setText("SHOW PASSWORD ");
        ShowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ShowBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 170, 50));

        PasswordField.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        PasswordField.setToolTipText("Password");
        jPanel1.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 540, 50));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("© Kelompok 3 Sistem Informasi 2A _Maratus,Sallma,Azka,Indah,Lhutfia");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambardanIcon/User64px.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambardanIcon/Key64px.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 70, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambardanIcon/User128px.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambardanIcon/Desktop - 8 (1).png"))); // NOI18N
        jLabel2.setText("   ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1372, 725));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ShowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowBtnActionPerformed
        // TODO add your handling code here:
         if (ShowBtn.isSelected()) {
            PasswordField.setEchoChar((char)0);
        } else {
            PasswordField.setEchoChar('*');
        }
    }//GEN-LAST:event_ShowBtnActionPerformed

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        // TODO add your handling code here:
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet result = stat.executeQuery("SELECT * FROM `tb_user` where "+ "Username='" + UsernameField.getText()+"'");
            if (result.next()){
                if(PasswordField.getText().equals(result.getString("Password"))){
                    MenuUtama MN = new MenuUtama();
                    MN.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    MN.setVisible(true);
                    this.dispose();
                } else{
                    JOptionPane.showMessageDialog(rootPane, "Password Salah");
                    PasswordField.setText("");
                    UsernameField.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "User Tidak Ditemukan");
                UsernameField.setText("");
                PasswordField.setText("");
                UsernameField.requestFocus();
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, "Gagal");
        }
    }//GEN-LAST:event_LoginBtnActionPerformed

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
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBtn;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JCheckBox ShowBtn;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}