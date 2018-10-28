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
        if (wheat < 0)
            return -1;
        if (wheat == 0)
            return 0;
        
        //create variables for calulations
        int tithingPercent = 0;
        int vermin = 0;
        
        //find tithing percent
        tithingPercent  = (tithing / wheat) * 100;
        
        //create vermin
        if (tithingPercent >= 12)
            vermin = 0;
        if (tithingPercent < 12)
            vermin = 2;
        if (tithingPercent < 8)
            vermin = 5;
        
        //subtract loss from wheat
        wheat -= vermin * 2;
        
        //check if wheat is negative
        if (wheat < 0) 
        {
            wheat = 0;
            return wheat;
        }

return wheat;

    }
}
