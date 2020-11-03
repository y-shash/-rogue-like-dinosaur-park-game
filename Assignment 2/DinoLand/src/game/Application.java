package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import edu.monash.fit2099.engine.*;

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
		"................................................................................",
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
		
		// Place a pair of stegosaurs in the middle of the map
		Stegosaur richyStego = new Stegosaur("richy", Gender.MALE);
		Stegosaur wendyStego = new Stegosaur("wendy", Gender.FEMALE);
		gameMap.at(30, 12).addActor(richyStego);
		gameMap.at(32, 12).addActor(wendyStego);


		
		// place some grass with respect to probability as well as control whether a tree drops a fruit each turn
		boolean twoGrassInX;
		boolean twoGrassInY;
		boolean treeDrop;

		int probabilityGrassSpawn = 2;
		int probabilityAdjacentGrass = 10;
		int probabilityFruitDrop = 5;
		for (int y = 0; y <= 24; y++) {
			for (int x = 0; x <= 79; x ++){
				twoGrassInX = x >= 2 && gameMap.at(x - 1, y).getDisplayChar() == 'G' && gameMap.at(x - 2, y).getDisplayChar() == 'G';
				twoGrassInY = y >= 2 && gameMap.at(x, y - 1).getDisplayChar() == 'G' && gameMap.at(x, y - 2).getDisplayChar() == 'G';

				if (gameMap.at(x, y).getDisplayChar() == '.' && (twoGrassInX || twoGrassInY)){
					if (Grass.growingProbability(probabilityAdjacentGrass)){
						gameMap.at(x,y).addItem(new Grass());
					}
				}
				else if (gameMap.at(x, y).getDisplayChar() == '.' && Grass.growingProbability(probabilityGrassSpawn)){
					gameMap.at(x,y).addItem(new Grass());
				}

				if(gameMap.at(x,y).getDisplayChar()=='+'|| gameMap.at(x,y).getDisplayChar()=='t' || gameMap.at(x,y).getDisplayChar()=='T'){
					if(Tree.dropFruitChance(probabilityFruitDrop)){
						gameMap.at(x,y).addItem(new Fruits());

					}
				}




			}
		}
		world.run();
	}
}
