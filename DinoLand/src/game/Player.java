package game;

import edu.monash.fit2099.engine.*;

import java.util.Random;

/**
 * Class representing the Player.
 */
public class Player extends Actor {

	private Menu menu = new Menu();
	protected EcoPoints e1= new EcoPoints();

	/**
	 * Constructor.
	 *
	 * @param name        Name to call the player in the UI
	 * @param displayChar Character to represent the player in the UI
	 * @param hitPoints   Player's starting number of hitpoints
	 */
	public Player(String name, char displayChar, int hitPoints) {
		super(name, displayChar, hitPoints);
	}

	public EcoPoints getE1() {
		return e1;
	}

	@Override
	public Action playTurn(Actions actions, Action lastAction, GameMap map, Display display) {
		// Handle multi-turn Actions
		if (lastAction.getNextAction() != null)
			return lastAction.getNextAction();
		actions.add(new Quit());
		actions.add(new EatFoodAction());
		Location player= map.locationOf(this);
		int playerX = player.x();
		int playerY = player.y();
		Ground someGround = map.at(playerX,playerY).getGround();
		boolean onGround = map.isAnActorAt(player) && someGround.getDisplayChar()== 'T';
		int Count = 0;
		if(onGround){
			actions.add(new searchTree());
			Count+=1;
			System.out.println(Count);
		}
		else if(Count == 2){
			actions.remove(new searchTree());
			System.out.println("does it?");
		}
		else{
			Count+=1;
		}

		System.out.println("near a tree:"+onGround);

		return menu.showMenu(this, actions, display);
	}
}
