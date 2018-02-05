/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok7.tubes.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.kelompok7.tubes.impl.MemberDaoImpl;
import edu.kelompok7.tubes.impl.PengeluaranDaoImpl;
import edu.kelompok7.tubes.impl.SchedulesDaoImpl;
import edu.kelompok7.tubes.service.MemberDao;
import edu.kelompok7.tubes.service.PengeluaranDao;
import edu.kelompok7.tubes.service.ScheduleDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Flow
 */
public class TubesDatabase {

    public Statement stm;
    
    public static Connection connection;

    private static ScheduleDao scheduleDao;

    private static MemberDao memberDao;

    private static PengeluaranDao pengeluaranDao;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {

            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/dbtubes");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
        }

        return connection;
    }

    public void config() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtubes", "root", "");
            stm = connection.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal " + e.getMessage());
        }
    }

    public static ScheduleDao getScheduleDao() throws SQLException {
        if (scheduleDao == null) {
            scheduleDao = new SchedulesDaoImpl(getConnection());
        }

        return scheduleDao;

    }

    public static MemberDao getMemberDao() throws SQLException {
        if (memberDao == null) {
            memberDao = new MemberDaoImpl(getConnection());
        }

        return memberDao;

    }

    public static PengeluaranDao getPengeluaranDao() throws SQLException {
        if (pengeluaranDao == null) {
            pengeluaranDao = new PengeluaranDaoImpl(getConnection());
        }

        return pengeluaranDao;

    }

}
