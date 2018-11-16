/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

import citbyui.cit260.cityofaaron.model.Player;
import citbyui.cit260.cityofaaron.control.GameControl;
import CityOfAaronSN.CityOfAaronSN;
import java.util.Scanner;

/**
 *
 * @author Meroko
 */
public class StartProgramView extends View{
    public static Scanner scanner = new Scanner( System.in );
    
    public StartProgramView() {   
    }
    
    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        
        //build prompt message
        String promptMessage = "Enter Your Name";
        
        inputs[0] = getInput(promptMessage);
        
        return inputs;
    }
    
    @Override
    public boolean doAction(String inputs[]) {
        
        String playerName = inputs[0];
        Player player = GameControl.savePlayer(playerName);
        
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
        mainMenuView.display();
        
        return true;
    }

   
    
    
}
