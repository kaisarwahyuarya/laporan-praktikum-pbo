package frontend;
import backend.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;

public class FrmPeminjaman1841720206Kaisar extends javax.swing.JFrame {

    /**
     * Creates new form FrmPeminjaman
     */
    public FrmPeminjaman1841720206Kaisar() {
        initComponents();
        tampilkanDataKaisar();
        kosongkanFormKaisar();
    }

    public void kosongkanFormKaisar(){
        txtIdPeminjaman.setText("0");
        txtIdAnggota.setText("");
        txtIdBuku.setText("");
        txtTanggalPinjam.setText("");
        txtTanggalKembali.setText("");
    }

    public void tampilkanDataKaisar(){
        String[] kolom = {"Nama" ,"Judul", "Tanggal Pinjam", "Tanggal Kembali"};
        ArrayList<Peminjaman1841720206Kaisar> list = new Peminjaman1841720206Kaisar().getAllKaisar();
        Object rowData[] = new Object[4];
        
        tblPeminjaman.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for (int i = 0; i < list.size(); i++) {
            rowData[0] = list.get(i).getAnggotaKaisar().getNamaKaisar();
            rowData[1] = list.get(i).getBukuKaisar().getJudulKaisar();
            rowData[2] = list.get(i).getTanggalpinjamKaisar();
            rowData[3] = list.get(i).getTanggalkembaliKaisar();
           
            ((DefaultTableModel)tblPeminjaman.getModel()).addRow(rowData);
        }
    }
    
    public void cari(String keyword){
        String[] kolom = {"Nama" ,"Judul", "Tanggal Pinjam", "Tanggal Kembali"};
        ArrayList<Peminjaman1841720206Kaisar> list = new Peminjaman1841720206Kaisar().searchKaisar(keyword);
        Object rowData[] = new Object[4];
        
        tblPeminjaman.setModel(new DefaultTableModel(new Object[][] {}, kolom));

        for (Peminjaman1841720206Kaisar peminjaman : list) {           
            rowData[0] = peminjaman.getAnggotaKaisar().getNamaKaisar();
            rowData[1] = peminjaman.getBukuKaisar().getJudulKaisar();
            rowData[2] = peminjaman.getTanggalpinjamKaisar();
            rowData[3] = peminjaman.getTanggalkembaliKaisar();
            
            ((DefaultTableModel)tblPeminjaman.getModel()).addRow(rowData);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdPeminjaman = new javax.swing.JTextField();
        txtIdAnggota = new javax.swing.JTextField();
        txtIdBuku = new javax.swing.JTextField();
        txtTanggalPinjam = new javax.swing.JTextField();
        txtTanggalKembali = new javax.swing.JTextField();
        btnCariAnggota = new javax.swing.JButton();
        btnCariBuku = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnTambahBaru = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPeminjaman = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ID :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID Anggota :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ID Buku :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Tanggal Pinjam :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Tanggal Kembali :");

        txtIdPeminjaman.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtIdPeminjaman.setEnabled(false);
        txtIdPeminjaman.setPreferredSize(new java.awt.Dimension(60, 30));

        txtIdAnggota.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtIdAnggota.setPreferredSize(new java.awt.Dimension(100, 30));

        txtIdBuku.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtIdBuku.setPreferredSize(new java.awt.Dimension(100, 30));

        txtTanggalPinjam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTanggalPinjam.setPreferredSize(new java.awt.Dimension(200, 30));

        txtTanggalKembali.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTanggalKembali.setPreferredSize(new java.awt.Dimension(200, 30));

        btnCariAnggota.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCariAnggota.setText("Cari");
        btnCariAnggota.setPreferredSize(new java.awt.Dimension(60, 30));
        btnCariAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariAnggotaActionPerformed(evt);
            }
        });

        btnCariBuku.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCariBuku.setText("Cari");
        btnCariBuku.setPreferredSize(new java.awt.Dimension(60, 30));
        btnCariBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariBukuActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Nama Anggota");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Judul Buku");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Format : YYYY/MM/DD");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Format : YYYY/MM/DD");

        btnSimpan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnTambahBaru.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTambahBaru.setText("Tambah Baru");
        btnTambahBaru.setToolTipText("");
        btnTambahBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahBaruActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHapus.setText("Hapus");

        tblPeminjaman.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblPeminjaman);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTambahBaru)
                            .addComponent(btnSimpan)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTanggalKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtTanggalPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtIdBuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtIdAnggota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnCariAnggota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnCariBuku, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)))
                            .addComponent(btnHapus))
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCariAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnCariBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTanggalPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTanggalKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSimpan)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambahBaru)
                    .addComponent(btnHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        Peminjaman1841720206Kaisar peminjaman = new Peminjaman1841720206Kaisar();
//        peminjaman.setIdpeminjaman(Integer.parseInt(txtIdPeminjaman.getText()));
//        peminjaman.getAnggota().setNama(txtIdAnggota.getText());
        peminjaman.getAnggotaKaisar().setIdanggotaKaisar(Integer.parseInt(txtIdAnggota.getText()));
//        peminjaman.getBuku().setJudul(txtIdBuku.getText());
        peminjaman.getBukuKaisar().setIdbukuKaisar(Integer.parseInt(txtIdBuku.getText()));
        peminjaman.setTanggalpinjamKaisar(txtTanggalPinjam.getText());
        peminjaman.setTanggalkembaliKaisar(txtTanggalKembali.getText());
        peminjaman.saveKaisar();

        txtIdPeminjaman.setText(Integer.toString(peminjaman.getIdpeminjamanKaisar()));
        tampilkanDataKaisar();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnCariAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariAnggotaActionPerformed
        // TODO add your handling code here:
        cari(txtIdAnggota.getText());
    }//GEN-LAST:event_btnCariAnggotaActionPerformed

    private void btnCariBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariBukuActionPerformed
        // TODO add your handling code here:
        cari(txtIdBuku.getText());
    }//GEN-LAST:event_btnCariBukuActionPerformed

    private void btnTambahBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahBaruActionPerformed
        // TODO add your handling code here:
        kosongkanFormKaisar();
    }//GEN-LAST:event_btnTambahBaruActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPeminjaman1841720206Kaisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPeminjaman1841720206Kaisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPeminjaman1841720206Kaisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPeminjaman1841720206Kaisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPeminjaman1841720206Kaisar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCariAnggota;
    private javax.swing.JButton btnCariBuku;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambahBaru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPeminjaman;
    private javax.swing.JTextField txtIdAnggota;
    private javax.swing.JTextField txtIdBuku;
    private javax.swing.JTextField txtIdPeminjaman;
    private javax.swing.JTextField txtTanggalKembali;
    private javax.swing.JTextField txtTanggalPinjam;
    // End of variables declaration//GEN-END:variables
}
