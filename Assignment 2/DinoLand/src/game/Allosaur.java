package game;

import edu.monash.fit2099.engine.*;

public class Allosaur extends Dinosaur {




    public Allosaur(String name, Gender gender) {
        super(name, 'A', 100, 100, Species.CARNIVORE, gender);
    }

    @Override
    public Action playTurn(Actions actions, Action lastAction, GameMap map, Display display) {
        return null;
    }
}


