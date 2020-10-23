/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamingecommerceapp;

/**
 * @version 1.0
 * @author Jack McNally
 * This class will get the name of the product and the price when a user clicks
 * the "add to basket button" and add this to the users basket. The price will 
 * also be added to the total variable on the "AppData" class and to calculate
 * the total of the items in the users basket.
 */
public class BasketItems {
    
    public String itemName;
    public double itemPrice;
    
    /**
     * This will be the method to get the items names and price and store it
     * as in the parameters of the method. A new use of this method will be 
     * on the "AppData" class to create the object array for the users basket.
     * @param itemName
     * @param itemPrice 
     */
    public BasketItems(String itemName,  double itemPrice)
    {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }
    
    
    /**
     * This method will get the items name when the user clicks the "add to basket"
     * button.
     * @return itemName 
     */
    public String getItemName()
    {
        return itemName;
    }
    
    /**
     * This method will set the item name in the BasketItems method parameters to
     * the name of the item the use has added to their basket and store it in the
     * basket array on the "AppData" class.
     * @param itemName 
     */
    public void setItemName(String itemName)
    {
        this.itemName=itemName;
    }
     
   /**
    * This method will get the items price when the user clicks the "add to basket"
    * button.
    * @return itemPrice 
    */

    public double getItemPrice()
    {
        return itemPrice;
    }
    
    /**
     * This method will set the items price in the BasketItems method parameters to
     * the name of the item the use has added to their basket and store it in the
     * basket array on the "AppData" class.
     * @param itemPrice 
     */
    
    public void setItemPrice(double itemPrice)
    {
        this.itemPrice=itemPrice;
    }
    

    
}//end of basket items class
