package com.barberAppointment;

import com.barberAppointment.model.ConnectionDB;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConnectionDB.getConnectionDB();
        System.out.println("Connected successfully..");

    }
}
