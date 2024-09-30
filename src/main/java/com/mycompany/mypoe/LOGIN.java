/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mypoe;

import java.util.regex.*;
/**
 *
 * @author RC_Student_lab
 */
public class LOGIN {
   //import object scanner
  
    //Declarations
    private String username;
    private String password;
   
   
    public void setUserName(String username){
        this.username = username;
    }
   public String getUserName(){
       return username;
   }
   public String getPassword(){
       return password;
   }
   public void setPassword(String password){
       this.password = password;
   }
    
     //creating a method
    public boolean checkUserName(){
      return username.contains("_") && username.length ()<= 5;
    }
        public boolean checkPasswordComplexity(){
      
      
        String regex = "^(?=.*[0-9])"
                       + "(?=.*[A-Z])(?=.*[a-z])"
                       + "(?=.*[@#$%^&+=]).{8,}$";
        //compiling regex
        Pattern p = Pattern.compile(regex);
        if(password == null){
            return false;
        }
      
            System.out.println(password.length()>=8);
            System.out.println(password.matches(regex)); 
     
        Matcher m =p.matcher(password);
        return m.matches();
      
    }
      public void display(String name, String lastname){
            System.out.println("the username =  " + username);
            System.out.println("the password = " + password);
            System.out.println("name = " + name);
            System.out.println("lastname =" + lastname);
        }
          public String registerUser(String username , String password){
          if (!checkUserName() && !checkPasswordComplexity()){
              
              System.out.println("The username is successfully captured and Password is successfully captured ");
              return "true";
          }
         else{
           System.out.println("The username is incorrectly formatted, please ensure that the username contains an underscore and is no more than 5 characters in length or Password is incorrectly formatted, please ensure that the password contains at least 8 chatacters,a capital letter ,a number and a special character");
}
        return "false";
          }    
             public boolean loginUser(String username , String password){
            if(username.equals(username) && password.equals(password)){
               return true; 
            }
            else{
                return false;
            }
        }
    
          public String returnLoginStatus(String username , String password, String name, String lastname){
                 if (loginUser(username , password) == true){
               System.out.println("Welcome " + name + " "  + lastname +" " + "it is great to see you again");  
            }
            else{
                      System.out.println("Username or password is incorrect.Please try again!");
            }
        return null;
        
        
          }
        }
