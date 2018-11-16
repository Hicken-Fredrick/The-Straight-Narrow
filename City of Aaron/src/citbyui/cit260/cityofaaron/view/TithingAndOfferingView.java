/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

import CityOfAaronSN.CityOfAaronSN;
import citbyui.cit260.cityofaaron.model.Game;
import citbyui.cit260.cityofaaron.control.GameControl;
import static citbyui.cit260.cityofaaron.view.PlantCropsView.game;
import java.util.Scanner;

/**
 *
 * @author Meroko
 */
public class TithingAndOfferingView extends View{
    public static Scanner scanner = new Scanner( System.in );
    public static Game game = CityOfAaronSN.getCurrentGame();
    public TithingAndOfferingView() {
    }
    
    
   @Override      
   public String[] getInputs() {
       
       String[] inputs = new String[1];
        
        //build prompt message
        String promptMessage = 
                
                "\n" + 
               "*********************************\n" + 
                "*   CITY OF AARON : Tithing and Offering    *\n" +
                "*********************************\n" +
               "You currently have: " + game.getWheatinStorage() + "Wheat in storage \n"
                    + "Do you want to pay tithing on that? " +
               "\n P - Pay Tithing and Offering \n" +
               " R - return to previous menu\n";
        
        inputs[0] = getInput(promptMessage);
        
        return inputs;
       
    }
    @Override
    public boolean doAction(String inputs[]) {
        String choice = inputs[0];
        
        switch (choice.toLowerCase()) {
            //call new game
            case "p":{
                payTithing();
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

    private void payTithing() {
        Boolean pass = false;
        int tithing = 0;
        Boolean validate = false;
        while (validate != true){
            pass = false;
        while (pass != true)
        {
        try {
        System.out.println("\nEnter the number of the percentage of tithing and offering that you wsant to pay:");
        tithing = Integer.parseInt(scanner.nextLine());
        pass = true;}
        catch (NumberFormatException e) { System.out.println("Invalid Input"); }

        }
        validate = validateInput(tithing);
        }
    }

    private Boolean validateInput(int tithing) {
        if (tithing > 100 ){
            System.out.println("\nNot Vaild");
            return false;
        }
        else if (tithing < 1 ){
            System.out.println("\nNot Vaild");
            return false;
        }
        else {
            System.out.println("\nLand successfully paid Tithing and Offering ");
            GameControl.paidTithing(tithing);
            
            return true;
            
        }
    }
    
}
