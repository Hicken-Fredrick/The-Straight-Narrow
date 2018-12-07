/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.cityofaaron.view;

/**
 *
 * @author Assigment Week 9
 */
public class ManageLandView extends View {
    public ManageLandView() {
}
 
@Override
public String[] getInputs() {
    String[] inputs = new String[1];
    
    
//build prompt message
        String promptMessage = 
                "\n*************************************\n" + 
               "* CITY OF AARON : LAND MENU *\n" +
               "*************************************\n" +
               " V - View current land\n" +
               " B - Buy Land\n" +
               " S - Sell Land\n" + 
               " Q - Return To Game\n";
        
        inputs[0] = getInput(promptMessage);
        
        return inputs;
    }

@Override
    public boolean doAction(String[] inputs) {
        String choice = inputs[0];
        
        switch (choice.toLowerCase()) {
            //acres owned
            case "v":{
                acreOwned();
                return false;
            }
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
           //return to the game menu   
            case "q":
                return true;
            //unknown menu item choice
            default:{
                ErrorView.display(this.getClass().getName(),
                        "Unknown Menu Choice Please Try Again");
                return false;
            }
            
        }
    }
    private void acreOwned() {
        AcreOwnedView acreOwnedView = new AcreOwnedView();
        acreOwnedView.displayAcreOwned();
    }
    
    private void buyLand() {
        BuyLandView buyLandView = new BuyLandView();
        buyLandView.display();
    }

    private void sellLand() {
        SellLandView sellLandView = new SellLandView();
        sellLandView.display();
    }

    private static class AcreOwnedView {

        public AcreOwnedView() {
        }

        private void displayAcreOwned() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
