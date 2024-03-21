package EarthBeings;
import SkyBeings.SkyBeing;
public class Human extends LivingBeings implements EarthBeing, SkyBeing {

    public String nombre;
    public int edad;
    public double peso ;
    public int altura;
    
    public Human (String nombre, int edad, double peso,int altura){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        
    }
    @Override
    public void reproduce(){
        System.out.println("Human is reproducing");
        System.out.println();
        System.out.println();
        System.out.println();

    }
    @Override
    public void born() {
        System.out.println("Human is born.");
        System.out.println();
    }
    @Override
    public void grow() {
        System.out.println("Human is growing.");
        System.out.println();
    }
    @Override
    public void respawn() {
        System.out.println("Human isnt allowed to respawn.");
        System.out.println();
    }
    @Override
    public void die() {
        System.out.println("Human dies.");
        System.out.println();
    }
    @Override
    public void fly() {
        System.out.println("Human tries to fly.");
        System.out.println();
    }
    @Override
    public void changeDimension() {
        System.out.println("Human tries but fails in changing dimension.");
        System.out.println();
    }
    @Override
    public void teleport() {
        System.out.println("I cant teleport as a human");
        System.out.println();
    }
}