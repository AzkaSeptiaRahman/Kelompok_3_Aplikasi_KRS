/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import java.awt.event.KeyEvent;
import java.awt.Dialog;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import Konektor.Koneksi;
import javax.swing.JFrame;

/**
 *
 * @author hp
 */
public class Admin extends javax.swing.JFrame {
    public final Connection conn = new Koneksi().connect();
    private DefaultTableModel tabmode;
    
    private void aktif(){
        DS_TF.setEnabled(true);
        ID_TF.setEnabled(true);
        MK_TF.setEnabled(true);
        SKS_TF.setEnabled(true);
        SMT_Box.setEnabled(true);
    }
    
    protected void kosong(){
        DS_TF.setText(null);
        ID_TF.setText(null);
        MK_TF.setText(null);
        SKS_TF.setText(null);
        SMT_Box.setSelectedItem("Select Semester");
    }
    
    public void noTable(){
        int Baris = tabmode.getRowCount();
        for(int a = 0; a< Baris; a++){
            String nomor = String.valueOf(a + 1);
            tabmode.setValueAt(nomor + ".",a, 0);
        }
    }
    
    public void lebarKolom() {
        TableColumn kolom;
        MK_Tb.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        kolom = MK_Tb.getColumnModel().getColumn(0);
        kolom.setPreferredWidth(40);
        kolom = MK_Tb.getColumnModel().getColumn(1);
        kolom.setPreferredWidth(130);
        kolom = MK_Tb.getColumnModel().getColumn(2);
        kolom.setPreferredWidth(200);
        kolom = MK_Tb.getColumnModel().getColumn(3);
        kolom.setPreferredWidth(100);
        kolom = MK_Tb.getColumnModel().getColumn(5);
        kolom.setPreferredWidth(300);
    }
      
   
    public void dataTable(){
        Object [] Baris = {"No","ID MATA KULIAH","MATA KULIAH","BOBOT SKS","SEMESTER","DOSEN"};
        tabmode = new DefaultTableModel (null, Baris);
        MK_Tb.setModel(tabmode);
        String sql = "select*from tb_matakuliah";
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String id_MK = hasil.getString("id_matakuliah");
                String MataKuliah = hasil.getString("mata_kuliah");
                String BobotSKS = hasil.getString("bobot_sks");
                String Semester = hasil.getString("semester");
                String Dosen = hasil.getString("dosen");
                String [] data = {"", id_MK,MataKuliah,BobotSKS,Semester,Dosen};
                tabmode.addRow(data);
                noTable();
                lebarKolom();
                
            }
            
        }catch (Exception e){
            
        }
        
    }
    
    public void pencarian (String sql){
        Object [] Baris = {"No","ID MATA KULIAH","MATA KULIAH","BOBOT SKS","SEMESTER","DOSEN"};
        tabmode = new DefaultTableModel (null,Baris);
        MK_Tb.setModel(tabmode);
        int brs = MK_Tb.getRowCount();
        for (int i = 0;1<brs;i++){
            tabmode.removeRow(i);
        }
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String id_MK = hasil.getString("id_matakuliah");
                String MataKuliah = hasil.getString("mata_kuliah");
                String BobotSKS = hasil.getString("bobot_sks");
                String Semester = hasil.getString("semester");
                String Dosen = hasil.getString("dosen");
                String [] data = {"", id_MK,MataKuliah,BobotSKS,Semester,Dosen};
                tabmode.addRow(data);
                noTable();
            }
            
        } catch (Exception e){
            
        }
    }

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        dataTable();
        aktif();
        lebarKolom();
        ID_TF.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UbahCh_D = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        IDCh_TF = new javax.swing.JTextField();
        MKCh_TF = new javax.swing.JTextField();
        SKSCh_TF = new javax.swing.JTextField();
        DSCh_TF = new javax.swing.JTextField();
        SMTCh_Box = new javax.swing.JComboBox<>();
        CancelCh_Btn = new javax.swing.JButton();
        SimpanCh_Btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        SMT_Box = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ID_TF = new javax.swing.JTextField();
        MK_TF = new javax.swing.JTextField();
        SKS_TF = new javax.swing.JTextField();
        DS_TF = new javax.swing.JTextField();
        Tambah_Btn = new javax.swing.JButton();
        UbahBtn = new javax.swing.JButton();
        Bersih_Btn = new javax.swing.JButton();
        Hapus_Btn = new javax.swing.JButton();
        Batal_Btn = new javax.swing.JButton();
        Search_TF = new javax.swing.JTextField();
        Search_Btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MK_Tb = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        UbahCh_D.setMinimumSize(new java.awt.Dimension(476, 360));

        jPanel2.setMinimumSize(new java.awt.Dimension(476, 360));
        jPanel2.setPreferredSize(new java.awt.Dimension(476, 360));

        jLabel7.setText("ID MATA KULIAH");

        jLabel9.setText("MATA KULIAH");

        jLabel10.setText("BOBOT SKS");

        jLabel11.setText("SEMESTER");

        jLabel12.setText("DOSEN");

        IDCh_TF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        IDCh_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IDCh_TFKeyPressed(evt);
            }
        });

        MKCh_TF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MKCh_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MKCh_TFKeyPressed(evt);
            }
        });

        SKSCh_TF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SKSCh_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SKSCh_TFKeyPressed(evt);
            }
        });

        DSCh_TF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        SMTCh_Box.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SMTCh_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---- Select Semester ----", "1 (Ganjil)", "2 (Genap)", "3 (Ganjil)", "4 (Genap)", "5 (Ganjil)", "6 (Genap)", "7 (Ganjil)", "8 (Genap)", " " }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SKSCh_TF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(53, 53, 53)
                                .addComponent(IDCh_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(MKCh_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(SMTCh_Box, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(DSCh_TF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(IDCh_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(MKCh_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(SKSCh_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(SMTCh_Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(DSCh_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(203, 203, 203))
        );

        CancelCh_Btn.setText("Cancel");
        CancelCh_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelCh_BtnActionPerformed(evt);
            }
        });

        SimpanCh_Btn.setText("Simpan");
        SimpanCh_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanCh_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(SimpanCh_Btn)
                        .addGap(46, 46, 46)
                        .addComponent(CancelCh_Btn)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SimpanCh_Btn)
                    .addComponent(CancelCh_Btn))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout UbahCh_DLayout = new javax.swing.GroupLayout(UbahCh_D.getContentPane());
        UbahCh_D.getContentPane().setLayout(UbahCh_DLayout);
        UbahCh_DLayout.setHorizontalGroup(
            UbahCh_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        UbahCh_DLayout.setVerticalGroup(
            UbahCh_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SMT_Box.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SMT_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Semester ", "1 (Ganjil)", "2 (Genap)", "3 (Ganjil)", "4 (Genap)", "5 (Ganjil)", "6 (Genap)", "7 (Ganjil)", "8 (Genap)" }));
        SMT_Box.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SMT_Box.setPreferredSize(new java.awt.Dimension(7, 28));
        SMT_Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SMT_BoxActionPerformed(evt);
            }
        });
        jPanel1.add(SMT_Box, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 310, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Mata Kuliah");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mata Kuliah");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bobot SKS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Semester");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dosen");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        ID_TF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ID_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ID_TFKeyPressed(evt);
            }
        });
        jPanel1.add(ID_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 310, 30));

        MK_TF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MK_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MK_TFKeyPressed(evt);
            }
        });
        jPanel1.add(MK_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 310, 30));

        SKS_TF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SKS_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SKS_TFKeyPressed(evt);
            }
        });
        jPanel1.add(SKS_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 310, 30));

        DS_TF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(DS_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 310, 30));

        Tambah_Btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Tambah_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambardanIcon/ion_add-circle.png"))); // NOI18N
        Tambah_Btn.setText("Tambah");
        Tambah_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tambah_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Tambah_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, -1, -1));

        UbahBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UbahBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambardanIcon/entypo_edit.png"))); // NOI18N
        UbahBtn.setText("Ubah");
        UbahBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahBtnActionPerformed(evt);
            }
        });
        jPanel1.add(UbahBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 110, -1));

        Bersih_Btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Bersih_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambardanIcon/bx_bxs-eraser.png"))); // NOI18N
        Bersih_Btn.setText("Bersih");
        Bersih_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bersih_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Bersih_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 580, -1, -1));

        Hapus_Btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Hapus_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambardanIcon/clarity_trash-solid.png"))); // NOI18N
        Hapus_Btn.setText("Hapus");
        Hapus_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hapus_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Hapus_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, -1, -1));

        Batal_Btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Batal_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambardanIcon/topcoat_cancel (1).png"))); // NOI18N
        Batal_Btn.setText("Batal");
        Batal_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Batal_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Batal_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, -1, -1));

        Search_TF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Search_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Search_TFKeyTyped(evt);
            }
        });
        jPanel1.add(Search_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, 450, -1));

        Search_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambardanIcon/flat-color-icons_search.png"))); // NOI18N
        Search_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Search_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 210, -1, -1));

        MK_Tb.setModel(new javax.swing.table.DefaultTableModel(
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
        MK_Tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MK_TbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MK_Tb);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 530, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambardanIcon/Dekstop_6.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 740));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Search_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_BtnActionPerformed
        // TODO add your handling code here:
        String sqlPencarian = "select * from tb_matakuliah where id_matakuliah like '%"+ Search_TF.getText()+"%' or " 
                +"mata_kuliah like '%" + Search_TF.getText()+ "%' or " + "dosen like '%" + Search_TF.getText()+ "%'";
        pencarian(sqlPencarian);
    }//GEN-LAST:event_Search_BtnActionPerformed

    private void Tambah_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tambah_BtnActionPerformed
        // TODO add your handling code here:
        if (ID_TF.getText().equals("")){
            JOptionPane.showMessageDialog(null,"ID MATA KULIAH Tidak Boleh Kosong");
        } else if (MK_TF.getText().equals("")){
            JOptionPane.showMessageDialog(null,"MATA KULIAH Tidak Boleh Kosong");
        } else if (SKS_TF.getText().equals("")){
            JOptionPane.showMessageDialog(null,"BOBOT SKS Tidak Boleh Kosong");
        } else if (SMT_Box.getSelectedItem().equals("---- Select Semester ----")){
            JOptionPane.showMessageDialog(null,"SEMESTER Tidak Boleh Kosong");
        } else if (DS_TF.getText().equals("")){
            JOptionPane.showMessageDialog(null,"DOSEN Tidak Boleh Kosong");
        } else {
            String sql = "insert into tb_matakuliah values (?,?,?,?,?)";
            try{
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.setString(1, ID_TF.getText());
                stat.setString(2, MK_TF.getText());
                stat.setString(3, SKS_TF.getText());
                stat.setString(4, (String) SMT_Box.getSelectedItem());
                stat.setString(5, DS_TF.getText());
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan");
                kosong();
                dataTable();
                lebarKolom();
                
                ID_TF.requestFocus();
            } catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"+ e);
            }
        }
        
    }//GEN-LAST:event_Tambah_BtnActionPerformed

    private void ID_TFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ID_TFKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            MK_TF.requestFocus();
        }
    }//GEN-LAST:event_ID_TFKeyPressed

    private void MK_TFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MK_TFKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            SKS_TF.requestFocus();
        }
    }//GEN-LAST:event_MK_TFKeyPressed

    private void SKS_TFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SKS_TFKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            DS_TF.requestFocus();
        }
    }//GEN-LAST:event_SKS_TFKeyPressed

    private void Bersih_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bersih_BtnActionPerformed
        // TODO add your handling code here:
        kosong();
    }//GEN-LAST:event_Bersih_BtnActionPerformed

    private void Hapus_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hapus_BtnActionPerformed
        // TODO add your handling code here:
         int Check = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin" + " Menghapus Data ", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
        if(Check == 0){
            String sql = "delete from tb_matakuliah where id_matakuliah='"+ ID_TF.getText()+"'";
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

    private void Batal_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Batal_BtnActionPerformed
        // TODO add your handling code here:
        MenuAdmin MA = new MenuAdmin();
        MA.setVisible(true);
        MA.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.dispose();
        
    }//GEN-LAST:event_Batal_BtnActionPerformed

    private void Search_TFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search_TFKeyTyped
        // TODO add your handling code here:
        String sqlPencarian = "select * from tb_matakuliah where id_matakuliah like '%"+ Search_TF.getText()+"%' or " 
                +"mata_kuliah like '%" + Search_TF.getText()+ "%' or " + "dosen like '%" + Search_TF.getText()+ "%'";
        pencarian(sqlPencarian);
        lebarKolom();
    }//GEN-LAST:event_Search_TFKeyTyped

    private void MK_TbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MK_TbMouseClicked
        // TODO add your handling code here:
        int bar = MK_Tb.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        String e = tabmode.getValueAt(bar, 4).toString();
        String f = tabmode.getValueAt(bar, 5).toString();
        
        ID_TF.setText(b);
        IDCh_TF.setText(b);
        MK_TF.setText(c);
        MKCh_TF.setText(c);
        SKS_TF.setText((d));
        SKSCh_TF.setText(d);
        SMT_Box.setSelectedItem(e);
        SMTCh_Box.setSelectedItem(e);
        DS_TF.setText(f);
        DSCh_TF.setText(f);
    }//GEN-LAST:event_MK_TbMouseClicked

    private void IDCh_TFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDCh_TFKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDCh_TFKeyPressed

    private void MKCh_TFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MKCh_TFKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_MKCh_TFKeyPressed

    private void SKSCh_TFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SKSCh_TFKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_SKSCh_TFKeyPressed

    private void CancelCh_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelCh_BtnActionPerformed
        // TODO add your handling code here:
        UbahCh_D.setVisible(false);
    }//GEN-LAST:event_CancelCh_BtnActionPerformed

    private void SimpanCh_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanCh_BtnActionPerformed
        // TODO add your handling code here:
        String sql = "update tb_matakuliah set id_matakuliah='"+ IDCh_TF.getText()+"',mata_kuliah='"+MKCh_TF.getText()+"',bobot_sks='"+SKSCh_TF.getText()+"',semester='"+ SMTCh_Box.getSelectedItem()+ "',dosen='"+DSCh_TF.getText()+"' where id_matakuliah='" + ID_TF.getText()+"'";
        try{
            PreparedStatement stat = conn.prepareStatement(sql);

            stat.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            kosong();
            dataTable();

            ID_TF.requestFocus();
            UbahCh_D.dispose();

        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah"+ e);
        }
    }//GEN-LAST:event_SimpanCh_BtnActionPerformed

    private void SMT_BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SMT_BoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SMT_BoxActionPerformed

    private void UbahBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahBtnActionPerformed
        // TODO add your handling code here:
        UbahCh_D.setLocationRelativeTo(this);
        UbahCh_D.setVisible(true);
    }//GEN-LAST:event_UbahBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Batal_Btn;
    private javax.swing.JButton Bersih_Btn;
    private javax.swing.JButton CancelCh_Btn;
    private javax.swing.JTextField DSCh_TF;
    private javax.swing.JTextField DS_TF;
    private javax.swing.JButton Hapus_Btn;
    private javax.swing.JTextField IDCh_TF;
    private javax.swing.JTextField ID_TF;
    private javax.swing.JTextField MKCh_TF;
    private javax.swing.JTextField MK_TF;
    private javax.swing.JTable MK_Tb;
    private javax.swing.JTextField SKSCh_TF;
    private javax.swing.JTextField SKS_TF;
    private javax.swing.JComboBox<String> SMTCh_Box;
    private javax.swing.JComboBox<String> SMT_Box;
    private javax.swing.JButton Search_Btn;
    private javax.swing.JTextField Search_TF;
    private javax.swing.JButton SimpanCh_Btn;
    private javax.swing.JButton Tambah_Btn;
    private javax.swing.JButton UbahBtn;
    private javax.swing.JDialog UbahCh_D;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}