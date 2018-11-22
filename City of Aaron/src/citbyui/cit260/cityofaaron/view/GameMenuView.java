/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;


/**
 *
 * @author Meroko
 */
public class GameMenuView extends View{

    public GameMenuView() {
    }

    //gather inputs from user
    @Override
    public String[] getInputs() {
        
        String[] inputs = new String[1];
        
        //build prompt message
        String promptMessage = 
                "\n*********************************\n" + 
               "*   CITY OF AARON : Game Menu   *\n" +
               "*********************************\n" +
               " V - Map Menu\n" +
               " M - Manage Crops\n" +
               " L - Live The Year\n" + 
               " B - Buy and Sell Land\n" +
               " S - Save Game\n" +
               " R - Reports Menu\n" + 
               " Q - Return To Main Menu\n";
        
        inputs[0] = getInput(promptMessage);
        
        return inputs;
    }
    
    //complete actions for input
    @Override
    public boolean doAction(String inputs[]) {
        String choice = inputs[0];
        
        switch (choice.toLowerCase()) {
            //view map and move
            case "v":{
                viewMapAndMove();
                return false;
            }
            //manage crops    
            case "m":{
                manageCrops();
                return false;
            }
            //proceed to next year      
            case "l":{
                liveYear();
                return false;
            }
            //save the game    
            case "s":{
                
                return false;
            }
            //reports menu
            case "r": {
               reportsMenu();
               return false;
            }
            //proceed to buy and sell menu     
            case "b":{
                buyAndSellLand();
                return false;
            }
            //quit out of game    
            case "q":
                return true;
            //unknown menu item choice
            default:{
                System.out.println("Unknown Menu Choice Please Try Again");
                return false;
            }
            
        }
    }

    private void manageCrops() {
        ManageCropsView manageCropsView = new ManageCropsView();
        manageCropsView.display();
    }

    private void viewMapAndMove() {
        MapView mapView = new MapView();
        mapView.display();
    }

    private void liveYear() {
        LiveTheYearView liveTheYearView = new LiveTheYearView();
        liveTheYearView.display();
    }

    private void reportsMenu() {
        ReportsView reportsView = new ReportsView();
        reportsView.display();
    }

    private void buyAndSellLand() {
        LandView landView = new LandView();
        landView.display();
    }

    
}
