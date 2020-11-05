package game;

import edu.monash.fit2099.engine.*;

/**
 * A omnivorous dinosaur
 *
 */
public class Agilisaurus extends Dinosaur {

    protected Behaviour behaviour = new WanderBehaviour();

    /**
     * Agilisaurs are represented by char G, and have 100 hitpoints

     */
    public Agilisaurus(String name, char displayChar, int hitPoints, int hungerLvl, Species type, Gender gender) {
        super(name, 'G', 100, 100, Species.OMNNIVORE, gender);

        behaviour = new WanderBehaviour();
    }

    @Override
    public Action playTurn(Actions actions, Action lastAction, GameMap map, Display display){
        return behaviour.getAction(this, map);
    }
}
