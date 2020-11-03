package game;

import edu.monash.fit2099.engine.Actor;
import edu.monash.fit2099.engine.Display;
import edu.monash.fit2099.engine.GameMap;
import edu.monash.fit2099.engine.Item;

import java.util.HashMap;

public class VendingMachine extends Item {
    EcoPoints e1 = new EcoPoints();
    private static final int HAY_ECO_POINTS = 20;
    private static final int FRUIT_ECO_POINTS = 30;
    private static final int VEGETARIAN_ECO_POINTS = 100;
    private static final int CARNIVORE_ECO_POINTS = 500;
    private static final int STEGOSAUR_EGG_ECO_POINTS = 200;
    private static final int ALLOSAUR_EGG_ECO_POINTS = 1000;
    private static final int LASER_GUN_ECO_POINTS = 500;

    public VendingMachine(GameMap map){
        super("VendingMachine", 'v', false);
        super.allowableActions.add(new purchaseAction(this));
    }

    public void purchaseHay(){
        if (e1.getEcoPoints() >= 20){
            e1.setEcoPoints(-20);
        }
        else {
            System.out.println("No enough Eco points to purchase");
        }
    }


    public void purchaseFruit(){
        if(e1.getEcoPoints() >= 30){
            e1.setEcoPoints(-30);
        }
        else {
            System.out.println("No enough Eco points to purchase");
        }
    }

    public void purchaseVegetarianMeal(){
        if (e1.getEcoPoints() >= 100){
            e1.setEcoPoints(-100);
        }
        else {
            System.out.println("No enough Eco points to purchase");
        }
    }

    public void purchaseCarnivoreMeal(){
        if (e1.getEcoPoints() >= 200){
            e1.setEcoPoints(-200);
        }
        else {
            System.out.println("No enough Eco points to purchase");
        }
    }

    public void purchaseStegosaurEgg(){
        if (e1.getEcoPoints() >= 100){
            e1.setEcoPoints(-100);
        }
        else {
            System.out.println("No enough Eco points to purchase");
        }
    }

    public void purchaseAllosaurEgg(){
        if (e1.getEcoPoints() >= 1000){
            e1.setEcoPoints(-1000);
        }
        else {
            System.out.println("No enough Eco points to purchase");
        }
    }

    public void purchaseLaserGun(){
        if (e1.getEcoPoints() >= 500){
            e1.setEcoPoints(-500);
        }
        else {
            System.out.println("No enough Eco points to purchase");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}