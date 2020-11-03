package game;

import edu.monash.fit2099.engine.*;

import java.util.HashSet;

public class mateBehaviour implements Behaviour {
    private Class<?> attractor;
    private String name;
    private int maxRange;
    private HashSet<Location> visitedLocations =new HashSet<Location>();

    public mateBehaviour(Class<?> cls, int mRange){
        this.attractor = cls;
        this.name = attractor.getSimpleName();;
        this.maxRange =mRange;

    }
    public Action mateAction(){
        return mateAction();
    }

    @Override
    public Action getAction(Actor actor, GameMap map) {
        return mateAction();
    }
}
