package com.barberAppointment.model;

public class Customer extends Person {
    private Character gender;

    /**
     * Create a basic user without phone number
     *
     * @param name
     * @param email
     */
    public Customer(String name, String email, Character gender) {
        super(name, email);
        this.gender = gender;
    }

    /**
     * Creates user with all attributes
     *
     * @param name
     * @param phone
     * @param email
     */
    public Customer(String name, String phone, String email, Character gender) {
        super(name, phone, email);
        this.gender = gender;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "gender=" + gender +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    //to do: create constructors for CRUD and continue with barber
}
