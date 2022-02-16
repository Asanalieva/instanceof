package com.company;

public abstract class Terrestrial extends Vehicle{
    public Terrestrial(String model, String color, int year, String country) {
        super(model, color, year, country);
    }

    public Terrestrial() {
    }

    public abstract void motor();
    public abstract void wheel();

    @Override
    public void moving() {
        System.out.println("Moving in ground");
    }
}
