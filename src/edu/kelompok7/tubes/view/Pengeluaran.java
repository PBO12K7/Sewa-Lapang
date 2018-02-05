/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok7.tubes.view;

import com.toedter.calendar.JDateChooser;
import edu.kelompok7.tubes.controller.PengeluaranController;
import edu.kelompok7.tubes.database.TubesDatabase;
import edu.kelompok7.tubes.entity.Pengeluarans;
import edu.kelompok7.tubes.error.ScheduleException;
import edu.kelompok7.tubes.event.PengeluaranListener;
import edu.kelompok7.tubes.model.PengeluaranModel;
import edu.kelompok7.tubes.model.TabelPengeluaranModel;
import edu.kelompok7.tubes.service.PengeluaranDao;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Flow
 */
public class Pengeluaran extends javax.swing.JPanel implements PengeluaranListener, ListSelectionListener {

    /**
     * Creates new form Pengeluaran
     */
    private TabelPengeluaranModel tabelModel;
    private PengeluaranModel model;
    private PengeluaranController controller;

    public Pengeluaran() {
        tabelModel = new TabelPengeluaranModel();
        initComponents();
        tablePengeluaran.setModel(tabelModel);

        model = new PengeluaranModel();
        model.setListener(this);

        controller = new PengeluaranController();
        controller.setModel(model);

        tablePengeluaran.getSelectionModel().addListSelectionListener(this);

    }

    public JTable getTablePengeluaran() {
        return tablePengeluaran;
    }

    public void setTablePengeluaran(JTable tablePengeluaran) {
        this.tablePengeluaran = tablePengeluaran;
    }

    public JTextField getTxtHarga() {
        return txtHarga;
    }

    public void setTxtHarga(JTextField txtHarga) {
        this.txtHarga = txtHarga;
    }

    public JTextField getTxtJumlahBarang() {
        return txtJumlahBarang;
    }

    public void setTxtJumlahBarang(JTextField txtJumlahBarang) {
        this.txtJumlahBarang = txtJumlahBarang;
    }

    public JTextField getTxtNamaBarang() {
        return txtNamaBarang;
    }

    public void setTxtNamaBarang(JTextField txtNamaBarang) {
        this.txtNamaBarang = txtNamaBarang;
    }

    public JDateChooser getTxtWaktu() {
        return txtWaktu;
    }

    public void setTxtWaktu(JDateChooser txtWaktu) {
        this.txtWaktu = txtWaktu;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodysemua = new javax.swing.JPanel();
        icons = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        about = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNamaBarang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtJumlahBarang = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePengeluaran = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtWaktu = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        about2 = new javax.swing.JLabel();
        about3 = new javax.swing.JLabel();

        bodysemua.setBackground(new java.awt.Color(55, 53, 66));
        bodysemua.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icons.setBackground(new java.awt.Color(67, 66, 80));
        icons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(67, 66, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok7/tubes/asset/icons8-calendar-50.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        icons.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 132, -1, -1));

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icons.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 478, -1, -1));

        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icons.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 343, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok7/tubes/asset/icons8-home-page-50.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        icons.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 76, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 245, 255));
        jPanel1.setForeground(new java.awt.Color(0, 245, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        icons.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, -1));

        about.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        about.setForeground(new java.awt.Color(0, 245, 255));
        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok7/tubes/asset/icons8-shutdown-15 (1).png"))); // NOI18N
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
        });
        icons.add(about, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 690, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok7/tubes/asset/icons8-people-50.png"))); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        icons.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok7/tubes/asset/icons8-money-50.png"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        icons.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        bodysemua.add(icons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1268));

        menu.setBackground(new java.awt.Color(55, 53, 66));
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 245, 255));
        jLabel5.setText("PENGELUARAN");
        menu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 11, -1, -1));

        jLabel6.setForeground(new java.awt.Color(55, 53, 66));
        jLabel6.setText(" ");
        menu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 133, -1, -1));

        txtNamaBarang.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        txtNamaBarang.setForeground(new java.awt.Color(67, 66, 80));
        txtNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaBarangActionPerformed(evt);
            }
        });
        menu.add(txtNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 106, 156, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("JUMLAH BARANG    :");
        menu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 156, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("WAKTU PEMBELIAN  :");
        menu.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 109, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("HARGA BARANG      :");
        menu.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 156, -1, -1));

        txtJumlahBarang.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        txtJumlahBarang.setForeground(new java.awt.Color(67, 66, 80));
        txtJumlahBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahBarangActionPerformed(evt);
            }
        });
        menu.add(txtJumlahBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 153, 156, -1));

        tablePengeluaran.setAutoCreateRowSorter(true);
        tablePengeluaran.setBackground(new java.awt.Color(67, 66, 80));
        tablePengeluaran.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        tablePengeluaran.setForeground(new java.awt.Color(0, 245, 255));
        tablePengeluaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama Barang", "Jumlah", "Waktu", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablePengeluaran);

        menu.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 233, 890, 342));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("NAMA BARANG       :");
        menu.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 109, -1, -1));

        txtHarga.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        txtHarga.setForeground(new java.awt.Color(67, 66, 80));
        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });
        menu.add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 153, 156, -1));

        btnSimpan.setBackground(new java.awt.Color(153, 153, 0));
        btnSimpan.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(55, 53, 66));
        btnSimpan.setText("Selesai !");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        menu.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 192, 156, -1));

        btnUbah.setBackground(new java.awt.Color(153, 153, 0));
        btnUbah.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        btnUbah.setForeground(new java.awt.Color(55, 53, 66));
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        menu.add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 618, 100, -1));

        btnHapus.setBackground(new java.awt.Color(153, 153, 0));
        btnHapus.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(55, 53, 66));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        menu.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(789, 618, 100, -1));

        txtWaktu.setDateFormatString("yyyy, dd MM");
        menu.add(txtWaktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 150, -1));

        bodysemua.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 46, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(55, 53, 66));
        jLabel8.setText("| Help");
        bodysemua.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 460, 49, -1));

        about2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        about2.setForeground(new java.awt.Color(0, 245, 255));
        about2.setText("About |");
        about2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                about2MouseClicked(evt);
            }
        });
        bodysemua.add(about2, new org.netbeans.lib.awtextra.AbsoluteConstraints(857, 0, -1, -1));

        about3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        about3.setForeground(new java.awt.Color(0, 245, 255));
        about3.setText("Help");
        about3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                about3MouseClicked(evt);
            }
        });
        bodysemua.add(about3, new org.netbeans.lib.awtextra.AbsoluteConstraints(901, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bodysemua, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bodysemua, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        Home n = new Home();
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaBarangActionPerformed

    private void txtJumlahBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahBarangActionPerformed

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        controller.insertPengeluaran(this);
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        controller.updatePengeluaran(this);
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        controller.deletePengeluaran(this);
    }//GEN-LAST:event_btnHapusActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        Schedule n = new Schedule();
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void about2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_about2MouseClicked
        // TODO add your handling code here:
        About n = new About();
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_about2MouseClicked

    private void about3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_about3MouseClicked
        // TODO add your handling code here:
        Help n = new Help();
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_about3MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        MainMember n = new MainMember();
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        MainPengeluaran n = new MainPengeluaran();
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_aboutMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel about;
    private javax.swing.JLabel about2;
    private javax.swing.JLabel about3;
    private javax.swing.JPanel bodysemua;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JPanel icons;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menu;
    private javax.swing.JTable tablePengeluaran;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtJumlahBarang;
    private javax.swing.JTextField txtNamaBarang;
    private com.toedter.calendar.JDateChooser txtWaktu;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onInsert(Pengeluarans barang) {
        tabelModel.add(barang);
    }

    @Override
    public void onChange(PengeluaranModel model) {
        txtNamaBarang.setText(model.getNamaBarang());
        txtJumlahBarang.setText(String.valueOf(model.getJumlahBarang()));
        txtWaktu.setDate(model.getWaktuPembelian());
        txtHarga.setText(String.valueOf(model.getHargaBarang()));
    }

    @Override
    public void onDelete() {
        int index = tablePengeluaran.getSelectedRow();
        tabelModel.remove(index);
    }

    @Override
    public void onUpdate(Pengeluarans barang) {
        int index = tablePengeluaran.getSelectedRow();
        tabelModel.set(index, barang);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        try {
            Pengeluarans model = tabelModel.get(tablePengeluaran.getSelectedRow());
            txtNamaBarang.setText(model.getNamaBarang());
            txtJumlahBarang.setText(String.valueOf(model.getJumlahBarang()));
            txtWaktu.setDate(model.getWaktuPembelian());
            txtHarga.setText(String.valueOf(model.getHargaBarang()));
        } catch (IndexOutOfBoundsException exception) {
        }
    }

    public void loadDatabase() throws SQLException, ScheduleException {
        PengeluaranDao dao = TubesDatabase.getPengeluaranDao();
        tabelModel.setList(dao.selectAllPengeluaran());
    }

}
