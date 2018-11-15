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
 * @author Meroko
 */
class TithingAndOfferingView {
    public static Scanner scanner = new Scanner( System.in );
    public static Game game = CityOfAaronSN.getCurrentGame();
    public TithingAndOfferingView() {
    }
    
    void displayTithingAndOfferingsView() {
        boolean endOfView = false;
        String[] inputs = new String[1];
        
        
        //loop for game sequence
        do {
        System.out.println("Plant Crops Display");
        inputs = getInputs();
            //use inputs to determine action
            endOfView = this.doAction(inputs);
        } while(endOfView != true);
        
    }
         
   private String[] getInputs() {
        String[] inputs = new String[1];
        
        //loop escape boolean
        boolean valid = false;
        
        //gather input and check validity before setting escape to true
        while (valid == false) {
            System.out.println( "\n" + 
               "*********************************\n" + 
                "*   CITY OF AARON : Tithing and Offering    *\n" +
                "*********************************\n" +
               "You currently have: " + game.getWheatinStorage() + "Wheat in storage \n"
                    + "Do you want to pay tithing on that? " +
               "\n P - Pay Tithing and Offering \n" +
               " R - return to previous menu\n");
            //prompt / input
            System.out.println("Please Enter Your Choice : ");
            inputs[0] = (scanner.nextLine());
            inputs[0] = inputs[0].trim();
            
            //validate
            if (inputs[0].length() != 1) {
                System.out.println("You must choose a valid option");
                System.out.println( "\n" + 
               "*********************************\n" + 
                "*   CITY OF AARON : Tithing and Offering   *\n" +
                "*********************************\n" +
               "You currently have: " + game.getWheatinStorage() + " Wheat in storage \n"
                    + "Do you want to pay tithing on that? " +
               "\n P - Pay Tithing and Offering \n" +
               " R - return to previous menu\n");
            }
            else
                valid = true;
        }
        
        return inputs;
    }
    
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
