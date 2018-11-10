/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

import citbyui.cit260.cityofaaron.control.LandData;
import citbyui.cit260.cityofaaron.model.Game;


/**
 *
 * @author Indivudual Week 8
 */
class LandControl {

    static int YIELD_BASE;
    static Game Game;
    static LandData landData;

    static void plantLand(int landToPlant, LandData landData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void buyLand(int price, int toBuy, LandData landData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static int calcLandPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void plantLand(int landToPlant, LandData landData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void buyLand(int price, int toBuy, landData landData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/**
 *
 * @author Indivudual Week 8
 */
public class LandControl {

    // Variables
    
    private static int ACRESPERBUSHEL;
    private static int PEOPLE_PER_ACRE;
    private static int YIELD_BASE;
    private static Game Game;
    private static LandData landData;

    public LandControl() {
    }
        
   
    public static int calcLandPrice(int min, int max) {
        
        // Generate random number
        Random random = new Random();
        // Generate random number using parameters
        int landPrice = random.nextInt(max) + min;
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
    public static int buyLand(int landPrice, int acresToBuy, CropData cropData) {
        try {
            int totalPrice = acresToBuy * landPrice;
                
            // if acresToBuy < 0, ERROR
            if (acresToBuy < 0) { 
                throw new LandException("A negative value was input.");  
               }
        
            // if wheatInStore < totalPrice, ERROR
            if (cropData.getWheatInStore() < totalPrice) { 
                throw new LandException("There is insufficient wheat to buy this much land."); 
            }
        
            // if population <= (oldAcres + newAcres) / 10, ERROR
            if ((cropData.getPopulation() * 10) < (cropData.getAcresOwned() + acresToBuy)) { 
                throw new LandException("The population isn't large enough to buy this much land.");  
            }
        
            if (acresToBuy == 0) { return cropData.getAcresOwned(); }
        
            else {
                // else, add number of acres purchased to acres owned
                cropData.setAcresOwned(cropData.getAcresOwned() + acresToBuy);
        
                // subtract price from WheatInStore
                cropData.setWheatInStore(cropData.getWheatInStore() - totalPrice);
        
                // return new acresOwned Value
                return cropData.getAcresOwned();
                //return cropData.getAcresOwned();
            }
        }
        // There needs to be a catch here
        catch (LandException e) {
            System.out.println("I cannot do that Dave");
            System.out.println(e.getMessage());
        }
        return 0;
    }

    /**
     * Method: sellLand
     * acres to sell must be positive
     * acres to sell must be greater or equal to acres owned
     */
    public static int sellLand(int landPrice, int acresToSell, CropData cropData) {
       try {
        // acresOwned Variable
        int acresOwned = cropData.getAcresOwned();
        
        // if acresToSell < 0, return -1
        if (acresToSell < 0)
            throw new LandException("A negative value was input.");   
        
        // if acresToSell > acresOwned, return -1
        if (acresToSell > acresOwned)
            throw new LandException("You don't own enough land to sell that amount.");  
        
        // if pre-conditions are met, this code block is executed
        else {
        // acresOwned - acresToSell
        acresOwned -= acresToSell;
        
        // save new acresOwned amount            
        cropData.setAcresOwned(acresOwned);
        
        // wheatInStore = wheatInStore + (acresToSell * landPrice)
        int wheatInStore = cropData.getWheatInStore();
        wheatInStore += (acresToSell * landPrice);
       
        // save result to wheatInStore
        cropData.setWheatInStore(wheatInStore);
        }
        // return acresOwned
        return cropData.getAcresOwned(); 
    }
       catch (LandException e) {
            System.out.println("I cannot do that Dave");
            System.out.println(e.getMessage());
        }
       return cropData.getAcresOwned(); 
    }
    public static int setOffering(int percent, CropData cropData) {
       
        if (percent > 0) {
            int offering = (percent * cropData.getWheatInStore()) / 100;
            cropData.setOffering(offering);
            return offering;
        }
        
        if (percent == 0) {
            return 0;            
        }
        
        else {
            return -1;
        }
    }

    public String toString() {
        return "LandControl{" + '}';
    }
    
    
}
