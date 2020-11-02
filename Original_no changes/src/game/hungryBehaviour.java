package game;

import edu.monash.fit2099.engine.*;

import java.util.ArrayList;

public class hungryBehaviour implements Behaviour {
    public hungryBehaviour(Class<?> cls, int range){

    }
    public Action hungryMovement(Actor actor, Location near){
        return null;
    }

    @Override
    public Action getAction(Actor actor, GameMap map) {
        return hungryMovement(actor,map.locationOf(actor));
    }
}
