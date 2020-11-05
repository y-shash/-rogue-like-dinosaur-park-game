package game;

import edu.monash.fit2099.engine.GameMap;

import java.util.Random;

public class GrassOnMap {

    boolean twoGrassInX;
    boolean twoGrassInY;


    public GrassOnMap(GameMap map){

        Random randInt = new Random();
        for(int x :map.getXRange()){
            for(int y: map.getYRange()){
                twoGrassInX= x >= 2 && map.at(x - 1, y).getDisplayChar() == 'H' && map.at(x - 2, y).getDisplayChar() == 'H';
                twoGrassInY= y >= 2 && map.at(x, y - 1).getDisplayChar() == 'H' && map.at(x, y - 2).getDisplayChar() == 'H';
                if (map.at(x, y).getDisplayChar() == '.'){
                    if(twoGrassInX || twoGrassInY){
                        if(randInt.nextInt(100)==10){
                            map.at(x,y).addItem(new Hay());
                        }
                    }
                    else if((randInt.nextInt(100)==5)){
                        map.at(x,y).addItem(new Hay());
                    }
                }
            }
        }



    }
}


