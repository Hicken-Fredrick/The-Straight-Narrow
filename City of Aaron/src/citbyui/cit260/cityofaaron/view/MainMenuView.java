/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

import java.util.Scanner;
/**
 *
 * @author Meroko
 */
public class MainMenuView {
    public static Scanner scanner = new Scanner( System.in );


    public MainMenuView() {
        
    }

    void displayMainMenuView() {
        
    }
    
    private String[] getInputs() {
        System.out.println("**** GetInputs() Called ****");
        String[] inputs = new String[1];
        
        //loop escape boolean
        boolean valid = false;
        
        //gather input and check validity before setting escape to true
        while (valid == false) {
            //prompt / input
            System.out.println("Please Enter a Name (Caps Included) : ");
            inputs[0]=(scanner.nextLine());
            inputs[0] = inputs[0].trim();
            
            //validate
            if (inputs[0].length() != 1) 
                System.out.println("You must a valid option");
            else
                valid = true;
        }
        
        return inputs;
    }
    
    public boolean doAction(String inputs[]) {
        System.out.println("**** GetActions() Called ****");
        
        
        return true;
    }
}
