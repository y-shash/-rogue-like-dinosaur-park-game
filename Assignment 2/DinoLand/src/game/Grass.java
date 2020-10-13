package game;

import edu.monash.fit2099.engine.Ground;

public class Grass extends Ground {
    // bool will focus on identifying closeby squares of grass
    private boolean nearBy;
    // this is the general probability of grass growing on a plot of ground
    // - use if condition to set probability 2% or 10 % based on proximity of nearby grass plots
    private double growthProbability;

    // allows for identifying when to call method GrassGrowth
    private int turnCount;

    // just ensure the item rots only outside the players inventory (use if cond again)
    private boolean rot;

    /**
     * Constructor.
     *
     * @param turnCount this is used in the if condition to test when to emplace
     */
    public void setTurnCount(int newTurnCount) {
        turnCount = newTurnCount;
    }

    public void setGrowthProbability(double newGrowthProbability) {
        growthProbability = newGrowthProbability;
    }

    public void setNearBy(boolean newNearBy) {
        nearBy = newNearBy;
    }

    public void setRot(boolean newRot) {
        rot = newRot;
    }

    public int getTurnCount() {
        return turnCount;
    }

    public double getGrowthProbability() {
        return growthProbability;
    }

    public boolean isNearBy() {
        return nearBy;
    }

    public boolean isRot() {
        return rot;
    }

    Grass(char displayChar, int turnCount) {

        super(displayChar);
        if (displayChar == '+' || displayChar == '.') {
            setNearBy(true);
            setGrowthProbability(0.02);
        }
    }
}
        // if the character .(ground) is near a block with another /(grass) growthProbability == 0.10
        // -- set the display char from . to /
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




