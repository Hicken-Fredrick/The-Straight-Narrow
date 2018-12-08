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
 * @author tayta
 */
public class ReportsView extends View{
    public static Game game = CityOfAaronSN.getCurrentGame();
    
    public ReportsView(){
    
    }
    @Override
    public String[] getInputs() {
         String[] inputs = new String[1];
        
        //build prompt message
        String promptMessage = 
                "\n"  
                + "*********************************\n" 
                + "*  CITY OF AARON : Reports View  *\n" 
                + "*********************************\n" 
                + "\n" + "Game Wheat Owned: " + game.getWheatinStorage() + "\n"
                + "Game Arces Owned: " + game.getAcresOwned() + "\n"
                + "Game Arces Planted: " + game.getAcresPlanted() + "\n"
                + "Game Tithing and Offering: " + game.getTithingPayed() + "\n" 
                + "M - View The Game Maker Author List\n"
                + "A - View List of Animals: \n"
                + "D - View List of Medicine\n"
                + "T - View List of Tools\n"
                + "P - Printable List Menu\n"
                + "R - return to previous menu\n";
        
        inputs[0] = getInput(promptMessage);
        
        return inputs;
        
    }
    @Override
    public boolean doAction(String inputs[]) {
        String choice = inputs[0];
        
        switch (choice.toLowerCase()) {
            //call author view class
            case "m":{
                authorList();
                return false;
            }
            //call animal list view
            case "a":{
                printAnimalList();
                return false;
            }
            //call medicine list view
            case "d":{
                printMedicineList();
                return false;
            }
            //call tool list view
            case "t":{
                printToolList();
                return false;
            }
            //open printable list menu for outgoing streams
            case "p":{
                printableMenu();
                return false;
            }
            //return to previous menu    
            case "r":
                return true;
            //unknown menu item choice
            default:{
                ErrorView.display(this.getClass().getName(),
                        "Unknown Menu Choice Please Try Again");
                return false;
            }
            
        }

    
}

    private void authorList() {
        AuthorView authorView = new AuthorView();
        authorView.displayauthorView();
    }

    private void printAnimalList() {
        ArrayList<InventoryItem> animalList = new ArrayList<>();
        animalList = StorehouseControl.buildAnimalList();
        
        this.console.println("*****************************\n" +
                           "*** LIST OF OWNED ANIMALS ***\n");
        
        for (int i = 0; i < animalList.size(); i++) {
            InventoryItem item = animalList.get(i);
            this.console.println(item.getName() + " and has " + item.getAge() 
                    + " years old and it is Valued at " + item.getValue() + " Bushels of Wheat\n");
        }
    }

    private void printMedicineList() {
        ArrayList<InventoryItem> medicineList = new ArrayList<>();
        medicineList = StorehouseControl.buildMedicineList();
        
        this.console.println("*****************************\n" +
                           "*** LIST OF OWNED Medicines ***\n");
        
        for (int i = 0; i < medicineList.size(); i++) {
            InventoryItem item = medicineList.get(i);
            this.console.println(item.getName() + " x " + item.getQuantity() 
                    + "\n" + item.getDescription() + " - Perishable: " 
                    + item.isPerishable() + "\n");
        }
    }

    private void printToolList() {
        ArrayList<InventoryItem> toolList = new ArrayList<>();
        toolList = StorehouseControl.buildToolList();
        
        this.console.println("*****************************\n" +
                           "*** LIST OF OWNED Tools ***\n");
        
        for (int i = 0; i < toolList.size(); i++) {
            InventoryItem item = toolList.get(i);
            this.console.println(item.getName() + " x " + item.getQuantity() 
                    + "\n" + item.getDescription() + " - Perishable: " 
                    + item.isPerishable() + "\n");
        }
    }

    private void printableMenu() {
        PrintableMenuView printableMenuView = new PrintableMenuView();
        printableMenuView.display();
    }
}

    
