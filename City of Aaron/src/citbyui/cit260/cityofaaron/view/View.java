/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package citbyui.cit260.cityofaaron.view;

import CityOfAaronSN.CityOfAaronSN;
import citbyui.cit260.cityofaaron.control.GameControl;
import citbyui.cit260.cityofaaron.model.Game;
import java.io.BufferedReader;
import java.io.PrintWriter;
import citbyui.cit260.cityofaaron.view.ErrorView;

import java.util.Scanner;

/**
 *
 * @author Meroko
 */
public abstract class View implements ViewInterface {
    protected final BufferedReader keyboard = CityOfAaronSN.getInFile();
    protected final PrintWriter console = CityOfAaronSN.getOutFile();
    
    public View() {
    }
    
    @Override
    public void display() {
        //if player is dead exit back
        Game game = CityOfAaronSN.getCurrentGame();
        GameOverView gameOverView = new GameOverView();
        boolean endOfView = false;
        
        do {
            if (game != null) {
                if (!game.getThePlayer().isAlive()) {
                    if (game.getThePlayer().isGameOverResultsViewed() == false) {
                        gameOverView.displayResults(game);
                        game.getThePlayer().setGameOverResultsViewed(true);
                    }
                    return;
                }
            }
            String[] inputs = this.getInputs();
            
            if (inputs == null || "q".equals(inputs[0].toLowerCase()))
                return;
            
            endOfView = this.doAction(inputs);
            
        } while(endOfView != true);
    }
    
    @Override
    public String getInput(String promptMessage) {
        String selection = null;
        boolean valid = false;
        try {
            while (!valid) {
                //print prompt
                this.console.println(promptMessage);
                
                //get user input
                selection = this.keyboard.readLine();
                selection = selection.trim();
                
                if (selection.length() < 1){
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
        
        return selection;
    }
    
}
