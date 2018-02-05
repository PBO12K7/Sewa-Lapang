/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok7.tubes.impl;

import edu.kelompok7.tubes.entity.Members;
import edu.kelompok7.tubes.entity.Pengeluarans;
import edu.kelompok7.tubes.entity.Schedules;
import edu.kelompok7.tubes.error.ScheduleException;
import edu.kelompok7.tubes.service.PengeluaranDao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Flow
 */
public class PengeluaranDaoImpl implements PengeluaranDao {

    private Connection connection;

    private final String insertPengeluaran = "INSERT INTO PENGELUARAN (NAMABARANG, JUMLAH, WAKTU, HBARANG) VALUES (?,?,?,?)";

    private final String updatePengeluaran = "UPDATE PENGELUARAN SET NAMABARANG=?,JUMLAH=?,WAKTU=?,HBARANG=? WHERE BARANGID=?";

    private final String deletePengeluaran = "DELETE FROM PENGELUARAN WHERE MEMBERID=?";

    private final String getByID = "SELECT * FROM PENGELUARAN WHERE MEMBERID=?";

    private final String selectAllPengeluaran = "SELECT * FROM PENGELUARAN";

    public PengeluaranDaoImpl(Connection connection) {
        this.connection = connection;

    }

    @Override
    public void insertPengeluaran(Pengeluarans barang) throws ScheduleException {
        PreparedStatement statement = null;

        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(insertPengeluaran, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, barang.getNamaBarang());
            statement.setInt(2, barang.getJumlahBarang());
            statement.setDate(3, (Date) barang.getWaktuPembelian());
            statement.setInt(4, barang.getHargaBarang());
            statement.executeUpdate();

            ResultSet result = statement.getGeneratedKeys();
            if (result.next()) {
                barang.setBarangId(result.getInt(1));
            }

            connection.commit();
        } catch (SQLException exception) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new ScheduleException(exception.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                }
            }
        }
    }

    @Override
    public void updatePengeluaran(Pengeluarans barang) throws ScheduleException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(insertPengeluaran, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, barang.getNamaBarang());
            statement.setInt(2, barang.getJumlahBarang());
            statement.setDate(3, (Date) barang.getWaktuPembelian());
            statement.setInt(4, barang.getHargaBarang());
            statement.setInt(5, barang.getBarangId());
            statement.executeUpdate();

            connection.commit();

        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new ScheduleException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }
        }
    }

    @Override
    public void deletePengeluaran(Integer barangId) throws ScheduleException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(deletePengeluaran);
            statement.setInt(1, barangId);
            statement.executeUpdate();

            connection.commit();

        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new ScheduleException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }
        }
    }

    @Override
    public Pengeluarans getPengeluaran(Integer barangId) throws ScheduleException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(getByID);
            statement.setInt(1, barangId);

            ResultSet result = statement.executeQuery();
            Pengeluarans barang = null;

            if (result.next()) {

                barang.setBarangId(result.getInt("BARANGID"));
                barang.setNamaBarang(result.getString("NAMABARANG"));
                barang.setJumlahBarang(result.getInt("JUMLAH"));
                barang.setWaktuPembelian(result.getDate("WAKTU"));
                barang.setHargaBarang(result.getInt("HBARANG"));

            } else {
                throw new ScheduleException("Pelanggan dengan id " + barangId + " tidak ditemukan");
            }
            connection.commit();
            return barang;
        } catch (SQLException e) {
            throw new ScheduleException(e.getMessage());
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }
        }
    }

    @Override
    public List<Pengeluarans> selectAllPengeluaran() throws ScheduleException {
        Statement statement = null;
        List<Pengeluarans> list = new ArrayList<Pengeluarans>();
        try {
            connection.setAutoCommit(false);
            statement = connection.createStatement();

            ResultSet result = statement.executeQuery(selectAllPengeluaran);
            while (result.next()) {
                Pengeluarans barang = new Pengeluarans();
                barang.setBarangId(result.getInt("BARANGID"));
                barang.setNamaBarang(result.getString("NAMABARANG"));
                barang.setJumlahBarang(result.getInt("JUMLAH"));
                barang.setWaktuPembelian(result.getDate("WAKTU"));
                barang.setHargaBarang(result.getInt("HBARANG"));
                list.add(barang);
            }
            connection.commit();
            return list;
        } catch (SQLException exception) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new ScheduleException(exception.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                }
            }

        }
    }
}
