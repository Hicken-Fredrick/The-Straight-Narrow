/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.control;

import CityOfAaronSN.CityOfAaronSN;
import citbyui.cit260.cityofaaron.model.Game;
import citbyui.cit260.cityofaaron.model.InventoryItem;
import citbyui.cit260.cityofaaron.model.ItemType;
import java.util.ArrayList;

/**
 *
 * @author Meroko
 */
public class StorehouseControl {

    public static ArrayList<InventoryItem> buildAnimalList() {
        
        //reutrn type
        ArrayList<InventoryItem> animalList = new ArrayList<>();
        
        //full inventory for sorting
        ArrayList<InventoryItem> inventoryList = new ArrayList<>();
        inventoryList = CityOfAaronSN.getCurrentGame().getTheStorehouse().getInventory();
        
        //sort loop
        for (InventoryItem inventoryItem : inventoryList) {
            if (inventoryItem.getItemType() == ItemType.Animal)
                animalList.add(inventoryItem);
        }
        
        return animalList;
    }

    public static ArrayList<InventoryItem> buildMedicineList() {
        //reutrn type
        ArrayList<InventoryItem> medicineList = new ArrayList<>();
        
        //full inventory for sorting
        ArrayList<InventoryItem> inventoryList = new ArrayList<>();
        inventoryList = CityOfAaronSN.getCurrentGame().getTheStorehouse().getInventory();
        
        //sort loop
        for (InventoryItem inventoryItem : inventoryList) {
            //check if medicine & there is stock
            if (inventoryItem.getItemType() == ItemType.Medicine 
                    && inventoryItem.getQuantity() > 1)
                //add item to return list
                medicineList.add(inventoryItem);
        }
        
        return medicineList;
    }
    
}
