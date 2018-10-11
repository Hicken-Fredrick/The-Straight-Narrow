/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityOfAaron;
import java.util.Scanner;

//Imports
import citbyui.cit260.cityofaaron.model.Player;

/**
 *
 * @author Meroko
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //sample calls PLAYER
        Player player = new Player();
        
        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter a name: ");
        player.setName(scanner.nextLine());
        
        System.out.println(player.getName());
        
        //sample calls **
        
        
        
        //sample calls **
        
    }
    
}
