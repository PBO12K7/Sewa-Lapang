/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok7.tubes.model;

import edu.kelompok7.tubes.entity.Schedules;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Flow
 */
public class TabelScheduleModel extends AbstractTableModel {

    private List<Schedules> list = new ArrayList<Schedules>();

    public void setList(List<Schedules> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {

        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    public boolean add(Schedules e) {
       try{
        
           return list.add(e);
       }finally{
           fireTableRowsInserted(getRowCount()-1,getRowCount()-1);
       }
       }

    public Schedules get(int index) {
        return list.get(index);
    }

    public Schedules set(int index, Schedules element) {
        try {
            return list.set(index, element);

        } finally {
            fireTableRowsUpdated(index, index);
        }
    }

    public Schedules remove(int index) {
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
                return "MEMBER";
            case 2:
                return "TELEPON";
            case 3:
                return "DP";
            case 4:
                return "JAMSEWA";
            case 5:
                return "JENIS LAPANG";
            case 6:
                return "PEMBAYARAN AKHIR";
            case 7:
                return "TOTAL BAYAR";
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
                return list.get(rowIndex).getMember();
            case 2:
                return list.get(rowIndex).getTelepon();
            case 3:
                return list.get(rowIndex).getDP();
            case 4:
                return list.get(rowIndex).getjSewa();
            case 5:
                return list.get(rowIndex).getjLapang();
            case 6:
                return list.get(rowIndex).getbAkhir();
            case 7:
                return list.get(rowIndex).gettBayar();
            default:
                return null;
        }

    }

}
