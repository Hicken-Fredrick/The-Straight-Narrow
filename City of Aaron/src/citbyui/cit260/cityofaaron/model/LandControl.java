/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.model;

import citbyui.cit260.cityofaaron.model.LandData;
import citbyui.cit260.cityofaaron.model.Game;
import java.util.Random;

/**
 *
 * @author Indivudual Week 8
 */
public class LandControl {

    // Variables
    
    private static int ACRESPERBUSHEL;
    private static int PEOPLE_PER_ACRE;
    private static int YIELD_BASE;
   // private static Game Game;
   // private static LandData landData;

    public static void calcLandPrice(int acres) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LandControl() {
    }
        
   
    public static int calcLandPrice(int min, int max) {
        
        // Generate random number
        Random random = new Random();
        // Generate random number using parameters
        int landPrice = random.nextInt(max-min) + min;
        // Return result
        return landPrice;
    }
    
    /**
     * Method: calcLandPrice
     */
    public static int calcLandPrice() {
  
        Random random = new Random(); 
         //constants
        int LAND_BASE = 17; 
        int LAND_RANGE = 11; 
        int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;
        
        return landPrice;
    }
    
    /**
    * Method: buyLand
    * Purpose: to Buy Land
    * - population * 10 >= currentTotalLand + wantsToBuy
    */
    public static int buyLand(int landPrice, int acresToBuy, LandData landData) {
  
        return 0;
    }

    /**
     * Method: sellLand
     * acres to sell must be positive
     * acres to sell must be greater or equal to acres owned
     */
    public static int sellLand(int landPrice, int acresToSell, LandData landData) {
     
        // acresOwned Variable
        int acresOwned = landData.getAcresOwned();
        
        // if acresToSell < 0, return -1
        if (acresToSell < 0)
            return -1;
        //("A negative value was input.");   
        
        // if acresToSell > acresOwned, return -1
        if (acresToSell > acresOwned)
            return -2;
        
        // if pre-conditions are met, this code block is executed
        else {
        // acresOwned - acresToSell
        acresOwned -= acresToSell;
        
        // save new acresOwned amount            
        landData.setAcresOwned(acresOwned);
        
        // wheatInStore = wheatInStore + (acresToSell * landPrice)
        int wheatInStore = landData.getWheatInStore();
        wheatInStore += (acresToSell * landPrice);
       
        // save result to wheatInStore
        landData.setWheatInStore(wheatInStore);
        }
        // return acresOwned
        return landData.getAcresOwned(); 
    }
     
   

    public String toString() {
        return "LandControl{" + '}';
    }
    
    
}
