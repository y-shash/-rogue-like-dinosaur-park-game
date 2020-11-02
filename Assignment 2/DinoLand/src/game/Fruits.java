package game;

import edu.monash.fit2099.engine.Action;
import edu.monash.fit2099.engine.Item;
import edu.monash.fit2099.interfaces.GroundInterface;

import java.util.List;

public class Fruits extends Food {
    public Fruits(){
        super("Fruits", 'F',20);
        super.allowableActions.add(new EatFoodAction());
    }

}
