package com.company;

public class Airplane extends Air{
    public Airplane(String model, String color, int year, String country) {
        super(model, color, year, country);
    }

    public Airplane() {
    }

    @Override
    public void high() {
        System.out.println("559 metre high flies");
    }

    @Override
    public void price() {
        System.out.println("2 million dollars");
    }

    public void sittingPlace(){
        System.out.println(getModel() + " has 60 sitting places");
    }
    public void style(){
        System.out.println(getColor()+ " is color of richness");
    }
}
