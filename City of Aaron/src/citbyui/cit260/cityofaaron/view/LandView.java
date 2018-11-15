/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

/**
 *
 * @author Indivudual Week 8
 */


import citbyui.cit260.cityofaaron.model.LandControl;
import CityOfAaronSN.CityOfAaronSN;
import citbyui.cit260.cityofaaron.model.LandData;
import citbyui.cit260.cityofaaron.model.Game;
import static citbyui.cit260.cityofaaron.view.HelpMenuView.scanner;
import java.util.Scanner;


public class LandView {
    
  
    
    // Scanner Object
    private static Scanner keyboard = new Scanner(System.in);
    // References to Game 
    private static Game game;
    private static LandData landData;
    //constructor
    public LandView() {
         game = CityOfAaronSN.getCurrentGame();
         landData = game.getLandData();
    
    }
    
    
    public void display() {
              
        boolean endOfView = false;
        String[] inputs = new String[1];
        
        //loop for game sequence
        do {
            //gather input
            inputs = getInputs();
            //use input to determine action
            endOfView = this.doAction(inputs);
        } while(endOfView != true);

// call buyLandView
  //      buyLandView();
  //     sellLandView(); 
        
       
    }
    
     private String[] getInputs() {
        String[] inputs = new String[1];
        //loop escape boolean
        boolean valid = false;
        
        //gather input and check validity before setting escape to true
        while (valid == false) {
            //prompt / input
            System.out.println(
               "\n*********************************\n" + 
               "*   CITY OF AARON : LAND MENU   *\n" +
               "*********************************\n" +
               " V - View current land\n" +
               " B - Buy Land\n" +
               " S - Sell Land\n" + 
               " Q - Quit\n");
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
    
    public boolean doAction(String inputs[]) {
        String choice = inputs[0];
        
        switch (choice.toLowerCase()) {
            //This is the menu for the Game
            case "v":{
                System.out.println("View the land available.\n"
                        + "Here you can see the land.\n");
                return false;
            }
            //How To Move 
            case "b":{
                System.out.println("Here is here you buy land.\n"
                       + "you must be rich.\n");
                return false;
            }
            //Harvesting Details     
            case "s":{
                System.out.println("Here is where you can SELL land\n"
                      + "you must be poor.\n");
                return false;
            }
          //quit out of menu   
            case "q":
                return true;
            //unknown menu item choice
            default:{
                System.out.println("Unknown Menu Choice Please Try Again\n");
                return false;
            }
            
        }
            
    }
  
    public static void buyLandView() {
        
        // get the cost of land for this round 
        int price = LandControl.calcLandPrice();
       
        System.out.format("Land is selling for %d points per acre.%n", price);
        
        // get the user's input and save it
        int toBuy = 0;
        boolean paramsNotOkay; 
        do {
            
                System.out.print("How many acres of land do you wish to buy?");
                toBuy = keyboard.nextInt();            
                LandControl.buyLand(price, toBuy, landData);
                
                
                paramsNotOkay = false;
           
            
       
        } while(paramsNotOkay); 
          // call buyLand() in contol layer to actually buy the land
        LandControl.buyLand(price, toBuy, landData);
    }
    
    /**
     * Method: sellLandView
     * Purpose: interface for selling land
     * Parameters: none
     * Returns: none
     */
    public static void sellLandView() {
        // get cost of land this round
        int price = LandControl.calcLandPrice();
        int toSell = 0;
        // prompt user to enter number of of acres to buy
        System.out.format("Land is selling for %d points per acre.%n", price);
        
        boolean ok = true;
      //  do {
    }         
         
    
        public static void landReportView(LandData landData) {
        System.out.println("Land Report View"); 
       
        int year = landData.getYear(); 
        int acresOwned = landData.getAcresOwned(); 
        int wheatInStore = landData.getWheatInStore();
        int population = landData.getPopulation(); 
        
        //System.out.print(year);
        System.out.format("The year is %d. %n", year); 
        System.out.format("You own %d acres of land.%n", acresOwned); 
        System.out.format("There are %d bushels of wheat in store.%n", wheatInStore); 
        System.out.format("The population is %d people.%n", population); 
        
    }
}
