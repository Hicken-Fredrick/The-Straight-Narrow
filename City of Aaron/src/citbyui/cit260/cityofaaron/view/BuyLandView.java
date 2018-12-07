/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

import CityOfAaronSN.CityOfAaronSN;
import citbyui.cit260.cityofaaron.control.GameControl;
import citbyui.cit260.cityofaaron.model.Game;
import citybyui.cit260.cirtyofaaron.exceptions.BuyLandException;
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
class BuyLandView extends View {
    public static Scanner scanner = new Scanner( System.in );
    public static Game game = CityOfAaronSN.getCurrentGame();
   
    
    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        
        
        //build prompt message
        String promptMessage = 
            "\n" + 
            "*********************************\n" + 
            "*   CITY OF AARON : BUY LAND MENU   *\n" +
            "*********************************\n" +
            "You currently have: " + game.getAcresOwned() + game.getAcresPlanted() +
            "Enter the number of acres you want to purchase? " + 
            " R - return to previous menu\n";
        
        inputs[0] = getInput(promptMessage);
        
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
       // System.out.println("TO BE IMPLEMENTED");
       
        String choice = inputs[0];
        
        switch (choice.toLowerCase()) {
            //call new game
            case "p":{
                BuyLandView();
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

    private void BuyLandView() {
        Boolean pass = false;
        //String choice = null;
        String acres = null;
        
        int landpurchased = 0;
        Boolean validate = false;
        
        while (validate != true){
            pass = false;
        while (pass != true)
        {
        try {
        System.out.println("\nEnter acres of land you want to buy (Q to Exit):");
        acres = scanner.nextLine();
        
            //check for escape
            if(acres.toLowerCase().trim().equals("q")) {
                System.out.println("quitting to previous menu");
                return;
            }
            
        landpurchased = Integer.parseInt(acres);
        pass = true;} catch (NumberFormatException e) { 
            System.out.println("Invalid Input, enter a number please"); }
        
        }
      try {
            //validate input against land owned
            GameControl.buyLand(landpurchased);
            validate = true;
        }catch(BuyLandException e){
            //to begining
            System.out.println(e.getMessage());
            validate = false;
            pass = false;
        }
        }
    }
}

