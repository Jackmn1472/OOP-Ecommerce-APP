/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamingecommerceapp;

/**
 *
 * @author Jack McNally
 * @version 1.0, 13/04/2020
 * 
 */
public class AppData {
    
    // this class will be the library class for the application and hold global data
    //to be used throughout the project
    
    /**
     * @author Jack McNally 
     * @version 2.0
     * this is the array for storing the users accounts 
     */
    // array for accounts
    public static UserAccounts [] accounts = new UserAccounts[5];
  
   
   
    /**
     * @author Jack McNally
     * @version 2.0
     * This will be the global data to be used throughout the application
     * and will include things such as tracking the count of users and the total
     * of the items in the users basket
     */
    
    public static int count =0;
    
    public static int productcount =0; 
    
    public static String username, firstname, lastname, address, postcode, password;
    
    public static String currentUser = "";
    
    public static double total = 0;
    
    //frame screens 
    public static MakeNewAccount frNewUser = new MakeNewAccount();
    
    public static HomeScreen frHome;
    
    public static Basket frBasket = new Basket();
    
    
    /**
     * @author Jack McNally
     * @version 2.0
     * This will be the array to store the items on the users basket.
   */
   
    public static BasketItems [] products = new BasketItems[5];
    


}//class
