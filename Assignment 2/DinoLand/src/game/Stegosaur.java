package game;


import edu.monash.fit2099.engine.*;

/**
 * A herbivorous dinosaur.
 *
 */
public class Stegosaur extends Dinosaur {


	// Will need to change this to a collection if Stegosaur gets additional Behaviours.
	protected Behaviour behaviour = new WanderBehaviour();
	protected int age;


	/**
	 * Constructor.
	 * All Stegosaurs are represented by a 'd' and have 100 hit points.
	 *
	 * @param name the name of this Stegosaur
	 */
	public Stegosaur(String name, Gender gender) {
		super(name, 'S', 10, 100, Species.HERBIVORE, gender);
		behaviour = new WanderBehaviour();
	}

	/**
	 * Figure out what to do next.
	 * <p>
	 * FIXME: Stegosaur wanders around at random, or if no suitable MoveActions are available, it
	 * just stands there.  That's boring.
	 *
	 * @see edu.monash.fit2099.engine.Actor#playTurn(Actions, Action, GameMap, Display)
	 */
	@Override
	public Action playTurn(Actions actions, Action lastAction, GameMap map, Display display) {
		return  behaviour.getAction(this, map);
	}

}
