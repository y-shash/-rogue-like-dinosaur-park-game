package game;

import edu.monash.fit2099.engine.Action;
import edu.monash.fit2099.engine.Actor;
import edu.monash.fit2099.engine.Exit;
import edu.monash.fit2099.engine.GameMap;

import java.util.ArrayList;
import java.util.List;

public class mateAction extends Action {
    protected Actor target;
    protected Dinosaur actor;

    public mateAction(Actor dino){
        this.target = dino;


    }

    public mateAction() {

    }

    @Override
    public String execute(Actor actor, GameMap map) {
        String result = "";
        List<Exit> mapPoints = new ArrayList<Exit>(map.locationOf(actor).getExits());
        return result;
    }

    @Override
    public String menuDescription(Actor actor) {
        return actor+" is moving to mate";
    }


}
