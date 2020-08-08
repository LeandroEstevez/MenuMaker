/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menumaker;

import java.util.ArrayList;

/**
 * This class displays a Menu of your choice. 
 * You need to add the options that the menu will have.
 *
 * @author leandroestevez
 */
public class Menu {
    
    private ArrayList<String> options;
    private int optionCounter;
    
    /**
     * Default constructor that will give a default value to 4 options.
     */
    public Menu() {
        
        options = new ArrayList<>();
        
        options.add("1) Add an option");
        options.add("2) Add an option");
        options.add("3) Add an option");
        
        optionCounter = 0;
        
    }
    
    /**
     * Adds an option to the bottom of the menu.
     * @param option a string representing the option added to the menu.
     */
    public void addOption(String option) {
        
        if(optionCounter == 0) {
            
            options.clear();
            
        }
        
        options.add(option);
        
        optionCounter++;
        
    }
    
    /**
     * Adds an option to the bottom of the menu.
     * @param option a string representing the option added to the menu.
     * @param index position of the new option.
     */
//    public void addOption(String option, int index) {
//        
//        if(optionCounter == 0) {
//            
//            options.clear();
//            
//        }
//        
//        if(index != 1 && !options.isEmpty() && index > options.size()) {
//            
//        }
//        
//        options.add(index - 1, option);
//        
//        optionCounter++;
//        
//    }
    
    /**
     * Adds options to the menu.
     * @param optionsArr a string representing the option added to the menu.
     */
    public void addArrOptions(String[] optionsArr) {
        
        if(optionCounter == 0) {
            
            options.clear();
            
        }
        
        for (String optionsArr1 : optionsArr) {
            options.add(optionsArr1);
            optionCounter++;
        }
        
    }
    
    /**
     * Deletes an option of the menu.
     * @param index position of the option to be deleted
     */
    public void deleteOption(int index) {
        
        options.remove(index - 1);
        
        optionCounter--;
        
    }
    
    /**
     * Deletes last option added of the menu.
     */
    public void deleteOption() {
        
        options.remove(options.size() - 1);
        
        optionCounter--;
        
    }
    
    /**
     * Deletes all options of the menu.
     */
    public void clearMenu() {
        
        options.clear();
        
        options.add("1) Add an option");
        options.add("2) Add an option");
        options.add("3) Add an option");
        
        optionCounter = 0;
        
    }
    
    /**
     * Displays the menu with the present options.
     */
    public void displayMenu() {
        
        for(int i = 0; i < options.size(); i++) {
            
            System.out.println((i + 1) + ") " + options.get(i));
            
        }
        
    }
    
}
