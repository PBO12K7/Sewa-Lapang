/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok7.tubes.model;

import edu.kelompok7.tubes.database.TubesDatabase;
import edu.kelompok7.tubes.entity.Schedules;
import edu.kelompok7.tubes.error.ScheduleException;
import edu.kelompok7.tubes.event.ScheduleListener;
import edu.kelompok7.tubes.service.ScheduleDao;
import java.sql.SQLException;

/**
 *
 * @author Flow
 */
public class ScheduleModel {

    private int sewaId;
    private String nama;
    private String member;
    private String telepon;
    private String DP;
    private String jSewa;
    private int jLapang;
    private int bAkhir;
    private int tBayar;

    private ScheduleListener listener;

    public ScheduleListener getListener() {
        return listener;
    }

    public void setListener(ScheduleListener listener) {
        this.listener = listener;
        fireOnChange();
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
        fireOnChange();

    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
        fireOnChange();
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
        fireOnChange();
    }

    public String isDP() {
        return DP;
    }

    public void setDP(String DP) {
        this.DP = DP;
        fireOnChange();
    }

    public String getjSewa() {
        return jSewa;
    }

    public void setjSewa(String jSewa) {
        this.jSewa = jSewa;
        fireOnChange();
    }

    public Integer getjLapang() {
        return jLapang;

    }

    public void setjLapang(Integer jLapang) {
        this.jLapang = jLapang;
        fireOnChange();
    }

    public int getbAkhir() {
        return bAkhir;
    }

    public void setbAkhir(int bAkhir) {
        this.bAkhir = bAkhir;
        fireOnChange();
    }

    public int gettBayar() {
        return tBayar;
    }

    public void settBayar(int tBayar) {
        this.tBayar = tBayar;
        fireOnChange();
    }

    protected void fireOnInsert(Schedules jadwal) {
        if (listener != null) {
            listener.onInsert(jadwal);

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

    protected void fireOnUpdate(Schedules jadwal) {
        if (listener != null) {
            listener.onUpdate(jadwal);
        }
    }

    public void insertSchedules() throws SQLException, ScheduleException {
        ScheduleDao dao = TubesDatabase.getScheduleDao();
        Schedules jadwal = new Schedules();
        jadwal.setNama(nama);
        jadwal.setMember(member);
        jadwal.setTelepon(telepon);
        jadwal.setDP(DP);
        jadwal.setjSewa(jSewa);
        jadwal.setjLapang(jLapang);
        jadwal.setbAkhir(bAkhir);
        jadwal.settBayar(tBayar);
        dao.insertSchedule(jadwal);
        fireOnInsert(jadwal);

    }

    public void updateSchedule() throws SQLException, ScheduleException {

        ScheduleDao dao = TubesDatabase.getScheduleDao();
        Schedules jadwal = new Schedules();
        jadwal.setNama(nama);
        jadwal.setMember(member);
        jadwal.setTelepon(telepon);
        jadwal.setDP(DP);
        jadwal.setjSewa(jSewa);
        jadwal.setjLapang(jLapang);
        jadwal.setbAkhir(bAkhir);
        jadwal.settBayar(tBayar);

        dao.updateSchedule(jadwal);
        fireOnUpdate(jadwal);
    }

    public void deleteSchedule() throws SQLException, ScheduleException {

        ScheduleDao dao = TubesDatabase.getScheduleDao();
        dao.deleteSchedule(sewaId);
        fireOnDelete();
    }

    public void resetSchedule() {
        setSewaId(0);
        setNama("");
        setMember("");
        setTelepon("");
        setDP("");
        setbAkhir(0);
        setjLapang(0);
        setbAkhir(0);
        settBayar(0);
        
    }

 
}
