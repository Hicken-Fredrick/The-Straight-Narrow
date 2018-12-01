/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

import CityOfAaronSN.CityOfAaronSN;
import citbyui.cit260.cityofaaron.model.Game;
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
                "NOT YET BUILT!";
        
        inputs[0] = getInput(promptMessage);
        
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        System.out.println("TO BE IMPLEMENTED");
        return true;
    }


}
