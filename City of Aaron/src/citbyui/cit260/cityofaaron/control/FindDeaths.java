/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.control;

/**
 *
 * @author Group Assignment
 */
public class FindDeaths {
     
    //check score validity and return score if it passes
    public static double calculateDeaths(int population, int wheat, int year) {
        double deaths = 0;
        
        
        /*error checking
        year must be > or = 0
        population must be > or = 0
        wheat must be > or = 0
        */ 
        
       if (year <= 0)
	return -1;
            else if (population < 0)
	return 0;
            else if (wheat < 0)
	return -1;
        
        //calculate deaths
        deaths = (population *(2 + (year / 10)))-wheat;
        
        
        //return deaths
        return deaths /2;
    }
    
    
}

        
        