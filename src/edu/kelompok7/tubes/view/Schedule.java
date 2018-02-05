/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok7.tubes.view;

import edu.kelompok7.tubes.controller.ScheduleController;
import edu.kelompok7.tubes.database.TubesDatabase;
import edu.kelompok7.tubes.entity.Schedules;
import edu.kelompok7.tubes.error.ScheduleException;
import edu.kelompok7.tubes.event.ScheduleListener;
import edu.kelompok7.tubes.model.ScheduleModel;
import edu.kelompok7.tubes.model.TabelScheduleModel;
import edu.kelompok7.tubes.service.ScheduleDao;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Flow
 */
public class Schedule extends javax.swing.JPanel implements ScheduleListener, ListSelectionListener {

    /**
     * Creates new form Schedule
     */
    private TabelScheduleModel tabelModel;
    private ScheduleModel model;
    private ScheduleController controller;

    public Schedule() {
        tabelModel = new TabelScheduleModel();
        initComponents();
        tbSchedule.setModel(tabelModel);

        model = new ScheduleModel();
        model.setListener(this);

        controller = new ScheduleController();
        controller.setModel(model);

        tbSchedule.getSelectionModel().addListSelectionListener(this);

    }

    public JComboBox<String> getCbDP() {
        return cbDP;
    }

    public void setCbDP(JComboBox<String> cbDP) {
        this.cbDP = cbDP;
    }

    public JTextField getjPAkhirSchedule() {
        return jPAkhirSchedule;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JTextField getjTBayar() {
        return jTBayar;
    }

    public JTable getTbSchedule() {
        return tbSchedule;
    }

    public JTextField getTxtJSewaSchedule() {
        return txtJSewaSchedule;
    }

    public JComboBox<String> getTxtMemberSchedule() {
        return txtMemberSchedule;
    }

    public JTextField getTxtNamaSchedule() {
        return txtNamaSchedule;
    }

    public JTextField getTxtTeleponSchedule() {
        return txtTeleponSchedule;
    }

    public JComboBox<String> getCbJLapangSchedule() {
        return cbJLapangSchedule;
    }

    public void setCbJLapangSchedule(JComboBox<String> cbJLapangSchedule) {
        this.cbJLapangSchedule = cbJLapangSchedule;
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
        about1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNamaSchedule = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMemberSchedule = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtTeleponSchedule = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtJSewaSchedule = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cbJLapangSchedule = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jPAkhirSchedule = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTBayar = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSchedule = new javax.swing.JTable();
        btnHapus = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        cbDP = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        about = new javax.swing.JLabel();
        about2 = new javax.swing.JLabel();

        bodysemua.setBackground(new java.awt.Color(55, 53, 66));
        bodysemua.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icons.setBackground(new java.awt.Color(67, 66, 80));

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

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok7/tubes/asset/icons8-home-page-50.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        about1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        about1.setForeground(new java.awt.Color(0, 245, 255));
        about1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok7/tubes/asset/icons8-shutdown-15 (1).png"))); // NOI18N
        about1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                about1MouseClicked(evt);
            }
        });

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

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok7/tubes/asset/icons8-people-50.png"))); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/kelompok7/tubes/asset/icons8-money-50.png"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout iconsLayout = new javax.swing.GroupLayout(icons);
        icons.setLayout(iconsLayout);
        iconsLayout.setHorizontalGroup(
            iconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconsLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(about1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(iconsLayout.createSequentialGroup()
                .addGroup(iconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(iconsLayout.createSequentialGroup()
                        .addGroup(iconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(iconsLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2))
                            .addGroup(iconsLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(iconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(iconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        iconsLayout.setVerticalGroup(
            iconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconsLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(iconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(iconsLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iconsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addComponent(about1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bodysemua.add(icons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menu.setBackground(new java.awt.Color(55, 53, 66));
        menu.setForeground(new java.awt.Color(55, 53, 66));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 245, 255));
        jLabel5.setText("JADWAL DAN PEMBAYARAN ");
        menu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 21, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NAMA            :");
        menu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 121, -1, -1));

        txtNamaSchedule.setFont(new java.awt.Font("Segoe UI Semilight", 1, 11)); // NOI18N
        txtNamaSchedule.setForeground(new java.awt.Color(67, 66, 80));
        txtNamaSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaScheduleActionPerformed(evt);
            }
        });
        menu.add(txtNamaSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 118, 156, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MEMBER        :");
        menu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 153, -1, -1));

        txtMemberSchedule.setFont(new java.awt.Font("Segoe UI Semilight", 1, 11)); // NOI18N
        txtMemberSchedule.setForeground(new java.awt.Color(67, 66, 80));
        txtMemberSchedule.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ya", "Bukan" }));
        menu.add(txtMemberSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("NO TELEPON :");
        menu.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 185, -1, -1));

        txtTeleponSchedule.setFont(new java.awt.Font("Segoe UI Semilight", 1, 11)); // NOI18N
        txtTeleponSchedule.setForeground(new java.awt.Color(67, 66, 80));
        txtTeleponSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeleponScheduleActionPerformed(evt);
            }
        });
        menu.add(txtTeleponSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 182, 156, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DP BOOKING :");
        menu.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 217, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("JAM PENYEWAAN            :");
        menu.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 121, -1, -1));

        txtJSewaSchedule.setFont(new java.awt.Font("Segoe UI Semilight", 1, 11)); // NOI18N
        txtJSewaSchedule.setForeground(new java.awt.Color(67, 66, 80));
        txtJSewaSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJSewaScheduleActionPerformed(evt);
            }
        });
        menu.add(txtJSewaSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 118, 156, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("JENIS LAPANG                  :");
        menu.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 153, -1, -1));

        cbJLapangSchedule.setFont(new java.awt.Font("Segoe UI Semilight", 1, 11)); // NOI18N
        cbJLapangSchedule.setForeground(new java.awt.Color(67, 66, 80));
        cbJLapangSchedule.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        menu.add(cbJLapangSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("PEMBAYARAN AKHIR       :");
        menu.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 185, -1, -1));

        jPAkhirSchedule.setFont(new java.awt.Font("Segoe UI Semilight", 1, 11)); // NOI18N
        jPAkhirSchedule.setForeground(new java.awt.Color(67, 66, 80));
        jPAkhirSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPAkhirScheduleActionPerformed(evt);
            }
        });
        menu.add(jPAkhirSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 182, 156, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(" TOTAL PEMBAYARAN      :");
        menu.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 217, -1, -1));

        jTBayar.setFont(new java.awt.Font("Segoe UI Semilight", 1, 11)); // NOI18N
        jTBayar.setForeground(new java.awt.Color(67, 66, 80));
        jTBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBayarActionPerformed(evt);
            }
        });
        menu.add(jTBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 214, 156, -1));

        btnSimpan.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        btnSimpan.setText("SELESAI!");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        menu.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 254, 166, -1));

        tbSchedule.setAutoCreateRowSorter(true);
        tbSchedule.setBackground(new java.awt.Color(67, 66, 80));
        tbSchedule.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        tbSchedule.setForeground(new java.awt.Color(0, 245, 255));
        tbSchedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Member", "No Telepon", "Dp Booking", "Jam Penyewaan", "Jenis Lapang", "Pembayaran Akhir", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbSchedule);

        menu.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 840, 306));

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

        cbDP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DP", "CASH" }));
        menu.add(cbDP, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        bodysemua.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 46, 930, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(55, 53, 66));
        jLabel8.setText("| Help");
        bodysemua.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 460, 49, -1));

        about.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        about.setForeground(new java.awt.Color(0, 245, 255));
        about.setText("Help");
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
        });
        bodysemua.add(about, new org.netbeans.lib.awtextra.AbsoluteConstraints(937, 0, -1, -1));

        about2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        about2.setForeground(new java.awt.Color(0, 245, 255));
        about2.setText("About |");
        about2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                about2MouseClicked(evt);
            }
        });
        bodysemua.add(about2, new org.netbeans.lib.awtextra.AbsoluteConstraints(893, 0, -1, -1));

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

    private void txtNamaScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaScheduleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaScheduleActionPerformed

    private void txtTeleponScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeleponScheduleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeleponScheduleActionPerformed

    private void txtJSewaScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJSewaScheduleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJSewaScheduleActionPerformed

    private void jPAkhirScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPAkhirScheduleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPAkhirScheduleActionPerformed

    private void jTBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBayarActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        controller.insertSchedule(this);
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        controller.deleteSchedule(this);
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        controller.updateSchedule(this);
    }//GEN-LAST:event_btnUbahActionPerformed

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

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
        // TODO add your handling code here:
        Help n = new Help();
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_aboutMouseClicked

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

    private void about1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_about1MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_about1MouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel about;
    private javax.swing.JLabel about1;
    private javax.swing.JLabel about2;
    private javax.swing.JPanel bodysemua;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cbDP;
    private javax.swing.JComboBox<String> cbJLapangSchedule;
    private javax.swing.JPanel icons;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTextField jPAkhirSchedule;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTBayar;
    private javax.swing.JPanel menu;
    private javax.swing.JTable tbSchedule;
    private javax.swing.JTextField txtJSewaSchedule;
    private javax.swing.JComboBox<String> txtMemberSchedule;
    private javax.swing.JTextField txtNamaSchedule;
    private javax.swing.JTextField txtTeleponSchedule;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onInsert(Schedules jadwal) {
        tabelModel.add(jadwal);
    }

    @Override
    public void onChange(ScheduleModel model) {
        txtNamaSchedule.setText(model.getNama());
        txtMemberSchedule.setSelectedItem(model.getMember() + 1);
        txtTeleponSchedule.setText(model.getTelepon());
        cbDP.setSelectedItem(model.isDP()+1);
        txtJSewaSchedule.setText(model.getjSewa());
        cbJLapangSchedule.setSelectedItem(model.getjLapang() + 1);
        jPAkhirSchedule.setText(String.valueOf(model.getbAkhir()));
        jTBayar.setText(String.valueOf(model.gettBayar()));

    }

    @Override
    public void onDelete() {
        int index = tbSchedule.getSelectedRow();
        tabelModel.remove(index);
    }

    @Override
    public void onUpdate(Schedules jadwal) {
        int index = tbSchedule.getSelectedRow();
        tabelModel.set(index, jadwal);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        try {
            Schedules model = tabelModel.get(tbSchedule.getSelectedRow());
            txtNamaSchedule.setText(model.getNama());
            txtMemberSchedule.setSelectedItem(model.getMember() + 1);
            txtTeleponSchedule.setText(model.getTelepon());
            cbDP.setSelectedItem(model.getDP()+1);
            txtJSewaSchedule.setText(model.getjSewa());
            cbJLapangSchedule.setSelectedIndex(model.getjLapang() + 1);
            jPAkhirSchedule.setText(String.valueOf(model.getbAkhir()));
            jTBayar.setText(String.valueOf(model.gettBayar()));
        } catch (IndexOutOfBoundsException exception) {
        }
    }

    public void loadDatabase() throws SQLException, ScheduleException {
        ScheduleDao dao = TubesDatabase.getScheduleDao();
        tabelModel.setList(dao.selectAllSchedules());
    }
}
