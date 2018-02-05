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
import edu.kelompok7.tubes.service.MemberDao;
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
public class MemberDaoImpl implements MemberDao {

    private Connection connection;

    private final String insertMember = "INSERT INTO MEMBER (NAMA, ALAMAT, TANGGAL, BAYAR, TOTAL) VALUES (?,?,?,?,?)";

    private final String updateMember = "UPDATE MEMBER SET NAMA=?,ALAMAT=?,TANGGAL=?,BAYAR=?,TOTAL=? WHERE MEMBERID=?";

    private final String deleteMember = "DELETE FROM MEMBER WHERE MEMBERID=?";

    private final String getByID = "SELECT * FROM MEMBER WHERE MEMBERID=?";

    private final String selectAllMember = "SELECT * FROM MEMBER";

    public MemberDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insertMember(Members member) throws ScheduleException {
        PreparedStatement statement = null;

        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(insertMember, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, member.getNama());
            statement.setString(2, member.getAlamat());
            statement.setDate(3, (Date) member.getTanggal());
            statement.setInt(4, member.getPembayaran());
            statement.setInt(5, member.getTbayar());
            statement.executeUpdate();

            ResultSet result = statement.getGeneratedKeys();
            if (result.next()) {
                member.setMemberId(result.getInt(1));
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
    public void updateMember(Members member) throws ScheduleException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(updateMember);
            statement.setString(1, member.getNama());
            statement.setString(2, member.getAlamat());
            statement.setDate(3, (Date) member.getTanggal());
            statement.setInt(4, member.getPembayaran());
            statement.setInt(5, member.getTbayar());
            statement.setInt(6, member.getMemberId());
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
    public void deleteMember(Integer memberId) throws ScheduleException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(deleteMember);
            statement.setInt(1, memberId);
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
    public Members getMember(Integer memberId) throws ScheduleException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(getByID);
            statement.setInt(1, memberId);

            ResultSet result = statement.executeQuery();
            Members member = null;

            if (result.next()) {

                member.setMemberId(result.getInt("MEMBERID"));
                member.setNama(result.getString("NAMA"));
                member.setAlamat(result.getString("ALAMAT"));
                member.setTanggal(result.getDate("TANGGAL"));
                member.setPembayaran(result.getInt("BAYAR"));
                member.setTbayar(result.getInt("TOTAL"));

            } else {
                throw new ScheduleException("Pelanggan dengan id " + memberId + " tidak ditemukan");
            }
            connection.commit();
            return member;
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
    public List<Members> selectAllMember() throws ScheduleException {
        Statement statement = null;
        List<Members> list = new ArrayList<Members>();
        try {
            connection.setAutoCommit(false);
            statement = connection.createStatement();

            ResultSet result = statement.executeQuery(selectAllMember);
            while (result.next()) {
                Members member = new Members();
                member.setMemberId(result.getInt("MEMBERID"));
                member.setNama(result.getString("NAMA"));
                member.setAlamat(result.getString("ALAMAT"));
                member.setTanggal(result.getDate("TANGGAL"));
                member.setPembayaran(result.getInt("BAYAR"));
                member.setTbayar(result.getInt("TOTAL"));
                list.add(member);
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
