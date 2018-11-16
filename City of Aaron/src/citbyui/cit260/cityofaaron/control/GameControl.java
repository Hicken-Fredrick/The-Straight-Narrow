/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.control;

import citbyui.cit260.cityofaaron.model.Game;
import citbyui.cit260.cityofaaron.model.Player;

/**
 *
 * @author Meroko
 */
public class GameControl {

    private static Game game = new Game();
    
    public GameControl() {
    }
    
    public static Game creatNewGame(Player player) {
        //create game
        
        int cost = getLandCost();
        
        //set player in game
        game.setThePlayer(player);
        
        //use this area to set starting conditions for game
        game.setWheatinStorage(50);
        game.setAcresOwned(5);
        game.setAcresPlanted(1);
        game.setCurrentPopulation(20);
        game.setTithingPayed(0);
        game.setAcreCost(cost);
        
        //return game
        return game;
        
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
    
    public static void plantCrops(int plant) {
        game.setAcresPlanted(game.getAcresPlanted() + plant);
        game.setAcresOwned(game.getAcresOwned() - plant);
        game.setWheatinStorage(game.getWheatinStorage() - (plant / 2));
    }
    
    public static void paidTithing(int tithing) {
        game.setWheatinStorage(game.getWheatinStorage() - (tithing / 100) );    }

    private static int getLandCost() {
        int cost = (int )(Math.random() * 10 + 17);
        return cost;
    }
    
}
