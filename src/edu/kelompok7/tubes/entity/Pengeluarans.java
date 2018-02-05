/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok7.tubes.entity;


import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Flow
 */
public class Pengeluarans {
    private int barangId;
    private String namaBarang;
    private int jumlahBarang;
    private Date waktuPembelian;
    private int hargaBarang;

    public Pengeluarans() {
    }

    public Pengeluarans(String namaBarang, int jumlahBarang, Date waktuPembelian, int hargaBarang) {
        this.namaBarang = namaBarang;
        this.jumlahBarang = jumlahBarang;
        this.waktuPembelian = waktuPembelian;
        this.hargaBarang = hargaBarang;
    }

    public int getBarangId() {
        return barangId;
    }

    public void setBarangId(int barangId) {
        this.barangId = barangId;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public Date getWaktuPembelian() {
        return waktuPembelian;
    }

    public void setWaktuPembelian(Date waktuPembelian) {
        this.waktuPembelian = waktuPembelian;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + this.barangId;
        hash = 43 * hash + Objects.hashCode(this.namaBarang);
        hash = 43 * hash + this.jumlahBarang;
        hash = 43 * hash + Objects.hashCode(this.waktuPembelian);
        hash = 43 * hash + this.hargaBarang;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pengeluarans other = (Pengeluarans) obj;
        if (this.barangId != other.barangId) {
            return false;
        }
        if (this.jumlahBarang != other.jumlahBarang) {
            return false;
        }
        if (this.hargaBarang != other.hargaBarang) {
            return false;
        }
        if (!Objects.equals(this.namaBarang, other.namaBarang)) {
            return false;
        }
        if (!Objects.equals(this.waktuPembelian, other.waktuPembelian)) {
            return false;
        }
        return true;
    }
    
    
    
}
