/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

import CityOfAaronSN.CityOfAaronSN;
import citbyui.cit260.cityofaaron.model.Game;
import citbyui.cit260.cityofaaron.control.GameControl;
import citbyui.cit260.cityofaaron.control.StorehouseControl;
import citbyui.cit260.cityofaaron.model.InventoryItem;
import citbyui.cit260.cityofaaron.model.ItemType;
import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author Edgar
 */
        
// ReportsView = BuyLandReportView

public class BuyLandReportView extends View{
    public static Game game = CityOfAaronSN.getCurrentGame();
    
    public BuyLandReportView(){
    
    }
    @Override
    public String[] getInputs() {
         String[] inputs = new String[1];
        
        //build prompt message
       String promptMessage = 
             "\n" + 
               "*****************************************\n" + 
                "*   CITY OF AARON : Buy Land Reports   *\n" +
                "****************************************\n" +
                "You Currently own " + (game.getAcresOwned() + game.getAcresPlanted()) +
                " acres of land\n" + "Land currently costs " + game.getAcreCost() +
                " bushels of wheat\n" +
                "B - Buy Land\n" + 
                "P - Print View of Menu\n" +
                "R - Return to previous menu";
        
        inputs[0] = getInput(promptMessage);
        
        return inputs;
    }
   @Override
    public boolean doAction(String[] inputs) {
       
        String choice = inputs[0];
        
        switch (choice.toLowerCase()) {
            //call new game
            case "b":{
                buylandView();
                return false;
            }
            //call restart for current game    
            case "r":
                return true;
            //unknown menu item choice
            default:{
                ErrorView.display("BuyLandView", "Unknown Menu Choice Please Try Again");
                return false;
            }
            case "p":{
                buylandPrintableMenu();
                return false;
            }
        }
        
    }

    private void buylandView() {
        Boolean pass = false;
        boolean valid = false;
        //String choice = null;
        String acres = null;
        
        int landpurchased = 0;
        Boolean validate = false;
        
        while (validate != true){
            pass = false;
        while (pass != true)
        {
        try {
        
            try {
                while (!valid) {
                    //print prompt
                    this.console.println("\nEnter acres of land you want to buy (q to Exit):");

                    //get user input
                    acres = this.keyboard.readLine();
                    acres = acres.trim();

                    if (acres.length() < 1){
                        ErrorView.display(this.getClass().getName(),
                                "You must enter a value.");
                        continue;
                    }
                    break;

                        }
            } catch (Exception e) {
                        ErrorView.display(this.getClass().getName(),
                                "Error Reading Input: " + e.getMessage());
                }
        
            //check for escape
            if(acres.toLowerCase().trim().equals("q")) {
                this.console.println("quitting to previous menu");
                return;
            }
            
        landpurchased = Integer.parseInt(acres);
        pass = true;} catch (NumberFormatException e) { 
            ErrorView.display(this.getClass().getName(),
                    "Invalid Input, enter a number please"); }
        
        }
      try {
            //validate input against land owned
            GameControl.buyLand(landpurchased);
            validate = true;
        }catch(BuyLandException e){
            //to begining
            ErrorView.display(this.getClass().getName(),e.getMessage());
            validate = false;
            pass = false;
        }
        }
    }
    private void printAnimalList() {
        ArrayList<InventoryItem> toolList = new ArrayList<>();
        toolList = StorehouseControl.buildToolList();
        
        this.console.println("*****************************\n" +
                           "*** LIST OF ANIMALS ***\n");
        
        for (int i = 0; i < toolList.size(); i++) {
            InventoryItem item = toolList.get(i);
            this.console.println(item.getName() + " x " + item.getQuantity() 
                    + "\n" + item.getDescription() + " - Perishable: " 
                    + item.isPerishable() + "\n");
        }
    }
      private void buylandPrintableMenu() {
        BuyLandPrintableReportView buylandPrintableReportView = new BuyLandPrintableReportView();
        buylandPrintableReportView.display();
    }
}