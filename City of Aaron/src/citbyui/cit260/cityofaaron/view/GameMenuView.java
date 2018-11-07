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
public class GameMenuView {
    public static Scanner scanner = new Scanner( System.in );

    public GameMenuView() {
    }

    //start display loop
    void displayMainMenuView() {
        boolean endOfView = false;
        String[] inputs = new String[1];
        
        //loop for game sequence
        do {
            //gather input
            inputs = getInputs();
            //use input to determine action
            endOfView = this.doAction(inputs);
        } while(endOfView != true);
        
    }

    //gather inputs from user
    private String[] getInputs() {
        
        String[] inputs = new String[1];
        
        //loop escape boolean
        boolean valid = false;
        
        while (valid == false) {
            //prompt / input
            System.out.println(
               "*********************************\n" + 
               "*   CITY OF AARON : Game Menu   *\n" +
               "*********************************\n" +
               " V - View Map & Move\n" +
               " M - Manage Crops\n" +
               " L - Live The Year\n" + 
               " S - Save Game\n" +
               " R - Reports Menu\n" + 
               " Q - Return To Main Menu\n");
            System.out.println("Please Enter Your Choice : ");
            inputs[0] = (scanner.nextLine());
            inputs[0] = inputs[0].trim();   
        }
        return inputs;
    }
    
    //complete actions for input
    public boolean doAction(String inputs[]) {
        String choice = inputs[0];
        
        switch (choice.toLowerCase()) {
            
            
        }
        
        return true;
    }
    
}
