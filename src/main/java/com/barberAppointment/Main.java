package com.barberAppointment;

import com.barberAppointment.dao.AppointmentDao;
import com.barberAppointment.model.Appointment;
import com.barberAppointment.model.ConnectionDB;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, ParseException {

        //test for appointment delete
        AppointmentDao appointmentDao = new AppointmentDao();
        Appointment appointment = new Appointment("4");
        int record = appointmentDao.delete(appointment);
        System.out.printf("Deleted %d records\n", record);
        /*
        //test for appointment edit
        Appointment appointment = new Appointment("barberEmail1@gmail.com", "customerEmail1@gmail.com", "2023-06-15", "08:30:00", "12000", "3");

        int record = appointmentDao.edit(appointment);
        System.out.printf("Edited %d records\n", record);

         */
        //test for appointmet insertion

        //Appointment appointment = new Appointment("barberEmail1@gmail.com", "customerEmail1@gmail.com", "2023-06-14", "15:30:00", "12500" );
        //int record = appointmentDao.insert(appointment);
        //System.out.printf("Inserted %d records", record);

        //tests for listing records
        //AppointmentDao appointmentDao = new AppointmentDao();
        List<Appointment> appointments =  appointmentDao.select();

        for(Appointment appnt : appointments){
            System.out.println(appnt);
        }

        //ConnectionDB.getConnectionDB();
        //System.out.println("Connected successfully..");

        /*todo:
        pull list of barbers to show
        pull notes from appointment-->
         */

    }
}
