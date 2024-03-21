package EarthBeings;
import SkyBeings.SkyBeing;

public class Bird extends LivingBeings implements SkyBeing {
public String name;
public int age;
public double weight ;
public int maxFlightHeight;


    public Bird (String name, int age, double weight,int maxFlightHeight){
        this.name = name;
        this.age = age;
        this.weight= weight;
        this.maxFlightHeight = maxFlightHeight;
        
    }
    @Override
    public void born () {
        System.out.println("A bird was born!");
        System.out.println();
    }
    @Override
    public void die() {
        System.out.println("The bird died.");
        System.out.println();
    }

    @Override
    public void reproduce() {
        System.out.println("The bird is reproducing");
        System.out.println();
        System.out.println();
        System.out.println();
    }
    
    @Override
    public void grow() {
        System.out.println("The bird is growing.");
        System.out.println();
    }
    // Methods inherited from the superclass "LivingBeings"
    @Override
    public void fly() {
        System.out.println("Bird flies.");
        System.out.println();
    }
    @Override
    public void changeDimension() {
        System.out.println("Bird tries but fails changing dimension.");
        System.out.println();
    }
    @Override
    public void teleport() {
        System.out.println("Time to go fast, its time to teleport.");
        System.out.println();
    }
    @Override
    public void respawn() {
        System.out.println("I cant respawn, I'm a dead bird.");
        System.out.println();
    }
}
