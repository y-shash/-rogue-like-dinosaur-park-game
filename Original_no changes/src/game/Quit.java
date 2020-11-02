package game;

import edu.monash.fit2099.engine.Action;
import edu.monash.fit2099.engine.Actor;
import edu.monash.fit2099.engine.GameMap;

public class Quit extends Action {

    @Override
    public String execute(Actor actor, GameMap map) {
        map.removeActor(actor);
        return "You quit! The game has ended!";
    }

    @Override
    public String menuDescription(Actor actor) {
        return "Quit Game";
    }

    @Override
    public String hotkey() {
        return "q";
    }
}
