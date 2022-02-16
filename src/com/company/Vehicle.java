package com.company;

public abstract class Vehicle {
    private String model;
    private String color;
    private int year;
    private String  country;

    public Vehicle(String model, String color, int year, String country) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.country = country;
    }
    public Vehicle(){}

    public abstract void moving();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
