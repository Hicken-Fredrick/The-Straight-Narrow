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
 * @author tayta
 */
public class RolloverControlTest {
    
    public RolloverControlTest() {
    }

    /**
     * Test of wheatEatin method, of class RolloverControl.
     */
    @Test
    public void testYearRollover() {
        
        //initialize variables
        int wheat = 0;
        int population = 0;
        double expResult = 0;
        double result = 0;
        
        //test one - valid test
        System.out.println("Test 01");
        wheat = 100;
        population = 50;
        expResult = 1;
        result = RolloverControl.wheatEatin(wheat, population);
        assertEquals(expResult, result, 0.0);
        System.out.println(result + " " + expResult);
        
        //test two - invalid year
        System.out.println("Test 02");
        wheat = 100;
        population = -500;
        expResult = -1;
        result = RolloverControl.wheatEatin(wheat, population);
        assertEquals(expResult, result, 0.0);
        System.out.println(result + " " + expResult);
        
        //test three - invalid wheat
        System.out.println("Test 03");
        wheat = -5;
        population = 100;
        expResult = -1;
        result = RolloverControl.wheatEatin(wheat, population);
        assertEquals(expResult, result, 0.0);
        System.out.println(result + " " + expResult);
        
        //test four - invalid acres
        System.out.println("Test 04");
        wheat = 25;
        population = 5;
        expResult = -1;
        result = RolloverControl.wheatEatin(wheat, population);
        assertEquals(expResult, result, 0.0);
        System.out.println(result + " " + expResult);
        
        //test five - invalid population
        System.out.println("Test 05");
        wheat = 35;
        population = -50;
        expResult = -1;
        result = RolloverControl.wheatEatin(wheat, population);
        assertEquals(expResult, result, 0.0);
        System.out.println(result + " " + expResult);
        
        //test six - multiple invalids
        System.out.println("Test 06");
        wheat = 100;
        population = -5;
        expResult = -1;
        result = RolloverControl.wheatEatin(wheat, population);
        assertEquals(expResult, result, 0.0);
        System.out.println(result + " " + expResult);
        
        //test seven - single invalid, positive result
        System.out.println("Test 07");
        wheat = 100;
        population = -50;
        expResult = -1;
        result = RolloverControl.wheatEatin(wheat, population);
        assertEquals(expResult, result, 0.0);
        System.out.println(result + " " + expResult);
        
    }
    
}
