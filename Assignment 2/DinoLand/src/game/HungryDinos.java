package game;

import edu.monash.fit2099.engine.MoveActorAction;

public class HungryDinos{

    //attribute to represent the current food level of Dinosaur
    private int FoodLvl;

    //represent the max level of food a stegosaur can reach
    private static final int MAX_FOOD_LVL = 100;

    //turns counter
    private int Turns;

    // If the food level gets to zero, the stegosaur becomes unconscious
    private boolean unconsciousness;

    // after 20 turns unconsciousness, the stegosaur dies
    private boolean dead;

   public HungryDinos(int FoodLvl){

    if(FoodLvl == 0){
        setUnconsciousness(true);
        //Move towards a food source
    }

    if (isUnconsciousness()){
        //get the turns at that moment
        int No_of_Turns = getTurns();
        if (FoodLvl == 0){
            int No_of_Turns2 = getTurns();
            if (No_of_Turns2 - No_of_Turns >= 20){
                setDead(true);
            }
        }
    }

    if (FoodLvl < MAX_FOOD_LVL){
        //Move towards a food source
    }



    }

    public void setFoodLvl(int newFoodLvl){ FoodLvl = newFoodLvl; }

    public void setTurns(int newTurns){ Turns = newTurns; }

    public void setUnconsciousness(boolean newUnconsciousness){unconsciousness = newUnconsciousness; }

    public void setDead(boolean newDead){ dead = newDead; }

    public int getFoodLvl() { return FoodLvl; }

    public int getTurns() {
        return Turns;
    }

    public boolean isUnconsciousness(){ return unconsciousness; }

    public boolean isDead(){ return dead; }
}
