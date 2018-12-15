/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.control;

import CityOfAaronSN.CityOfAaronSN;
import citbyui.cit260.cityofaaron.model.*;
import citbyui.cit260.cityofaaron.view.ErrorView;
import citybyui.cit260.cirtyofaaron.exceptions.BuyLandException;
import citybyui.cit260.cirtyofaaron.exceptions.GameControlException;
import citybyui.cit260.cirtyofaaron.exceptions.SellLandException;
import citybyui.cit260.cirtyofaaron.exceptions.TithingException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
    
    public static void createNewGame(Player player) throws GameControlException {
        //check if player is empty
        if (player == null)
            throw new GameControlException("Player Entity Was Null");
        Game game = new Game();
        
        int cost = generateLandCost();
        
        //set player in game
        game.setThePlayer(player);
        
        //set the game
        CityOfAaronSN.setCurrentGame(game);
        
        
        //create starting inventory for player
        Storehouse storehouse = new Storehouse();
        ArrayList<InventoryItem> startingInventory;
        startingInventory = createItems();
        //check validity of items
        if (startingInventory == null)
            throw new GameControlException("Inventory Failed to Create");
        else {
            storehouse.setInventory(startingInventory);
            game.setTheStorehouse(storehouse);
        }
        
        //create map array and set to game
        Map map;
        map = MapControl.createMap(game, 5, 5);
        //check validity of map
        if (map == null)
            throw new GameControlException("Map Failed to Create");
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
        
        //game over state checks
        game.getThePlayer().setAlive(true);
        game.getThePlayer().setGameOverResultsViewed(false);
        
        //set starting location
        map.setCurrentLocation(map.getLocations()[0][0]);
        map.getCurrentLocation().setVisited(true);
        map.setCurrentRow(1);
        map.setCurrentColumn(1);
        
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
        
        //item 9
        item = new InventoryItem();
        item.setName("Hammer");
        item.setDescription("Needed for all building");
        item.setItemType(ItemType.Tool);
        item.setQuantity(3);
        item.setValue(3);
        item.setPerishable(false);
        
        //add item 9
        items.add(item);
        
        //item 10
        item = new InventoryItem();
        item.setName("Graden Hoe");
        item.setDescription("Helps with preparing the feilds");
        item.setItemType(ItemType.Tool);
        item.setQuantity(1);
        item.setValue(100);
        item.setPerishable(false);
        
        //add item 10
        items.add(item);
        
        //item 11
        item = new InventoryItem();
        item.setName("Sickle");
        item.setDescription("To cut all of the wheat");
        item.setItemType(ItemType.Tool);
        item.setQuantity(2);
        item.setValue(100);
        item.setPerishable(false);
        
        //add item 11
        items.add(item);
        
        return items;
    }
     
    public static void plantCrops(int plant) {
        Game game = CityOfAaronSN.getCurrentGame();
        
        game.setAcresPlanted(game.getAcresPlanted() + plant);
        game.setAcresOwned(game.getAcresOwned() - plant);
        game.setWheatinStorage(game.getWheatinStorage() - (plant / 2));
    }
    
    public static void paidTithing(int tithing) {
        Game game = CityOfAaronSN.getCurrentGame();
        
        game.setWheatinStorage(game.getWheatinStorage() - tithing);    
    }

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
    
    public static void sellLand(int amountToSell) throws SellLandException {
        Game game = CityOfAaronSN.getCurrentGame();
        //validate input
        if(game.getAcresOwned() + game.getAcresPlanted() < amountToSell)
            throw new SellLandException("You do not own that much land");
        //complete transaction
        else {
            //add wheat to players inventory
            int newWheatTotal = (amountToSell * game.getAcreCost()) + game.getWheatinStorage();
            game.setWheatinStorage(newWheatTotal);
            
            //remove land from players inventory
            if(amountToSell > game.getAcresOwned()) {
                amountToSell -= game.getAcresOwned();
                game.setAcresOwned(0);
                game.setAcresPlanted(game.getAcresPlanted() - amountToSell);
            }
            else
                game.setAcresOwned(game.getAcresOwned() - amountToSell);
                
        }
    }
    
    ////
    
    public static void buyLand(int landpurchased) throws BuyLandException {
        Game game = CityOfAaronSN.getCurrentGame();
        //validate input
        if(landpurchased * game.getAcreCost() > game.getWheatinStorage() )
            throw new BuyLandException("You do not have enough wheat to complete this purchase");
        //complete transaction
        else {
            //remove wheat from player
            int newWheatTotal =  game.getWheatinStorage() - (landpurchased * game.getAcreCost());
            game.setWheatinStorage(newWheatTotal);
            
           //add acres to player
           game.setAcresOwned(landpurchased + game.getAcresOwned());
        }
    }
    ////
    
    public static Boolean payingTithing(int tithing) throws TithingException{
        Game game = CityOfAaronSN.getCurrentGame();
        
        if (tithing > game.getWheatinStorage() ){
            throw new TithingException("\nYou Don't Have Enough Wheat");
            
        }
        else if (tithing < 1 ){
            throw new TithingException("\nValue must be 1 or Greater");
            
        }
        else {
            System.out.println("\nSuccessfully Submittited Tithing To Temple");
            paidTithing(tithing);
            
            return true;
            
        }
    }
    
    public static void saveGame(Game game, String filepath) throws GameControlException, IOException {
        
        if(game == null || filepath == null || filepath.length() < 1)
            throw new GameControlException("Failed to Save Game");
        else {
            try (ObjectOutputStream out =
                new ObjectOutputStream(new FileOutputStream(filepath));) {
                
                //write to location
                out.writeObject(game);
            }
                
                
            }
        }
    
        public static Game getGame(String filePath) throws GameControlException {
            if (filePath == null)
                throw new GameControlException("filePath wasn't set");
            //holder game file
            Game game = null;
            try (ObjectInputStream in =
                new ObjectInputStream(new FileInputStream(filePath));) {
                game = (Game) in.readObject();
                
            } catch(IOException ex) {
                ErrorView.display("Load Game",
                        "I/O Stream has Failed");
                
            } catch(ClassNotFoundException cnfe) {
                ErrorView.display("Load Game",
                        "File Incorrect or Corrupted");
            }
            return game;
        }

        
    }
