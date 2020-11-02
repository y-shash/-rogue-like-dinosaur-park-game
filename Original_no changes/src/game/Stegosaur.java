package game;


import edu.monash.fit2099.engine.*;

/**
 * A herbivorous dinosaur.
 *
 */
public class Stegosaur extends Dinosaur {
	// Will need to change this to a collection if Stegosaur gets additional Behaviours.
	private Behaviour behaviour;
	/** 
	 * Constructor.
	 * All Stegosaurs are represented by a 'd' and have 100 hit points.
	 * 
	 * @param name the name of this Stegosaur
	 */
	public Stegosaur(String name, Gender gender) {
		super(name, 'S',100, gender, Species.HERBIVORES);
		Behaviour[] behaviour = {new WanderBehaviour()};
	}


	@Override
	public Actions getAllowableActions(Actor otherActor, String direction, GameMap map) {
		Actions actions = super.getAllowableActions(otherActor,direction,map);
		actions.add(new AttackAction(this));
		actions.add(new feedAction(this));
		return actions;
	}

	/**
	 * Figure out what to do next.
	 * 
	 * FIXME: Stegosaur wanders around at random, or if no suitable MoveActions are available, it
	 * just stands there.  That's boring.
	 * 
	 * @see edu.monash.fit2099.engine.Actor#playTurn(Actions, Action, GameMap, Display)
	 */
	@Override
	public Action playTurn(Actions actions, Action lastAction, GameMap map, Display display) {
//		Action wander = behaviour.getAction(this, map);
		this.hurt(1);
		hungryDino(display,map);
		Action wander = null;

		if (wander != null)
			return wander;
		return new DoNothingAction();
	}

}
