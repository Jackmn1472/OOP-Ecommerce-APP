/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamingecommerceapp;

/**
 *
 * @author Jack McNally
 * @version 1.0, 10/04/2020
 * This class is the class that will allow the user to create an new account 
 * on the app and the method create in this class will be used in the accounts
 * object array on the "AppData" class to add new users and keep a count of the users
 * created.
 */
public class UserAccounts {
    
    private String firstname, surname, address, postcode, username, password;
    
    /**
     * This method will be used to get the users information and store them in
     * the parameters of the method. This is the object method that will be used 
     * in the "AppData" class to create the accounts object array to store new
     * users and allow a maximum of 6 users to be created. 
     * @param username
     * @param firstname
     * @param surname
     * @param address
     * @param postcode
     * @param password 
     */
    
    public UserAccounts(String username, String firstname, String surname, String address, String postcode, String password)
    {
        this.username = username;
        this.firstname = firstname;
        this.surname = surname;
        this.address = address;
        this.postcode = postcode;
        this.password = password;
      
    }// end of UserAccounts
    
    
    
    /**
     * This method will get the users password when the user fills out the text
     * fields on the create an account screen of the application and click the 
     * create account button. This method will get the text the user entered
     * in the password field and store it in the password parameter of the new
     * account object array.
     * @return password
     * @author Jack McNally
     */
    public String getPassword()
    {
        return password;
    }// end of password getter
    
    
    
    
    /**
     * This method will set the users password in the UserAccounts method parameters 
     * to the password the user entered into the password field of the 
     * "MakeNewAccount" screen of the application. 
     * @param password 
     */
    public void setPassword(String password)
    {
        this.password = password;
    }// end of username setter
    
 
    
    /**
     * This method will get the users username when the user fills out the text
     * fields on the create an account screen of the application and click the 
     * create account button. This method will get the text the user entered
     * in the username field and store it in the username parameter of the new
     * account object array.
     * @return username
     */
    public String getUsername()
    {
        return username;
    }// end of username getter
    
    
    
    
    /**
     * This method will set the users username in the UserAccounts method parameters 
     * to the username the user entered into the username field of the 
     * "MakeNewAccount" screen of the application. 
     * @param username   
     */ 
    public void setUsername(String username)
    {
        this.username = username;
    }// end of username setter
    
    
    
     
    
    /**
     * This method will get the users first name when the user fills out the text
     * fields on the create an account screen of the application and click the 
     * create account button. This method will get the text the user entered
     * in the first name field and store it in the firstname parameter of the new
     * account object array.
     * @return firstname 
     */
    public String getUserFirstname()
    {
        return firstname;
    }// end of user firstname getter
    
    
    
    
    
    /**
     * This method will set the users firstname in the UserAccounts method parameters 
     * to the first name the user entered into the first name field of the 
     * "MakeNewAccount" screen of the application.
     * @param firstname 
     */
    public void setUserFirstname(String firstname)
    {
        this.firstname = firstname;
    }// end of user firstname setter
    
    
    /**
     * This method will get the users surname when the user fills out the text
     * fields on the create an account screen of the application and click the 
     * create account button. This method will get the text the user entered
     * in the surname field and store it in the surname parameter of the new
     * account object array.
     * @return surname
     */
    public String getUserSurname()
    {
        return surname;
    }// end of user surname getter

   
    
    /**
     * This method will set the users surname in the UserAccounts method parameters 
     * to the surname the user entered into the surname field of the 
     * "MakeNewAccount" screen of the application
     * @param surname 
     */
    public void setUserSurname(String surname)
    {
        this.surname = surname;
    }// end of user surname setter
    
    
    
    /**
     * This method will get the users address when the user fills out the text
     * fields on the create an account screen of the application and click the 
     * create account button. This method will get the text the user entered
     * in the address field and store it in the address parameter of the new
     * account object array.
     * @return address
     */
    public String getUserAddress()
    {
        return address;
    }// end of address getter
    
    
    
    /**
     * This method will set the users address in the UserAccounts method parameters 
     * to the address the user entered into the surname field of the 
     * "MakeNewAccount" screen of the application
     * @param address
     */
    public void setUserAddress(String address)
    {
        this.address = address;
    }// end of address setter
    
    
   /**
    * This method will get the users postcode when the user fills out the text
    * fields on the create an account screen of the application and click the 
    * create account button. This method will get the text the user entered
    * in the postcode field and store it in the postcode parameter of the new
    * account object array.
    * @return postcode 
    */
    public String getUserPostcode()
    {
        return postcode;
    }// end of postcode getter
    
    
    
    /**
     * This method will set the users postcode in the UserAccounts method parameters 
     * to the postcode the user entered into the surname field of the 
     * "MakeNewAccount" screen of the application
     * @param postcode 
     */
    public void setUserPostcode(String postcode)
    {
        this.postcode = postcode;
    }
           
  
    
    
}
