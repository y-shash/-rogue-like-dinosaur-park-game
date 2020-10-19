package game;

import edu.monash.fit2099.engine.Action;
import edu.monash.fit2099.engine.Actor;
import edu.monash.fit2099.engine.GameMap;

public class carnivorousBehaviour implements Behaviour {
    private  Class<?> targetClass;
    private String targetName;
    private int x;

    public carnivorousBehaviour( Class<?> target, int range){




    }

    @Override
    public Action getAction(Actor actor, GameMap map) {
        return null;
    }
}
