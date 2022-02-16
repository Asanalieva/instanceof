package com.company;

public class Raketa extends Air{
    public Raketa(String model, String color, int year, String country) {
        super(model, color, year, country);
    }

    public Raketa() {
    }


    @Override
    public void high() {
        System.out.println("To the Space");
    }

    @Override
    public void price() {
        System.out.println("10 billion dollars");
    }

    public void owner(){
        System.out.println(getModel()+" Owners are too rich");
    }
    public void goal(){
        System.out.println(getModel() +" is going to the Mars!");
    }



}
