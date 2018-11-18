/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

import CityOfAaronSN.CityOfAaronSN;
import citbyui.cit260.cityofaaron.model.Game;
import citbyui.cit260.cityofaaron.control.GameControl;

import java.util.Scanner;

/**
 *
 * @author tayta
 */
public class ReportsView extends View{
    
    public static Scanner scanner = new Scanner( System.in );
    public static Game game = CityOfAaronSN.getCurrentGame();
    
    public ReportsView(){
    
    }
    @Override
    public String[] getInputs() {
         String[] inputs = new String[1];
        
        //build prompt message
        String promptMessage = 
                "\n" + 
               "*********************************\n" + 
                "*   CITY OF AARON : Reports View  *\n" +
                "*********************************\n" +
                "\n" + "Game Wheat Owned: " + game.getWheatinStorage() + "\n"
                + "Game Arces Owned: " + game.getAcresOwned() + "\n"
                        + "Game Arces Planted: " + game.getAcresPlanted() + "\n"
                                + "Game Tithing and Offering: " + game.getTithingPayed() +
               "\n" +
                "A - Find the Author list\n" +
               " R - return to previous menu\n";
        
        inputs[0] = getInput(promptMessage);
        
        return inputs;
        
    }
    @Override
    public boolean doAction(String inputs[]) {
        String choice = inputs[0];
        
        switch (choice.toLowerCase()) {
            
            //call author veiw class
            case "A":{
                authorList();
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

    private void authorList() {
        AuthorView authorView = new AuthorView();
        authorView.displayauthorView();
    }
}

    
