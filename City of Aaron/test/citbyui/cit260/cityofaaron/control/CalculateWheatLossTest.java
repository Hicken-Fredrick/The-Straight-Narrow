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
public class CalculateWheatLossTest {
    
    public CalculateWheatLossTest() {
    }

    /**
     * Test of calcWheatLoss method, of class CalculateWheatLoss.
     */
    @Test
    public void testCalcWheatLoss() {
        //initialize variables
        int tithing = 0;
        int wheat = 0;
        int expResult = 0;
        int result = 0;
        
        //test one - valid test
        System.out.println("calcWheatLoss");
        tithing = 13;
        wheat = 100;
        expResult = 100;
        result = CalculateWheatLoss.calcWheatLoss(tithing, wheat);
        assertEquals(expResult, result);
        System.out.println(result + " " + expResult);
        
        //test two - invalid test - tithing and wheat negative
        System.out.println("calcWheatLoss");
        tithing = -5;
        wheat = -5;
        expResult = -1;
        result = CalculateWheatLoss.calcWheatLoss(tithing, wheat);
        assertEquals(expResult, result);
        System.out.println(result + " " + expResult);
        
        //test three - invalid test - wheat is negative
        System.out.println("calcWheatLoss");
        tithing = 50;
        wheat = -50;
        expResult = -1;
        result = CalculateWheatLoss.calcWheatLoss(tithing, wheat);
        assertEquals(expResult, result);
        System.out.println(result + " " + expResult);
        
        //test four - invalid test - tithing is negative
        System.out.println("calcWheatLoss");
        tithing = -5;
        wheat = 100;
        expResult = -1;
        result = CalculateWheatLoss.calcWheatLoss(tithing, wheat);
        assertEquals(expResult, result);
        System.out.println(result + " " + expResult);
        
        //test five - invalid test - divide by 0
        System.out.println("calcWheatLoss");
        tithing = 50;
        wheat = 0;
        expResult = 0;
        result = CalculateWheatLoss.calcWheatLoss(tithing, wheat);
        assertEquals(expResult, result);
        System.out.println(result + " " + expResult);
        
        //test six - invalid test - wheat becomes negative
        System.out.println("calcWheatLoss");
        tithing = 0;
        wheat = 5;
        expResult = 0;
        result = CalculateWheatLoss.calcWheatLoss(tithing, wheat);
        assertEquals(expResult, result);
        System.out.println(result + " " + expResult);
        
        //test seven - valid - fixed with using double for calc
        System.out.println("calcWheatLoss");
        tithing = 115;
        wheat = 1000;
        expResult = 996;
        result = CalculateWheatLoss.calcWheatLoss(tithing, wheat);
        assertEquals(expResult, result);
        System.out.println(result + " " + expResult);
    }
    
}
