import EarthBeings.Bird;
import EarthBeings.Human;
import EarthBeings.LivingBeings;
import SkyBeings.Angel;
import SkyBeings.LivingBeingCreator;



public class Main {
    public static void main (String[] args) {
        LivingBeingCreator dios = new LivingBeingCreator();
        LivingBeings obj1 = dios.createLivingBeings("Human");
        LivingBeings obj2 = dios.createLivingBeings("Angel");
        LivingBeings obj3 = dios.createLivingBeings("Bird");

        
        obj1.born();
        obj1.grow();
        obj1.die();
        ((Human)obj1).respawn();
        ((Human)obj1).teleport();
        ((Human)obj1).fly(); // This is not allowed for humans
        ((Human)obj1).changeDimension(); // This is not allowed for humans
        obj1.reproduce();

        obj2.born();
        obj2.grow();
        obj2.die();
        ((Angel)obj2).respawn();
        ((Angel)obj2).teleport();
        ((Angel)obj2).fly(); // This is allowed for angels
        ((Angel)obj2).changeDimension(); // This is allowed for angels
        obj2.reproduce();


        obj3.born();
        obj3.grow();
        obj3.die();
        ((Bird)obj3).respawn();
        ((Bird)obj3).teleport();
        ((Bird)obj3).fly(); // This is allowed for birds
        ((Bird)obj3).changeDimension(); // This is not allowed for birds
        obj3.reproduce();
    }
}