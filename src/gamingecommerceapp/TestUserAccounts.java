/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamingecommerceapp;

/**
 *
 * @author mabookair
 */
public class TestUserAccounts {
    
    public static void main(String[] args) {
        
        UserAccounts tempUser = new UserAccounts("Jackmn1472", "Jack", "McNally", "Belfast Lane", "BT119RS", "password");
        
        System.out.println("*********** New User Created ************" );
        System.out.println("Username: " + tempUser.getUsername());
        System.out.println("Firstname: " + tempUser.getUserFirstname());
        System.out.println("Surname: " + tempUser.getUserSurname());
        System.out.println("Address: " + tempUser.getUserAddress());
        System.out.println("Postcode: " + tempUser.getUserPostcode());
        
 
        
    }
    
    
    
}
