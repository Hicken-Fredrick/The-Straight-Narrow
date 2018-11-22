/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

import citbyui.cit260.cityofaaron.model.Player;
import citbyui.cit260.cityofaaron.control.GameControl;
import CityOfAaronSN.CityOfAaronSN;
import java.util.Scanner;

/**
 *
 * @author Meroko
 */
public class StartProgramView extends View{
    public static Scanner scanner = new Scanner( System.in );
    
    public StartProgramView() {   
    }
    
    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        
        //build prompt message
        String promptMessage = 
                " ##  #   #           #   ##      #                  \n" +
                "#       ### # #     # #  #      # #  ## ### ### ##  \n" +
                "#    #   #  ###     # # ###     ### # # #   # # # # \n" +
                "#    ##  ##   #     # #  #      # # ### #   ### # # \n" +
                " ##         ###      #  ##      # #                 \n" +
                "\nWelcome to the best game, City of Aaron.\n "
                + "From here you will be the ruler of the cities. Your main task\n "
                + "will be to manage buy land or sell land keeping in mind that\n "
                + "you need to determine how much items you need to survive each\n "
                + "year doing many activities with the land you own, for example\n "
                + "you can plan wheat and other items in order to survive. Also,\n "
                + "you will be require to pay annual tithing based on what you\n "
                + "accumulate per year. In case that you did not meet the minimum\n "
                + "requirements to survive with the food you harvested, people will\n "
                + "start dying and your locations or cities will loss its dynamics to\n "
                + "be self-reliance on its own plants or wheat collected, this case\n "
                + "will quickly cause chaos on that location and you might lose it\n "
                + "if no changes are made quickly.  \n"
                + "\nWatch out for others challenges that will keep your storage in\n " 
                + "good shape, like insects, rodents and the life of the products stored.\n"
                + "\n CHOOSE THE NAME YOU WISH TO BE CALLED! \n";
        
        inputs[0] = getInput(promptMessage);
        
        return inputs;
    }
    
    @Override
    public boolean doAction(String inputs[]) {
        
        String playerName = inputs[0];
        Player player = GameControl.savePlayer(playerName);
        
        if (player == null) {
            System.out.println("Failed to create player. " +
                    "Please Try Again!");
           
            return false;
        }
        
        System.out.println("==================================="
        + "\nWelcome to the game " + playerName
        + "\nWe hope you have lots of fun!"
        + "\n===================================");
        
        CityOfAaronSN.setThePlayer(player);
        
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
        
        return true;
    }

   
    
    
}
