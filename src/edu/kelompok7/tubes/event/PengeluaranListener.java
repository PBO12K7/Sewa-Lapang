/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok7.tubes.event;

import edu.kelompok7.tubes.entity.Pengeluarans;
import edu.kelompok7.tubes.model.PengeluaranModel;

/**
 *
 * @author Flow
 */
public interface PengeluaranListener {
    public void onInsert(Pengeluarans barang);

    public void onChange(PengeluaranModel model);

    public void onDelete();

    public void onUpdate(Pengeluarans barang);
}
