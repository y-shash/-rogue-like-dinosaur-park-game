package game;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import edu.monash.fit2099.engine.Actor;
import edu.monash.fit2099.engine.Display;
import edu.monash.fit2099.engine.FancyGroundFactory;
import edu.monash.fit2099.engine.GameMap;
import edu.monash.fit2099.engine.World;

/**
 * The main class for the Jurassic World game.
 *
 */
public class Application {

	public static void main(String[] args) {
		World world = new World(new Display());

		FancyGroundFactory groundFactory = new FancyGroundFactory(new Dirt(), new Wall(), new Floor(), new Tree());
		
		List<String> map = Arrays.asList(
		"................................................................................",
		"................................................................................",
		".....#######....................................................................",
		".....#_____#....................................................................",
		".....#_____#....................................................................",
		".....###.###....................................................................",
		"..........+.....................................................................",
		"......................................+++.......................................",
		".......................................++++.....................................",
		"...................................+++++........................................",
		".....................................++++++.....................................",
		"......................................+++.......................................",
		".....................................+++........................................",
		"................................................................................",
		"............+++.................................................................",
		".............+++++..............................................................",
		"...............++........................................+++++..................",
		".............+++....................................++++++++....................",
		"............+++.......................................+++.......................",
		"................................................................................",
		".........................................................................++.....",
		"........................................................................++.++...",
		".........................................................................++++...",
		"..........................................................................++....",
		"................................................................................");
		GameMap gameMap = new GameMap(groundFactory, map );
		world.addGameMap(gameMap);

		
		Actor player = new Player("Player", '@', 100);
		world.addPlayer(player, gameMap.at(9, 4));
		gameMap.at(9,4).addItem(new Hay());
		gameMap.at(9,4).addItem(new Fruits());
		gameMap.at(8,3).addItem(new VendingMachine(gameMap,player));

		// Place a pair of stegosaurs in the middle of the map
		gameMap.at(29, 11).addActor(new Stegosaur("Stegosaur",Gender.MALE));
		gameMap.at(37, 12).addActor(new Stegosaur("Stegosaur",Gender.FEMALE));


//		gameMap.at(8,3).addItem(new Hay());
		// grass Growing
		boolean twoGrassInX;
		boolean twoGrassInY;
		Random randInt = new Random();
		for(int x :gameMap.getXRange()){
			for(int y: gameMap.getYRange()){
				twoGrassInX= x >= 2 && gameMap.at(x - 1, y).getDisplayChar() == 'H' && gameMap.at(x - 2, y).getDisplayChar() == 'H';
				twoGrassInY= y >= 2 && gameMap.at(x, y - 1).getDisplayChar() == 'H' && gameMap.at(x, y - 2).getDisplayChar() == 'H';
				if (gameMap.at(x, y).getDisplayChar() == '.'){
					if(twoGrassInX || twoGrassInY){
						if(randInt.nextInt(100)==10){
							gameMap.at(x,y).addItem(new Hay());
						}
					}
					else if((randInt.nextInt(100)==5)){
						gameMap.at(x,y).addItem(new Hay());
					}
				}
			}
		}
		world.run();
	}
}
