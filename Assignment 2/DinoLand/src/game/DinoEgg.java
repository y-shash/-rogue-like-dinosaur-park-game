package game;

public class DinoEgg {

    DinoBaby dinoBaby = new DinoBaby("dino",'d',10,10,Species.HERBIVORE,Gender.MALE);

    EcoPoints e1 = new EcoPoints();

    public DinoBaby hatch(){
        e1.setEcoPoints(100);  //if this stego then add 100 eco points
        return dinoBaby;
    }

}
//