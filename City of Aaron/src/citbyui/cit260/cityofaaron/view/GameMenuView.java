/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

import java.util.Scanner;

/**
 *
 * @author Meroko
 */
public class GameMenuView {
    public static Scanner scanner = new Scanner( System.in );

    public GameMenuView() {
    }

    //start display loop
    void displayMainMenuView() {
        boolean endOfView = false;
        String[] inputs = new String[1];
        
        //loop for game sequence
        do {
            //gather input
            inputs = getInputs();
            //use input to determine action
            endOfView = this.doAction(inputs);
        } while(endOfView != true);
        
    }

    //gather inputs from user
    private String[] getInputs() {
        
        String[] inputs = new String[1];
        
        //loop escape boolean
        boolean valid = false;
        
        //get input and validate loop
        while (valid == false) {
            //prompt / input
            System.out.println(
               "\n*********************************\n" + 
               "*   CITY OF AARON : Game Menu   *\n" +
               "*********************************\n" +
               " V - View Map & Move\n" +
               " M - Manage Crops\n" +
               " L - Live The Year\n" + 
               " B - Buy and Sell Land\n" +
               " S - Save Game\n" +
               " R - Reports Menu\n" + 
               " Q - Return To Main Menu\n");
            System.out.println("Please Enter Your Choice : ");
            inputs[0] = (scanner.nextLine());
            inputs[0] = inputs[0].trim();
            
            //validate
            if (inputs[0].length() != 1) {
                System.out.println("You must choose a valid option\n");
                
            }
            else
                valid = true;
        }
        return inputs;
    }
    
    //complete actions for input
    public boolean doAction(String inputs[]) {
        String choice = inputs[0];
        
        switch (choice.toLowerCase()) {
            //view map and move
            case "v":{
                viewMapAndMove();
                return false;
            }
            //manage crops    
            case "m":{
                manageCrops();
                return false;
            }
            //proceed to next year      
            case "l":{
                liveYear();
                return false;
            }
            //save the game    
            case "s":{
                
                return false;
            }
            //reports menu
            case "r": {
               reportsMenu();
               return false;
            }
            //proceed to buy and sell menu     
            case "b":{
                buyAndSellLand();
                return false;
            }
            //quit out of game    
            case "q":
                return true;
            //unknown menu item choice
            default:{
                System.out.println("Unknown Menu Choice Please Try Again");
                return false;
            }
            
        }
    }

    private void manageCrops() {
        
        //create manageCropsView
        ManageCropsView manageCropsView = new ManageCropsView();
        manageCropsView.displayManageCropsView();
    }

    private void viewMapAndMove() {
        
    }

    private void liveYear() {
        
    }

    private void reportsMenu() {
        
    }

    private void buyAndSellLand() {
        LandView landView = new LandView();
        landView.display();
    }

    
}
