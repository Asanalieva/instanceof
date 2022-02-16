package com.company;

public class Scooter extends Aqueous{
    public Scooter(String model, String color, int year, String country) {
        super(model, color, year, country);
    }

    public Scooter() {
    }

    @Override
    public void ocean() {
        System.out.println("Indian  Ocean");
    }

    @Override
    public void safety() {
        System.out.println("Safety is 10/10");
    }
    public void job(){
        System.out.println(getModel() + "'s motor is spinning");
    }
    public  void speed(){
        System.out.println(getModel()+"Riding to the shore" );
    }
}
