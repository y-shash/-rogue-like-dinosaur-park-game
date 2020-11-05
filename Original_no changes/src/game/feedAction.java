package game;

import edu.monash.fit2099.engine.*;

import java.util.List;


public class feedAction extends Action {
    protected Dinosaur target;
    protected EcoPoints e1;
    public feedAction( Dinosaur target){
        this.target= target;
    }
    @Override
    public String execute(Actor actor, GameMap map) {
        for(Item items : actor.getInventory()){
            if(items.toString().equals("Hay")){
                target.heal(20);
                if(actor instanceof Player) {
                    e1 = ((Player) actor).getE1();
                    e1.setEcoPoints(20);
                    actor.removeItemFromInventory(items);
                    return "added eco points";
                }
                return actor +" feeds"+ items+" to "+target;
            }
            else{
                return actor+" does not have hay to feed "+ target;
            }
        }
        return actor+" inventory empty";
    }
    @Override
    public String menuDescription(Actor actor) {
        return "Feed "+ target;
    }
}
