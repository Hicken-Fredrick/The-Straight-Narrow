/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.control;

/**
 *
 * @author Meroko
 */
public class CalculateWheatLoss {
    
    public static int calcWheatLoss(int tithing, int wheat){
        //check for failure states
        if (tithing < 0)
            return -1;
        else if (wheat < 0)
            return -1;
        else if (wheat == 0)
            return 0;
        
        //create variables for calulations
        double tithingPercent = 0;
        int vermin = 0;
        
        //find tithing percent
        tithingPercent  = tithing;
        tithingPercent /= wheat;
        tithingPercent *= 100;
        
        /*create vermin
        Above 12%	0 vermin
        8% - 12%	2 vermin
        Below 8%	5 vermin
        */
        if (tithingPercent > 12) {
            vermin = 0;
        } else if (tithingPercent <= 12 && tithingPercent > 7) {
            vermin = 2;
        } else if (tithingPercent <= 7){
            vermin = 5;
        }
        
        //subtract loss from wheat
        wheat -= (vermin * 2);
        
        //check if wheat is negative
        if (wheat < 0) 
        {
            wheat = 0;
            return wheat;
        }

return wheat;

    }
}
