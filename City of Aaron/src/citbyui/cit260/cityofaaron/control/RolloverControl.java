/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.control;

import java.util.Random;

/**
 *
 * @author tayta
 */
public class RolloverControl {
        
    //check wheat eatin for the year
    public static double wheatEatin(int wheat, int population) {
        
        double wheatEatin = 0;
        
        /*error checking
        population must be > or = 0
        wheat must be > or = 0
        acres must be > or = 0
        */ 
        if (population < 0)
            return -1;
        else  if (wheat < 0)
            return -1;
        
        //calculate score
        wheatEatin = wheat - (population * 2);
        
        //return score
        return wheatEatin;
    }

    static int wheatGenerated(int tithing, int wheat, int land) {
        //find how many bushels gained per acre
        int bushelsPerAcre = 0;
        Random rn = new Random();
        //used to define the possible values for bushelsPerAcre
        double tithingPercent = 0;
        int min = 0;
        int max = 0;
        
        //find tithing percent
        tithingPercent  = tithing;
        tithingPercent /= wheat;
        tithingPercent *= 100;
        
        //break down tithing percents
        if (tithingPercent > 12) {
            min = 2;
            max = 5;
        } else if (tithingPercent <= 12 && tithingPercent > 7) {
            min = 2;
            max = 4;
        } else if (tithingPercent <= 7){
            min = 1;
            max = 3;
        }
        
        //generate a random based on tithing given
        bushelsPerAcre = rn.nextInt(max - min + 1) + min;
        
        //calculate wheat generated
        wheat += land * bushelsPerAcre;
        
        //return wheat new wheat total
        return wheat;
    }

    
    
}
