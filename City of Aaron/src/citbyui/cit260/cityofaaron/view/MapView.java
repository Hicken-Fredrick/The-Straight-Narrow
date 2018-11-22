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
class MapView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        
        //build prompt message
        String promptMessage = 
               "\n*********************************\n" + 
               "*   CITY OF AARON : Map Menu   *\n" +
               "*********************************\n" +
               " V - View Map & Move\n" +
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
                System.out.println("Unknown Menu Choice Please Try Again");
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
    
}
