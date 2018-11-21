/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

import CityOfAaronSN.CityOfAaronSN;
import citbyui.cit260.cityofaaron.control.GameControl;
import citbyui.cit260.cityofaaron.model.Game;

/**
 *
 * @author Meroko
 */
public class MainMenuView extends View {

    public MainMenuView() {
    }
    
    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        
        //build prompt message
        String promptMessage = "\n" + 
                "*********************************\n" + 
                "*   CITY OF AARON : MAIN MENU   *\n" +
                "*********************************\n" +
                " N - Start New Game\n" +
                " L - Restart The Game\n" +
                " H - Get Help on Playing the Game\n" + 
                " S - Save Game\n" + 
                " Q - Quit\n";
        
        inputs[0] = getInput(promptMessage);
        
        return inputs;
    }
    
    @Override
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
        int returnValue = GameControl.createNewGame(CityOfAaronSN.getThePlayer());
        
        //check to see if create new game worked
        if (returnValue < 0)
            System.out.println("ERROR - Failed to create new game");
        
        //else call game menu view
        else {
            GameMenuView gameMenuView = new GameMenuView();
            gameMenuView.display();
        }
    }
    
    private void loadGame() {
        
        //call start existing game view
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();
    }
    
    private void getHelp() {
        
        //call help menu view
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
    
}
