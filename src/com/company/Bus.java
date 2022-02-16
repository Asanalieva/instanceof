package com.company;

public class Bus extends Terrestrial{
    public Bus(String model,String color,int year,String country){
        super(model, color, year, country);
    }
    public Bus(){}

    @Override
    public void motor() {
        System.out.println("Bus is going to next bus station");
    }
    @Override
    public void wheel() {
        System.out.println("6 wheels are spinning");
    }
    public void doors(){
        System.out.println("Doors are opening automatically");
    }
    public void stop(){
        System.out.println("Bus is going to stop");
    }
}
