/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

import CityOfAaronSN.CityOfAaronSN;
import citbyui.cit260.cityofaaron.model.Game;
import citbyui.cit260.cityofaaron.control.GameControl;
import citybyui.cit260.cirtyofaaron.exceptions.TithingException;
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
                ErrorView.display(this.getClass().getName(),
                        "Unknown Menu Choice Please Try Again");
                return false;
            }
            
        }
    }

    private void payTithing() {
        Boolean pass = false;
        boolean valid = false;
        String choice = null;
        int tithing = 0;
        Boolean validate = false;
        
        while (validate != true){
            pass = false;
        while (pass != true)
        {
        try {
            
            try {
            while (!valid) {
                //print prompt
                this.console.println("\nEnter the Tithing to Be Paid(q to quit):");
                
                //get user input
                choice = this.keyboard.readLine();
                choice = choice.trim();
                
                if (choice.length() < 1){
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

                //check for escape
                if(choice.toLowerCase().equals("q")) {
                    this.console.println("quitting to previous menu");
                    return;
                }

            tithing = Integer.parseInt(choice);
            pass = true;} catch (NumberFormatException e) { 
                ErrorView.display(this.getClass().getName(),
                        "Invalid Input"); }
            }

            try {

                GameControl.payingTithing(tithing);
                validate = true;

        } catch (TithingException te) {
        ErrorView.display(this.getClass().getName(),
                te.getMessage());
        validate = false;
    }
        
        
        }
    }
      
}



