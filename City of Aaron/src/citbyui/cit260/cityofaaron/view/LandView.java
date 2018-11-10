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


import CityOfAaronSN.CityOfAaronSN;
import citbyui.cit260.cityofaaron.control.LandData;
import citbyui.cit260.cityofaaron.model.Game;
import java.util.Scanner;


public class LandView {
    
  
    
    // Scanner Object
    private static Scanner keyboard = new Scanner(System.in);
    // References to Game 
    private static Game Game = CityOfAaronSN.getTheGame();
    private static Game LandData = Game.getLandData();
    private static citbyui.cit260.cityofaaron.view.landData landData;
    
    
    public static void runLandView() {
        landReportView(landData); 
        

// call buyLandView
        buyLandView();
        
        
        sellLandView(); 
        feedPeopleView(landData); 
        plantLandView(landData); 
       
    }
    
  
    public static void buyLandView() {
        
        // get the cost of land for this round 
        int price = LandControl.calcLandPrice();
       
        System.out.format("Land is selling for %d points per acre.%n", price);
        
        // get the user's input and save it
        int toBuy = 0;
        boolean paramsNotOkay; 
        do {
            try {
                System.out.print("How many acres of land do you wish to buy?");
                toBuy = keyboard.nextInt();            
                LandControl.buyLand(price, toBuy, landData);
                
                
                paramsNotOkay = false;
            }
            
       
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
        do {
                
        
       
    
        
    
        public static void landReportView(landData landData) {
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

    private static void landReportView(LandData landData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void feedPeopleView(citbyui.cit260.cityofaaron.view.landData landData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void plantLandView(citbyui.cit260.cityofaaron.view.landData landData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class LandException {

        public LandException() {
        }

        private LandException(String cannot_Plant_on_more_land_than_Possessed) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private boolean getMessage() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        
    }
}
