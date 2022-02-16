package com.company;

public class Car extends Terrestrial {
    public Car(String model, String color, int year, String country) {
        super(model, color, year, country);
    }

    public Car() {
    }

    @Override
    public void motor() {
        System.out.println("Motor is working");
    }

    @Override
    public void wheel() {
        System.out.println("4 wheels are spinning");
    }
    public void speed(){
        System.out.println(getModel() + " is picking up speed");
    }
    public void ceil(){
        System.out.println("Ceil is opening");
    }
}
