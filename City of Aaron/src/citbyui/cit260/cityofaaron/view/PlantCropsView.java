/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

import CityOfAaronSN.CityOfAaronSN;
import citbyui.cit260.cityofaaron.model.Game;
import citbyui.cit260.cityofaaron.control.GameControl;

import java.util.Scanner;

/**
 *
 * @author Meroko
 */
public class PlantCropsView extends View{
    public static Game game = CityOfAaronSN.getCurrentGame();
    
    public PlantCropsView() {
        
    }
    
    @Override
    public String[] getInputs() {
         String[] inputs = new String[1];
        
        //build prompt message
        String promptMessage = 
                "\n" + 
               "*********************************\n" + 
                "*   CITY OF AARON : Plant Crops   *\n" +
                "*********************************\n" +
               "You currently have: " + game.getWheatinStorage() + " Wheat in storage \n" +
               "Current Acres Planted: " + game.getAcresPlanted() +
               "\n" + "Current Acres Unplanted: " + game.getAcresOwned() +
               "\n P - plant additional crops\n" +
               " R - return to previous menu\n";
        
        inputs[0] = getInput(promptMessage);
        
        return inputs;
        
    }
    @Override
    public boolean doAction(String inputs[]) {
        String choice = inputs[0];
        
        switch (choice.toLowerCase()) {
            //call new game
            case "p":{
                plantCrops();
                return false;
            }
            //call restart for current game    
            case "r":
                return true;
            //unknown menu item choice
            default:{
                ErrorView.display(this.getClass().getName(),
                        "Unknown Menu Choice Please Try Again");
                return false;
            }
            
        }
    }

    private void plantCrops() {
        boolean pass = false;
        boolean valid = false;
        String choice = null;
        int plant = 0;
        boolean validate = false;
        while (validate != true){
            pass = false;
            while (pass != true)
            {
                try {
                    try {
                        while (!valid) {
                            //print prompt
                            this.console.println("\nEnter the number that you want to plant(q to quit):");
                            
                            //get user input
                            choice = this.keyboard.readLine();
                            choice = choice.trim();
                            
                            if (choice.length() < 1){
                                ErrorView.display(this.getClass().getName(),
                                        "You must enter a value.");
                                continue;
                            }
                            break;
                            
                        }
                    } catch (Exception e) {
                        ErrorView.display(this.getClass().getName(),
                                "Error Reading Input: " + e.getMessage());
                    }
                    
                    //check for escape
                    if(choice.toLowerCase().equals("q")) {
                        this.console.println("quitting to previous menu");
                        return;
                    }
                    
                    plant = Integer.parseInt(choice);
                    pass = true;}
                catch (NumberFormatException e) { 
                    ErrorView.display(this.getClass().getName(),
                            "Invalid Input"); }
            }
            validate = validateInput(plant);
        }
    }

    private Boolean validateInput(int plant) {
        if (plant > game.getAcresOwned()){
            ErrorView.display(this.getClass().getName(),
                    "\nYou do not have enough land to do that");
            return false;
        }
        else if (plant / 2 > game.getWheatinStorage()){
            ErrorView.display(this.getClass().getName(),
                    "\nYou do not have enough wheat to do that");
            return false;
        }
        else {
            this.console.println("\nLand successfully planted ");
            GameControl.plantCrops(plant);
            
            return true;
            
        }
    }
    
}