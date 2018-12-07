/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

import CityOfAaronSN.CityOfAaronSN;
import java.io.PrintWriter;

/**
 *
 * @author Meroko
 */
public class ErrorView {
    private static PrintWriter console = CityOfAaronSN.getOutFile();
    private static PrintWriter log = CityOfAaronSN.getLogFile();
    
    public static void display(String className, String errorMessage) {
        console.println(
                "\n--- Error -------------------------------"
               +"\n" + errorMessage
               +"\n-----------------------------------------");
               log.printf("%n%n%s", className+ " - " + errorMessage);
        
    }
    
}
