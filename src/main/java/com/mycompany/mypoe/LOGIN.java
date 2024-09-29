/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mypoe;
import java.util.Scanner;

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
                       + "(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])";
        if(password.length()>=8 && password.matches(regex)){
              return true;
        }
        else{
            return false;
        }
    }
    
    
    
    
    
}
