package com.company;

public abstract class Air extends Vehicle{
    public Air(String model, String color, int year, String country) {
        super(model, color, year, country);
    }

    public Air() {
    }

    public abstract void high();
    public abstract void price();

    @Override
    public void moving() {
        System.out.println("Moving fast");
    }
}
