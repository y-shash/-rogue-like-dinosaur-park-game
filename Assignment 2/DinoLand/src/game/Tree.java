package game;

import edu.monash.fit2099.engine.Exit;
import edu.monash.fit2099.engine.Ground;
import edu.monash.fit2099.engine.Location;

import java.util.Random;

public class Tree extends Ground {
	private int age = 0;
	public static Random r = new Random();

	public Tree() {
		super('+');
	}

	public static boolean dropFruitChance(int dropChance){
		int randInt = r.nextInt(100);
		boolean fruitDrop = false;
		if(randInt >= 0 && randInt <= dropChance){
			fruitDrop = true;
			return fruitDrop;
		}
		return fruitDrop;
	}
//	public boolean dropFruit(){
//
//	}



	@Override
	public void tick(Location location) {
		super.tick(location);
		age++;
		if (age == 10)
			displayChar = 't';
		if (age == 20)
			displayChar = 'T';


	}
}
