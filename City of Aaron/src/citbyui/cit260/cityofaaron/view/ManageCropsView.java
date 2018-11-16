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
public class ManageCropsView extends View {

    public ManageCropsView() {
    }
    
    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        
        //build prompt message
        String promptMessage = 
                "\n*************************************\n" + 
               "* CITY OF AARON : Manage Crops Menu *\n" +
               "*************************************\n" +
               " B - Buy Land\n" +
               " S - Sell Land\n" +
               " F - Feed The People\n" + 
               " P - Plant Crops\n" +
               " T - Tithing & Offerings\n" + 
               " R - Return To Game Menu\n";
        
        inputs[0] = getInput(promptMessage);
        
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String choice = inputs[0];
        
        switch (choice.toLowerCase()) {
            //buy land
            case "b":{
                buyLand();
                return false;
            }
            //sell land   
            case "s":{
                sellLand();
                return false;
            }
            //feed the people for the year     
            case "f":{
                feedThePeople();
                return false;
            }
            //plant crops   
            case "p":{
                plantCrops();
                return false;
            }
            //give to tithing
            case "t": {
               tithingAndOfferings();
               return false;
            }
            //return to the game menu   
            case "r":
                return true;
            //unknown menu item choice
            default:{
                System.out.println("Unknown Menu Choice Please Try Again");
                return false;
            }
            
        }
    }

    private void buyLand() {
        BuyLandView buyLandView = new BuyLandView();
        buyLandView.displayBuyLandView();
    }

    private void sellLand() {
        SellLandView sellLandView = new SellLandView();
        sellLandView.displaySellLandView();
    }

    private void feedThePeople() {
        FeedThePeopleView feedThePeopleView = new FeedThePeopleView();
        feedThePeopleView.displayFeedThePeopleView();
    }

    private void plantCrops() {
        PlantCropsView plantCropsView = new PlantCropsView();
        plantCropsView.display();
    }

    private void tithingAndOfferings() {
        TithingAndOfferingView tithingAndOfferingView = new TithingAndOfferingView();
        tithingAndOfferingView.display();
    }

       
}
