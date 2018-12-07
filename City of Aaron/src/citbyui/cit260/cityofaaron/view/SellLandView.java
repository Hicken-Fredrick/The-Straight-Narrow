/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

import CityOfAaronSN.CityOfAaronSN;
import citbyui.cit260.cityofaaron.control.GameControl;
import citbyui.cit260.cityofaaron.model.Game;
import citybyui.cit260.cirtyofaaron.exceptions.SellLandException;
import java.util.Scanner;

/**
 *
 * @author Meroko
 */
class SellLandView extends View {
    public static Game game = CityOfAaronSN.getCurrentGame();
    
    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        
        //build prompt message
        String promptMessage = 
                "\n" + 
               "*********************************\n" + 
                "*   CITY OF AARON : Sell Land   *\n" +
                "*********************************\n" +
                "You Currently own " + (game.getAcresOwned() + game.getAcresPlanted()) +
                " acres of land\n" + "Land currently sells for " + game.getAcreCost() +
                " bushels of wheat\n" +
                "S - Sell Land\n" + 
                "R - Return to previous menu";
                
        
        inputs[0] = getInput(promptMessage);
        
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String choice = inputs[0];
        
        switch (choice.toLowerCase()) {
            //call new game
            case "s":{
                sellLand();
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

    private void sellLand() {
        boolean pass = false;
        boolean valid = false;
        String choice = null;
        int amountToSell = 0;
        boolean validate = false;
        
        //get input and validate
        while (validate != true){
            pass = false;
            while (pass != true)
            {
            try {
            this.console.println("\nEnter Amount of Land to Sell(or enter q to quit):");
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
                if(choice.toLowerCase().trim().equals("q")) {
                    this.console.println("quitting to previous menu");
                    return;
                }
                
            amountToSell = Integer.parseInt(choice);
            pass = true;} catch (NumberFormatException e) { 
                ErrorView.display(this.getClass().getName(),
                        "Please Enter Only Numbers"); }
        }
        try {
            //validate input against land owned
            GameControl.sellLand(amountToSell);
            validate = true;
        }catch(SellLandException sle){
            //reset to begining
            ErrorView.display(this.getClass().getName(),
                    sle.getMessage());
            validate = false;
            pass = false;
        }
        }
    }

    
    
}
