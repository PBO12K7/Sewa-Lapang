/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok7.tubes.impl;

import edu.kelompok7.tubes.entity.Schedules;
import edu.kelompok7.tubes.error.ScheduleException;
import edu.kelompok7.tubes.service.ScheduleDao;
import java.sql.Connection;
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
public class SchedulesDaoImpl implements ScheduleDao {

    private Connection connection;

    private final String insertSchedule = "INSERT INTO SCHEDULE (NAMA, MEMBER, TELEPON, DP, JSEWA, JLAPANG, BAKHIR, TBAYAR) VALUES (?,?,?,?,?,?,?,?)";

    private final String updateSchedule = "UPDATE SCHEDULE SET NAMA=?,MEMBER=?,TELEPON=?,DP=?,JSEWA=?,JLAPANG=?,BAKHIR=?,TBAYAR=? WHERE ID=?";

    private final String deleteSchedule = "DELETE FROM SCHEDULE WHERE SEWAID=?";

    private final String getByID = "SELECT * FROM SCHEDULE WHERE SEWAID=?";

    private final String selectAllSchedules = "SELECT * FROM SCHEDULE";

    public SchedulesDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insertSchedule(Schedules jadwal) throws ScheduleException {
        PreparedStatement statement = null;

        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(insertSchedule, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, jadwal.getNama());
            statement.setString(2, jadwal.getMember());
            statement.setString(3, jadwal.getTelepon());
            statement.setString(4, jadwal.getDP());
            statement.setString(5, jadwal.getjSewa());
            statement.setInt(6, jadwal.getjLapang());
            statement.setInt(7, jadwal.getbAkhir());
            statement.setInt(8, jadwal.gettBayar());
            statement.executeUpdate();

            ResultSet result = statement.getGeneratedKeys();
            if (result.next()) {
                jadwal.setSewaId(result.getInt(1));
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
    public List<Schedules> selectAllSchedules() throws ScheduleException {
        Statement statement = null;
        List<Schedules> list = new ArrayList<Schedules>();
        try {
            connection.setAutoCommit(false);
            statement = connection.createStatement();

            ResultSet result = statement.executeQuery(selectAllSchedules);
            while (result.next()) {
                Schedules jadwal = new Schedules();
                jadwal.setSewaId(result.getInt("SEWAID"));
                jadwal.setNama(result.getString("NAMA"));
                jadwal.setMember(result.getString("MEMBER"));
                jadwal.setTelepon(result.getString("TELEPON"));
                jadwal.setDP(result.getString("DP"));
                jadwal.setjSewa(result.getString("JAMSEWA"));
                jadwal.setjLapang(result.getInt("JLAPANG"));
                jadwal.setbAkhir(result.getInt("BAKHIR"));
                jadwal.settBayar(result.getInt("TBAYAR"));
                list.add(jadwal);
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

    @Override
    public void updateSchedule(Schedules jadwal) throws ScheduleException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(updateSchedule);
            statement.setString(1, jadwal.getNama());
            statement.setString(2, jadwal.getMember());
            statement.setString(3, jadwal.getTelepon());
            statement.setString(4, jadwal.getDP());
            statement.setString(5, jadwal.getjSewa());
            statement.setInt(6, jadwal.getjLapang());
            statement.setInt(7, jadwal.getbAkhir());
            statement.setInt(8, jadwal.gettBayar());
            statement.setInt(9, jadwal.getSewaId());
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
    public void deleteSchedule(Integer sewaId) throws ScheduleException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(deleteSchedule);
            statement.setInt(1, sewaId);
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
    public Schedules getSchedule(Integer sewaId) throws ScheduleException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(getByID);
            statement.setInt(1, sewaId);

            ResultSet result = statement.executeQuery();
            Schedules jadwal = null;

            if (result.next()) {

                jadwal.setSewaId(result.getInt("SEWAID"));
                jadwal.setNama(result.getString("NAMA"));
                jadwal.setMember(result.getString("MEMBER"));
                jadwal.setTelepon(result.getString("TELEPON"));
                jadwal.setDP(result.getString("DP"));
                jadwal.setjSewa(result.getString("JAMSEWA"));
                jadwal.setjLapang(result.getInt("JLAPANG"));
                jadwal.setbAkhir(result.getInt("BAKHIR"));
                jadwal.settBayar(result.getInt("TBAYAR"));
            } else {
                throw new ScheduleException("Pelanggan dengan id " + sewaId + " tidak ditemukan");
            }
            connection.commit();
            return jadwal;
        } catch (SQLException e) {
            throw new ScheduleException(e.getMessage());
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }
        }}
}
