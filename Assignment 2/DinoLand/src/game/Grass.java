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
    Grass(char displayChar, int turnCount, double growthProbability){
        super(displayChar);
        boolean nearBy = false;

        // if the player is near the grass then it will allow the player harvest hay
        boolean allowPickup = false;

        // if the character (is near + or on .) growthProbability == 0.02
        // NOTE: 'Tree' == +, '.' == ground
        // -- set the displayCharacter for the block from . to / representing change from ground grass
        if (displayChar == '+'){
            nearBy = true;
            growthProbability = 0.02;


        }

        else if (displayChar == '.'&& displayChar == '+' ){
            boolean nearby = true;

        }


        // if the character .(ground) is near a block with another /(grass) growthProbability == 0.10
        // -- set the display char from . to /

        }
    // diagonal check,
    // horizontal checks
    // vertical checks


        //for any square of dirt, if it is next to at least 2 squares of grass, then the probability of that square of dirt
    // to grow grass is 0.1

    //check the current Location of the square of dirt, the add 1 to that Location and check if == / (grass)
    //then add 2 to the Location we obtained first and check if that square is == /
    // then set the probability of the first Location tp 0.1
    //
    // [.],[.],[.],[.],[.]
    // [.],[.],[/],[/],[.]
    // [.],[.],[/],[/],[.]
    // [.],[.],[.],[.],[.]
    // [.],[.],[.],[.],[.]
    // for i in range(1,5 )
    // if the 2nd and 3rd block have grass block
    // then set the probability of grass growth for block 5 to 0.1



}
