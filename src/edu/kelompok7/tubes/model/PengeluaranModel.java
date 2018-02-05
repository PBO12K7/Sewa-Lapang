/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok7.tubes.model;

import edu.kelompok7.tubes.database.TubesDatabase;
import edu.kelompok7.tubes.entity.Pengeluarans;
import edu.kelompok7.tubes.error.ScheduleException;
import edu.kelompok7.tubes.event.PengeluaranListener;
import edu.kelompok7.tubes.service.PengeluaranDao;
import java.sql.SQLException;
import java.util.Date;



/**
 *
 * @author Flow
 */
public class PengeluaranModel {

    private int barangId;
    private String namaBarang;
    private int jumlahBarang;
    private Date waktuPembelian;
    private int hargaBarang;

    private PengeluaranListener listener;

    public PengeluaranListener getListener() {
        return listener;
    }

    public void setListener(PengeluaranListener listener) {
        this.listener = listener;
        fireOnChange();
    }

    public int getBarangId() {
        return barangId;
    }

    public void setBarangId(int barangId) {
        this.barangId = barangId;
        fireOnChange();
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
        fireOnChange();
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
        fireOnChange();
    }

    public Date getWaktuPembelian() {
        return waktuPembelian;
    }

    public void setWaktuPembelian(Date waktuPembelian) {
        this.waktuPembelian = waktuPembelian;
        fireOnChange();
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
        fireOnChange();
    }

    protected void fireOnInsert(Pengeluarans barang) {
        if (listener != null) {
            listener.onInsert(barang);

        }
    }

    protected void fireOnChange() {
        if(listener!=null){
            listener.onChange(this);
        }

    }

    protected void fireOnDelete() {
        if (listener != null) {
            listener.onDelete();
        }
    }

    protected void fireOnUpdate(Pengeluarans barang) {
        if (listener != null) {
            listener.onUpdate(barang);
        }
    }

    public void insertPengeluaran() throws SQLException, ScheduleException {
        PengeluaranDao dao = TubesDatabase.getPengeluaranDao();
        Pengeluarans barang = new Pengeluarans();
        barang.setNamaBarang(namaBarang);
        barang.setJumlahBarang(jumlahBarang);
        barang.setWaktuPembelian(waktuPembelian);
        barang.setHargaBarang(hargaBarang);
        fireOnInsert(barang);

    }

    public void updatePengeluaran() throws SQLException, ScheduleException {

        PengeluaranDao dao = TubesDatabase.getPengeluaranDao();
        Pengeluarans barang = new Pengeluarans();
        barang.setNamaBarang(namaBarang);
        barang.setJumlahBarang(jumlahBarang);
        barang.setWaktuPembelian(waktuPembelian);
        barang.setHargaBarang(hargaBarang);

        dao.updatePengeluaran(barang);
        fireOnUpdate(barang);
    }

    public void deletePengeluaran() throws SQLException, ScheduleException {

        PengeluaranDao dao = TubesDatabase.getPengeluaranDao();
        dao.deletePengeluaran(barangId);
        fireOnDelete();
    }

    public void resetPengeluaran() {
        setNamaBarang("");
        setJumlahBarang(0);
        setWaktuPembelian(null);
        setHargaBarang(0);
            
    }

}
