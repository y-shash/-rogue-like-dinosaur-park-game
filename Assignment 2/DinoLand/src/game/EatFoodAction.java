package game;

import edu.monash.fit2099.engine.Action;
import edu.monash.fit2099.engine.Actor;
import edu.monash.fit2099.engine.GameMap;
import edu.monash.fit2099.engine.Item;

/**
 * class represents the action for eating food
 *
 * @author User
 *
 */
public class EatFoodAction extends Action {
    private Food foodToRemove;

    /**
     * A constructor to instantiate an object of the Food class
     *
     * @param initFood the food that will be eaten
     */
    public EatFoodAction(Food initFood) {
        // TODO Auto-generated constructor stub
        foodToRemove = initFood;
    }

    public EatFoodAction() {

    }

    public void incFoodlvl(Actor actor, Item food){

    }

    /**
     * Perform the eating action, increase the food level, remove the food after being eaten and add it to thr actor
     *
     * @param actor The actor that is eating.
     * @param map The map the actor is on.
     * @return a description of what happened that can be displayed to the user.
     */
    @Override
    public String execute(Actor actor, GameMap map) {
        // TODO Auto-generated method stub
        map.locationOf(actor).removeItem(foodToRemove);
//        actor.incFoodLvl(foodToRemove.getIncFoodLvl());
        return menuDescription(actor);
    }

    /**
     * A description method to indicate that the actor has eaten and level up the food level
     * @param actor The actor performing the action.
     * @return
     */

    @Override
    public String menuDescription(Actor actor) {
        // TODO Auto-generated method stub
        return actor + " eats food to level up food level.";
    }

    @Override
    public String hotkey() {
        return "T";
    }

    //km

}
