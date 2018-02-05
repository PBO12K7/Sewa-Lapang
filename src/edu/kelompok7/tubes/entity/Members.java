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
public class Members {
    private int memberId;
    private String nama;
    private String alamat;
    private Date tanggal;
    private int pembayaran;
    private int tbayar;

    public Members() {
    }

    public Members(String nama, String alamat, Date tanggal, int pembayaran, int tbayar) {
        this.nama = nama;
        this.alamat = alamat;
        this.tanggal = tanggal;
        this.pembayaran = pembayaran;
        this.tbayar = tbayar;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public int getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(int pembayaran) {
        this.pembayaran = pembayaran;
    }

    public int getTbayar() {
        return tbayar;
    }

    public void setTbayar(int tbayar) {
        this.tbayar = tbayar;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.memberId;
        hash = 71 * hash + Objects.hashCode(this.nama);
        hash = 71 * hash + Objects.hashCode(this.alamat);
        hash = 71 * hash + Objects.hashCode(this.tanggal);
        hash = 71 * hash + this.pembayaran;
        hash = 71 * hash + this.tbayar;
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
        final Members other = (Members) obj;
        if (this.memberId != other.memberId) {
            return false;
        }
        if (this.pembayaran != other.pembayaran) {
            return false;
        }
        if (this.tbayar != other.tbayar) {
            return false;
        }
        if (!Objects.equals(this.nama, other.nama)) {
            return false;
        }
        if (!Objects.equals(this.alamat, other.alamat)) {
            return false;
        }
        if (!Objects.equals(this.tanggal, other.tanggal)) {
            return false;
        }
        return true;
    }
    
    
    
}
