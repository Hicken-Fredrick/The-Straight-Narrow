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
        scene.setName("Village");
        scene.setDescription("Your Have come to the Village outside the City of Aarron");
        //make item
        item = new InventoryItem();
        item.setDescription("a beautifully silver hammer");
        item.setItemType(ItemType.Tool);
        item.setName("Silver Hammer");
        item.setQuantity(1);
        item.setPerishable(false);
        item.setValue(100);
        //add item
        scene.setItem(item);
        //make question
        question = new Question("You See a man who is about to fall off a lader", 
                "Tell someone to help him", 
                "Let him fall because you don't think you could get there on time",
                "get the gaurds involved", 
                "Ran as fast as you can to help him",
                4);
        //add question
        scene.setQuestion(question);
        //add to scene list
        sceneList[1] = scene;
        
        //generate scene 3
        scene = new Scene();
        //add params
        scene.setName("Local River");
        scene.setDescription("Right next to the mountain side you have come to the Local River");
        //make item
        item = new InventoryItem();
        item.setDescription("a big Cow");
        item.setItemType(ItemType.Animal);
        item.setName("Big Betty");
        item.setQuantity(1);
        item.setPerishable(false);
        item.setValue(80);
        //add item
        scene.setItem(item);
        //make question
        question = new Question("You see a Family cleaning there clothes in the water", 
                "Say good moring", 
                "Wave to them",
                "Help them clean there clothes", 
                "Go up stream and get some water",
                3);
        //add question
        scene.setQuestion(question);
        //add to scene list
        sceneList[2] = scene;
        
        //generate scene 4
        scene = new Scene();
        //add params
        scene.setName("Local River");
        scene.setDescription("Right next to the mountain side you have come to the Local River");
        //make item
        item = new InventoryItem();
        item.setDescription("a big Cow");
        item.setItemType(ItemType.Animal);
        item.setName("Big Betty");
        item.setQuantity(1);
        item.setPerishable(false);
        item.setValue(80);
        //add item
        scene.setItem(item);
        //make question
        question = new Question("You see a Family cleaning there clothes in the water", 
                "Say good moring", 
                "Wave to them",
                "Help them clean there clothes", 
                "Go up stream and get some water",
                3);
        //add question
        scene.setQuestion(question);
        //add to scene list
        sceneList[3] = scene;
        
        //generate scene 5
        scene = new Scene();
        //add params
        scene.setName("Local River");
        scene.setDescription("Right next to the mountain side you have come to the Local River");
        //make item
        item = new InventoryItem();
        item.setDescription("a big Cow");
        item.setItemType(ItemType.Animal);
        item.setName("Big Betty");
        item.setQuantity(1);
        item.setPerishable(false);
        item.setValue(80);
        //add item
        scene.setItem(item);
        //make question
        question = new Question("You see a Family cleaning there clothes in the water", 
                "Say good moring", 
                "Wave to them",
                "Help them clean there clothes", 
                "Go up stream and get some water",
                3);
        //add question
        scene.setQuestion(question);
        //add to scene list
        sceneList[4] = scene;
        
        //generate scene 6
        scene = new Scene();
        //add params
        scene.setName("Local River");
        scene.setDescription("Right next to the mountain side you have come to the Local River");
        //make item
        item = new InventoryItem();
        item.setDescription("a big Cow");
        item.setItemType(ItemType.Animal);
        item.setName("Big Betty");
        item.setQuantity(1);
        item.setPerishable(false);
        item.setValue(80);
        //add item
        scene.setItem(item);
        //make question
        question = new Question("You see a Family cleaning there clothes in the water", 
                "Say good moring", 
                "Wave to them",
                "Help them clean there clothes", 
                "Go up stream and get some water",
                3);
        //add question
        scene.setQuestion(question);
        //add to scene list
        sceneList[5] = scene;
        
        //generate scene 7
        scene = new Scene();
        //add params
        scene.setName("Local River");
        scene.setDescription("Right next to the mountain side you have come to the Local River");
        //make item
        item = new InventoryItem();
        item.setDescription("a big Cow");
        item.setItemType(ItemType.Animal);
        item.setName("Big Betty");
        item.setQuantity(1);
        item.setPerishable(false);
        item.setValue(80);
        //add item
        scene.setItem(item);
        //make question
        question = new Question("You see a Family cleaning there clothes in the water", 
                "Say good moring", 
                "Wave to them",
                "Help them clean there clothes", 
                "Go up stream and get some water",
                3);
        //add question
        scene.setQuestion(question);
        //add to scene list
        sceneList[6] = scene;
        
        //generate scene 8
        scene = new Scene();
        //add params
        scene.setName("Local River");
        scene.setDescription("Right next to the mountain side you have come to the Local River");
        //make item
        item = new InventoryItem();
        item.setDescription("a big Cow");
        item.setItemType(ItemType.Animal);
        item.setName("Big Betty");
        item.setQuantity(1);
        item.setPerishable(false);
        item.setValue(80);
        //add item
        scene.setItem(item);
        //make question
        question = new Question("You see a Family cleaning there clothes in the water", 
                "Say good moring", 
                "Wave to them",
                "Help them clean there clothes", 
                "Go up stream and get some water",
                3);
        //add question
        scene.setQuestion(question);
        //add to scene list
        sceneList[7] = scene;
        
        //generate scene 9
        scene = new Scene();
        //add params
        scene.setName("Local River");
        scene.setDescription("Right next to the mountain side you have come to the Local River");
        //make item
        item = new InventoryItem();
        item.setDescription("a big Cow");
        item.setItemType(ItemType.Animal);
        item.setName("Big Betty");
        item.setQuantity(1);
        item.setPerishable(false);
        item.setValue(80);
        //add item
        scene.setItem(item);
        //make question
        question = new Question("You see a Family cleaning there clothes in the water", 
                "Say good moring", 
                "Wave to them",
                "Help them clean there clothes", 
                "Go up stream and get some water",
                3);
        //add question
        scene.setQuestion(question);
        //add to scene list
        sceneList[8] = scene;
        
        //generate scene 10
        scene = new Scene();
        //add params
        scene.setName("Local River");
        scene.setDescription("Right next to the mountain side you have come to the Local River");
        //make item
        item = new InventoryItem();
        item.setDescription("a big Cow");
        item.setItemType(ItemType.Animal);
        item.setName("Big Betty");
        item.setQuantity(1);
        item.setPerishable(false);
        item.setValue(80);
        //add item
        scene.setItem(item);
        //make question
        question = new Question("You see a Family cleaning there clothes in the water", 
                "Say good moring", 
                "Wave to them",
                "Help them clean there clothes", 
                "Go up stream and get some water",
                3);
        //add question
        scene.setQuestion(question);
        //add to scene list
        sceneList[9] = scene;
        
        //generate scene 11
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
        sceneList[10] = scene;
        
        //generate scene 12
        scene = new Scene();
        //add params
        scene.setName("Village");
        scene.setDescription("Your Have come to the Village outside the City of Arron");
        //make item
        item = new InventoryItem();
        item.setDescription("a beautifully silver hammer");
        item.setItemType(ItemType.Tool);
        item.setName("Silver Hammer");
        item.setQuantity(1);
        item.setPerishable(false);
        item.setValue(100);
        //add item
        scene.setItem(item);
        //make question
        question = new Question("You See a man who is about to fall off a lader", 
                "Tell someone to help him", 
                "Let him fall because you don't think you could get there on time",
                "get the gaurds involved", 
                "Ran as fast as you can to help him",
                4);
        //add question
        scene.setQuestion(question);
        //add to scene list
        sceneList[11] = scene;
        
        //generate scene 13
        scene = new Scene();
        //add params
        scene.setName("Local River");
        scene.setDescription("Right next to the mountain side you have come to the Local River");
        //make item
        item = new InventoryItem();
        item.setDescription("a big Cow");
        item.setItemType(ItemType.Animal);
        item.setName("Big Betty");
        item.setQuantity(1);
        item.setPerishable(false);
        item.setValue(80);
        //add item
        scene.setItem(item);
        //make question
        question = new Question("You see a Family cleaning there clothes in the water", 
                "Say good moring", 
                "Wave to them",
                "Help them clean there clothes", 
                "Go up stream and get some water",
                3);
        //add question
        scene.setQuestion(question);
        //add to scene list
        sceneList[12] = scene;
        
        //generate scene 14
        scene = new Scene();
        //add params
        scene.setName("Local River");
        scene.setDescription("Right next to the mountain side you have come to the Local River");
        //make item
        item = new InventoryItem();
        item.setDescription("a big Cow");
        item.setItemType(ItemType.Animal);
        item.setName("Big Betty");
        item.setQuantity(1);
        item.setPerishable(false);
        item.setValue(80);
        //add item
        scene.setItem(item);
        //make question
        question = new Question("You see a Family cleaning there clothes in the water", 
                "Say good moring", 
                "Wave to them",
                "Help them clean there clothes", 
                "Go up stream and get some water",
                3);
        //add question
        scene.setQuestion(question);
        //add to scene list
        sceneList[13] = scene;
        
        //generate scene 15
        scene = new Scene();
        //add params
        scene.setName("Local River");
        scene.setDescription("Right next to the mountain side you have come to the Local River");
        //make item
        item = new InventoryItem();
        item.setDescription("a big Cow");
        item.setItemType(ItemType.Animal);
        item.setName("Big Betty");
        item.setQuantity(1);
        item.setPerishable(false);
        item.setValue(80);
        //add item
        scene.setItem(item);
        //make question
        question = new Question("You see a Family cleaning there clothes in the water", 
                "Say good moring", 
                "Wave to them",
                "Help them clean there clothes", 
                "Go up stream and get some water",
                3);
        //add question
        scene.setQuestion(question);
        //add to scene list
        sceneList[14] = scene;
        
        //generate scene 16
        scene = new Scene();
        //add params
        scene.setName("Local River");
        scene.setDescription("Right next to the mountain side you have come to the Local River");
        //make item
        item = new InventoryItem();
        item.setDescription("a big Cow");
        item.setItemType(ItemType.Animal);
        item.setName("Big Betty");
        item.setQuantity(1);
        item.setPerishable(false);
        item.setValue(80);
        //add item
        scene.setItem(item);
        //make question
        question = new Question("You see a Family cleaning there clothes in the water", 
                "Say good moring", 
                "Wave to them",
                "Help them clean there clothes", 
                "Go up stream and get some water",
                3);
        //add question
        scene.setQuestion(question);
        //add to scene list
        sceneList[15] = scene;
        
        //generate scene 17
        scene = new Scene();
        //add params
        scene.setName("Local River");
        scene.setDescription("Right next to the mountain side you have come to the Local River");
        //make item
        item = new InventoryItem();
        item.setDescription("a big Cow");
        item.setItemType(ItemType.Animal);
        item.setName("Big Betty");
        item.setQuantity(1);
        item.setPerishable(false);
        item.setValue(80);
        //add item
        scene.setItem(item);
        //make question
        question = new Question("You see a Family cleaning there clothes in the water", 
                "Say good moring", 
                "Wave to them",
                "Help them clean there clothes", 
                "Go up stream and get some water",
                3);
        //add question
        scene.setQuestion(question);
        //add to scene list
        sceneList[16] = scene;
        
        //generate scene 18
        scene = new Scene();
        //add params
        scene.setName("Local River");
        scene.setDescription("Right next to the mountain side you have come to the Local River");
        //make item
        item = new InventoryItem();
        item.setDescription("a big Cow");
        item.setItemType(ItemType.Animal);
        item.setName("Big Betty");
        item.setQuantity(1);
        item.setPerishable(false);
        item.setValue(80);
        //add item
        scene.setItem(item);
        //make question
        question = new Question("You see a Family cleaning there clothes in the water", 
                "Say good moring", 
                "Wave to them",
                "Help them clean there clothes", 
                "Go up stream and get some water",
                3);
        //add question
        scene.setQuestion(question);
        //add to scene list
        sceneList[17] = scene;
        
        //generate scene 19
        scene = new Scene();
        //add params
        scene.setName("Local River");
        scene.setDescription("Right next to the mountain side you have come to the Local River");
        //make item
        item = new InventoryItem();
        item.setDescription("a big Cow");
        item.setItemType(ItemType.Animal);
        item.setName("Big Betty");
        item.setQuantity(1);
        item.setPerishable(false);
        item.setValue(80);
        //add item
        scene.setItem(item);
        //make question
        question = new Question("You see a Family cleaning there clothes in the water", 
                "Say good moring", 
                "Wave to them",
                "Help them clean there clothes", 
                "Go up stream and get some water",
                3);
        //add question
        scene.setQuestion(question);
        //add to scene list
        sceneList[18] = scene;
        
        //generate scene 20
        scene = new Scene();
        //add params
        scene.setName("Local River");
        scene.setDescription("Right next to the mountain side you have come to the Local River");
        //make item
        item = new InventoryItem();
        item.setDescription("a big Cow");
        item.setItemType(ItemType.Animal);
        item.setName("Big Betty");
        item.setQuantity(1);
        item.setPerishable(false);
        item.setValue(80);
        //add item
        scene.setItem(item);
        //make question
        question = new Question("You see a Family cleaning there clothes in the water", 
                "Say good moring", 
                "Wave to them",
                "Help them clean there clothes", 
                "Go up stream and get some water",
                3);
        //add question
        scene.setQuestion(question);
        //add to scene list
        sceneList[19] = scene;
        
        //generate scene 21
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
        sceneList[20] = scene;
        
        //generate scene 21
        scene = new Scene();
        //add params
        scene.setName("Village");
        scene.setDescription("Your Have come to the Village outside the City of Arron");
        //make item
        item = new InventoryItem();
        item.setDescription("a beautifully silver hammer");
        item.setItemType(ItemType.Tool);
        item.setName("Silver Hammer");
        item.setQuantity(1);
        item.setPerishable(false);
        item.setValue(100);
        //add item
        scene.setItem(item);
        //make question
        question = new Question("You See a man who is about to fall off a lader", 
                "Tell someone to help him", 
                "Let him fall because you don't think you could get there on time",
                "get the gaurds involved", 
                "Ran as fast as you can to help him",
                4);
        //add question
        scene.setQuestion(question);
        //add to scene list
        sceneList[21] = scene;
        
        //generate scene 23
        scene = new Scene();
        //add params
        scene.setName("Local River");
        scene.setDescription("Right next to the mountain side you have come to the Local River");
        //make item
        item = new InventoryItem();
        item.setDescription("a big Cow");
        item.setItemType(ItemType.Animal);
        item.setName("Big Betty");
        item.setQuantity(1);
        item.setPerishable(false);
        item.setValue(80);
        //add item
        scene.setItem(item);
        //make question
        question = new Question("You see a Family cleaning there clothes in the water", 
                "Say good moring", 
                "Wave to them",
                "Help them clean there clothes", 
                "Go up stream and get some water",
                3);
        //add question
        scene.setQuestion(question);
        //add to scene list
        sceneList[22] = scene;
        
        //generate scene 24
        scene = new Scene();
        //add params
        scene.setName("Local River");
        scene.setDescription("Right next to the mountain side you have come to the Local River");
        //make item
        item = new InventoryItem();
        item.setDescription("a big Cow");
        item.setItemType(ItemType.Animal);
        item.setName("Big Betty");
        item.setQuantity(1);
        item.setPerishable(false);
        item.setValue(80);
        //add item
        scene.setItem(item);
        //make question
        question = new Question("You see a Family cleaning there clothes in the water", 
                "Say good moring", 
                "Wave to them",
                "Help them clean there clothes", 
                "Go up stream and get some water",
                3);
        //add question
        scene.setQuestion(question);
        //add to scene list
        sceneList[23] = scene;
        
        //generate scene 25
        scene = new Scene();
        //add params
        scene.setName("Local River");
        scene.setDescription("Right next to the mountain side you have come to the Local River");
        //make item
        item = new InventoryItem();
        item.setDescription("a big Cow");
        item.setItemType(ItemType.Animal);
        item.setName("Big Betty");
        item.setQuantity(1);
        item.setPerishable(false);
        item.setValue(80);
        //add item
        scene.setItem(item);
        //make question
        question = new Question("You see a Family cleaning there clothes in the water", 
                "Say good moring", 
                "Wave to them",
                "Help them clean there clothes", 
                "Go up stream and get some water",
                3);
        //add question
        scene.setQuestion(question);
        //add to scene list
        sceneList[24] = scene;
        
        
        return sceneList;
    }
    
}
