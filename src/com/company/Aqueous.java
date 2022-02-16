package com.company;

public abstract class Aqueous extends Vehicle {
    public Aqueous(String model, String color, int year, String country) {
        super(model, color, year, country);
    }

    public Aqueous() {
    }
    public abstract void ocean();
    public abstract void safety();

    @Override
    public void moving() {
        System.out.println("Moving in the water");
    }
}
