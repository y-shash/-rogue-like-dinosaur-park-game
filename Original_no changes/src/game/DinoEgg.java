package game;

import edu.monash.fit2099.engine.Ground;

public class DinoEgg extends DinoBaby {
    EcoPoints e1 = new EcoPoints();
    /**
     * Constructor.
     *
     * @param displayChar character to display for this type of terrain
     */
    public DinoEgg(char displayChar,Species species, Gender gender)
    {
        super("Egg",'o',species,gender);
    }

    public DinoBaby hatch(DinoBaby dinoBaby){
        e1.setEcoPoints(100);  //if this stego then add 100 eco points
        return dinoBaby;
    }
}
