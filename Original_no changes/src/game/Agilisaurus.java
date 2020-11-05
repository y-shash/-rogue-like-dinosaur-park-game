package game;

import edu.monash.fit2099.engine.*;

import java.util.ArrayList;

/**
 * A omnivorous dinosaur
 *
 */
public class Agilisaurus extends Dinosaur {

    private Behaviour behaviour;

    ArrayList<Behaviour> behaviours=new ArrayList<Behaviour>();

    /**
     * Agilisaurs are represented by char G, and have 100 hitpoints
     */
    public Agilisaurus(String name, Gender gender) {
        super(name, 'G', 100, Gender.MALE, Species.OMNIVORES);

        behaviour = new WanderBehaviour();
    }

    @Override
    public Actions getAllowableActions(Actor otherActor, String direction, GameMap map) {
        Actions actions = super.getAllowableActions(otherActor, direction, map);
        actions.add(new feedAction(this));
        return actions;
    }


    /**
     *
     * @param actions
     * @param lastAction
     * @param map
     * @param display
     * @return
     */

    @Override
    public Action playTurn(Actions actions, Action lastAction, GameMap map, Display display) {
        Display animals = new Display();
        animals.println("Agili Health: " + this.hitPoints);
        behaviours.add(0, new mateBehaviour(Dinosaur.class, 10));
        this.hurt(1);
        hungryDino(display, map);
        if (this.isConscious()) {

            for (Behaviour behaviour : behaviours) {
                Action action = behaviour.getAction(this, map);
                System.out.println(behaviour.getClass());
                if (action!=null)
                    return action;
            }


        }

        return new DoNothingAction();

    }
}