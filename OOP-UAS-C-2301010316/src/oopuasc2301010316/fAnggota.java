package oopuasc2301010316;

import javax.swing.JOptionPane;

public class fAnggota extends javax.swing.JFrame {
    
    private boolean isEditMode = false;
    private String nimLama = "";

    public fAnggota() {
        initComponents();
        isiComboBox();// panggil method untuk mengisi combobox
    }
    
    // Overload constructor untuk edit
    public fAnggota(String nim, String nama, String jurusan, String divisi, String jenisKelamin, String kontak) {
        initComponents();
        isiComboBox();
        isEditMode = true;
        nimLama = nim;

        txNIM.setText(nim);
        txNIM.setEnabled(false);
        txNAMA.setText(nama);
        txJUR.setSelectedItem(jurusan);
        txDIV.setSelectedItem(divisi);
        txJK.setSelectedItem(jenisKelamin);
        txKONTAK.setText(kontak);
        fJudul.setText("Edit Anggota UKM Rasikuntan");
        btnSimpan.setText("PERBARUI");
    }
    
    private void isiComboBox() {
        txJUR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
            "-- Pilih Jurusan --","IF-MTI", "IF-KAB", "IF-PAR", "DKV", "BD", "RSK"
        }));
        txDIV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
            "-- Pilih Jurusan --","AKADEMIK", "HUMAS", "KOMINFO"
        }));
        txJK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
            "-- Pilih Jurusan --","Laki-Laki", "Perempuan"
        }));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fJudul = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txNIM = new javax.swing.JTextField();
        txNAMA = new javax.swing.JTextField();
        txKONTAK = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        txJUR = new javax.swing.JComboBox<>();
        txDIV = new javax.swing.JComboBox<>();
        txJK = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fJudul.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        fJudul.setForeground(new java.awt.Color(44, 107, 222));
        fJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fJudul.setText("Tambah Anggota UKM Rasikuntan");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("NIM");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Jurusan");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Divisi");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Jenis Kelamin");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Kontak");

        txNAMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNAMAActionPerformed(evt);
            }
        });

        btnSimpan.setBackground(new java.awt.Color(102, 255, 102));
        btnSimpan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSimpan.setText("SIMPAN");
        btnSimpan.setMaximumSize(new java.awt.Dimension(78, 22));
        btnSimpan.setMinimumSize(new java.awt.Dimension(78, 22));
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnBatal.setBackground(new java.awt.Color(255, 51, 51));
        btnBatal.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnBatal.setText("BATAL");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        txJUR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        txJUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txJURActionPerformed(evt);
            }
        });

        txDIV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txJK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)
                                .addGap(57, 57, 57)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txNAMA, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txJUR, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txDIV, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txJK, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txKONTAK, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(fJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(fJudul)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txNAMA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txJUR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txDIV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txJK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txKONTAK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        
        String nim = txNIM.getText();
        String nama = txNAMA.getText();
        String jurusan = txJUR.getSelectedItem().toString();
        String divisi = txDIV.getSelectedItem().toString();
        String jenisKelamin = txJK.getSelectedItem().toString();
        String kontak = txKONTAK.getText();
    
        // Validasi sederhana
        if (nim.isEmpty() || nama.isEmpty() || kontak.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Harap isi semua field wajib!");
            return;
        }
        
        try{
             java.sql.Connection conn = dbkoneksi.koneksi();
            String sql;
            java.sql.PreparedStatement pst;
            
            if (isEditMode) {
                sql = "UPDATE anggota SET nama=?, jurusan=?, divisi=?, jenis_kelamin=?, kontak=? WHERE nim=?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, nama);
                pst.setString(2, jurusan);
                pst.setString(3, divisi);
                pst.setString(4, jenisKelamin);
                pst.setString(5, kontak);
                pst.setString(6, nimLama);
        }else{
                sql = "INSERT INTO anggota (nim, nama, jurusan, divisi, jenis_kelamin, kontak) VALUES (?, ?, ?, ?, ?, ?)";
                pst = conn.prepareStatement(sql);
                pst.setString(1, nim);
                pst.setString(2, nama);
                pst.setString(3, jurusan);
                pst.setString(4, divisi);
                pst.setString(5, jenisKelamin);
                pst.setString(6, kontak);
            }
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, isEditMode ? "Data berhasil diperbarui!" : "Data berhasil disimpan!");
            this.dispose();
            new tDataAnggota().setVisible(true);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal simpan data: " + e.getMessage());
        }    
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void txNAMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNAMAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNAMAActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        this.dispose();
        new tDataAnggota().setVisible(true);
    }//GEN-LAST:event_btnBatalActionPerformed

    private void txJURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txJURActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txJURActionPerformed

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
            java.util.logging.Logger.getLogger(fAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fAnggota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel fJudul;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> txDIV;
    private javax.swing.JComboBox<String> txJK;
    private javax.swing.JComboBox<String> txJUR;
    private javax.swing.JTextField txKONTAK;
    private javax.swing.JTextField txNAMA;
    private javax.swing.JTextField txNIM;
    // End of variables declaration//GEN-END:variables
}
