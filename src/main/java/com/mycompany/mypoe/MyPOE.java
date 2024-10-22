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
  
        
       
            //calling the third class
        final JDialog dialog = new JDialog();
        dialog.setAlwaysOnTop(true);
            
            
             JOptionPane.showMessageDialog(dialog,"Welcome to EasyKanBan");
      String[] OptionsToChoose ={"To do","Doing" ,"Done"};
      
    while(ab.loginUser(username, password)){
           Task op = new Task(TaskName, TaskNumber,TaskDescription ,developerDetails,taskDuration);
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

for (int i = 0; i < Quest; i++) {
        
 TaskName = JOptionPane.showInputDialog(" Enter Task name");

            // prompt user to enter task description
 TaskDescription = JOptionPane.showInputDialog("Enter Task description");
 developerDetails = JOptionPane.showInputDialog( " Enter Task developer details (firstname & surname)");
           
taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter duration (In Hours)"));
 JOptionPane.showInputDialog(dialog,op.createTaskID(TaskName, i, TaskDescription,developerDetails,taskDuration));
 String TaskStatus = (String) JOptionPane.showInputDialog(dialog, "Choose task status","Select task status",JOptionPane.QUESTION_MESSAGE,null,OptionsToChoose,OptionsToChoose[2]);
        
newArray[i] = new Task (TaskName,i,TaskDescription ,developerDetails,taskDuration);
JOptionPane.showMessageDialog(dialog, op.printTaskDetails(TaskName, i, TaskDescription, developerDetails, taskDuration,TaskStatus)+"\n" + op.createTaskID(TaskName, i, TaskDescription, developerDetails, taskDuration));
}
  
       break;    
        //Display the task number, name, and description

    case "2":
        JOptionPane.showInputDialog(dialog, "Coming Soon!");
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
    
