package game;

import edu.monash.fit2099.engine.Action;
import edu.monash.fit2099.engine.Actor;
import edu.monash.fit2099.engine.Exit;
import edu.monash.fit2099.engine.GameMap;

import java.util.ArrayList;
import java.util.List;

public class mateAction extends Action {
    protected Dinosaur target;
    protected Dinosaur giver ;

    public mateAction(Dinosaur dino){
        this.target = dino;

    }

    public mateAction() {

    }

    @Override
    public String execute(Actor actor, GameMap map) {
        if(actor.hasCapability(Gender.MALE) && target.hasCapability(Gender.FEMALE)){
            target.setPregnant(true);
            // after 10 turns target will lay egg
            target.layEgg();
            menuDescription(actor);
        }else if(actor.hasCapability(Gender.MALE) && target.hasCapability(Gender.MALE)){
            target.setPregnant(false);
        }else if(actor.hasCapability(Gender.FEMALE) && target.hasCapability(Gender.FEMALE)){
            target.setPregnant(false);
        }else if(actor.hasCapability(Gender.FEMALE) && target.hasCapability(Gender.MALE)){
            ((Dinosaur)actor).setPregnant(true);
            ((Dinosaur) actor).layEgg();
            menuDescription(actor);
        }
        else{
            ((Dinosaur)actor).setPregnant(true);
            ((Dinosaur) actor).layEgg();
            menuDescription(actor);
        }
        return " ";
    }

    @Override
    public String menuDescription(Actor actor) {
        return actor+" is moving to mate";
    }


}
