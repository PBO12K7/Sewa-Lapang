/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok7.tubes.model;

import edu.kelompok7.tubes.entity.Members;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Flow
 */
public class TabelMemberModel extends AbstractTableModel {

    private List<Members> list = new ArrayList<Members>();

    public void setList(List<Members> list) {
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

    public boolean add(Members e) {
        try {

            return list.add(e);
        } finally {
            fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1);
        }
    }

    public Members get(int index) {
        return list.get(index);
    }

    public Members set(int index, Members element) {
        try {
            return list.set(index, element);

        } finally {
            fireTableRowsUpdated(index, index);
        }
    }

    public Members remove(int index) {
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
                return "ALAMAT";
            case 2:
                return "TANGGAL";
            case 3:
                return "PEMBAYARAN";
           
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getNama();
            case 1:
                return list.get(rowIndex).getAlamat();
            case 2:
                return list.get(rowIndex).getTanggal();
            case 3:
                return list.get(rowIndex).getPembayaran();
           
            default:
                return null;
        }
    }

}
