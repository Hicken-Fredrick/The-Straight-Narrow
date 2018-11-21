/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.control;

import CityOfAaronSN.CityOfAaronSN;
import citbyui.cit260.cityofaaron.model.Game;
import citbyui.cit260.cityofaaron.model.Player;
import citbyui.cit260.cityofaaron.control.*;
import citbyui.cit260.cityofaaron.model.InventoryItem;
import citbyui.cit260.cityofaaron.model.ItemType;
import citbyui.cit260.cityofaaron.model.Map;
import citbyui.cit260.cityofaaron.model.Storehouse;
import java.util.ArrayList;

/**
 *
 * @author Meroko
 */
public class GameControl {
  
    public GameControl() {
    }
    
    public static int createNewGame(Player player) {
        //check if player is empty
        if (player == null)
            return -1;
        Game game = new Game();
        
        int cost = generateLandCost();
        
        //set player in game
        game.setThePlayer(player);
        
        //set the game
        CityOfAaronSN.setCurrentGame(game);
        
        //use this area to set starting conditions for game
        game.setYear(1);
        game.setWheatinStorage(50);
        game.setAcresOwned(5);
        game.setAcresPlanted(1);
        game.setCurrentPopulation(20);
        game.setTithingPayed(0);
        game.setAcreCost(cost);
        
        //create starting inventory for player TO BE IMPLEMENTED (see below)
        Storehouse storehouse = new Storehouse();
        ArrayList<InventoryItem> startingInventory;
        startingInventory = createItems();
        //check validity of items
        if (startingInventory == null)
            return -2;
        else {
            storehouse.setInventory(startingInventory);
            game.setTheStorehouse(storehouse);
        }
        
        //create map array and set to game
        Map map;
        map = createMap(game, 1, 1);
        //check validity of map
        if (map == null)
            return -2;
        else
            game.setTheMap(map);
        
        
        //return value for success
        return 1;
        
    }
    
    public static Player savePlayer(String player) {
        //validate
        if (player.length() < 1)
            return null;
        
        //create newPlayer and pass back
        Player newPlayer = new Player();
        newPlayer.setName(player);
        
        return newPlayer;
    }
    
    private static ArrayList<InventoryItem> createItems() {
        ArrayList<InventoryItem> items = new ArrayList<>();
        
        //reate and item
        InventoryItem cow = new InventoryItem();
        cow.setName("Bertha");
        cow.setAge(3);
        cow.setItemType(ItemType.Animal);
        
        //add the item
        items.add(cow);
        
        //output arraylist
        for (InventoryItem inventoryItem : items) {
            if (inventoryItem.getItemType() == ItemType.Animal)
                System.out.println(inventoryItem.getName() + " the " + inventoryItem.getItemType());
        }
        
        //check to see if running
        System.out.println("createItems Called");
        
        return items;
    }
    
    public static Map createMap(Game game, int noOfRows, int noOfColumns) {
        Map map = new Map();
        
        //adding info
        map.setRows(noOfRows);
        map.setColumns(noOfColumns);
        
        //check to see if running
        System.out.println("createMap Called");
        
        return map;
    }
    
    public static void plantCrops(int plant) {
        Game game = CityOfAaronSN.getCurrentGame();
        
        game.setAcresPlanted(game.getAcresPlanted() + plant);
        game.setAcresOwned(game.getAcresOwned() - plant);
        game.setWheatinStorage(game.getWheatinStorage() - (plant / 2));
    }
    
    public static void paidTithing(int tithing) {
        Game game = CityOfAaronSN.getCurrentGame();
        
        game.setWheatinStorage(game.getWheatinStorage() - (tithing / 100) );    }

    private static int generateLandCost() {
        int cost = (int )(Math.random() * 10 + 17);
        return cost;
    }
    
    public static void yearRollover() {
        Game game = CityOfAaronSN.getCurrentGame();
        
        //find how much wheat we made during the year
        game.setWheatinStorage(RolloverControl.wheatGenerated
        (game.getTithingPayed(), game.getWheatinStorage(), game.getAcresPlanted()));
        
        //generate vermin to eat a portion of your stored wheat
        game.setWheatinStorage(CalculateWheatLoss.calcWheatLoss
        (game.getTithingPayed(), game.getWheatinStorage()));
        
        //needs more work here to complete including a game over state
        
        //increment the year upwards
        game.setYear(game.getYear()+1);
    }
    
}
