package com.company;

public class Boat extends Aqueous{
    public Boat(String model, String color, int year, String country) {
        super(model, color, year, country);
    }

    public Boat() {
    }

    @Override
    public void ocean() {
        System.out.println("Moving in Yssyk Kul");
    }

    @Override
    public void safety() {
        System.out.println("Safety is medium");
    }
    public void motor(){
        System.out.println("Boat motor is spinning by electrocity");
    }
    public void way(){
        System.out.println("Moving fast in the like");
    }
}
