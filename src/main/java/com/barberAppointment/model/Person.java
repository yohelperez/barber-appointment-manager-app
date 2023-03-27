package com.barberAppointment.model;

public abstract class Person {
    protected String name;
    protected String phone;
    protected String email;

    public Person() {
    }

    /**
     * Create a basic user without phone number
     * @param name
     * @param email
     */
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /**
     * Creates user with all attributes
     * @param name
     * @param phone
     * @param email
     */
    public Person(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
