package game;

import edu.monash.fit2099.engine.Location;
import edu.monash.fit2099.engine.PickUpItemAction;

public class Fruits extends PortableItem {
    private int age = 0;

    public Fruits() {
        super("Fruit", '*');

    }

    @Override
    public void tick(Location location) {
//        super.tick(location);
//        age++;
//        if(age>10)
//            displayChar='f';
//        if(age>30)
//            displayChar='F';
//        if(age>40)
//            name = "RottenFruit";

    }
}