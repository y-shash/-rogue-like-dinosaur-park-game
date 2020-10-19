package game;

import edu.monash.fit2099.engine.Item;

/**
 * A class that represents food.
 */
public class Food extends PortableItem{
    private int IncFoodLvl;

    /**
     * Constructor
     *
     * @param incFoodLvl amount of increase if this food is eaten
     */
    public Food(String name, char DisplayChar, int incFoodLvl) {
        super(name, DisplayChar);
        IncFoodLvl = incFoodLvl;
        super.allowableActions.add(new EatFoodAction());
    }

    //public void incFoodLlvl(int initFOODLvl){
    //    IncFoodLvl += initFOODLvl;
    //}

    public int getIncFoodLvl() {
        return IncFoodLvl;
    }
}
