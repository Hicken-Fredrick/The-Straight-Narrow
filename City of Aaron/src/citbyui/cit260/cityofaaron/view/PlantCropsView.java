/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

import CityOfAaronSN.CityOfAaronSN;
import citbyui.cit260.cityofaaron.model.Game;
import citbyui.cit260.cityofaaron.control.GameControl;

import java.util.Scanner;

/**
 *
 * @author Meroko
 */
class PlantCropsView {
    public static Scanner scanner = new Scanner( System.in );
    public static Game game = CityOfAaronSN.getCurrentGame();
    public PlantCropsView() {
        
    }

    void displayPlantCropsView() {
        boolean endOfView = false;
        String[] inputs = new String[1];
        
        
        //loop for game sequence
        do {
        System.out.println("Plant Crops Display");
        inputs = getInputs();
            //use inputs to determine action
            endOfView = this.doAction(inputs);
        } while(endOfView != true);
        
    }
    
    private String[] getInputs() {
        String[] inputs = new String[1];
        
        //loop escape boolean
        boolean valid = false;
        
        //gather input and check validity before setting escape to true
        while (valid == false) {
            System.out.println( "\n" + 
               "*********************************\n" + 
                "*   CITY OF AARON : Plant Crops   *\n" +
                "*********************************\n" +
               "You currently have: " + game.getWheatinStorage() + "Wheat in storage \n"
                    + "This is how many plated arces you have: " + game.getAcresPlanted()
                        + "\n" + "And this many unplanted: " + game.getAcresOwned() +
               "\n P - plant additional crops\n" +
               " R - return to previous menu\n");
            //prompt / input
            System.out.println("Please Enter Your Choice : ");
            inputs[0] = (scanner.nextLine());
            inputs[0] = inputs[0].trim();
            
            //validate
            if (inputs[0].length() != 1) {
                System.out.println("You must choose a valid option");
                System.out.println( "\n" + 
               "*********************************\n" + 
                "*   CITY OF AARON : Plant Crops   *\n" +
                "*********************************\n" +
               "You currently have: " + game.getWheatinStorage() + "Wheat in storage \n"
                    + "This is how many plated arces you have: " + game.getAcresPlanted()
                        + "\n" + "And this many unplanted: " + game.getAcresOwned() +
               "\n P - plant additional crops\n" +
               " R - return to previous menu\n");
            }
            else
                valid = true;
        }
        
        return inputs;
    }
    
    public boolean doAction(String inputs[]) {
        String choice = inputs[0];
        
        switch (choice.toLowerCase()) {
            //call new game
            case "p":{
                plantCrops();
                return false;
            }
            //call restart for current game    
            case "r":
                return true;
            //unknown menu item choice
            default:{
                System.out.println("Unknown Menu Choice Please Try Again");
                return false;
            }
            
        }
    }

    private void plantCrops() {
        Boolean pass = false;
        int plant = 0;
        Boolean validate = false;
        while (validate != true){
            pass = false;
        while (pass != true)
        {
        try {
        System.out.println("\nEnter the number that you want to plant:");
        plant = Integer.parseInt(scanner.nextLine());
        pass = true;}
        catch (NumberFormatException e) { System.out.println("Invalid Input"); }

        }
        validate = validateInput(plant);
        }
    }

    private Boolean validateInput(int plant) {
        if (plant > game.getAcresOwned()){
            System.out.println("\nYou do not have enough land to do that");
            return false;
        }
        else if (plant / 2 > game.getWheatinStorage()){
            System.out.println("\nYou do not have enough wheat to do that");
            return false;
        }
        else {
            System.out.println("\nLand successfully planted ");
            GameControl.plantCrops(plant);
            
            return true;
            
        }
    }
    
}
