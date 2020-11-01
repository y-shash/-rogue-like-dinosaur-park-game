package game;

import edu.monash.fit2099.engine.Action;
import edu.monash.fit2099.engine.Actor;
import edu.monash.fit2099.engine.GameMap;



public class growAction extends Action {
    public growAction(){

    }

    EcoPoints e1 = new EcoPoints();

    @Override
    public String execute(Actor actor, GameMap map) {
        boolean twoGrassInX;
        boolean twoGrassInY;
        boolean treeDrop;

        int probabilityGrassSpawn = 2;
        int probabilityAdjacentGrass = 10;
        int probabilityFruitDrop = 5;
        for (int y = 0; y <= 24; y++) {
            for (int x = 0; x <= 79; x ++){
                twoGrassInX = x >= 2 && map.at(x - 1, y).getDisplayChar() == 'G' && map.at(x - 2, y).getDisplayChar() == 'G';
                twoGrassInY = y >= 2 && map.at(x, y - 1).getDisplayChar() == 'G' && map.at(x, y - 2).getDisplayChar() == 'G';

                if (map.at(x, y).getDisplayChar() == '.' && (twoGrassInX || twoGrassInY)){
                    if (Grass.growingProbability(probabilityAdjacentGrass)){
                        map.at(x,y).addItem(new Grass());
                        e1.setEcoPoints(1);
                    }
                }
                else if (map.at(x, y).getDisplayChar() == '.' && Grass.growingProbability(probabilityGrassSpawn)){
                    map.at(x,y).addItem(new Grass());
                    e1.setEcoPoints(1);
                }

                if(map.at(x,y).getDisplayChar()=='+'|| map.at(x,y).getDisplayChar()=='t' || map.at(x,y).getDisplayChar()=='T'){
                    if(Tree.dropFruitChance(probabilityFruitDrop)){
                        map.at(x,y).addItem(new Fruits());

                    }
                }



            }
        }
        return null;
    }

    @Override
    public String menuDescription(Actor actor) {
        return null;
    }
}
