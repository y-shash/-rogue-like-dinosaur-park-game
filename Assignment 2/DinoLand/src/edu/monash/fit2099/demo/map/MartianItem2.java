package edu.monash.fit2099.demo.map;

import edu.monash.fit2099.engine.Action;
import edu.monash.fit2099.engine.Item;

public class MartianItem2 extends Item{

    public MartianItem2(String name, char displayChar, boolean portable) {
        super(name, displayChar, portable);
    }

    public void addAction(Action action) {
        this.allowableActions.add(action);
    }
}
