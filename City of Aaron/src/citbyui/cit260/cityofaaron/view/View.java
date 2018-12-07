/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

import CityOfAaronSN.CityOfAaronSN;
import citbyui.cit260.cityofaaron.control.GameControl;
import citbyui.cit260.cityofaaron.model.Game;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

import java.util.Scanner;

/**
 *
 * @author Meroko
 */
public abstract class View implements ViewInterface {
        protected final BufferedReader keyboard = CityOfAaronSN.getInFile();
        protected final PrintWriter console = CityOfAaronSN.getOutFile();

    public View() {
    }
    
    @Override
    public void display() {
        boolean endOfView = false;
        
        do {
            String[] inputs = this.getInputs();
            
            if (inputs == null || "q".equals(inputs[0].toLowerCase()))
                return;
           
            endOfView = this.doAction(inputs);
           
        } while(endOfView != true);
    }
    
    @Override
    public String getInput(String promptMessage) {
        String selection = null;
        boolean valid = false;
        try {
            while (!valid) {
                //print prompt
                this.console.println(promptMessage);
                
                //get user input
                selection = this.keyboard.readLine();
                selection = selection.trim();
                
                if (selection.length() < 1){
                    System.out.println("You must enter a value.");
                    continue;
                }
                break;
            
                    }
        } catch (Exception e) {
                    System.out.println("Error Reading Input: " + e.getMessage());
        }

        return selection;
    }
    
}
