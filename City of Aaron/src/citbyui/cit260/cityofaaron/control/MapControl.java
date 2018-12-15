/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.control;

import CityOfAaronSN.CityOfAaronSN;
import citbyui.cit260.cityofaaron.model.Game;
import citbyui.cit260.cityofaaron.model.Location;
import citbyui.cit260.cityofaaron.model.Map;
import citbyui.cit260.cityofaaron.model.Point;
import citbyui.cit260.cityofaaron.model.Scene;

/**
 *
 * @author Meroko
 */
public class MapControl {

    public static void movePlayer(Map map, int row, int column) {
        map.setCurrentLocation(map.getLocations()[row][column]);
        map.getCurrentLocation().setVisited(true);
        map.setCurrentRow(row);
        map.setCurrentColumn(column);
    }
    
    public static Map createMap(Game game, int noOfRows, int noOfColumns) {
        if (game == null || noOfRows < 0 || noOfColumns < 0)
            return null;
        
        Map map = new Map();
        
        //adding info
        map.setRows(noOfRows);
        map.setColumns(noOfColumns);
        game.setTheMap(map);
        
        //create locations list
        Location [][] locations = createLocations(noOfRows, noOfColumns);
        if (locations == null)
            return null;
        
        map.setLocations(locations);
        
        
        /*hold for later
        *Locations[][] location = CityOfAaaronSN.getCurrentGmae().getMap().getLocations();
        */
        
        return map;
    }
    
    private static Location[][] createLocations(int noOfRows, int noOfColumns) {
        if (CityOfAaronSN.getCurrentGame() == null || noOfRows < 1 || noOfColumns < 1)
            return null;
        //get scene list
        Scene [] sceneList = SceneControl.buildSceneList();
        //create location storage
        Location [][] locations = new Location[noOfRows][noOfColumns];
        
        //create each location and store it
        //location 1
        Location location = new Location();
        //set point of location
        Point point = new Point();
        point.setRow(1);
        point.setColumn(1);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("The Ruler's Court");
        //set map symbol
        location.setMapSymbol("RC");
        //save location
        locations[0][0] = location;
        
        //location 2
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(1);
        point.setColumn(2);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Village");
        //set map symbol
        location.setMapSymbol("VI");
        //save location
        locations[0][1] = location;
        
        //location 3
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(1);
        point.setColumn(3);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Local River");
        //set map symbol
        location.setMapSymbol("LR");
        //save location
        locations[0][2] = location;
        
        //location 4
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(1);
        point.setColumn(4);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("The Temple");
        //set map symbol
        location.setMapSymbol("TS");
        //save location
        locations[0][3] = location;
        
        //location 5
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(1);
        point.setColumn(5);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("The Farms");
        //set map symbol
        location.setMapSymbol("FL");
        //save location
        locations[0][4] = location;
        
        //location 6
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(2);
        point.setColumn(1);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Border Lands");
        //set map symbol
        location.setMapSymbol("BL");
        //save location
        locations[1][0] = location;
        
        //location 7
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(2);
        point.setColumn(2);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Personal Room");
        //set map symbol
        location.setMapSymbol("PR");
        //save location
        locations[1][1] = location;
        
        //location 8
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(2);
        point.setColumn(3);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Westerfall");
        //set map symbol
        location.setMapSymbol("WF");
        //save location
        locations[1][2] = location;
        
        //location 9
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(2);
        point.setColumn(4);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Bywald");
        //set map symbol
        location.setMapSymbol("BW");
        //save location
        locations[1][3] = location;
        
        //location 10
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(2);
        point.setColumn(5);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Aldmarsh");
        //set map symbol
        location.setMapSymbol("AM");
        //save location
        locations[1][4] = location;
        
        //location 11
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(3);
        point.setColumn(1);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Morford");
        //set map symbol
        location.setMapSymbol("MF");
        //save location
        locations[2][0] = location;
        
        //location 12
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(3);
        point.setColumn(2);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Snowbeech");
        //set map symbol
        location.setMapSymbol("SW");
        //save location
        locations[2][1] = location;
        
        //location 13
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(3);
        point.setColumn(3);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Butterdell");
        //set map symbol
        location.setMapSymbol("BD");
        //save location
        locations[2][2] = location;
        
        //location 14
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(3);
        point.setColumn(4);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Sevokith");
        //set map symbol
        location.setMapSymbol("SK");
        //save location
        locations[2][3] = location;
        
        //location 15
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(3);
        point.setColumn(5);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Kingdom of Coir");
        //set map symbol
        location.setMapSymbol("KC");
        //save location
        locations[2][4] = location;
        
        //location 16
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(4);
        point.setColumn(1);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("West Border");
        //set map symbol
        location.setMapSymbol("WB");
        //save location
        locations[3][0] = location;
        
        //location 17
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(4);
        point.setColumn(2);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("East Border");
        //set map symbol
        location.setMapSymbol("EB");
        //save location
        locations[3][1] = location;
        
        //location 18
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(4);
        point.setColumn(3);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("North Border");
        //set map symbol
        location.setMapSymbol("NB");
        //save location
        locations[3][2] = location;
        
        //location 19
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(4);
        point.setColumn(4);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("South Border");
        //set map symbol
        location.setMapSymbol("SB");
        //save location
        locations[3][3] = location;
        
        //location 20
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(4);
        point.setColumn(5);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Captain's Office");
        //set map symbol
        location.setMapSymbol("CO");
        //save location
        locations[3][4] = location;
        
        //location 21
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(5);
        point.setColumn(1);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Judge's Office");
        //set map symbol
        location.setMapSymbol("JO");
        //save location
        locations[4][0] = location;
        
        //location 22
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(5);
        point.setColumn(2);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Advisor's Office");
        //set map symbol
        location.setMapSymbol("AO");
        //save location
        locations[4][1] = location;
        
        //location 23
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(5);
        point.setColumn(3);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Tool Store");
        //set map symbol
        location.setMapSymbol("TS");
        //save location
        locations[4][2] = location;
        
        //location 24
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(5);
        point.setColumn(4);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Animal Store");
        //set map symbol
        location.setMapSymbol("AS");
        //save location
        locations[4][3] = location;
        
        //location 25
        location = new Location();
        //set point of location
        point = new Point();
        point.setRow(5);
        point.setColumn(5);
        location.setPoint(point);
        //set visited
        location.setVisited(false);
        //set name
        location.setName("Medicine Store");
        //set map symbol
        location.setMapSymbol("MS");
        //save location
        locations[4][4] = location;
        
        return locations;
    }
}
