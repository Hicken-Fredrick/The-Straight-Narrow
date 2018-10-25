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
 * @author EDgar
 */
public class FindDeathsTest {
    
    public FindDeathsTest() {
    }
    
    /**
     * Test of calculateDeaths method, of class FindDeaths.
     */
    @Test
    public void testCalculateDeaths() {
        System.out.println("calculateDeaths");
        int population = 0;
        int wheat = 0;
        int year = 0;
        double expResult = 0.0;
        double result = 0;
       
        //test 1 - valid test
        System.out.println("Test 01");
        population = 50;
        wheat = 100;
        year = 1;
        expResult = 173.0;
        result = FindDeaths.calculateDeaths(population, wheat, year);
        assertEquals(expResult, result, 173.0);
        System.out.println(result + " " + expResult);
        
        //test 2 - valid test
        System.out.println("Test 02");
        population = -10;
        wheat = 100;
        year = 0;
        expResult = -1;
        result = FindDeaths.calculateDeaths(population, wheat, year);
        assertEquals(expResult, result, 0.0);
        System.out.println(result + " " + expResult);
        
         //test 3 - valid test
        System.out.println("Test 03");
        population = -10;
        wheat = 100;
        year = 0;
        expResult = -1;
        result = FindDeaths.calculateDeaths(population, wheat, year);
        assertEquals(expResult, result, 0.0);
        System.out.println(result + " " + expResult);
        
         //test 4 - valid test
        System.out.println("Test 04");
        population = -10;
        wheat = 100;
        year = 0;
        expResult = -1;
        result = FindDeaths.calculateDeaths(population, wheat, year);
        assertEquals(expResult, result, 0.0);
        System.out.println(result + " " + expResult);
        
         //test 5 - valid test
        System.out.println("Test 05");
        population = -10;
        wheat = 100;
        year = 0;
        expResult = -1;
        result = FindDeaths.calculateDeaths(population, wheat, year);
        assertEquals(expResult, result, 0.0);
        System.out.println(result + " " + expResult);
        
         //test 6 - valid test
        System.out.println("Test 06");
        population = -10;
        wheat = 100;
        year = 0;
        expResult = -1;
        result = FindDeaths.calculateDeaths(population, wheat, year);
        assertEquals(expResult, result, 0.0);
        System.out.println(result + " " + expResult);
        
        //test 7 - valid test
        System.out.println("Test 07");
        population = -10;
        wheat = 100;
        year = 0;
        expResult = -1;
        result = FindDeaths.calculateDeaths(population, wheat, year);
        assertEquals(expResult, result, 0.0);
        System.out.println(result + " " + expResult);
 
    }
    
}
