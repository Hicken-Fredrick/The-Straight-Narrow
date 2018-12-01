/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CityOfAaronSN;
import java.util.Scanner;

//Imports
import citbyui.cit260.cityofaaron.model.*;
import citbyui.cit260.cityofaaron.control.*;
import citbyui.cit260.cityofaaron.view.*;

/**
 *
 * @author Group
 */
public class CityOfAaronSN {
    /**
     * @param args the command line arguments
     */
    public static Scanner scanner = new Scanner( System.in );
    
    //statics for game / player
    private static Game currentGame= null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        CityOfAaronSN.currentGame = currentGame;
    }

    public static Player getThePlayer() {
        return player;
    }

    public static void setThePlayer(Player player) {
        CityOfAaronSN.player = player;
    }
    
    
    public static void main(String[] args) {
        //program creation
        try {
        StartProgramView startProgram = new StartProgramView();
        startProgram.display();
        } catch (Throwable game) {
            System.out.println("The Program Has Unexpectedly Crashed \n"
                    + "We Apologize for the Inconvience, Please play again.\n");
            game.printStackTrace();
        }
    }

    
}
