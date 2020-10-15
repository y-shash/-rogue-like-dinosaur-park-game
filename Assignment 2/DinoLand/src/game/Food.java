package game;

/**
 * A class that represents food.
 */
public class Food extends PortableItem {
    private int IncFoodLvl;

    /**
     * Constructor
     *
     * @param incFoodLvl amount of increase if this food is eaten
     */
    public Food(int incFoodLvl) {
        super("food", 'F');
        IncFoodLvl = incFoodLvl;
    }

    public void incFoodLlvl(int initFOODLvl){
        IncFoodLvl += initFOODLvl;
    }

    public int getIncFoodLvl() {
        return IncFoodLvl;
    }
}
//