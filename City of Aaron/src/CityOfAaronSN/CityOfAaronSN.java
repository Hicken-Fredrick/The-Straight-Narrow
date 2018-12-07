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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Group
 */
public class CityOfAaronSN {
    /**
     * @param args the command line arguments
     */
    
    //statics for game / player
    private static Game currentGame= null;
    private static Player player = null;
    
    //statics for reader / writer
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;

    //getters & setters
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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        CityOfAaronSN.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        CityOfAaronSN.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        CityOfAaronSN.logFile = logFile;
    }
    
    
    public static void main(String[] args) {
        //program creation
        try {
            //open character streams
            CityOfAaronSN.inFile = new BufferedReader(new InputStreamReader(System.in));
            CityOfAaronSN.outFile = new PrintWriter(System.out, true);
            CityOfAaronSN.logFile = new PrintWriter("logFile.txt");
            
            //create and start game
            StartProgramView startProgram = new StartProgramView();
            startProgram.display();
        } catch (Throwable game) {
            ErrorView.display("Game", "The Program Has Unexpectedly Crashed \n"
                    + "We Apologize for the Inconvience, Please play again.\n"
                    + "\nException: " + game.toString()
                    + "\nCause: " + game.getCause()
                    + "\nMessage: " + game.getMessage());
            game.printStackTrace();
        } finally {
            try {
                if (inFile != null)
                    CityOfAaronSN.inFile.close();
                
                if (outFile != null)
                    CityOfAaronSN.outFile.close();
                
                if (logFile != null)
                    CityOfAaronSN.logFile.close();
                
            } catch (IOException ex) {
                System.console().printf("%s%s", "Error closing the input/output stream");
                return;
                }
        }
    }

    
}
