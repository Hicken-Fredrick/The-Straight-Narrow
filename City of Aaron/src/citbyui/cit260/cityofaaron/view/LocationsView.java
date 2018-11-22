/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

import CityOfAaronSN.CityOfAaronSN;
import citbyui.cit260.cityofaaron.control.MapControl;
import citbyui.cit260.cityofaaron.model.Game;
import citbyui.cit260.cityofaaron.model.Location;
import citbyui.cit260.cityofaaron.model.Map;

/**
 *
 * @author Meroko
 */
class LocationsView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        
        //build prompt message
        String promptMessage = buildMapString() +
                ("\n"
     + "\n------------------------------------------"
     + "\n Enter your desired location "
     + "\n------------------------------------------");;
        
        inputs[0] = getInput(promptMessage);
        
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        //setup variables needed
        String mapOption = inputs[0];
        mapOption = mapOption.toUpperCase();
        //pull down map and locations list
        Map map = CityOfAaronSN.getCurrentGame().getTheMap();// retreive the map from game
        Location[][] locations = CityOfAaronSN.getCurrentGame().getTheMap().getLocations(); // retreive the locations from map
        
        for (int row = 0; row < locations.length; row++) {
            for (int column = 0; column < locations[row].length; column++) {
                //if (locations[row][column].getScene() != null) {   REINSTATE LATER            
                    if (mapOption.equals(locations[row][column].getMapSymbol())) {
                         MapControl.movePlayer(map, row, column);
                         return true;
                    }
                //}
            }
        }
        System.out.println("\n*** Invalid selection *** Try Again later");
        return false;   
}

    private String buildMapString() {
        String mapString = new String();
        
        String leftIndicator;
  String rightIndicator;
  Game game = CityOfAaronSN.getCurrentGame(); // retreive the game
  Map map = game.getTheMap(); // retreive the map from game
  Location[][] locations = map.getLocations(); // retreive the locations from map
    // Build the heading of the map
    System.out.print("  |");
    for( int column = 0; column < locations[0].length; column++){
      // print col numbers to side of map
      System.out.print("  " + column + " |"); 
    }
    // Now build the map.  For each row, show the column information
    System.out.println();
    for( int row = 0; row < locations.length; row++){
     System.out.print(row + " "); // print row numbers to side of map
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
       System.out.print("|"); // start map with a |
       /* if(locations[row][column].getScene() == null)
        {
             // No scene assigned here so use ?? for the symbol
             System.out.print(leftIndicator + "??" + rightIndicator);
        } 
        else */ // !!!!!!REINSTATE CODE WITH SCENE CREATION!!!!!
          System.out.print(leftIndicator
             + locations[row][column].getMapSymbol()
             + rightIndicator);
      }
     System.out.println("|");
    }
        
        return mapString;
    }
    
}
