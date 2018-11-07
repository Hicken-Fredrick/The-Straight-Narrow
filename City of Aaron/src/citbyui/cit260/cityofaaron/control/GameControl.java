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

    public GameControl() {
    }
    
    public static Game creatNewGame(Player player) {
        //create game
        Game game = new Game();
        
        //set player in game
        game.setThePlayer(player);
        
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
}
