package game;

import edu.monash.fit2099.engine.*;

public class DinoEgg extends Dinosaur {
    /**
     * Constructor.
     *
     * @param displayChar character to display for this type of terrain
     */
//    DinoBaby babysteg = new DinoBaby("BabySteg");
    protected int age=0;
    public DinoEgg(String name, Species species, Gender gender){
        super(name,'o',10,gender,species);
    }
    public DinoBaby hatch(DinoBaby dinoBaby){
        return dinoBaby;
    }

    private void setDisplaychar(GameMap map){
        if (age == 5) {
            Location egg = map.locationOf(this);
            map.removeActor(this);
            map.addActor(new DinoBaby("theseus", 't', Species.HERBIVORES, Gender.FEMALE), egg);
        }
    }

    @Override
    public Action playTurn(Actions actions, Action lastAction, GameMap map, Display display) {
        setDisplaychar(map);
//        hatch()
        return null;
    }
}
