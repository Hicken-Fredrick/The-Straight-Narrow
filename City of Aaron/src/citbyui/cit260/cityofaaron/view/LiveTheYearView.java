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
class LiveTheYearView extends View {
    public static Game game = CityOfAaronSN.getCurrentGame();

    public LiveTheYearView() {
    }

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        
        //build prompt message
        String promptMessage =
            "\n" + 
            "*********************************\n" + 
            "* CITY OF AARON : Live The Year *\n" +
            "*********************************\n" +
            "This Will Progress The Game By One Year Make Sure Your Ready\n" +
            "REMINDERS\n" +
            "You Have " + game.getAcresOwned() + " Acres of Unplanted Land\n" +
            "You Have Payed " + game.getTithingPayed() + " Into Your Tithing\n" +
            "L - Live The Year \n" +
            "R - Return to Previous Menu\n";
        
        inputs[0] = getInput(promptMessage);
        
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String choice = inputs[0];
        
        switch (choice.toLowerCase()) {
            //call new game
            case "l":{
                GameControl.yearRollover();
                return true;
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

    
}
