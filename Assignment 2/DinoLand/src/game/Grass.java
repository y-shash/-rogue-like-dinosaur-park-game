package game;

import edu.monash.fit2099.engine.*;
import java.util.Random;

/**
 * A class for grass and its growth Behaviour
 */

public class Grass extends Food{


    public static Random r = new Random();

    public Grass() {
        super("Hay", 'H', 10);

    }

    public static boolean growingProbability(int probability) {
        int randInt = r.nextInt(100);
        if(randInt >= 0 && randInt <= probability){
            return true;
        }
        return false;
    }






}
