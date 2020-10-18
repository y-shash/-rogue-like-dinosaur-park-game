package game;

import edu.monash.fit2099.engine.*;

public class Allosaur extends Actor {


    private Behaviour[] = new carnivorousBehaviour(Stegosaur.class, 10);
    public Allosaur(){
        super("dinosaur",'A', 100);

    }
    @Override
    public Action playTurn(Actions actions, Action lastAction, GameMap map, Display display) {
        return null;
    }
}
