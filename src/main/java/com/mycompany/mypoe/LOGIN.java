/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mypoe;
import java.util.Scanner;
import java.util.regex.*;
/**
 *
 * @author RC_Student_lab
 */
public class LOGIN {
   //import object scanner
    Scanner sc = new Scanner(System.in);
    //Declarations
    String username;
    String password;
    String name;
    String lastname;
   
    
    //prompt the user to enter name and lastname
    public void Prompt(){
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter lastname: ");
        lastname = sc.next();
    }
     //creating a method
    public boolean checkUserName(){
      
        //prompt the user to enter username
         System.out.println("enter username: ");
        username = sc.next();
        System.out.println(username.contains("_"));
        System.out.println(username.length ()<= 5);

         return true;
    }
        public boolean checkPasswordComplexity(){
        //prompt the user to enter password
       System.out.println("Enter password: ");
        password = sc.next(); 
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
      public void display(){
            System.out.println("the username =  " + username);
            System.out.println("the password = " + password);
            System.out.println("name = " + name);
            System.out.println("lastname =" + lastname);
        }
          public String registerUser(){
          if (checkUserName() ==true && checkPasswordComplexity()==true){
              System.out.println("The username is correctly formatted and Password does meet complexity requirements ");
          
          }
         else{
           System.out.println("The username is incorrectly formatted Password does not meet complexity requirements ");
}
        return null;
          }    
             public boolean loginUser(){
            if(username.equals(registerUser()) && password.equals(registerUser())){
               return true; 
            }
            else{
                return false;
            }
        }
    
          public void returnLoginStatus(){
              
          }
        }
