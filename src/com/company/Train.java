package com.company;

public class Train extends Terrestrial{
    public Train(String model, String color, int year, String country) {
        super(model, color, year, country);
    }

    public Train() {
    }

    @Override
    public void motor() {
        System.out.println("Pipe is smoking");
    }

    @Override
    public void wheel() {
        System.out.println("More than 50 wheels are spinning");
    }
    public void doors(){
        System.out.println("Doors are opening");
    }
    public void stop(){
        System.out.println("Train is going to stop");
    }
}
