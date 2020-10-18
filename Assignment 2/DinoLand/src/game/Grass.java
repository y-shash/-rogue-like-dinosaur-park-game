package game;

import edu.monash.fit2099.engine.*;

import java.util.Map;
import java.util.Random;

/**
 * A class for grass and its growth Behaviour
 */

public class Grass extends Food{

    public static Random r = new Random();

    public Grass() {
        super("grass", 'G', 1);

    }

    // here is where the growing probability is derived, if growingProbability(2) it shows that there is a random probability of 2% to achieve a growth
    // if growingProbability(10) returns true then grass will grow at that point
    public static boolean growingProbability(int probability) {
        int randInt = r.nextInt(100);
        if(randInt >= 0 && randInt <= probability){
            return true;
        }
        return false;
    }


}
