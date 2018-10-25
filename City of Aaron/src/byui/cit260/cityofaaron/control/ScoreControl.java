/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityofaaron.control;

/**
 *
 * @author Group Assignment
 */
public class ScoreControl {
    
    //check score validity and return score if it passes
    public static double calcScore(int year, int wheat, int population, int acres) {
        
        double score = 0;
        
        /*error checking
        year must be > or = 1
        population must be > or = 0
        wheat must be > or = 0
        acres must be > or = 0
        */ 
        if (year <= 0)
            return -1;
        else if (population < 0)
            return -1;
        else  if (wheat < 0)
            return -1;
        else if (acres < 0)
            return -1;
        
        //calculate score
        score = year * ((population * 2) + (wheat * 1) + (acres * 20));
        
        return score;
    }
    
    
}
