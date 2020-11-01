package game;

import edu.monash.fit2099.engine.GameMap;
import edu.monash.fit2099.engine.Item;

public class VendingMachine extends Item {

    public VendingMachine(GameMap map){
        super("VendingMachine", 'v', false);

    }
     EcoPoints e1 = new EcoPoints();

    private static final int HAY_ECO_POINTS = 20;
    private static final int FRUIT_ECO_POINTS = 30;
    private static final int VEGETARIAN_ECO_POINTS = 100;
    private static final int CARNIVORE_ECO_POINTS = 500;
    private static final int STEGOSAUR_EGG_ECO_POINTS = 200;
    private static final int ALLOSAUR_EGG_ECO_POINTS = 1000;
    private static final int LASER_GUN_ECO_POINTS = 500;

    public void purchaseHay(){
        if (e1.getEcoPoints() >= 20){
        e1.setEcoPoints(-20);
    }}

    public void purchaseFruit(){
        if(e1.getEcoPoints() >= 30){
        e1.setEcoPoints(-30);
    }}

    public void purchaseVegetarianMeal(){
        if (e1.getEcoPoints() >= 100){
        e1.setEcoPoints(-100);
    }}

    public void purchaseCarnivoreMeal(){
        if (e1.getEcoPoints() >= 200){
        e1.setEcoPoints(-200);
    }}

    public void purchaseStegosaurEgg(){
        if (e1.getEcoPoints() >= 100){
        e1.setEcoPoints(-100);
    }}

    public void purchaseAllosaurEgg(){
        if (e1.getEcoPoints() >= 1000){
        e1.setEcoPoints(-1000);
    }}

    public void purchaseLaserGun(){
        if (e1.getEcoPoints() >= 500){
        e1.setEcoPoints(-500);
        }
    }


//o


}
