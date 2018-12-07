/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

import CityOfAaronSN.CityOfAaronSN;
import citbyui.cit260.cityofaaron.control.GameControl;
import citbyui.cit260.cityofaaron.model.Game;
import citybyui.cit260.cirtyofaaron.exceptions.GameControlException;
import java.io.IOException;

/**
 *
 * @author Meroko
 */
class SaveGameView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        
        //build prompt message
        String promptMessage = 
                "Please Enter Where You Wish to Save Your Game: " +
                "(ex:C:\\Users\\Documents\\games\\cityOfAaronSave)";
        
        inputs[0] = getInput(promptMessage);
        
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String filePath = inputs[0];
        Game game = CityOfAaronSN.getCurrentGame();
        
        try {
            GameControl.saveGame(game, filePath);
            
        } catch(GameControlException gce) {
            ErrorView.display(this.getClass().getName(),
                        gce.getMessage());
            return false;
        } catch (IOException ex1) {
                ErrorView.display("I/O Error: ",
                        ex1.getMessage());
            }
        
        this.console.println("File Succesfully Saved at: " + filePath + "\n");
        return true;
    }
    
}
