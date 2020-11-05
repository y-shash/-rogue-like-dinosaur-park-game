package game;


import edu.monash.fit2099.engine.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * A herbivorous dinosaur.
 *
 */
public class Stegosaur extends Dinosaur {
	// Will need to change this to a collection if Stegosaur gets additional Behaviours.
	private Behaviour behaviour;
	private Dinosaur other=null;
	int age = 0;
	Behaviour[] behaviours = {new WanderBehaviour()};
	ArrayList<Behaviour>behaviours1=new ArrayList<Behaviour>();
	/**
	 * Constructor.
	 * All Stegosaurs are represented by a 'd' and have 100 hit points.
	 *
	 * @param name the name of this Stegosaur
	 */
	public Stegosaur(String name, Gender gender) {
		super(name, '-', 100, gender, Species.HERBIVORES);

	}
	private void setDisplayChar(){
		age+=1;
		if(age == 5)
			this.displayChar='s';
		if(age == 10)
			this.displayChar='S';
	}


	@Override
	public Actions getAllowableActions(Actor otherActor, String direction, GameMap map) {
		Actions actions = super.getAllowableActions(otherActor, direction, map);
		actions.add(new AttackAction(this));
		actions.add(new feedAction(this));
		return actions;
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
		Display animals = new Display();
		animals.println("Stego Health: "+ this.hitPoints);
		behaviours1.add(0, new mateBehaviour(Dinosaur.class, 10));
		this.hurt(1);
		hungryDino(display, map);
		setDisplayChar();
		if (this.isConscious()) {
//			if(this.hitPoints>90 && (this.getDisplayChar()=='S')){
//				behaviours1.remove(0);
//				behaviours1.add(0, new mateBehaviour(Stegosaur.class, 30));
//			}
			for (Behaviour behaviour : behaviours1) {
				Action action = behaviour.getAction(this, map);
				System.out.println(behaviour.getClass());
//				Action action = null;
				if (action!=null)
					return action;
			}
		}
		return new DoNothingAction();
	}
}
