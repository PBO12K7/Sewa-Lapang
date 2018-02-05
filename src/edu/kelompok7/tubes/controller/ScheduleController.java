/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok7.tubes.controller;

import edu.kelompok7.tubes.model.ScheduleModel;
import edu.kelompok7.tubes.view.Schedule;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Flow
 */
public class ScheduleController {

    private ScheduleModel model;

    public void setModel(ScheduleModel model) {
        this.model = model;
    }

    public void insertSchedule(Schedule view) {
        String nama = view.getTxtNamaSchedule().getText();
        String member = (String) view.getTxtMemberSchedule().getSelectedItem();
        String telepon = view.getTxtTeleponSchedule().getText();
        String DP =(String) view.getCbDP().getSelectedItem();
        String jSewa = view.getTxtJSewaSchedule().getText();
        int jLapang = (int) view.getCbJLapangSchedule().getSelectedIndex() + 1;

        Integer bAkhir = Integer.parseInt(view.getjPAkhirSchedule().getText());;
        Integer tBayar = Integer.parseInt(view.getjTBayar().getText());;
        

        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh kosong");
        } else if (nama.trim().length() > 16) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh lebih dari 16 karakter");
        } else if (member.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Member tidak boleh kosong");
        } else if (telepon.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nomor telepon tidak boleh kosong");
        } else if (telepon.trim().length() > 13) {
            JOptionPane.showMessageDialog(view, "Nomor telepon tidak boleh lebih dari 13 karakter");
        } else if (jSewa.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Jenis Penyewaan");
        } else {
            model.setNama(nama);
            model.setMember(member);
            model.setTelepon(telepon);
            model.setDP(DP);
            model.setjLapang(jLapang);
            model.setjSewa(jSewa);
            model.setbAkhir(bAkhir);
            model.settBayar(tBayar);

            try {
                model.insertSchedules();
                JOptionPane.showMessageDialog(view, "Data berhasil dimasukkan");
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi error di dalam database dengan pesan", e.getMessage()});
            }

        }
    }

    public void updateSchedule(Schedule view) {

        if (view.getTbSchedule().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(view, "Silahkan seleksi baris data yang akan di ubah");
            return;
        }

        //Integer id = Integer.parseInt(view.getTxtId().getText());
        String nama = view.getTxtNamaSchedule().getText();
        String member = (String) view.getTxtMemberSchedule().getSelectedItem();
        String telepon = view.getTxtTeleponSchedule().getText();
        String DP =(String) view.getCbDP().getSelectedItem();
        String jSewa = view.getTxtJSewaSchedule().getText();
        int jLapang = (int) view.getCbJLapangSchedule().getSelectedIndex() + 1;

        int bAkhir = (int) view.getjPAkhirSchedule().getComponentCount();
        int tBayar = view.getjTBayar().getComponentCount();

        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh kosong");
        } else if (nama.trim().length() > 16) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh lebih dari 16 karakter");
        } else if (member.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Member tidak boleh kosong");
        } else if (telepon.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nomor telepon tidak boleh kosong");
        } else if (telepon.trim().length() > 13) {
            JOptionPane.showMessageDialog(view, "Nomor telepon tidak boleh lebih dari 13 karakter");
        } else if (jSewa.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Jenis Penyewaan");
        } else {

            model.setNama(nama);
            model.setMember(member);
            model.setTelepon(telepon);
            model.setDP(DP);
            model.setjLapang(jLapang);
            model.setjSewa(jSewa);
            model.setbAkhir(bAkhir);
            model.settBayar(tBayar);

            try {
                model.updateSchedule();
                JOptionPane.showMessageDialog(view, "Pelanggan Berhasil Di Ubah");
                model.resetSchedule();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di Database dengan pesan ", throwable.getMessage()});

            }

        }
    }

    public void deleteSchedule(Schedule view) {

        if (view.getTbSchedule().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(view, "Silahkan seleksi baris data yang akan di hapus");
            return;
        }
        if (JOptionPane.showConfirmDialog(view, "Anda yakin akan menghapus?") == JOptionPane.OK_OPTION) {
            String nama = view.getTxtNamaSchedule().getText();
            model.setNama(nama);

            try {
                model.deleteSchedule();
                JOptionPane.showMessageDialog(view, "Pelanggan Berhasil Di Hapus");
                model.resetSchedule();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di Database dengan pesan ", throwable.getMessage()});

            }
        }

    }
}
