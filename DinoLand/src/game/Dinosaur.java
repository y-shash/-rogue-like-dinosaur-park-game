package game;

import edu.monash.fit2099.engine.*;

public abstract class Dinosaur extends Actor {
    private final Gender gender;
    private final Species species;
    private boolean isPregnant = false;
    /**
     * Constructor.
     * functions that encapsulate all the methods governing the dinosaurus classes
     *  @param name        the name of the Actor
     * @param displayChar the character that will represent the Actor in the display
     * @param hitPoints   the Actor's starting hit points
     * @author Ashwin Sarith
     */

    public Dinosaur(String name, char displayChar, int hitPoints, Gender gender, Species species) {
        super(name, displayChar,hitPoints);
        this.gender = gender;
        this.species = species;
        super.addCapability(gender);
        super.addCapability(species);
    }

    public void setPregnant(boolean pregnant) {
        this.isPregnant = pregnant;
    }

    public boolean getIsPregnant() {
        return isPregnant;
    }

    public void hungryDino(Display display, GameMap map){
        String s = "";
        Location t_location= map.locationOf(this);
        Item corpse = new PortableItem("dead " + this, '%');
        int x = t_location.x();
        int y = t_location.y();
        if(this.hitPoints<90) {
            s += this.name + " at "+"("+x +","+ y+")" + " is getting hungry";
            display.println(s);
        }
        else{
            s+=this.name+ " is "+ " happy";
        }
        if(!this.isConscious()) {
            map.removeActor(this);
            t_location.addItem(corpse);
            s+=this.name + " at "+"("+x +","+ y+")" +" has died from hunger";
        }

        display.println(s);
    }

}
