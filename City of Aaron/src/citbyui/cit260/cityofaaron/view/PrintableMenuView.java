/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

import citbyui.cit260.cityofaaron.control.StorehouseControl;
import citbyui.cit260.cityofaaron.model.InventoryItem;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Meroko
 */
class PrintableMenuView extends View {

    @Override
    public String[] getInputs() {
         String[] inputs = new String[1];
        
        //build prompt message
        String promptMessage = 
                "\n"  
                + "***************************************\n" 
                + "* CITY OF AARON : Printable List View *\n" 
                + "***************************************\n" 
                + "A - Print List of Animals: \n"
                + "D - Print List of Medicine\n"
                + "T - Print List of Tools\n"
                + "R - return to previous menu\n";
        
        inputs[0] = getInput(promptMessage);
        
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String choice = inputs[0];
        
        switch (choice.toLowerCase()) {
            //call animal list view
            case "a":{
                animalListPrintLocation();
                return false;
            }
            //call medicine list view
            case "d":{
                medicineListPrintLocation();
                return false;
            }
            //call tool list view
            case "t":{
                toolListPrintLocation();
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
    

    private void animalListPrintLocation() {
        
    }
    
    //asks for where you wish to save the list
    private void medicineListPrintLocation() {
        String[] inputs = new String[1];
        
        //build prompt message
        String promptMessage = "\nEnter Where You Wish To Save The List: (ex: D:/medicineList.txt";
        
        inputs[0] = getInput(promptMessage);
        
        saveMedicineList(inputs);
    }
    

    private void toolListPrintLocation() {
        String[] inputs = new String[1];
        
        //build prompt message
        String promptMessage = "\nEnter Where You Wish To Save The List: (ex: D:/toolsList.txt";
        
        inputs[0] = getInput(promptMessage);
        
        saveToolList(inputs);
        
    }
    
    //saves the list at given location
    private void saveMedicineList(String[] inputs) {
        if (inputs == null || inputs[0].length() < 1) {
            ErrorView.display(this.getClass().getName(), "Unable to Parse Save Location");
            return;
        }
        
        try(PrintWriter save = new PrintWriter(inputs[0])) {
            //generate list for printing
            ArrayList<InventoryItem> medicineList = new ArrayList<>();
            medicineList = StorehouseControl.buildMedicineList();
            
            //make header & column headings
            save.println("\n----------------------------------MEDICINE LIST----------------------------------");
            save.printf("%n%-20s%-10s%-35s%-10s", "Name", "Quantity", "Description", "Perishable");
            //print whole list
            for (InventoryItem item: medicineList){
                save.printf("%n%-20s%-10s%-35s%-10s",item.getName(), " x " + item.getQuantity(),
                item.getDescription(), "Perishable: " + item.isPerishable());
            }
            
        }catch(IOException e) {
            ErrorView.display(this.getClass().getName(), "IO Stream Has Stopped Functioning");
        }
        
        //success
        this.console.println("List Has Been Successfully Saved at: " + inputs[0]);
    }

    private void saveToolList(String[] inputs) {
        if (inputs == null || inputs[0].length() < 1) {
            ErrorView.display(this.getClass().getName(), "Unable to Parse Save Location");
            return;
        }
        
        try(PrintWriter save = new PrintWriter(inputs[0])) {
         //generate list for printing
            ArrayList<InventoryItem> toolList = new ArrayList<>();
            toolList = StorehouseControl.buildToolList();
            
            //make header & column headings
            save.println("\n----------------------------------TOOL LIST----------------------------------");
            save.printf("%n%-20s%-10s%-35s%-10s", "Name", "Quantity", "Description", "Perishable");
            //print whole list
            for (InventoryItem item: toolList){
                save.printf("%n%-20s%-10s%-35s%-10s",item.getName(), " x " + item.getQuantity(),
                item.getDescription(), "Perishable: " + item.isPerishable());
            }
            
        }catch(IOException e) {
            ErrorView.display(this.getClass().getName(), "IO Stream Has Stopped Functioning");
        }
        
        //success
        this.console.println("List Has Been Successfully Saved at: " + inputs[0]);
    }
    
}
