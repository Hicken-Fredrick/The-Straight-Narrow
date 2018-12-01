/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

/**
 *
 * @author Indivudual Week 9
 */

import citbyui.cit260.cityofaaron.model.LandControl;
import CityOfAaronSN.CityOfAaronSN;
import citbyui.cit260.cityofaaron.model.LandData;
import citbyui.cit260.cityofaaron.model.Game;
import static citbyui.cit260.cityofaaron.view.HelpMenuView.scanner;
import java.util.Scanner;


public class LandView extends View{
    // Scanner Object
    public static Scanner keyboard = new Scanner(System.in);
    // References to Game 
    public static Game game;
    public static LandData landData;
    //constructor
    
    public LandView() {
         game = CityOfAaronSN.getCurrentGame();
         landData = game.getLandData();
    
    }
    
    @Override
   public String[] getInputs() {
         String[] inputs = new String[1];
        
        //build prompt message
        String promptMessage = 
                "\n" + 
               "*********************************\n" + 
                "*   CITY OF AARON : Land View   *\n" +
                "*********************************\n" +
               "You currently have: " + game.getAcresOwned() + " acres available \n" +
               "If you want to buy more acres, it will cost you: " + game.getAcreCost() +
               "\n" + "R - return to previous menu\n";
        
        inputs[0] = getInput(promptMessage);
        
        return inputs;
        
    }
   @Override
    public boolean doAction(String inputs[]) {
        String choice = inputs[0];
        
        switch (choice.toLowerCase()) {
            //call new game
            case "b":{
                acreOwned();
                return false;
            }
            //call restart for current game    
            case "r":
                return true;
            //unknown menu item choice
            default:{
                System.out.println("Unknown Menu Choice Please Try Again");
                return false;
            }
            
        }
    }

    private void acreOwned() {
        Boolean pass = false;
        int acres = 0;
        Boolean validate = false;
        while (validate != true){
            pass = false;
        while (pass != true)
        {
        try {
        System.out.println("\nEnter the number that you want to purchase:");
        acres = Integer.parseInt(scanner.nextLine());
        pass = true;}
        catch (NumberFormatException e) { System.out.println("Invalid Input"); }

        }
        validate = validateInput(acres);
        }
    }
    
     public static void sellLandView() {
        // get cost of land this round
        int price = LandControl.calcLandPrice();
        int toSell = 0;
        // prompt user to enter number of of acres to buy
        System.out.format("Land is selling for %d points per acre.%n", price);
        
        boolean ok = true;
      //  do {
    }         
         
    
      
    private Boolean validateInput(int acres) {
        if (acres > game.getAcresOwned()){
            System.out.println("\nYou do not have enough land to do that");
            return false;
        }
        else if (acres / 2 > game.getWheatinStorage()){
            System.out.println("\nYou do not have enough to do that");
            return false;
        }
        else {
            System.out.println("\nLand successfully purchase ");
            LandControl.calcLandPrice(acres);
            
            return true;
            
        }
    }
    
}

