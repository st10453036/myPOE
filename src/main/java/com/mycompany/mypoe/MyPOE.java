/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mypoe;
import java.util.Scanner;
import javax.swing.*;
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
      
       String TaskName = "";
         String TaskDescription = "";
         int TaskNumber = 0 ;
          String developerDetails = "";
          int taskDuration = 0;
         
    
     /*//prompt the user to enter name and lastname
      System.out.println("Enter your name: ");
        name = sc.next();
        System.out.println("Enter your lastname: ");
        lastname = sc.next();
       //prompt user to enter username
        System.out.println("enter username: ");
       username = sc.next();
        //prompt user to enter password
         System.out.println("Enter password: ");
         password = sc.next(); */
         
         //calling second class
       /*    LOGIN ab = new LOGIN(username,password);
      
     
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
     //   ab.loginUser(username , password);
        
        while(ab.loginUser(username, password) == true){
            
        }*/
            //calling the third class
  
           String message = JOptionPane.showInputDialog("Welcome to EasyKanBan");
                
    while(true){
        String options =  """
                      ======Options=======
                      1.Add tasks
                      2. Show report
                      3. Quit
                     """;
        String choice =JOptionPane.showInputDialog(options);
               switch (choice) {
    case "1":
        // prompt user to enter many tasks
        String taskCountInput = JOptionPane.showInputDialog("How many tasks would you like to enter?");
        int taskCount = Integer.parseInt(taskCountInput); 

        // created an array to make tasknum autogenarate
        String[] newArray = new String[taskCount];

        for (int i = 0; i < newArray.length; i++) {
        
            
            TaskName = JOptionPane.showInputDialog("Task Number " + (i) + ": Enter Task name");

            // prompt user to enter task description
             TaskDescription = JOptionPane.showInputDialog("Task Number " + (i) + ": Enter Task description");

           
            newArray[i] = "Task " + (i ) + ": " + TaskName + " - " + TaskDescription;
            Task op = new Task(TaskName, TaskNumber,TaskDescription ,developerDetails,taskDuration);
            
    op.createTaskID(TaskName, TaskNumber, TaskDescription,developerDetails,taskDuration);
    
    
    JOptionPane.showMessageDialog(null, TaskID);
    int t = Integer.parseInt(JOptionPane.showInputDialog("choose an option"\n 1: "To do" \n 2. "Done "\n 3:"Doing"));
     
    String take = "";
    if (t == 1){
        take = "To do";
    } else if(t==2){
            take = "Doing";
        }else if (t == 3){
            take = "Done";
        }
    JOptionPane.showMessageDialog(null, take);
        }
        

        //Display the task number, name, and description
        String allTasks = "";
        for (int i = 0; i < newArray.length; i++) {
            allTasks += newArray[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, allTasks);
        break;

    case "2":
        JOptionPane.showInputDialog(null, "Coming Soon!");
        break;

    case "3":
        JOptionPane.showInputDialog(null, "Quitting...");
        System.exit(0);
        break;
}
   
    }       
    
}
    }
