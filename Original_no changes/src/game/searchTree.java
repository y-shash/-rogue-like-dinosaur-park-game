package game;

import edu.monash.fit2099.engine.*;

import java.util.Random;

public class searchTree extends Action {
    Random randInt= new Random();
    EcoPoints e1;
    @Override
    public String execute(Actor actor, GameMap map) {
        // basically giving the tree a 10% chance to have a fruit when searching
        boolean val = randInt.nextInt(10)==1;
        if(val){
            actor.addItemToInventory(new Fruits());
            if(actor instanceof Player) {
                e1 = ((Player) actor).getE1();
                e1.setEcoPoints(20);
                return "ecopoints+++ fruits are rare";
            }
            return actor + "found a fruit,";
        }
        else{
            return actor + "could not find fruits";
        }
    }
    @Override
    public String menuDescription(Actor actor) {
        return "search Tree for fruits";
    }
}
