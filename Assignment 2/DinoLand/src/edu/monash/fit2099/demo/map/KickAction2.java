package edu.monash.fit2099.demo.map;

import edu.monash.fit2099.engine.Action;
import edu.monash.fit2099.engine.Actor;
import edu.monash.fit2099.engine.GameMap;
import java.util.*;

public class KickAction2 extends Action {

    private Actor target;
    private Random rand = new Random();

    public KickAction2(Actor target) {
        this.target = target;
    }

    @Override
    public String execute(Actor actor, GameMap map) {
        if (rand.nextBoolean()) {
            return target + " evades the clumsy kick.";
        } else {
            map.removeActor(target);
            return actor + " squashes " + target + " like a bug.";
        }
    }

    @Override
    public String menuDescription(Actor actor) {
        return actor + " kicks " + target;
    }
}
