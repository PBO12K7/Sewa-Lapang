/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok7.tubes.entity;

import java.util.Objects;

/**
 *
 * @author Flow
 */
public class Schedules {
    private Integer sewaId;
    private String nama;
    private String member;
    private String telepon;
    private String DP;
    private String jSewa;
    private int jLapang;
    private int bAkhir;
    private int tBayar;

    public Schedules() {
    }

    public Schedules(String nama, String member, String telepon, String DP, String jSewa, int jLapang, int bAkhir, int tBayar) {
        this.nama = nama;
        this.member = member;
        this.telepon = telepon;
        this.DP = DP;
        this.jSewa = jSewa;
        this.jLapang = jLapang;
        this.bAkhir = bAkhir;
        this.tBayar = tBayar;
    }

    public int getSewaId() {
        return sewaId;
    }

    public void setSewaId(int sewaId) {
        this.sewaId = sewaId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getDP() {
        return DP;
    }

    public void setDP(String DP) {
        this.DP = DP;
    }

    public String getjSewa() {
        return jSewa;
    }

    public void setjSewa(String jSewa) {
        this.jSewa = jSewa;
    }

    public Integer getjLapang() {
        return jLapang;
    }

    public void setjLapang(Integer jLapang) {
        this.jLapang = jLapang;
    }

    public int getbAkhir() {
        return bAkhir;
    }

    public void setbAkhir(int bAkhir) {
        this.bAkhir = bAkhir;
    }

    public int gettBayar() {
        return tBayar;
    }

    public void settBayar(int tBayar) {
        this.tBayar = tBayar;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.sewaId);
        hash = 41 * hash + Objects.hashCode(this.nama);
        hash = 41 * hash + Objects.hashCode(this.member);
        hash = 41 * hash + Objects.hashCode(this.telepon);
        hash = 41 * hash + Objects.hashCode(this.DP);
        hash = 41 * hash + Objects.hashCode(this.jSewa);
        hash = 41 * hash + this.jLapang;
        hash = 41 * hash + this.bAkhir;
        hash = 41 * hash + this.tBayar;
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
        final Schedules other = (Schedules) obj;
        if (this.DP != other.DP) {
            return false;
        }
        if (this.bAkhir != other.bAkhir) {
            return false;
        }
        if (this.tBayar != other.tBayar) {
            return false;
        }
        if (!Objects.equals(this.nama, other.nama)) {
            return false;
        }
        if (!Objects.equals(this.member, other.member)) {
            return false;
        }
        if (!Objects.equals(this.jSewa, other.jSewa)) {
            return false;
        }
        if (!Objects.equals(this.sewaId, other.sewaId)) {
            return false;
        }
        if (!Objects.equals(this.telepon, other.telepon)) {
            return false;
        }
        if (!Objects.equals(this.jLapang, other.jLapang)) {
            return false;
        }
        return true;
    }

    
    
    
}
