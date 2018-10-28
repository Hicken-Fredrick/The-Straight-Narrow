/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.control;

/**
 *
 * @author tayta
 */
public class RolloverControl {
    
    //check score validity and return score if it passes
    public static double yearRollover(int wheat, int population, int acres) {
        
        double rollover = 0;
        
        /*error checking
        population must be > or = 0
        wheat must be > or = 0
        acres must be > or = 0
        */ 
        if (population < 0)
            return -1;
        else  if (wheat < 0)
            return -1;
        else if (acres < 0)
            return -1;
        
        //calculate score
        rollover = ((population * 2) / wheat ) + (population - acres);
        
        //return score
        return rollover;
    }
    
}
