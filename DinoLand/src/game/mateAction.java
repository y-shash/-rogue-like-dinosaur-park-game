package game;

import edu.monash.fit2099.engine.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class mateAction extends Action {
    Dinosaur attractor;
    public List<Behaviour> actionFactories = new ArrayList<Behaviour>();
    Random randInt= new Random();
    Gender random = null;
    public mateAction( Dinosaur attractor){
        this.attractor = attractor;
    }
    @Override
    public String execute(Actor actor, GameMap map) {
        if((attractor.hasCapability(Gender.MALE) && actor.hasCapability(Gender.FEMALE))||(attractor.hasCapability(Gender.FEMALE) && actor.hasCapability(Gender.MALE))){
            if (actor instanceof Stegosaur) {
                boolean val = randInt.nextInt(2) == 1;
                map.locationOf(actor).addActor(new DinoEgg("Stegosaur Egg",Species.HERBIVORES,Gender.FEMALE));
            }
        }
        return "Didnt work out "+ actor+ " too good for "+ attractor;
    }

    @Override
    public String menuDescription(Actor actor) {
        return null;
    }
}
