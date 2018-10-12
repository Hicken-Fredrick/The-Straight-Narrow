/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CityOfAaronSN;
import java.util.Scanner;

//Imports
import citbyui.cit260.cityofaaron.model.*;

/**
 *
 * @author Meroko
 */
public class CityOfAaronSN {

    /**
     * @param args the command line arguments
     */
    public static Scanner scanner = new Scanner( System.in );
    
    public static void testTeamClasses() {
        
        Player player = new Player();
        
        System.out.println("Enter a name: ");
        player.setName(scanner.nextLine());
        
        System.out.println("\n" + player.getName());
    }
    
    public static void testFredClasses() {
        
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
    }
            
    public static void testEdgarClasses() {
        
    }
            
    public static void testTaylorClasses() {
        
    }
    
    public static void main(String[] args) {
        //testTeamClasses();
        //testFredClasses();
        //testEdgarClasses();
        //testTaylorClasses();
    }
    
}
