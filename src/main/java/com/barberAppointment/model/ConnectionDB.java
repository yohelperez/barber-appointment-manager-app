package com.barberAppointment.model;

import java.sql.*;

public class ConnectionDB {
    private static final String URL = "jdbc:mysql://localhost/barber_appointment_db?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "system";

    public static Connection getConnectionDB() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return (Connection) DriverManager.getConnection(URL, USER, PASS);
    }

    public static void close (ResultSet rs) throws SQLException {
        rs.close();
    }

    public static void close(PreparedStatement ps) throws SQLException {
        ps.close();
    }

    public static void close(Connection connection) throws SQLException {
        connection.close();
    }


}
