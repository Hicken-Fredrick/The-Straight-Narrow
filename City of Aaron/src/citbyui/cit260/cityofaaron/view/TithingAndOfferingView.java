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

/**
 *
 * @author Meroko
 */
public class TithingAndOfferingView extends View{
    public static Game game = CityOfAaronSN.getCurrentGame();

   @Override      
   public String[] getInputs() {
       
       String[] inputs = new String[1];
        
        //build prompt message
        String promptMessage = 
                
                "\n" + 
               "*********************************\n" + 
                "*   CITY OF AARON : Tithing and Offering    *\n" +
                "*********************************\n" +
               "You currently have: " + game.getWheatinStorage() + " Wheat in storage \n" +
               "Do you want to pay tithing on that? " +
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
        String choice = null;
        int tithing = 0;
        Boolean validate = false;
        
        while (validate != true){
            pass = false;
        while (pass != true)
        {
        try {
        System.out.println("\nEnter the Tithing to Be Paid:");
        choice = scanner.nextLine();
        
            //check for escape
            if(choice.toLowerCase().trim().equals("q")) {
                System.out.println("quitting to previous menu");
                return;
            }
            
        tithing = Integer.parseInt(choice);
        pass = true;} catch (NumberFormatException e) { 
            System.out.println("Invalid Input"); }
        }
        
        validate = validateInput(tithing);
        }
    }

    private Boolean validateInput(int tithing) {
        Game game = CityOfAaronSN.getCurrentGame();
        
        if (tithing > game.getWheatinStorage() ){
            System.out.println("\nYou Don't Have Enough Wheat");
            return false;
        }
        else if (tithing < 1 ){
            System.out.println("\nValue must be 1 or Greater");
            return false;
        }
        else {
            System.out.println("\nSuccessfully Submittited Tithing To Temple");
            GameControl.paidTithing(tithing);
            
            return true;
            
        }
    }
    
}
/*
try {

GameControl.payTithing(tithing);
return true

} catch (TithingException te) {

    System.out.println(te.getMessage());
    return false
}
*/