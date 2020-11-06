package game;

import edu.monash.fit2099.engine.Action;
import edu.monash.fit2099.engine.Actor;
import edu.monash.fit2099.engine.GameMap;
import edu.monash.fit2099.engine.Location;

/**
 * A class that represents the Thirst Behaviour of Dinosaurs
 */
public class ThirstyBehaviour implements Behaviour {

    public ThirstyBehaviour(Class<?> cls, int range){

    }

    public Action ThirstMovement(Actor actor, Location near){return null;}
    @Override
    public Action getAction(Actor actor, GameMap map) {
        return ThirstMovement(actor, map.locationOf(actor));
    }


}
