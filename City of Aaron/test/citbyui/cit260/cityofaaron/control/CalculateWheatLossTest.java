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
        System.out.println("calcWheatLoss");
        int tithing = 0;
        int wheat = 0;
        int expResult = 0;
        int result = CalculateWheatLoss.calcWheatLoss(tithing, wheat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
