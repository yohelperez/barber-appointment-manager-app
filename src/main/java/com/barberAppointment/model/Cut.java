package com.barberAppointment.model;

import java.math.BigDecimal;

public class Cut {
    protected String gender;
    protected BigDecimal price;

    public Cut() {
    }

    public Cut(String gender, BigDecimal price) {
        this.gender = gender;
        this.price = price;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cut{" +
                "gender='" + gender + '\'' +
                ", price=" + price +
                '}';
    }
}
