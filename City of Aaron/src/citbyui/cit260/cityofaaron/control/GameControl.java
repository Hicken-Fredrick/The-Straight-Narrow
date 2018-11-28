/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.control;

import CityOfAaronSN.CityOfAaronSN;
import citbyui.cit260.cityofaaron.model.*;
import citbyui.cit260.cityofaaron.control.*;

import java.util.ArrayList;

/**
 *
 * @author Meroko
 * 
 * 
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
        map = createMap(game, 5, 5);
        //check validity of map
        if (map == null)
            return -2;
        else
            game.setTheMap(map);
        
        //use this area to set starting conditions for game
        game.setYear(1);
        game.setWheatinStorage(50);
        game.setAcresOwned(5);
        game.setAcresPlanted(1);
        game.setCurrentPopulation(20);
        game.setTithingPayed(0);
        game.setAcreCost(cost);
        
        //set starting location
        map.setCurrentLocation(map.getLocations()[0][0]);
        map.getCurrentLocation().setVisited(true);
        map.setCurrentRow(1);
        map.setCurrentColumn(1);
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
        
        //creating items to fill inventory
        //item 1
        InventoryItem item = new InventoryItem();
        item.setName("Moo");
        item.setAge(3);
        item.setItemType(ItemType.Animal);
        item.setValue(15);

        //add item 1
        items.add(item);
        
        //item 2
        item = new InventoryItem();
        item.setName("Ninja");
        item.setAge(4);
        item.setItemType(ItemType.Animal);
        item.setValue(14);
        
        //add item 2
        items.add(item);  
        
        //item 3
        item = new InventoryItem();
        item.setName("GrassLover");
        item.setAge(5);
        item.setItemType(ItemType.Animal);
        item.setValue(13);
        
        //add item 3
        items.add(item);
        
        //item 4
        item = new InventoryItem();
        item.setName("Shadow");
        item.setAge(6);
        item.setItemType(ItemType.Animal);
        item.setValue(12);
        
        //add item 4
        items.add(item);
        
        //item 5
        item = new InventoryItem();
        item.setName("Speedy");
        item.setAge(7);
        item.setItemType(ItemType.Animal);
        item.setValue(11);
        
        //add item 5
        items.add(item);
        
        //item 6
        item = new InventoryItem();
        item.setName("Curative Moss");
        item.setDescription("Cures all Diseases");
        item.setItemType(ItemType.Medicine);
        item.setQuantity(3);
        item.setValue(3);
        item.setPerishable(true);
        
        //add item 6
        items.add(item);
        
        //item 7
        item = new InventoryItem();
        item.setName("Mana");
        item.setDescription("Removes all Hunger Costs this Year");
        item.setItemType(ItemType.Medicine);
        item.setQuantity(0);
        item.setValue(100);
        item.setPerishable(true);
        
        //add item 7
        items.add(item);
        
        //item 8
        item = new InventoryItem();
        item.setName("Blessed Water");
        item.setDescription("Icreased Faith & Protection");
        item.setItemType(ItemType.Medicine);
        item.setQuantity(2);
        item.setValue(10);
        item.setPerishable(false);
        
        //add item 8
        items.add(item);
        
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
        if (game == null || noOfRows < 0 || noOfColumns < 0)
            return null;
        
        Map map = new Map();
        
        //adding info
        map.setRows(noOfRows);
        map.setColumns(noOfColumns);
        game.setTheMap(map);
        
        //create locations list
        Location [][] locations = createLocations(noOfRows, noOfColumns);
        if (locations == null)
            return null;
        
        map.setLocations(locations);
        
        //check to see if running
        System.out.println("createMap Called");
        
        /*hold for later
        *Locations[][] location = CityOfAaaronSN.getCurrentGmae().getMap().getLocations();
        */
        
        return map;
    }
    
    private static Location[][] createLocations(int noOfRows, int noOfColumns) {
        if (CityOfAaronSN.getCurrentGame() == null || noOfRows < 1 || noOfColumns < 1)
            return null;
        
        //create location storage
        Location [][] locations = new Location[noOfRows][noOfColumns];
        
        //create each location and store it
        //location 1
        Location location = new Location();
        //set point of location
        Point point = new Point();
        point.setRow(1);
        point.setColumn(1);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("The Ruler's Court");
        //set map symbol
        location.setMapSymbol("RC");
        //save location
        locations[0][0] = location;
        
        //location 2
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(1);
        point.setColumn(2);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Village");
        //set map symbol
        location.setMapSymbol("VI");
        //save location
        locations[0][1] = location;
        
        //location 3
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(1);
        point.setColumn(3);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Local River");
        //set map symbol
        location.setMapSymbol("LR");
        //save location
        locations[0][2] = location;
        
        //location 4
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(1);
        point.setColumn(4);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("The Temple");
        //set map symbol
        location.setMapSymbol("TS");
        //save location
        locations[0][3] = location;
        
        //location 5
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(1);
        point.setColumn(5);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("The Farms");
        //set map symbol
        location.setMapSymbol("FL");
        //save location
        locations[0][4] = location;
        
        //location 6
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(2);
        point.setColumn(1);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Border Lands");
        //set map symbol
        location.setMapSymbol("BL");
        //save location
        locations[1][0] = location;
        
        //location 7
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(2);
        point.setColumn(2);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Personal Room");
        //set map symbol
        location.setMapSymbol("PR");
        //save location
        locations[1][1] = location;
        
        //location 8
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(2);
        point.setColumn(3);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Westerfall");
        //set map symbol
        location.setMapSymbol("WF");
        //save location
        locations[1][2] = location;
        
        //location 9
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(2);
        point.setColumn(4);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Bywald");
        //set map symbol
        location.setMapSymbol("BW");
        //save location
        locations[1][3] = location;
        
        //location 10
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(2);
        point.setColumn(5);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Aldmarsh");
        //set map symbol
        location.setMapSymbol("AM");
        //save location
        locations[1][4] = location;
        
        //location 11
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(3);
        point.setColumn(1);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Morford");
        //set map symbol
        location.setMapSymbol("MF");
        //save location
        locations[2][0] = location;
        
        //location 12
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(3);
        point.setColumn(2);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Snowbeech");
        //set map symbol
        location.setMapSymbol("SW");
        //save location
        locations[2][1] = location;
        
        //location 13
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(3);
        point.setColumn(3);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Butterdell");
        //set map symbol
        location.setMapSymbol("BD");
        //save location
        locations[2][2] = location;
        
        //location 14
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(3);
        point.setColumn(4);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Sevokith");
        //set map symbol
        location.setMapSymbol("SK");
        //save location
        locations[2][3] = location;
        
        //location 15
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(3);
        point.setColumn(5);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Kingdom of Coir");
        //set map symbol
        location.setMapSymbol("KC");
        //save location
        locations[2][4] = location;
        
        //location 16
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(4);
        point.setColumn(1);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("West Border");
        //set map symbol
        location.setMapSymbol("WB");
        //save location
        locations[3][0] = location;
        
        //location 17
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(4);
        point.setColumn(2);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("East Border");
        //set map symbol
        location.setMapSymbol("EB");
        //save location
        locations[3][1] = location;
        
        //location 18
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(4);
        point.setColumn(3);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("North Border");
        //set map symbol
        location.setMapSymbol("NB");
        //save location
        locations[3][2] = location;
        
        //location 19
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(4);
        point.setColumn(4);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("South Border");
        //set map symbol
        location.setMapSymbol("SB");
        //save location
        locations[3][3] = location;
        
        //location 20
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(4);
        point.setColumn(5);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Captain's Office");
        //set map symbol
        location.setMapSymbol("CO");
        //save location
        locations[3][4] = location;
        
        //location 21
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(5);
        point.setColumn(1);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Judge's Office");
        //set map symbol
        location.setMapSymbol("JO");
        //save location
        locations[4][0] = location;
        
        //location 22
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(5);
        point.setColumn(2);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Advisor's Office");
        //set map symbol
        location.setMapSymbol("AO");
        //save location
        locations[4][1] = location;
        
        //location 23
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(5);
        point.setColumn(3);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Tool Store");
        //set map symbol
        location.setMapSymbol("TS");
        //save location
        locations[4][2] = location;
        
        //location 24
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(5);
        point.setColumn(4);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Animal Store");
        //set map symbol
        location.setMapSymbol("AS");
        //save location
        locations[4][3] = location;
        
        //location 25
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(5);
        point.setColumn(5);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Medicine Store");
        //set map symbol
        location.setMapSymbol("MS");
        //save location
        locations[4][4] = location;
        
        return locations;
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
