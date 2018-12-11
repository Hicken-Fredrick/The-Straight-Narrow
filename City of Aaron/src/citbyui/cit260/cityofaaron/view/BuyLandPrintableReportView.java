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
 * @author Edgar
 */
class BuyLandPrintableReportView extends View {

//class PrintableMenuView extends View {

    @Override
    public String[] getInputs() {
         String[] inputs = new String[1];
        
        //build prompt message
        String promptMessage = 
                "\n"  
                + "***************************************\n" 
                + "* CITY OF AARON : Printable Report View *\n" 
                + "***************************************\n" 
                + "A - Print List of Animals: \n"
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