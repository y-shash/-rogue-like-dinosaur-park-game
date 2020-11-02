package game;

import edu.monash.fit2099.engine.Ground;

public class DinoEgg extends Ground {

    DinoBaby dinoBaby = new DinoBaby("BabySteg",'s',Species.HERBIVORE,Gender.MALE);

    EcoPoints e1 = new EcoPoints();

    /**
     * Constructor.
     *
     * @param displayChar character to display for this type of terrain
     */
    public DinoEgg(char displayChar) {
        super('E');
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public DinoBaby hatch(){
        e1.setEcoPoints(100);  //if this stego then add 100 eco points
        return dinoBaby;
    }

}
