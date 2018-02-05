/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok7.tubes.controller;

import edu.kelompok7.tubes.model.PengeluaranModel;
import edu.kelompok7.tubes.view.Pengeluaran;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Flow
 */
public class PengeluaranController {

    private PengeluaranModel model;

    public void setModel(PengeluaranModel model) {
        this.model = model;
    }

    public void insertPengeluaran(Pengeluaran view) {
        String namaBarang = view.getTxtNamaBarang().getText();
        Date waktuPembayaran = (Date) view.getTxtWaktu().getDate();
        Integer jumlahBarang = Integer.parseInt(view.getTxtJumlahBarang().getText());
        Integer hargaBarang = Integer.parseInt(view.getTxtHarga().getText());
        if (namaBarang.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh kosong");
        } else if (namaBarang.trim().length() > 16) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh lebih dari 16 karakter");
        } else {
            model.setNamaBarang(namaBarang);
            model.setJumlahBarang(jumlahBarang);
            model.setWaktuPembelian(waktuPembayaran);
            model.setHargaBarang(hargaBarang);
            try {
                model.insertPengeluaran();
                JOptionPane.showMessageDialog(view, "Data berhasil dimasukkan");
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi error di dalam database dengan pesan", e.getMessage()});
            }

        }
    }

    public void updatePengeluaran(Pengeluaran view) {

        if (view.getTablePengeluaran().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(view, "Silahkan seleksi baris data yang akan di ubah");
            return;
        }

        //Integer id = Integer.parseInt(view.getTxtId().getText());
        String namaBarang = view.getTxtNamaBarang().getText();
        Date waktuPembayaran = (Date) view.getTxtWaktu().getDate();
        Integer jumlahBarang = Integer.parseInt(view.getTxtJumlahBarang().getText());
        Integer hargaBarang = Integer.parseInt(view.getTxtHarga().getText());

        if (namaBarang.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh kosong");
        } else if (namaBarang.trim().length() > 16) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh lebih dari 16 karakter");
        } else {
            model.setNamaBarang(namaBarang);
            model.setJumlahBarang(jumlahBarang);
            model.setWaktuPembelian(waktuPembayaran);
            model.setHargaBarang(hargaBarang);

            try {
                model.updatePengeluaran();
                JOptionPane.showMessageDialog(view, "Pelanggan Berhasil Di Ubah");
                model.resetPengeluaran();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di Database dengan pesan ", throwable.getMessage()});

            }

        }
    }

    public void deletePengeluaran(Pengeluaran view) {

        if (view.getTablePengeluaran().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(view, "Silahkan seleksi baris data yang akan di hapus");
            return;
        }
        if (JOptionPane.showConfirmDialog(view, "Anda yakin akan menghapus?") == JOptionPane.OK_OPTION) {
            String namaBarang = view.getTxtNamaBarang().getText();
            model.setNamaBarang(namaBarang);

            try {
                model.deletePengeluaran();
                JOptionPane.showMessageDialog(view, "Pelanggan Berhasil Di Hapus");
                model.resetPengeluaran();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di Database dengan pesan ", throwable.getMessage()});

            }
        }

    }
}
