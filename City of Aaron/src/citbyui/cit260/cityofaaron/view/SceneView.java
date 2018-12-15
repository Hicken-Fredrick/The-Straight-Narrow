/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

import CityOfAaronSN.CityOfAaronSN;
import citbyui.cit260.cityofaaron.control.SceneControl;
import citbyui.cit260.cityofaaron.model.Question;
import citbyui.cit260.cityofaaron.model.Scene;

/**
 *
 * @author Meroko
 */
class SceneView extends View {
       
       Scene scene = CityOfAaronSN.getCurrentGame().getTheMap().getCurrentLocation().getScene();
       Question question = scene.getQuestion();
       
    @Override
    public String[] getInputs() {
       String[] inputs = new String[1];
       String promptMessage = null;
        
       if (scene.isSceneComplete()){
            promptMessage = "It looks as if nothing of note is happening (enter any value to return)";
            
            inputs[0] = getInput(promptMessage);
            
            return inputs;
       }
       
        //build prompt message
       else {
        promptMessage = scene.getName() + "\n" +
                scene.getDescription() + "\n" +
                question.getQuestionText() + "\n" +
                "1." + question.getAnswerOne() + "\n" +
                "2." + question.getAnswerTwo() + "\n" +
                "3." + question.getAnswerThree() + "\n" +
                "4." + question.getAnswerFour() + "\n";
        
        inputs[0] = getInput(promptMessage);
        
        return inputs;
       }
    }

    @Override
    public boolean doAction(String[] inputs) {
        int choice = 0;
        if (scene.isSceneComplete()){
            return true;
        }
                
        try {
            choice = Integer.parseInt(inputs[0]);
        } catch (NumberFormatException e){ 
            ErrorView.display(this.getClass().getName(),"Please Enter Only Numbers");
            return false;
        }
        if(choice == question.getCorrectAnswer()) {
            SceneControl.giveItem(scene);
            this.console.println("Congratulations you have earned " + scene.getItem().getName() + "\n");
            scene.setSceneComplete(true);
            return true;
        }
        else {
            this.console.println("You Have Failed This Trial\n");
            return true;
        }
            
    }
    
}
