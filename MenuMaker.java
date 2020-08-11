/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menumaker;

/**
 *
 * @author leandroestevez
 */
public class MenuMaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Menu menu = new Menu();
        
        String[] options = {"Buy", "Refund", "Deposit", "LOL"};
        
//        menu.addOption("Buy");
//        
//        menu.addOption("Refund");
//        
//        menu.addOption("Deposit");
//        
//        menu.addOption("LOL");

        menu.addArrOptions(options);
        
        menu.deleteOption();
        menu.deleteOption();
        menu.deleteOption();
        menu.deleteOption();
        menu.deleteOption();

        menu.addOption("Jesus", 0);
        
        menu.displayMenu();
        
    }
    
}
