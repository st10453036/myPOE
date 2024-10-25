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
public class LOGIN{
    
    private String firstname, lastname, username, password;
   
   
   
   public String getUserName(){
       return username;
   }
   public String getPassword(){
       return password;
   }
  
     //creating a method
    public boolean checkUserName(String username){
      return username.contains("_") && username.length ()<= 5;
    }
        public boolean checkPasswordComplexity(String password){
      
      
        String regex = "^(?=.*[0-9])"
                       + "(?=.*[A-Z])(?=.*[a-z])"
                       + "(?=.*[@#$%^&+=]).{8,}$";
        //compiling regex
        Pattern p = Pattern.compile(regex);
        if(password == null){
            return false;
        }
      
          //  System.out.println(password.length()>=8);
          //  System.out.println(password.matches(regex)); 
     
        Matcher m =p.matcher(password);
        return m.matches();
      
    }
    
         public String registerUser(String firstname, String lastname, String username , String password){
             
             if(!checkUserName(username))
                 return "The username is incorrectly formatted, please ensure that the username contains an underscore and is no more than 5 characters in length";
             
             if(!checkPasswordComplexity(password))
                 return "Password is incorrectly formatted, please ensure that the password contains at least 8 chatacters,a capital letter ,a number and a special character";
             
             
             this.firstname = firstname;
             this.lastname = lastname;
             this.username = username;
             this.password = password;
             return "The username is successfully captured and Password is successfully captured";
         }
        
             public boolean loginUser(String userName , String Password){
          return this.username.equals(userName) && this.password.equals(Password);
        }
    
          public String returnLoginStatus(boolean login){
                 if (login){
               return "Welcome " + this.firstname + " "  + this.lastname +" " + "it is great to see you again";  
            }
            else{
                      return "Username or password is incorrect.Please try again!";
            }
    
          }
   
  public void display(String name, String lastname,String userName , String Password){
            System.out.println("the username =  " + userName);
            System.out.println("the password = " + Password);
            System.out.println("name = " + name);
            System.out.println("lastname =" + lastname);
            
        }
        }
