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
          LOGIN ab = new LOGIN();
      
     
       //calling register user method
       System.out.println( ab.registerUser(name, lastname, username , password));
        if(!ab.checkUserName(username) || !ab.checkPasswordComplexity(password)){

            return;
        }
                
        System.out.println("====== LOGIN ========");
       
        System.out.println("Enter username");
          String  userName = cv.next();
            System.out.println("Enter password");
            String Password = cv.next();
            
            boolean loginStats = ab.loginUser(userName, Password);
            
            System.out.println(ab.returnLoginStatus(loginStats) );
        
     
  
        
       if(loginStats){
            //calling the third class
        final JDialog dialog = new JDialog();
        dialog.setAlwaysOnTop(true);
            
            
             JOptionPane.showMessageDialog(dialog,"Welcome to EasyKanBan");
      String[] optionsToChoose ={"To do","Doing" ,"Done"};
      
    while(ab.loginUser(username, password)){
           Task op = new Task();
        String options =  """
                      ======Options=======
                      1.Add tasks
                      2. Show report
                      3. Quit
                     """;
        String choice =JOptionPane.showInputDialog(dialog, options);
               switch (choice) {
    case "1":
        // prompt user to enter many tasks
     int Quest = Integer.parseInt(JOptionPane.showInputDialog(dialog, "How many tasks would you like to enter?"));
 
        // created an array to make tasknum autogenarate
  Task [] newArray = new Task[Quest];
int[] taskDurations =new int [Quest];
int totalHours;
for (int i = 0; i < Quest; i++) {
  newArray[i] = new Task() ;
  
 TaskName = JOptionPane.showInputDialog(" Enter Task name");

 

do {
        // prompt user to enter task description
 TaskDescription = JOptionPane.showInputDialog("Enter Task description");
  boolean check = op.checkTaskDescription(TaskDescription);
}
while (TaskDescription.length ()>50);

 

 
 developerDetails = JOptionPane.showInputDialog( " Enter Task developer details (firstname & surname)");
           
taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter duration (In Hours)"));

taskDurations[i] =taskDuration;


JOptionPane.showMessageDialog(dialog, op.createTaskID(TaskName, i, TaskDescription, developerDetails, taskDuration));
String taskStatus = (String) JOptionPane.showInputDialog(dialog, "Choose task status","Select task status",JOptionPane.QUESTION_MESSAGE,null,optionsToChoose, optionsToChoose[2]);
  newArray [i] = new Task ();
JOptionPane.showMessageDialog(dialog, op.printTaskDetails(TaskName, i, TaskDescription, developerDetails, taskDuration, taskStatus)+ "\n" + op.createTaskID(TaskName, i, TaskDescription, developerDetails, taskDuration));
}

totalHours =op.returnTotalHours(taskDurations, TaskName, TaskNumber, TaskDescription, developerDetails, taskDuration);



JOptionPane.showMessageDialog(dialog, "total hours is: " + totalHours);
   
       break;    
        //Display the task number, name, and description

    case "2":
        JOptionPane.showMessageDialog(dialog, "Coming Soon!");
        break;

    case "3":
        JOptionPane.showMessageDialog(dialog, "Quitting...");
        System.exit(0);
        break;
                 
}
         dialog.dispose();
    }       
    }
    }
    }

    



