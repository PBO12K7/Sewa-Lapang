/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok7.tubes.model;

import edu.kelompok7.tubes.entity.Pengeluarans;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Flow
 */
public class TabelPengeluaranModel extends AbstractTableModel {

    private List<Pengeluarans> list = new ArrayList<Pengeluarans>();

    public void setList(List<Pengeluarans> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    public boolean add(Pengeluarans e) {
        try {

            return list.add(e);
        } finally {
            fireTableRowsInserted(getRowCount() -1, getRowCount() - 1);
        }
    }

    public Pengeluarans get(int index) {
        return list.get(index);
    }

    public Pengeluarans set(int index, Pengeluarans element) {
        try {
            return list.set(index, element);

        } finally {
            fireTableRowsUpdated(index, index);
        }
    }

    public Pengeluarans remove(int index) {
        try {
            return list.remove(index);
        } finally {
            fireTableRowsDeleted(index, index);
        }

    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NAMA";
            case 1:
                return "JUMLAH";
            case 2:
                return "WAKTU";
            case 3:
                return "HARGA";

            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getNamaBarang();
            case 1:
                return list.get(rowIndex).getJumlahBarang();
            case 2:
                return list.get(rowIndex).getWaktuPembelian();
            case 3:
                return list.get(rowIndex).getHargaBarang();

            default:
                return null;
        }
    }

}
