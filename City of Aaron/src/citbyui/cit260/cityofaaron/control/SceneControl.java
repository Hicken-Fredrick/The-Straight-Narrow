/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.control;

import citbyui.cit260.cityofaaron.model.InventoryItem;
import citbyui.cit260.cityofaaron.model.ItemType;
import citbyui.cit260.cityofaaron.model.Question;
import citbyui.cit260.cityofaaron.model.Scene;

/**
 *
 * @author Meroko
 */
public class SceneControl {

    static Scene[] buildSceneList() {
        Scene [] sceneList = new Scene[25];
        
        //generate scene 1
        Scene scene = new Scene();
        //add params
        scene.setName("Ruler's Court");
        scene.setDescription("Beautiful marble pillers line the walls leading to a great throne");
        //make item
        InventoryItem item = new InventoryItem();
        item.setDescription("a beautifully gilded hammer");
        item.setItemType(ItemType.Tool);
        item.setName("Golden Hammer");
        item.setQuantity(1);
        item.setPerishable(false);
        item.setValue(150);
        //add item
        scene.setItem(item);
        //make question
        Question question = new Question("You See a Group Of Men Bickering Over A Money Table", 
                "Approce them and help", 
                "Attack them with your fist to drive them out",
                "get the gaurds involved", 
                "Throw Rocks at Them",
                1);
        //add question
        scene.setQuestion(question);
        //add to scene list
        sceneList[0] = scene;
        
        //generate scene 2
        scene = new Scene();
        //add params
        scene.setName("Ruler's Court");
        scene.setDescription("Beautiful marble pillers line the walls leading to a great throne");
        //make item
        item = new InventoryItem();
        item.setDescription("a beautifully gilded hammer");
        item.setItemType(ItemType.Tool);
        item.setName("Golden Hammer");
        item.setQuantity(1);
        item.setPerishable(false);
        item.setValue(150);
        //add item
        scene.setItem(item);
        //make question
        question = new Question("You See a Group Of Men Bickering Over A Money Table", 
                "Approce them and help", 
                "Attack them with your fist to drive them out",
                "get the gaurds involved", 
                "Throw Rocks at Them",
                1);
        //add question
        scene.setQuestion(question);
        //add to scene list
        sceneList[1] = scene;
        
        return sceneList;
    }
    
}
