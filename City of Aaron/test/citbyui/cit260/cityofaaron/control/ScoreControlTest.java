/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Meroko
 */
public class ScoreControlTest {
    
    public ScoreControlTest() {
    }

    /**
     * Test of calcScore method, of class ScoreControl.
     */
    @Test
    public void testCalcScore() {
        
        //initialize variables
        int year = 0;
        int wheat = 0;
        int population = 0;
        int acres = 0;
        double expResult = 0;
        double result = 0;
        
        //test one - valid test
        System.out.println("Test 01");
        year = 1;
        wheat = 100;
        population = 50;
        acres = 50;
        expResult = 1200.0;
        result = ScoreControl.calcScore(year, wheat, population, acres);
        assertEquals(expResult, result, 0.0);
        System.out.println(result + " " + expResult);
        
        //test two - invalid year
        System.out.println("Test 02");
        year = 0;
        wheat = 100;
        population = 50;
        acres = 50;
        expResult = -1;
        result = ScoreControl.calcScore(year, wheat, population, acres);
        assertEquals(expResult, result, 0.0);
        System.out.println(result + " " + expResult);
        
        //test three - invalid wheat
        System.out.println("Test 03");
        year = 3;
        wheat = -350;
        population = 100;
        acres = 5;
        expResult = -1;
        result = ScoreControl.calcScore(year, wheat, population, acres);
        assertEquals(expResult, result, 0.0);
        System.out.println(result + " " + expResult);
        
        //test four - invalid acres
        System.out.println("Test 04");
        year = 1;
        wheat = 25;
        population = 5;
        acres = -5;
        expResult = -1;
        result = ScoreControl.calcScore(year, wheat, population, acres);
        assertEquals(expResult, result, 0.0);
        System.out.println(result + " " + expResult);
        
        //test five - invalid population
        System.out.println("Test 05");
        year = 2;
        wheat = 35;
        population = -50;
        acres = 3;
        expResult = -1;
        result = ScoreControl.calcScore(year, wheat, population, acres);
        assertEquals(expResult, result, 0.0);
        System.out.println(result + " " + expResult);
        
        //test six - multiple invalids
        System.out.println("Test 06");
        year = -1;
        wheat = -100;
        population = -5;
        acres = -1;
        expResult = -1;
        result = ScoreControl.calcScore(year, wheat, population, acres);
        assertEquals(expResult, result, 0.0);
        System.out.println(result + " " + expResult);
        
        //test seven - single invalid, positive result
        System.out.println("Test 07");
        year = 2;
        wheat = 100;
        population = -50;
        acres = 5;
        expResult = -1;
        result = ScoreControl.calcScore(year, wheat, population, acres);
        assertEquals(expResult, result, 0.0);
        System.out.println(result + " " + expResult);
    }
    
}
