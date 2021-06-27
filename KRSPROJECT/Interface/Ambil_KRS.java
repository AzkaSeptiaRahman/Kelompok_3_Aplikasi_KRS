/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Konektor.Koneksi;
import java.sql.PreparedStatement;
import javax.swing.table.TableColumn;
/**
 *
 * @author asus
 */
public class Ambil_KRS extends javax.swing.JFrame {
    public final Connection conn = new Koneksi().connect();
    private DefaultTableModel tabmode;
    
     public void dataTable(){
        Object [] Baris = {"NIM","NAMA LENGKAP","KELAS","ID MATA KULIAH","MATA KULIAH","BOBOT SKS","SEMESTER","DOSEN"};
        tabmode = new DefaultTableModel (null, Baris);
        KRS_TB.setModel(tabmode);
        String sql = "select*from tb_krs order by nim asc";
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String NIM = hasil.getString("nim");
                String Nama = hasil.getString("nama");
                String Kelas = hasil.getString("kelas");
                String ID_MK = hasil.getString("id_matakuliah");
                String MK = hasil.getString("matakuliah");
                String SKS = hasil.getString("sks");
                String Semester = hasil.getString("semester");
                String Dosen = hasil.getString("dosen");
                String [] data = {NIM, Nama ,Kelas ,ID_MK, MK, SKS, Semester, Dosen};
                tabmode.addRow(data);
            }
           }catch (Exception e){
            
        }
        
    }
    
    public void Combo_Box(){
      String sql = "select id_matakuliah from tb_matakuliah";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet a = stat.executeQuery(sql);
       while(a.next()){
                ID_Box.addItem(a.getString("id_matakuliah"));
            }
       stat.close();
       
        } catch (Exception e) {
            System.out.print(e.getMessage());
            
        }
        
    }
    
    protected void kosong(){
        NIM_TF.setText(null);
        Nama_TF.setText(null);
        Kelas_TF.setText(null);
        ID_Box.setSelectedItem("Select ID Mata Kuliah");
        MK_TF.setText(null);
        SKS_TF.setText(null);
        SMT_TF.setText(null);
        DS_TF.setText(null);
    }
    
     public void lebarKolom() {
        TableColumn kolom;
        KRS_TB.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        kolom = KRS_TB.getColumnModel().getColumn(0);
        kolom.setPreferredWidth(150);
        kolom = KRS_TB.getColumnModel().getColumn(1);
        kolom.setPreferredWidth(150);
        kolom = KRS_TB.getColumnModel().getColumn(2);
        kolom.setPreferredWidth(50);
        kolom = KRS_TB.getColumnModel().getColumn(3);
        kolom.setPreferredWidth(100);
        kolom = KRS_TB.getColumnModel().getColumn(4);
        kolom.setPreferredWidth(150);
        kolom = KRS_TB.getColumnModel().getColumn(5);
        kolom.setPreferredWidth(80);
        kolom = KRS_TB.getColumnModel().getColumn(6);
        kolom.setPreferredWidth(80);
        kolom = KRS_TB.getColumnModel().getColumn(7);
        kolom.setPreferredWidth(200);
    }
    
   
    /**
     * Creates new form Ambil_KRS
     */
    public Ambil_KRS() {
        initComponents();
        dataTable();
        Combo_Box();
        lebarKolom();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        NIM_TF = new javax.swing.JTextField();
        Nama_TF = new javax.swing.JTextField();
        Kelas_TF = new javax.swing.JTextField();
        ID_Box = new javax.swing.JComboBox<>();
        MK_TF = new javax.swing.JTextField();
        SKS_TF = new javax.swing.JTextField();
        SMT_TF = new javax.swing.JTextField();
        DS_TF = new javax.swing.JTextField();
        Check_Btn = new javax.swing.JButton();
        Ambil_Btn = new javax.swing.JButton();
        Hapus_Btn = new javax.swing.JButton();
        Bersih_Btn = new javax.swing.JButton();
        Keluar_Btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        KRS_TB = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NIM");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Kelas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID Mata Kuliah");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mata Kuliah");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Bobot SKS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Semester");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Dosen");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, -1, -1));

        NIM_TF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(NIM_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 270, -1));

        Nama_TF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Nama_TF.setEnabled(false);
        jPanel1.add(Nama_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 270, -1));

        Kelas_TF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Kelas_TF.setEnabled(false);
        jPanel1.add(Kelas_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 270, -1));

        ID_Box.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ID_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ID Mata Kuliah", " " }));
        ID_Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_BoxActionPerformed(evt);
            }
        });
        jPanel1.add(ID_Box, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 270, -1));

        MK_TF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MK_TF.setEnabled(false);
        jPanel1.add(MK_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 270, -1));

        SKS_TF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SKS_TF.setEnabled(false);
        jPanel1.add(SKS_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 270, -1));

        SMT_TF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SMT_TF.setEnabled(false);
        jPanel1.add(SMT_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 270, -1));

        DS_TF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DS_TF.setEnabled(false);
        jPanel1.add(DS_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 270, -1));

        Check_Btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Check_Btn.setText("Check NIM");
        Check_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Check_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Check_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, -1));

        Ambil_Btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Ambil_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambardanIcon/ion_add-circle.png"))); // NOI18N
        Ambil_Btn.setText("Ambil");
        Ambil_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ambil_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Ambil_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 600, -1, -1));

        Hapus_Btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Hapus_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambardanIcon/clarity_trash-solid.png"))); // NOI18N
        Hapus_Btn.setText("Hapus");
        Hapus_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hapus_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Hapus_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 600, -1, -1));

        Bersih_Btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Bersih_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambardanIcon/bx_bxs-eraser.png"))); // NOI18N
        Bersih_Btn.setText("Bersih");
        Bersih_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bersih_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Bersih_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 600, -1, -1));

        Keluar_Btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Keluar_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambardanIcon/topcoat_cancel (1).png"))); // NOI18N
        Keluar_Btn.setText("Keluar");
        Keluar_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Keluar_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Keluar_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 600, -1, -1));

        KRS_TB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        KRS_TB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KRS_TBMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(KRS_TB);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, 550, 500));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambardanIcon/AMBIL KRS (1).png"))); // NOI18N
        jLabel1.setText("Dosen");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1372, 725));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Check_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check_BtnActionPerformed
        // TODO add your handling code here:
        String NIM = NIM_TF.getText();
        String sql = "select * from tb_mahasiswa where nim ='"+NIM+"'";
        NIM_TF.setEnabled(false);
        try{ 
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            
            while (hasil.next()){
                Nama_TF.setText(hasil.getString(2));
                Kelas_TF.setText(hasil.getString(3));
            }
     
        } catch (SQLException e){
            
        }
    }//GEN-LAST:event_Check_BtnActionPerformed

    private void ID_BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_BoxActionPerformed
        // TODO add your handling code here:
        String sql = "select id_matakuliah, mata_kuliah, bobot_sks, semester, dosen from tb_matakuliah where id_matakuliah ='" + ID_Box.getSelectedItem() + "'";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet MK = stat.executeQuery(sql);
            
            while(MK.next()){
                MK_TF.setText(MK.getString("mata_kuliah"));
                SKS_TF.setText(MK.getString("mata_kuliah"));
                SKS_TF.setText(MK.getString("bobot_sks"));
                SMT_TF.setText(MK.getString("semester"));
                DS_TF.setText(MK.getString("dosen"));           
            }
            
            stat.close();
             
        } catch (Exception e){
            
        }
    }//GEN-LAST:event_ID_BoxActionPerformed

    private void Ambil_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ambil_BtnActionPerformed
        // TODO add your handling code here:
        String sql = "insert into tb_krs values (?,?,?,?,?,?,?,?)";
            try{
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.setString(1, NIM_TF.getText());
                stat.setString(2, Nama_TF.getText());
                stat.setString(3, Kelas_TF.getText());
                stat.setString(4, (String)ID_Box.getSelectedItem());
                stat.setString(5, MK_TF.getText());
                stat.setString(6, SKS_TF.getText());
                stat.setString(7, SMT_TF.getText());
                stat.setString(8, DS_TF.getText());
                
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan");
                dataTable();
                lebarKolom();
                NIM_TF.requestFocus();
            } catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"+ e);
            }
        
    }//GEN-LAST:event_Ambil_BtnActionPerformed

    private void Bersih_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bersih_BtnActionPerformed
        // TODO add your handling code here:
        kosong();
        NIM_TF.setEnabled(true);
    }//GEN-LAST:event_Bersih_BtnActionPerformed

    private void Hapus_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hapus_BtnActionPerformed
        // TODO add your handling code here:
        int Check = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin" + " Menghapus Data ", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
        if(Check == 0){
            String sql = "delete from tb_krs where id_matakuliah='"+ ID_Box.getSelectedItem()+"'";
            try{
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus");
                kosong();
                dataTable();
                lebarKolom();
             
                
            }catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapus" + e);
            }
        }
    
    }//GEN-LAST:event_Hapus_BtnActionPerformed

    private void Keluar_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Keluar_BtnActionPerformed
        // TODO add your handling code here:
        MenuUtama MU = new MenuUtama();
        MU.setVisible(true);
        MU.setExtendedState(MAXIMIZED_BOTH);        
        this.dispose();
        
    }//GEN-LAST:event_Keluar_BtnActionPerformed

    private void KRS_TBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KRS_TBMouseClicked
        // TODO add your handling code here:
        int bar = KRS_TB.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        String e = tabmode.getValueAt(bar, 4).toString();
        String f = tabmode.getValueAt(bar, 5).toString();
        String g = tabmode.getValueAt(bar, 6).toString();
        String h = tabmode.getValueAt(bar, 7).toString();
        
        
        NIM_TF.setText(a);
        Nama_TF.setText(b);
        Kelas_TF.setText(c);
        ID_Box.setSelectedItem(d);
        MK_TF.setText(e);
        SKS_TF.setText(f);
        SMT_TF.setText(g);
        DS_TF.setText(h);
        
    }//GEN-LAST:event_KRS_TBMouseClicked

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
            java.util.logging.Logger.getLogger(Ambil_KRS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ambil_KRS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ambil_KRS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ambil_KRS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ambil_KRS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ambil_Btn;
    private javax.swing.JButton Bersih_Btn;
    private javax.swing.JButton Check_Btn;
    private javax.swing.JTextField DS_TF;
    private javax.swing.JButton Hapus_Btn;
    private javax.swing.JComboBox<String> ID_Box;
    private javax.swing.JTable KRS_TB;
    private javax.swing.JTextField Kelas_TF;
    private javax.swing.JButton Keluar_Btn;
    private javax.swing.JTextField MK_TF;
    private javax.swing.JTextField NIM_TF;
    private javax.swing.JTextField Nama_TF;
    private javax.swing.JTextField SKS_TF;
    private javax.swing.JTextField SMT_TF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}