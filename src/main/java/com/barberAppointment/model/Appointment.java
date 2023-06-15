package com.barberAppointment.model;

import java.math.BigDecimal;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Appointment {

    private String id;
    private String barberEmail;
    private String customerEmail;
    private LocalDate date;
    private LocalTime time;
    private BigDecimal price;

    public Appointment() {
    }

    public Appointment(String barberEmail, String customerEmail, String date, String time, String price, String id) throws ParseException {

        this.id = id;
        this.barberEmail = barberEmail;
        this.customerEmail = customerEmail;
        this.date = LocalDate.parse(date);
        this.time = LocalTime.parse(time);
        this.price = new BigDecimal(price);
    }

    public Appointment( String barberEmail, String customerEmail, LocalDate date, LocalTime time, BigDecimal price, String id) {
        this.id = id;
        this.barberEmail = barberEmail;
        this.customerEmail = customerEmail;
        this.date = date;
        this.time = time;
        this.price = price;
    }

    public Appointment(String barberEmail, String customerEmail, String date, String time, String price) throws ParseException {

        this.barberEmail = barberEmail;
        this.customerEmail = customerEmail;
        this.date = LocalDate.parse(date);
        this.time = LocalTime.parse(time);
        this.price = new BigDecimal(price);
    }

    public Appointment(String barberEmail, String customerEmail, String date, String time) throws ParseException {

        this.barberEmail = barberEmail;
        this.customerEmail = customerEmail;
        this.date = LocalDate.parse(date);
        this.time = LocalTime.parse(time);
        this.price = new BigDecimal("12000");
    }

    public Appointment( String barberEmail, String customerEmail, LocalDate date, LocalTime time, BigDecimal price) {
        this.barberEmail = barberEmail;
        this.customerEmail = customerEmail;
        this.date = date;
        this.time = time;
        this.price = price;
    }

    /**
     * Creates an appointment without price
     *
     * @param barberEmail
     * @param customerEmail
     * @param date
     * @param time
     */
    public Appointment( String barberEmail, String customerEmail, LocalDate date, LocalTime time) {
        this.barberEmail = barberEmail;
        this.customerEmail = customerEmail;
        this.date = date;
        this.time = time;
    }

    public Appointment(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getBarberEmail() {
        return barberEmail;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id='" + id + '\'' +
                ", barberEmail='" + barberEmail + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", price=" + price +
                '}';
    }
}
