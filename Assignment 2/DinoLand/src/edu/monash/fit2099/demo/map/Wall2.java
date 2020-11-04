package edu.monash.fit2099.demo.map;

import edu.monash.fit2099.engine.Actor;
import edu.monash.fit2099.engine.Ground;

public class Wall2 extends Ground {

    public Wall2() {
        super('#');
    }

    @Override
    public boolean canActorEnter(Actor actor) {
        return false;
    }

    @Override
    public boolean blocksThrownObjects() {
        return true;
    }
}
