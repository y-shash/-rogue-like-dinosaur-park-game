package game;

import edu.monash.fit2099.engine.Action;
import edu.monash.fit2099.engine.Actions;
import edu.monash.fit2099.engine.Display;
import edu.monash.fit2099.engine.GameMap;

public class DinoBaby extends Dinosaur{

    public DinoBaby(String name, char displayChar, Species type, Gender gender) {
        super(name, displayChar, 10, gender, type);
    }

    @Override
    public Action playTurn(Actions actions, Action lastAction, GameMap map, Display display) {
        return null;
    }
}