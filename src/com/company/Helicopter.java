package com.company;

public class Helicopter extends Air{
    public Helicopter(String model, String color, int year, String country) {
        super(model, color, year, country);
    }

    public Helicopter() {
    }

    @Override
    public void high() {
        System.out.println("300 metre high");
    }

    @Override
    public void price() {
        System.out.println("1 million dollars");
    }
    public void popularity(){
        System.out.println(getModel()+ " was popular in " + getCountry());
    }
    public void year(){
        System.out.println(getModel() + " was made in " + getYear());
    }
}

