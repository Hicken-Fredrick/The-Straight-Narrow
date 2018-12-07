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

/**
 *
 * @author Meroko
 */
class StartExistingGameView extends View {
    
    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        
        //build prompt message
        String promptMessage = "\nEnter Saved Game Location: (ex: D:/gameSave.dat";
        
        inputs[0] = getInput(promptMessage);
        
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String filePath = inputs[0];
        Game game = null;
                
        try {
            //get game
            game = GameControl.getGame(filePath);
                //validate game
                if (game == null)
                    throw new GameControlException("Invalid Game File");
            //set game   
            CityOfAaronSN.setCurrentGame(game);
            
            //start game view
            GameMenuView gameMenuView = new GameMenuView();
            gameMenuView.display();
            
        } catch (GameControlException gce) {
            ErrorView.display(this.getClass().getName(),
                        gce.getMessage());
        }
        
        
        return true;
    }
    
}
