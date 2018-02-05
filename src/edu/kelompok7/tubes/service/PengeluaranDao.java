/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok7.tubes.service;

import edu.kelompok7.tubes.entity.Members;
import edu.kelompok7.tubes.entity.Pengeluarans;
import edu.kelompok7.tubes.error.ScheduleException;
import java.util.List;

/**
 *
 * @author Flow
 */
public interface PengeluaranDao {
     public void insertPengeluaran(Pengeluarans barang) throws ScheduleException;

    public void updatePengeluaran(Pengeluarans barang) throws ScheduleException;

    public void deletePengeluaran(Integer barangId) throws ScheduleException;

    public Pengeluarans getPengeluaran(Integer barangId) throws ScheduleException;

    public List<Pengeluarans> selectAllPengeluaran() throws ScheduleException;

}
