package com.company;

public class Liner extends Aqueous {
    public Liner(String model, String color, int year, String country) {
        super(model, color, year, country);
    }

    public Liner() {
    }

    @Override
    public void ocean() {
        System.out.println("Moving to Atlantic Ocean");
    }

    @Override
    public void safety() {
        System.out.println("Safety is 7/10");
    }
    public void speed(){
        System.out.println(getModel() + " is moving slowly");
    }
    public void smoke(){
        System.out.println("Liner is smoking...");
    }


}
