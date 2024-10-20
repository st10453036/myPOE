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
       
    
     //prompt the user to enter name and lastname
    /*  System.out.println("Enter your name: ");
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
     //   ab.loginUser(username , password);
        
        while(ab.loginUser(username, password) == true){
         
        }*/
            //calling the third class
  
             JOptionPane.showMessageDialog(null,"Welcome to EasyKanBan");
                
    while(true){
           Task op = new Task(TaskName, TaskNumber,TaskDescription ,developerDetails,taskDuration);
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
        
            
            
            TaskName = JOptionPane.showInputDialog(" Enter Task name");

            // prompt user to enter task description
             TaskDescription = JOptionPane.showInputDialog("Enter Task description");

           developerDetails = JOptionPane.showInputDialog( " Enter Task developer details (firstname & surname)");
           
           taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter duration (In Hours)"));
           JOptionPane.showInputDialog(null,op.createTaskID(TaskName, TaskNumber, TaskDescription,developerDetails,taskDuration));
            
           
           
           
            newArray[i] = "Task " + (i ) + ": " + TaskName + " - " + TaskDescription;
        }
        //      String allTasks = "";
        //for (int i = 0; i < newArray.length; i++) {
        //    allTasks += newArray[i] + "\n";
       // }

    
     
  //  JOptionPane.showMessageDialog(null, TaskID);

    
    
    
   
    
    while(true){
        String option2 = """
                          ======Options=======
                         1. To do
                         2.Doing
                         3.Done
                        """;
         String opt = JOptionPane.showInputDialog(option2);
    switch (opt){
        case "1":
           
   JOptionPane.showMessageDialog(null, "To do");
      
   JOptionPane.showMessageDialog(null,op.TaskDetails( TaskName, TaskNumber,TaskDescription, developerDetails, taskDuration) +"\n" +op.createTaskID(TaskName, TaskNumber, TaskDescription, developerDetails, taskDuration) +  "\n" +  "taskStatus: TO DO" );

   break;
    
        case "2":
        JOptionPane.showMessageDialog(null, "Doing");
        
         JOptionPane.showMessageDialog(null,op.TaskDetails( TaskName, TaskNumber,TaskDescription, developerDetails, taskDuration) +"\n" +op.createTaskID(TaskName, TaskNumber, TaskDescription, developerDetails, taskDuration) +  "\n" +  "taskStatus:Doing" );

        break;
        
        case "3":
        JOptionPane.showMessageDialog(null, "Done");
        JOptionPane.showMessageDialog(null,op.TaskDetails( TaskName, TaskNumber,TaskDescription, developerDetails, taskDuration) +"\n" +op.createTaskID(TaskName, TaskNumber, TaskDescription, developerDetails, taskDuration) +  "\n" +  "taskStatus:Done" );

        break;
        }
    
        
    }
               
        //Display the task number, name, and description

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
