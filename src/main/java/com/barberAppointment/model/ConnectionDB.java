package com.barberAppointment.model;

import java.sql.*;

public class ConnectionDB {
    private static final String URL = "jdbc:mysql://localhost/barber_appointment_db?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "system";

    //Returns the connection to the db
    public static Connection getConnectionDB() throws SQLException, ClassNotFoundException {

        //since its a java web app its necessary to make this setting
        Class.forName("com.mysql.cj.jdbc.Driver");

        return (Connection) DriverManager.getConnection(URL, USER, PASS);
    }

    //Methods to close all connections made to db
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
