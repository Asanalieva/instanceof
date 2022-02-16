package com.company;

public class Motorcycle extends Terrestrial{
    public Motorcycle(String model, String color, int year, String country) {
        super(model, color, year, country);
    }

    public Motorcycle() {
    }

    @Override
    public void motor() {
        System.out.println("Small motor is spinning");
    }

    @Override
    public void wheel() {
        System.out.println("2 wheels are spinning");
    }
    public void baggage(){
        System.out.println("Baggage is opening");
    }
    public void speed(){
        System.out.println("Motorcycle is moving too fast");
    }

}
