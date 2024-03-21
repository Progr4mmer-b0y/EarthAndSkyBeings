package SkyBeings;
import EarthBeings.Bird;
import EarthBeings.Human;
import EarthBeings.LivingBeings;

public class LivingBeingCreator implements Creator {
    @Override
    public LivingBeings createLivingBeings(String Being) {
        if (Being.equalsIgnoreCase("Angel")){
        return new Angel("Samael", 10000, 12, "infinite", "gold");
        }
        else if (Being.equalsIgnoreCase("Bird")){
        return  new Bird("Rogelio", 12, 4.5, 200);
        }
        else if (Being.equalsIgnoreCase("Human") ){
        return new Human("Juan Esteban", 35,  90.1, 190);
            
        }
        return null; // Implement according to specific requirements
    }
}