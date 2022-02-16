package com.company;

public class Dirijabel extends Air{
    public Dirijabel(String model, String color, int year, String country) {
        super(model, color, year, country);
    }

    public Dirijabel() {
    }

    @Override
    public void high() {
        System.out.println("2032 metre high");
    }

    @Override
    public void price() {
        System.out.println("Too expensive");
    }

    public void films(){
        System.out.println(getModel() + " was filmed in Avatar");
    }
    public void madeIn(){
        System.out.println(" Was made in " +getCountry());
    }
}
