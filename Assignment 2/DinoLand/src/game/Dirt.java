package game;

import edu.monash.fit2099.engine.Ground;
import edu.monash.fit2099.engine.Location;

/**
 * A class that represents bare dirt.
 */
public class Dirt extends Ground{
	private int time = 0;
	private Grass g;

	public Dirt() {
		super('.');
	}

	@Override
	public void tick(Location location) {

		super.tick(location);
		time++;

		}

}
