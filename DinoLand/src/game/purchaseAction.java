package game;

import edu.monash.fit2099.engine.Action;
import edu.monash.fit2099.engine.Actor;
import edu.monash.fit2099.engine.Display;
import edu.monash.fit2099.engine.GameMap;

import java.util.HashMap;
public class purchaseAction extends Action {
    /**
     * Function deals with the ability of the player to purchase items
     *
     * @author Ashwin Sarith
     */
    protected VendingMachine vendingMachine;
    purchaseAction(VendingMachine venDingMachine){
        this.vendingMachine =venDingMachine;
    }
    protected String purchaseIt(Actor actor, GameMap map){
        Display display = new Display();
        HashMap<Character, String> itemToBuy = new HashMap<Character, String>();
        display.println("");
        display.println("EcoPoints: "+vendingMachine.e1.getEcoPoints());
        display.println("-----------DINO SERVER--------");
        display.println("What would you like to buy?");
        display.println("------------------------------");
        String[] choices = {"Hay","Fruit","VegetarianMeal","CarnivoreMeal","Stegosaur Egg","Allosaur Egg", "Laser Gun","ArchaeopteryxEgg","AgilisaurusEgg" };
        char [] hotkeys = {'a','b','c','d','e','f','g','h','i'};
        for(int i =0; i<9;i++){
            display.println(hotkeys[i]+": Purchase"+ choices[i]);
            itemToBuy.put(hotkeys[i],choices[i]);
        }
        char choice;
        do{
            choice = display.readChar();
        }while(!itemToBuy.containsKey(choice));

        String res = "";
        if(choice == 'a'){
            vendingMachine.purchaseHay();
            Hay bought = new Hay();
            actor.addItemToInventory(bought);
            display.println(bought.toString()+" purchased");
            res+="hello";
            return res;
        }
        else if(choice == 'b'){
            vendingMachine.purchaseFruit();
            Fruits bought = new Fruits();
            actor.addItemToInventory(bought);
            display.println(bought.toString()+" purchased");
            res+="hello";
            return res;
        }
        else if(choice == 'c'){
            vendingMachine.purchaseVegetarianMeal();
            return res;
        }
        else if(choice == 'd'){
            vendingMachine.purchaseCarnivoreMeal();
            return res;
        }
        else if(choice == 'e'){
            vendingMachine.purchaseStegosaurEgg();
            return res;
        }
        else if(choice == 'f'){
            vendingMachine.purchaseAllosaurEgg();
            return res;
        }
        else if(choice == 'g'){
            vendingMachine.purchaseLaserGun();
//            LaserGun bought = new LaserGun();
//            actor.addItemToInventory(bought);
//            display.println(bought.toString()+" purchased");

            return res;
        }
        else if(choice == 'h'){
            vendingMachine.purchaseArchaeopteryxEgg();
//            LaserGun bought = new LaserGun();
//            actor.addItemToInventory(bought);
//            display.println(bought.toString()+" purchased");
            return res;
        }
        else if(choice == 'i'){
            vendingMachine.purchaseAgilisaurusEgg();
//            LaserGun bought = new LaserGun();
//            actor.addItemToInventory(bought);
//            display.println(bought.toString()+" purchased");
            return res;
        }
        else {
            return "incorrect choice";
        }
    }
    @Override
    public String execute(Actor actor, GameMap map) {
    return purchaseIt(actor,map);
    }
    @Override
    public String menuDescription(Actor actor) {
        return "Use the Vending Machine?";
    }
}
