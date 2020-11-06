package game;

import edu.monash.fit2099.engine.Ground;
import edu.monash.fit2099.engine.Location;

/**
 * A class that represents a pool with the char ~
 */
public class Water extends Ground {

    /**
     * Constructor.
     *
     //* @param displayChar character to display for this type of terrain
     */
    public Water() {
        super('~');
    }

    @Override
    public void tick(Location location) {
        super.tick(location);

    }


}
