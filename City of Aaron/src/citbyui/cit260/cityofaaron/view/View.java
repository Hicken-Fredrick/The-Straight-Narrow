/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

import CityOfAaronSN.CityOfAaronSN;
import citbyui.cit260.cityofaaron.control.GameControl;
import citbyui.cit260.cityofaaron.model.Game;
import java.util.Scanner;

import java.util.Scanner;

/**
 *
 * @author Meroko
 */
public abstract class View implements ViewInterface {
        public static Scanner scanner = new Scanner( System.in );

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
        String input = null;
        
        //loop escape boolean
        boolean valid = false;
        
        //get input and validate loop
        while (valid == false) {
            
            //output prompt
            System.out.println(promptMessage);
            System.out.println("Please Enter Your Choice: \n");
            
            //get input and trim
            input = (scanner.nextLine());
            input = input.trim();
            
            //validate
            if (input.length() < 1) {
                System.out.println("You must enter a value\n");
            }
            else
                valid = true;
        }
        
        return input;
    }
    
}
