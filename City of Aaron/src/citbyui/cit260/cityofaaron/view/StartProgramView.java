/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

import citbyui.cit260.cityofaaron.model.Player;
import citbyui.cit260.cityofaaron.control.SavePlayer;
import CityOfAaronSN.CityOfAaronSN;
import java.util.Scanner;

/**
 *
 * @author Meroko
 */
public class StartProgramView {
    public static Scanner scanner = new Scanner( System.in );
    
    public StartProgramView() {   
    }
    
    public void displayStartProgramView() {
        
        boolean endOfView = false;
        
        do {
            String[] inputs = this.getInputs();
            
            if (inputs == null || "q".equals(inputs[0].toLowerCase()))
                return;
           
            endOfView = this.doAction(inputs);
           
        } while(endOfView != true);
        
    }
    
    public boolean doAction(String inputs[]) {
        System.out.println("**** GetActions() Called ****");
        
        String playerName = inputs[0];
        Player player = SavePlayer.savePlayer(playerName);
        
        if (player == null) {
            System.out.println("Failed to create player. " +
                    "Please Try Again!");
           
            return false;
        }
        
        System.out.println("==================================="
        + "\nWelcome to the game " + playerName
        + "\nWe hope you have lots of fun!"
        + "\n===================================");
        
        CityOfAaronSN.setThePlayer(player);
        
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
        
        return true;
    }

    private String[] getInputs() {
        System.out.println("**** GetInputs() Called ****");
        String[] inputs = new String[1];
        
        //loop escape boolean
        boolean valid = false;
        
        //gather input and check validity before setting escape to true
        while (valid == false) {
            //prompt / input
            System.out.println("Please Enter a Name (Caps Included) : ");
            inputs[0]=(scanner.nextLine());
            inputs[0] = inputs[0].trim();
            
            //validate
            if (inputs[0].length() <= 0) 
                System.out.println("You must enter a non-blank name");
            else
                valid = true;
                
        }
                
        return inputs;
    }
    
    
}
