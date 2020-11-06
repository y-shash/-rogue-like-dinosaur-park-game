package game;

import edu.monash.fit2099.engine.Action;
import edu.monash.fit2099.engine.Actor;
import edu.monash.fit2099.engine.GameMap;

public class DrinkWaterAction extends Action {

    protected Dinosaur target;

    public  DrinkWaterAction(Dinosaur target){this.target = target;}
    @Override
    public String execute(Actor actor, GameMap map) {
        return null;
    }

    @Override
    public String menuDescription(Actor actor) {
        return "Drink water?";
    }
    @Override
    public String hotkey() {
        return "w";
    }
}
