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
class HelpMenuView {
    public static Scanner scanner = new Scanner( System.in );

    public HelpMenuView() {
    }

    void displayHelpMenuView() {
        System.out.println("**** getHelp() Called ****");
        System.out.println(
               "*********************************\n" + 
               "*   CITY OF AARON : MAIN MENU   *\n" +
               "*********************************\n" +
               " G - What Is The Mission Of The Game\n" +
               " M - How To Move\n" +
               " H - Harvesting Details\n" + 
               " S - Scoring Details\n" +
               " R - Reports Menu Details\n" + 
               " T - Tithing Info\n" + 
               " Q - Quit\n"
            );
        //set variables
        boolean endOfView = false;
        String[] inputs = new String[1];
        
        //menu infographic
        
        
        //loop for game sequence
        do {
            inputs = getInputs();
            
            
            endOfView = this.doAction(inputs);
        } while(endOfView != true);
    }
    
        private String[] getInputs() {
        System.out.println("**** getInputs() Called ****");
        String[] inputs = new String[1];
        
        //loop escape boolean
        boolean valid = false;
        
        //gather input and check validity before setting escape to true
        while (valid == false) {
            //prompt / input
            
            System.out.println("Please Enter Your Choice : ");
            inputs[0] = (scanner.nextLine());
            inputs[0] = inputs[0].trim();
            
            //validate
            if (inputs[0].length() != 1) {
                System.out.println("You must a valid option");
                System.out.println(
               "*********************************\n" + 
               "*   CITY OF AARON : MAIN MENU   *\n" +
               "*********************************\n" +
               " G - What Is The Mission Of The Game\n" +
               " M - How To Move\n" +
               " H - Harvesting Details\n" + 
               " S - Scoring Details\n" +
               " R - Reports Menu Details\n" + 
               " T - Tithing Info\n" + 
               " Q - Quit\n");
            }
            else
                valid = true;
        }
        
        return inputs;
    }
    
    public boolean doAction(String inputs[]) {
        System.out.println("**** getActions() Called ****");
        String choice = inputs[0];
        
        switch (choice.toLowerCase()) {
            //What Is The Mission Of The Game
            case "g":{
                System.out.println("Stay Alive for the for ten years to complete the game.\n"
                        + "In this game you are the leader and will need to know what is best\n"
                        + "for your people in harvesting crops and when to buy or sell land.\n"
                        + "So good luck.\n");
                return false;
            }
            //How To Move 
            case "m":{
                System.out.println("You will be able to move to different locations on the map.\n"
                        + "This will be set on the map menu to move to.\n"
                        + "All locations will do different actions depending on the location\n"
                        + "that you are currently on.\n");
                return false;
            }
            //Harvesting Details     
            case "h":{
                System.out.println("Make sure that you have enough harvest per year\n"
                        + "to support your population. You can do this by checking your\n"
                        + "yield and buy land for your people to harvest.\n");
                return false;
            }
            //Scoring Details    
            case "s":{
                System.out.println("Your score will calculated by kingdoms wealth\n"
                        + "and the years that you were in office.\n");
                return false;
            }
            //Reports Menu Details
            case "r":{
                System.out.println("This will give you detail report\n"
                        + "on the progress through the game.\n");
                return false;
            }
            //Tithing Info
            case "t":{
                System.out.println("If you don’t pay your offerings,\n"
                        + "the beasts may take of your fields.\n");
                return false;
            }
            //quit out of menu   
            case "q":
                return true;
            //unknown menu item choice
            default:{
                System.out.println("Unknown Menu Choice Please Try Again\n");
                return false;
            }
            
        }
            
    }
    
    
}
