package game;

import edu.monash.fit2099.engine.Ground;

public class Grass extends Ground {
    // bool will focus on identifying closeby squares of grass
    private boolean nearBy;

    // this is the general probability of grass growing on a plot of ground
    // - use if condition to set probability 2% or 10 % based on proximity of nearby grass plots
    private float growthProbability;

    // allows for identifying when to call method GrassGrowth
    private int turnCount;

    // just ensure the item rots only outside the players inventory (use if cond again)
    private boolean rot;

    /**
     * Constructor.
     *
     * @param displayChar character to display for this type of terrain
     */
    Grass(char displayChar, int turnCount, double growthProbability, boolean nearBy){
        super(displayChar);

        // if the character (is near + or on .) growthProbability == 0.02
        // NOTE: 'Tree' == +, '.' == ground
        // -- set the displayCharacter for the block from . to / representing change from ground grass

        // if the character .(ground) is near a block with another /(grass) growthProbability == 0.10
        // -- set the display char from . to /

    }
}
