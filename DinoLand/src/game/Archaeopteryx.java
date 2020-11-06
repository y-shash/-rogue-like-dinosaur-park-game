package game;

import edu.monash.fit2099.engine.*;

public class Archaeopteryx extends Dinosaur {
    /**
     * Constructor.
     *
     * @param name        the name of the Actor
     * @param displayChar the character that will represent the Actor in the display
     * @param hitPoints   the Actor's starting hit points
     * @param gender
     * @param species
     */
    public Archaeopteryx(String name, Gender gender) {
        super(name, 'X', 10, gender, Species.CARNIVORES);
        addCapability(FlyAbility.FLIES);
    }

    @Override
    public Actions getAllowableActions(Actor otherActor, String direction, GameMap map) {
        Actions actions = super.getAllowableActions(otherActor, direction, map);
        actions.add(new AttackAction(this));
        actions.add(new feedAction(this));
        return actions;
    }
    @Override
    public Action playTurn(Actions actions, Action lastAction, GameMap map, Display display) {
        return null;
    }
}
