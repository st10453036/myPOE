/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mypoe;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class MyPOE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Scanner cv = new Scanner(System.in);
      
        
        //Declarations
        String name;
        String lastname;
         String username;
      String password;
    
      //prompt the user to enter name and lastname
         System.out.println("Enter your name: ");
        name = sc.next();
        System.out.println("Enter your lastname: ");
        lastname = sc.next();
       //prompt user to enter username
        System.out.println("enter username: ");
       username = sc.next();
        //prompt user to enter password
         System.out.println("Enter password: ");
         password = sc.next(); 
         
         //calling second class
           LOGIN ab = new LOGIN(username,password);
      
     
       //calling register user method
        System.out.println( ab.registerUser(username , password));
        
        if (ab.checkPasswordComplexity(password) && ab.checkUserName(username)){
            //prompt the user to enter password and username
            System.out.println("Enter username");
          String  userName = cv.next();
            System.out.println("Enter password");
            String Password = cv.next();
            //calling the return login status method
            System.out.println(ab.returnLoginStatus( userName ,Password, name,lastname));
            //called the display method
             ab.display( name ,lastname, userName,Password);
        }
        ab.loginUser(username , password);
        
    
    }
}
