package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //terrestrial
        Vehicle train = new Train("Royal","Red",1997,"Canada");
        Vehicle car = new Car("Range Rover","Blue",2020,"Germany");
        Vehicle motorcycle = new Motorcycle("Venom","Black",2055,"Kyrgyzstan");
        Vehicle bus = new Bus("Merceds Benz","Yellow",2017,"German");

        //air
        Vehicle raketa = new Raketa("Fast Koi","White",2019,"USA");
        Vehicle dirijabel = new Dirijabel("Soko","White-Gray",1877,"China");
        Vehicle airplane = new Airplane("Kyrgyzstan President's Airplane","Blue",2022,"Kyrgyzstan");
        Vehicle helicopter = new Helicopter("Azula","Green",1895,"USA");

        //Aqueous
        Vehicle ship = new Ship("Jed","White",2018,"Italy");
        Vehicle scooter = new Scooter("Fire","Green",1999,"Kazakhstan");
        Vehicle liner = new Liner("Dilbar","White",2016,"Barcelona");
        Vehicle boat = new Boat("Ico","Gray",1432,"Netherlands");

        //array
        Vehicle[] vehicles = {train,car,motorcycle,bus,raketa,dirijabel,airplane,helicopter,ship,scooter,liner,boat};

        for (Vehicle i : vehicles){
            if(i instanceof Airplane){
                ((Airplane)i).sittingPlace();
                ((Airplane)i).style();
            }
            if(i instanceof Raketa){
                ((Raketa)i).owner();
                ((Raketa)i).goal();
            }
            if(i instanceof Dirijabel){
                ((Dirijabel)i).films();
                ((Dirijabel)i).madeIn();
            }
            if(i instanceof Helicopter){
                ((Helicopter)i).popularity();
                ((Helicopter)i).year();
            }
            if(i instanceof Ship){
                ((Ship)i).rides();
                ((Ship)i).working();
            }
            if(i instanceof Scooter){
                ((Scooter)i).job();
                ((Scooter)i).speed();
            }
            if(i instanceof Liner){
                ((Liner)i).speed();
                ((Liner)i).smoke();
            }if(i instanceof Boat){
                ((Boat)i).motor();
                ((Boat)i).way();
            }
            if(i instanceof Train){
                ((Train)i).doors();
                ((Train)i).stop();
            } if(i instanceof Car){
                ((Car)i).speed();
                ((Car)i).ceil();
            } if(i instanceof Motorcycle){
                ((Motorcycle)i).baggage();
                ((Motorcycle)i).speed();

            } if(i instanceof Bus){
                ((Bus)i).doors();
                ((Bus)i).stop();
            }
        }











    }
}
