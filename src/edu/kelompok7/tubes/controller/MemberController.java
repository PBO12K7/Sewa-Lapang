/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok7.tubes.controller;

import edu.kelompok7.tubes.model.MemberModel;
import edu.kelompok7.tubes.view.Member;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Flow
 */
public class MemberController {

    private MemberModel model;

    public void setModel(MemberModel model) {
        this.model = model;
    }

    public void insertMember(Member view) {
        String nama = view.getTxtNama().getText();
        String alamat = view.getTxtAlamat().getText();
        Date tanggal = (Date) view.getTxtTanggal().getDate();
        Integer pembayaran = Integer.parseInt(view.getTxtPembayaran().getText());

        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh kosong");
        } else if (nama.trim().length() > 16) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh lebih dari 16 karakter");
        } else {
            model.setNama(nama);
            model.setAlamat(alamat);
            model.setTanggal(tanggal);
            model.setPembayaran(pembayaran);

            try {
                model.insertMember();
                JOptionPane.showMessageDialog(view, "Data berhasil dimasukkan");
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi error di dalam database dengan pesan", e.getMessage()});
            }

        }
    }

    public void updateMember(Member view) {

        if (view.getTableMember().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(view, "Silahkan seleksi baris data yang akan di ubah");
            return;
        }

        //Integer id = Integer.parseInt(view.getTxtId().getText());
        String nama = view.getTxtNama().getText();
        String alamat = view.getTxtAlamat().getText();
        Date tanggal = (Date) view.getTxtTanggal().getDate();
        Integer pembayaran = Integer.parseInt(view.getTxtPembayaran().getText());
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh kosong");
        } else if (nama.trim().length() > 16) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh lebih dari 16 karakter");
        } else {
            model.setNama(nama);
            model.setAlamat(alamat);
            model.setTanggal(tanggal);
            model.setPembayaran(pembayaran);
           
            try {
                model.updateMember();
                JOptionPane.showMessageDialog(view, "Pelanggan Berhasil Di Ubah");
                model.resetMember();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di Database dengan pesan ", throwable.getMessage()});

            }

        }
    }

    public void deleteMember(Member view) {

        if (view.getTableMember().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(view, "Silahkan seleksi baris data yang akan di hapus");
            return;
        }
        if (JOptionPane.showConfirmDialog(view, "Anda yakin akan menghapus?") == JOptionPane.OK_OPTION) {
            String nama = view.getTxtNama().getText();
            model.setNama(nama);

            try {
                model.deleteMember();
                JOptionPane.showMessageDialog(view, "Pelanggan Berhasil Di Hapus");
                model.resetMember();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di Database dengan pesan ", throwable.getMessage()});

            }
        }

    }
}
