package game;

import edu.monash.fit2099.engine.*;

public abstract class Dinosaur extends Actor {
    protected int HungerLvl;
    protected int dinoHitPoints;
    protected String dinoName;
    protected Species type;
    protected Gender gender;
    protected boolean isPregnant = false;


    public Dinosaur(String name, char displayChar, int hitPoints, int hungerLvl, Species type, Gender gender){
        super(name,displayChar,hitPoints);
        this.dinoName =name;
        this.HungerLvl = hungerLvl;
        this.dinoHitPoints = hitPoints;
        addCapability(type);
        addCapability(gender);
    }
//    DinoEgg egg = new DinoEgg();

    // getters for gender and HungerLvl
    public int getHungerLvl() {
        return HungerLvl;
    }
    public int getDinoHitPoints(){return dinoHitPoints;}
    public Species getType() {return type;}
    public Gender getGender() {
        return gender;
    }
    public String getDinoName() {
        return dinoName;
    }

    // setter
    public void setPregnant(boolean pregnant) {
        isPregnant = pregnant;
    }

    // method


    @Override
    public Action playTurn(Actions actions, Action lastAction, GameMap map, Display display) {
        return null;
    }

    @Override
    public Actions getAllowableActions(Actor otherActor, String direction, GameMap map) {
        Actions list = super.getAllowableActions(otherActor, direction, map);
        // if the herbivore
        boolean herbivoreCondition = (otherActor.hasCapability(Species.HERBIVORE) == (this.hasCapability(Species.HERBIVORE)));
        boolean carnivoreCondition = (otherActor.hasCapability(Species.CARNIVORE) == (this.hasCapability(Species.CARNIVORE)));
        boolean maleFemale  = (otherActor.hasCapability(Gender.MALE) && (this.hasCapability(Gender.FEMALE)));
        boolean femaleMale  = (otherActor.hasCapability(Gender.FEMALE) && (this.hasCapability(Gender.MALE)));

        if(herbivoreCondition){
            if(maleFemale){
                list.add(new mateAction(this));
            }
            else if(femaleMale){
                list.add(new mateAction(this));
            }
        else if(carnivoreCondition){
                if(maleFemale){
                    list.add(new mateAction(this));
                }
                else if(femaleMale){
                    list.add(new mateAction(this));
                }
            }
        }
        list.add(new AttackAction(this));

        return list;


}

//    public DinoEgg layEgg(){
//        return egg;
//    }
}
