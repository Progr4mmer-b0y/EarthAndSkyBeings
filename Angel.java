package SkyBeings;

import EarthBeings.LivingBeings;
public class Angel extends LivingBeings implements SkyBeing{

public String name;
public int age;
public double weight ;
public String maxFlightHeight;
public String color;


    public Angel (String name, int age, double weight,String maxFlightHeight, String color){
        this.name = name;
        this.age = age;
        this.weight= weight;
        this.maxFlightHeight = maxFlightHeight;
        this.color = color;
    }
    @Override
    public void  fly() {
        System.out.println("I am an angel and I can fly");
        System.out.println();
}
    @Override
    public void changeDimension(){
        System.out.println("Let's go to the fourth dimension!");
        System.out.println();
    }

    @Override
    public void respawn(){
        System.out.println("I died it time to respawn");
        System.out.println();
    }

    @Override
    public void teleport(){
        System.out.println("it's time to teleport back home");
        System.out.println();
    }
    
    //Methods from LivingBeings interface
    @Override
    public void born () {
        System.out.println("An angel was born!");
        System.out.println();
    }
    @Override
    public void die() {
        System.out.println("The angel died.");
        System.out.println();
    }

    @Override
    public void reproduce() {
        System.out.println("The angel is reproducing");
        System.out.println();
        System.out.println();
        System.out.println();

    }
    
    @Override
    public void grow() {
        System.out.println("The angel is growing.");
        System.out.println();
    }
    
    // Methods inherited from the superclass "LivingBeings"
    
}