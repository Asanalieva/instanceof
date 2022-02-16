package com.company;

public class Ship extends Aqueous{
    public Ship(String model, String color, int year, String country) {
        super(model, color, year, country);
    }

    public Ship() {
    }

    @Override
    public void ocean() {
        System.out.println("Atlantic ocean");
    }

    @Override
    public void safety() {
        System.out.println("Safety is 9/10");
    }
    public void rides(){
        System.out.println(getModel() + " is riding to Pacific Ocean.");
    }
    public void working(){
        System.out.println("In " + getModel() + " works more than 200 people");
    }
}
