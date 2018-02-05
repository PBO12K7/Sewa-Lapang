/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok7.tubes.model;

import edu.kelompok7.tubes.database.TubesDatabase;
import edu.kelompok7.tubes.entity.Members;
import edu.kelompok7.tubes.error.ScheduleException;
import edu.kelompok7.tubes.event.MemberListener;
import edu.kelompok7.tubes.service.MemberDao;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Flow
 */
public class MemberModel {

    private int memberId;
    private String nama;
    private String alamat;
    private Date tanggal;
    private int pembayaran;
    private int tbayar;

    private MemberListener listener;

    public MemberListener getListener() {
        return listener;

    }

    public void setListener(MemberListener listener) {
        this.listener = listener;
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

    protected void fireOnInsert(Members member) {
        if (listener != null) {
            listener.onInsert(member);

        }
    }

    protected void fireOnChange() {
        if (listener != null) {
            listener.onChange(this);
        }

    }

    protected void fireOnDelete() {
        if (listener != null) {
            listener.onDelete();
        }
    }

    protected void fireOnUpdate(Members member) {
        if (listener != null) {
            listener.onUpdate(member);
        }
    }

    public void insertMember() throws SQLException, ScheduleException {
        MemberDao dao = TubesDatabase.getMemberDao();
        Members member = new Members();
        member.setNama(nama);
        member.setAlamat(alamat);
        member.setTanggal(tanggal);
        member.setPembayaran(pembayaran);
        member.setTbayar(tbayar);
        fireOnInsert(member);

    }

    public void updateMember() throws SQLException, ScheduleException {

        MemberDao dao = TubesDatabase.getMemberDao();
        Members member = new Members();
        member.setNama(nama);
        member.setAlamat(alamat);
        member.setTanggal(tanggal);
        member.setPembayaran(pembayaran);
        member.setTbayar(tbayar);

        dao.updateMember(member);
        fireOnUpdate(member);
    }

    public void deleteMember() throws SQLException, ScheduleException {

        MemberDao dao = TubesDatabase.getMemberDao();
        dao.deleteMember(memberId);
        fireOnDelete();
    }

    public void resetMember() {
        setMemberId(0);
        setAlamat("");
        setTanggal(null);
        setPembayaran(0);
        setTbayar(0);

    }
}
