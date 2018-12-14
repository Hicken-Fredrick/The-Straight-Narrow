/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

import CityOfAaronSN.CityOfAaronSN;
import citbyui.cit260.cityofaaron.model.Game;
import citbyui.cit260.cityofaaron.model.Location;
import citbyui.cit260.cityofaaron.model.Map;

/**
 *
 * @author Meroko
 */
class MapView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        String map = buildMapString();
        
        //build prompt message
        String promptMessage = map +
               "\n*********************************\n" + 
               "*   CITY OF AARON : Map Menu   *\n" +
               "*********************************\n" +
               " V - Move to New Area\n" +
               " L - Look Around\n" +
               " R - Return to Game Menu\n";
        
        inputs[0] = getInput(promptMessage);
        
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String choice = inputs[0];
        
        switch (choice.toLowerCase()) {
            //move to a new area
            case "v":{
                locationsView();
                return false;
            }
            //triggers the scene and question
            case "l":{
                sceneView();
                return false;
            }
            //go back to game menu
            case "r":
                return true;
            //unknown menu item choice
            default:{
                ErrorView.display(this.getClass().getName(),
                        "Unknown Menu Choice Please Try Again");
                return false;
            }
            
        }
    }

    private void sceneView() {
        SceneView sceneView = new SceneView();
        sceneView.display();
    }

    private void locationsView() {
        LocationsView locationsView = new LocationsView();
        locationsView.display();
    }
    
    public String buildMapString() {
        String mapString = new String();
        
        String leftIndicator;
        String rightIndicator;
        Game game = CityOfAaronSN.getCurrentGame(); // retreive the game
        Map map = game.getTheMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map
        // Build the heading of the map
        this.console.print("  |");
        for( int column = 0; column < locations[0].length; column++){
            // print col numbers to side of map
            System.out.print("  " + column + " |");
        }
        // Now build the map.  For each row, show the column information
        this.console.println();
        for( int row = 0; row < locations.length; row++){
            this.console.print(row + " "); // print row numbers to side of map
            for( int column = 0; column < locations[row].length; column++){
                // set default indicators as blanks
                leftIndicator = " ";
                rightIndicator = " ";
                if(locations[row][column] == map.getCurrentLocation()){
                    // Set star indicators to show this is the current location.
                    leftIndicator = "*";
                    rightIndicator = "*";
                }
                else if(locations[row][column].isVisited()){
                    // Set < > indicators to show this location has been visited.
                    leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
                    rightIndicator = "<"; // same as above
                }
                this.console.print("|"); // start map with a |
                /* if(locations[row][column].getScene() == null)
                {
                // No scene assigned here so use ?? for the symbol
                System.out.print(leftIndicator + "??" + rightIndicator);
                }
                else */ // !!!!!!REINSTATE CODE WITH SCENE CREATION!!!!!
                this.console.print(leftIndicator
                        + locations[row][column].getMapSymbol()
                        + rightIndicator);
            }
            this.console.println("|");
        }
        
        return mapString;
    }

    private void killThePlayer() {
        Game game = CityOfAaronSN.getCurrentGame();
        game.getThePlayer().setAlive(false);
        
        this.console.println(game.getThePlayer().isAlive());
    }
    
}
