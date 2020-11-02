package game;

import edu.monash.fit2099.engine.*;

import java.util.Random;

/**
 * Class representing the Player.
 */
public class Player extends Actor {

	private Menu menu = new Menu();

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
		if(onGround){
			actions.add(new searchTree());
		}
		System.out.println("near a tree:"+onGround);

		return menu.showMenu(this, actions, display);
	}
}
