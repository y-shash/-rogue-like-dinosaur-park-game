package game;

import edu.monash.fit2099.engine.Action;
import edu.monash.fit2099.engine.Actor;
import edu.monash.fit2099.engine.GameMap;
import edu.monash.fit2099.engine.Item;

public class EatFoodAction extends Action {
    @Override
    public String execute(Actor actor, GameMap map) {
        for(Item items : actor.getInventory()){
            if(items.toString().equals("Fruit")){
                actor.heal(10);
                actor.removeItemFromInventory(items);
                return actor +" eats a "+ items;
            }
            else{
                return actor+" does not have Fruits to eat";
            }
        }
        return actor+" inventory empty";
    }

    @Override
    public String menuDescription(Actor actor) {
        return "Eat Food?";
    }
    @Override
    public String hotkey() {
        return "k";
    }
}
