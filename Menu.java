/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menumaker;

/**
 * This class displays a Menu of your choice. 
 * You need to add the options that the menu will have.
 *
 * @author leandroestevez
 */
public class Menu {
    
    private String[] options = new String[4];
    private int optionCounter;
    
    /**
     * Default constructor that will give a default value to 4 options.
     */
    public Menu() {
        
        options[0] = "1) Add an option";
        options[1] = "2) Add an option";
        options[2] = "3) Add an option";
        options[3] = "4) Add an option";
        
        optionCounter = 0;
        
    }
    
    /**
     * Adds an option to the menu.
     * @param option a string representing the option added to the menu.
     */
    public void addOption(String option) {
        
        if(optionCounter == 0) {
            
            for(int i = 0; i < options.length; i++) {
            
                options[i] = "";
            
            }
            
        }
        
        optionCounter++;
        
        options[optionCounter - 1] = optionCounter + ") " + option;
        
    }
    
    /**
     * Displays the menu with the present options.
     */
    public void displayMenu() {
        
        for(int i = 0; i < options.length; i++) {
            
            System.out.println(options[i]);
            
        }
        
    }
    
}
