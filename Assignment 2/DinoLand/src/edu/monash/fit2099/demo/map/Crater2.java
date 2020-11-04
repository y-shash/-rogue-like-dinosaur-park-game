package edu.monash.fit2099.demo.map;

import edu.monash.fit2099.engine.Actor;
import edu.monash.fit2099.engine.Ground;


public class Crater2 extends Ground {

    public Crater2() {
        super('o');
    }

    @Override
    public boolean canActorEnter(Actor a) {
        return a.hasCapability(DemoCapabilities2.SPACETRAVELLER);
    }
}