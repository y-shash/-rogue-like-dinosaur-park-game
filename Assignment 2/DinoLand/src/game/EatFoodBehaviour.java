package game;

import java.util.List;

import edu.monash.fit2099.engine.Action;
import edu.monash.fit2099.engine.Actor;
import edu.monash.fit2099.engine.GameMap;
import edu.monash.fit2099.engine.Item;

/**
 * Returns an eating food action that will allow the actor to comsume the food if it is damaged
 *
 * @author User
 *
 */
public class EatFoodBehaviour implements Behaviour {

    public EatFoodBehaviour() {
        // TODO Auto-generated constructor stub
    }

    /**
     * get the list of action the actor can do when need to feed stegosaurs
     * @param actor the Actor acting
     * @param map the GameMap containing the Actor
     * @return
     */

    @Override
    public Action getAction(Actor actor, GameMap map) {
        if (actor.isDead()){
            return null;
        }
        else if (actor.isConscious()) {
            Food food = this.getFood(actor.getInventory());
            if (food != null) {
                return new EatFoodAction(food);
            }
        }
        return null;
    }

    /**
     * Get the first Food in the actors inventory
     *
     * @param inventory the actor's inventory
     * @return the first Food in the actors inventory
     */
    private Food getFood(List<Item> inventory) {
        for (Item item : inventory) {
            if (item instanceof Food) {
                return (Food) item;
            }
        }
        return null;
    }
//
}
