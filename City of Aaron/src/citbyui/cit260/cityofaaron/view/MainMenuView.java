/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

import CityOfAaronSN.CityOfAaronSN;
import citbyui.cit260.cityofaaron.control.GameControl;
import java.util.Scanner;
/**
 *
 * @author Meroko
 */
public class MainMenuView {
    public static Scanner scanner = new Scanner( System.in );


    public MainMenuView() {
        
    }

    void displayMainMenuView() {
        //set variables
        boolean endOfView = false;
        String[] inputs = new String[1];
        
        
        //loop for game sequence
        do {
            //menu infographic
            System.out.println( "\n" + 
                "*********************************\n" + 
                "*   CITY OF AARON : MAIN MENU   *\n" +
                "*********************************\n" +
                " N - Start New Game\n" +
                " L - Restart The Game\n" +
                " H - Get Help on Playing the Game\n" + 
                " S - Save Game\n" + 
                " Q - Quit\n"
            );
            //gather input
            inputs = getInputs();
            //use inputs to determine action
            endOfView = this.doAction(inputs);
        } while(endOfView != true);
    }
    
    private String[] getInputs() {
        String[] inputs = new String[1];
        
        //loop escape boolean
        boolean valid = false;
        
        //gather input and check validity before setting escape to true
        while (valid == false) {
            //prompt / input
            System.out.println("Please Enter Your Choice : ");
            inputs[0] = (scanner.nextLine());
            inputs[0] = inputs[0].trim();
            
            //validate
            if (inputs[0].length() != 1) {
                System.out.println("You must choose a valid option");
                System.out.println( "\n" + 
               "*********************************\n" + 
               "*   CITY OF AARON : MAIN MENU   *\n" +
               "*********************************\n" +
               " N - Start New Game\n" +
               " L - Restart The Game\n" +
               " H - Get Help on Playing the Game\n" + 
               " S - Save Game\n" + 
               " Q - Quit\n");
            }
            else
                valid = true;
        }
        
        return inputs;
    }
    
    public boolean doAction(String inputs[]) {
        String choice = inputs[0];
        
        switch (choice.toLowerCase()) {
            //call new game
            case "n":{
                startNewGame();
                return false;
            }
            //call restart for current game    
            case "l":{
                loadGame();
                return false;
            }
            //call help menu       
            case "h":{
                getHelp();
                return false;
            }
            //save the game    
            case "s":{
                
                return false;
            }
            //quit out of game    
            case "q":
                return true;
            //unknown menu item choice
            default:{
                System.out.println("Unknown Menu Choice Please Try Again");
                return false;
            }
            
        }
            
    }
    
    private void startNewGame() {
        //create game and push previously made player
        GameControl.creatNewGame(CityOfAaronSN.getThePlayer());
        
        //call game menu view
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayMainMenuView();
    }
    
    private void loadGame() {
        
        //call start existing game view
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();
    }
    
    private void getHelp() {
        
        //call help menu view
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();
    }
    
}
