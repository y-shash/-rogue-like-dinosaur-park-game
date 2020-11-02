package game;

import edu.monash.fit2099.engine.*;

import java.util.Random;

public class searchTree extends Action {
    Random randInt= new Random();
    Ground tree;
//    public searchTree(Ground Tree){
//        this.tree = Tree;
//    }
    @Override
    public String execute(Actor actor, GameMap map) {
        // basically giving the tree a 10% chance to have a fruit when searching
        boolean val = randInt.nextInt(10)==1;
        System.out.println(val);
        if(val){
            actor.addItemToInventory(new Fruits());
            return actor + "found a fruit";
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
