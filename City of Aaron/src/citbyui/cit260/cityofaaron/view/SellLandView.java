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
    public static Scanner scanner = new Scanner( System.in );
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
                " acres of land\n" + "land currently sells for " + game.getAcreCost() +
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
                System.out.println("Unknown Menu Choice Please Try Again");
                return false;
            }
            
        }
    }

    private void sellLand() {
        Boolean pass = false;
        String choice = null;
        int amountToSell = 0;
        Boolean validate = false;
        
        //get input and validate
        while (validate != true){
            pass = false;
            while (pass != true)
            {
            try {
            System.out.println("\nEnter Amount of Land to Sell(or enter q to quit):");
            choice = scanner.nextLine();

                //check for escape
                if(choice.toLowerCase().trim().equals("q")) {
                    System.out.println("quitting to previous menu");
                    return;
                }
                
            amountToSell = Integer.parseInt(choice);
            pass = true;} catch (NumberFormatException e) { 
                System.out.println("Please Enter Only Numbers"); }
        }
        try {
            //validate input against land owned
            GameControl.sellLand(amountToSell);
            validate = true;
        }catch(SellLandException sle){
            //reset to begining
            System.out.println(sle.getMessage());
            validate = false;
            pass = false;
        }
        }
    }

    
    
}
