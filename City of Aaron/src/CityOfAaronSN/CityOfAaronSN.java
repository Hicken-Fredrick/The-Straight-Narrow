/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CityOfAaronSN;
import java.util.Scanner;

//Imports
import citbyui.cit260.cityofaaron.model.*;
import citbyui.cit260.cityofaaron.control.*;
import citbyui.cit260.cityofaaron.view.*;

/**
 *
 * @author Group
 */
public class CityOfAaronSN {
    /**
     * @param args the command line arguments
     */
    public static Scanner scanner = new Scanner( System.in );
    
    //statics for game / player
    private static Game currentGame= null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        CityOfAaronSN.currentGame = currentGame;
    }

    public static Player getThePlayer() {
        return player;
    }

    public static void setThePlayer(Player player) {
        CityOfAaronSN.player = player;
    }
    
    
    public static void testTeamClasses() {
        /*
        Player player = new Player();
        
        System.out.println("Enter a name: ");
        player.setName(scanner.nextLine());
        
        System.out.println("\n" + player.getName());
        */
        
    }
    
    private static void testTecmClassesView() {
        //program creation
        StartProgramView startProgram = new StartProgramView();
        startProgram.display();
    }
    
    public static void testFredClasses() {
        //InventoryItem Test case
        InventoryItem item = new InventoryItem();
       
        System.out.println("Enter the item name: ");
        item.setName(scanner.nextLine());
        
        System.out.println("Enter the item Quantity: ");
        item.setQuantity(scanner.nextInt());
        
        System.out.println("Enter the item Age: ");
        item.setAge(scanner.nextInt());
        
        System.out.println("Enter if item is perishable: ");
        item.setPerishable(scanner.nextBoolean());
        
        System.out.println("\n" + item.getName());
        System.out.println(item.getItemType());
        System.out.println(item.getCondition());
        System.out.println(item.getQuantity());
        System.out.println(item.getAge());
        System.out.println(item.isPerishable());
        
        /*
        InventoryItem item = new InventoryItem();
        item.setName("Shovel");
        item.setAge(1);
        item.setQuantity(1);
        item.setPerishable(false);
        item.setCondition(Condition.Good);
        item.setItemType(ItemType.Tool);
        
        System.out.println(item.toString());
        */
        
        //Question Test case
        Question question = new Question();
        //setting
        question.setQuestionText("What is the first line in the book of mormon?" + "\n");
        question.setAnswerOne("1. I, Nephi, having been born of goodly parents");
        question.setAnswerTwo("2. My father dwelt in a tent");
        question.setAnswerThree("3. And as he entered the city he was an hungered");
        question.setAnswerFour("4. For with what judgment ye judge, ye shall be judged.");
        //calling
        System.out.println(question.getQuestionText());
        System.out.println(question.getAnswerOne());
        System.out.println(question.getAnswerTwo());
        System.out.println(question.getAnswerThree());
        System.out.println(question.getAnswerFour());
        //answering & replying
        System.out.println("Answer: ");
        if(scanner.nextInt() == 1)
            System.out.println("Correct");
        else
            System.out.println("Incorrect");
    }
            
    public static void testEdgarClasses() {
        Author author = new Author();
        System.out.println("Enter the item name: ");
        author.setAuthor(scanner.nextLine());
        System.out.println("\n" + author.getAuthor());
        
        Scoreboard scoreboard;
        scoreboard = new Scoreboard();
        System.out.println("Enter the score: ");
        scoreboard.setScore(scanner.nextDouble());
        System.out.println("\n" + scoreboard + scoreboard.getScore());
    }
            
    public static void testTaylorClasses() {
        
    }
    
    public static void main(String[] args) {
        //testTeamClasses();
        testTecmClassesView();
        
        //testFredClasses();
        //testEdgarClasses();
        //testTaylorClasses();
    }

    
}
