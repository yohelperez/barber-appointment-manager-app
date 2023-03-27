package com.barberAppointment.model;

public class Barber extends Person {
    private String timeIn;
    private String timeOut;

    /**
     * Create a basic user without phone number
     *
     * @param name
     * @param email
     */
    public Barber(String name, String email, String timeIn, String timeOut) {
        super(name, email);
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }

    /**
     * Creates user with all attributes
     *
     * @param name
     * @param phone
     * @param email
     */
    public Barber(String name, String phone, String email, String timeIn, String timeOut) {
        super(name, phone, email);
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }

    public String getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(String timeIn) {
        this.timeIn = timeIn;
    }

    public String getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }

    @Override
    public String toString() {
        return "Barber{" +
                "timeIn='" + timeIn + '\'' +
                ", timeOut='" + timeOut + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
