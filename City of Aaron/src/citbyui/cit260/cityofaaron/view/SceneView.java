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
class SceneView extends View {

    @Override
    public String[] getInputs() {
       String[] inputs = new String[1];
        
        //build prompt message
        String promptMessage = 
               "THIS MENU ISN'T IMPLEMENTED YET - any value to return";
        
        inputs[0] = getInput(promptMessage);
        
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        return true;
    }
    
}
