package com.barberAppointment.dao;

import com.barberAppointment.model.Appointment;

import java.math.BigDecimal;
import java.sql.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*; //Allows to work with lists
import java.util.Date;
//import java.util.logging.*;

import static com.barberAppointment.model.ConnectionDB.close;
import static com.barberAppointment.model.ConnectionDB.getConnectionDB; //se importa estatico para acceder directamente a la funcion getConnectionDB

public class AppointmentDao {
    private Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private Appointment appointment;

    public List<Appointment> select() throws ClassNotFoundException {
        String sql = "SELECT * FROM appointment";
        List<Appointment> appointments = new ArrayList<>();
        try {
            this.connection = getConnectionDB();        //static method from ConnectionDB
            this.ps = this.connection.prepareStatement(sql); //To prepare the SQL query
            this.rs = this.ps.executeQuery(); //to get the result of the query execution

            //Goes through all records from DB from rs
            while(this.rs.next()){
                String id = this.rs.getString("id");
                String barberEmail = this.rs.getString("email_barber");
                String customerEmail = this.rs.getString("email_customer");
                LocalDate date = this.rs.getDate("date").toLocalDate();
                LocalTime time = this.rs.getTime("time").toLocalTime();
                BigDecimal price = this.rs.getBigDecimal("price");

                //creates an appointment with the records pulled from db and adds it to the list
                this.appointment = new Appointment(barberEmail, customerEmail, date, time, price, id);
                appointments.add(this.appointment);

            }
        } catch (SQLException e) {
           e.printStackTrace(System.out);

        } finally {
            //finally is used to close all streams
            try {
                close(this.rs);
                close(this.ps);
                close(this.connection);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }

        return appointments;
    }

    public int insert(Appointment appointment) throws ClassNotFoundException {
        String sql = "INSERT INTO appointment(email_barber, email_customer, date, time, price) VALUES (?, ?, ?, ?, ?)";
        int records = 0;
        try {
            this.connection = getConnectionDB();
            this.ps = this.connection.prepareStatement(sql); //To prepare the SQL query

            //sends the appointment values to the sql VALUES ? query
            this.ps.setString(1, appointment.getBarberEmail());
            this.ps.setString(2, appointment.getCustomerEmail());
            this.ps.setString(3, appointment.getDate().toString());
            this.ps.setString(4, appointment.getTime().toString());
            this.ps.setString(5, appointment.getPrice().toString());
            records = this.ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);

        } finally {
            //finally is used to close all streams
            try {
                close(this.ps);
                close(this.connection);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }

        return records;
    }

    public int edit(Appointment appointment) throws ClassNotFoundException {
        String sql = "UPDATE appointment SET email_barber=?, email_customer=?, date=?, time=?, price=? WHERE id=?";
        int records = 0;
        try {
            this.connection = getConnectionDB();
            this.ps = this.connection.prepareStatement(sql); //To prepare the SQL query

            //sends the appointment values to the sql VALUES ? query
            this.ps.setString(1, appointment.getBarberEmail());
            this.ps.setString(2, appointment.getCustomerEmail());
            this.ps.setString(3, appointment.getDate().toString());
            this.ps.setString(4, appointment.getTime().toString());
            this.ps.setString(5, appointment.getPrice().toString());
            this.ps.setString(6, appointment.getId().toString());
            records = this.ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);

        } finally {
            //finally is used to close all streams
            try {
                close(this.ps);
                close(this.connection);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }

        return records;
    }

    public int delete(Appointment appointment) throws ClassNotFoundException {
        String sql = "DELETE FROM appointment WHERE id=?";
        int records = 0;
        try {
            this.connection = getConnectionDB();
            this.ps = this.connection.prepareStatement(sql); //To prepare the SQL query

            //sends the appointment values to the sql VALUES ? query
            this.ps.setString(1, appointment.getId());
            records = this.ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);

        } finally {
            //finally is used to close all streams
            try {
                close(this.ps);
                close(this.connection);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }

        return records;
    }
}
