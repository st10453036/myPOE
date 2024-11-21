/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mypoe;
import java.util.Scanner;
import javax.swing.*;
import java.util.ArrayList;
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
       
          
          
        ArrayList<String> developers = new ArrayList<>();
        ArrayList<String> taskNames = new ArrayList<>();
        ArrayList<String> taskIDs = new ArrayList<>();
       ArrayList<Integer> taskDurations = new ArrayList<>();
        ArrayList<String> taskStatuses = new ArrayList<>();
        
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
int[] totalDuration =new int [Quest];
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

// prompt user to enter task developer details
 developerDetails = JOptionPane.showInputDialog( " Enter Task developer details (firstname & surname)");
           
taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter duration (In Hours)"));
totalDuration[i] =taskDuration;

JOptionPane.showMessageDialog(dialog, op.createTaskID(TaskName, i, TaskDescription, developerDetails, taskDuration));
String taskStatus = (String) JOptionPane.showInputDialog(dialog, "Choose task status","Select task status",JOptionPane.QUESTION_MESSAGE,
        null,optionsToChoose, optionsToChoose[2]);
 String taskID = op.createTaskID(TaskName, i, TaskDescription, developerDetails, taskDuration);
                            taskIDs.add(taskID);
                            developers.add(developerDetails);
                            taskNames.add(TaskName);
                           taskDurations.add(taskDuration);
                            taskStatuses.add(taskStatus);

newArray [i] = new Task ();
  
JOptionPane.showMessageDialog(dialog, op.printTaskDetails(TaskName, i, TaskDescription, developerDetails, taskDuration, taskStatus)+ "\n" + op.createTaskID(TaskName, i, TaskDescription, developerDetails, taskDuration));
}

totalHours =op.returnTotalHours(totalDuration, TaskName, TaskNumber, TaskDescription, developerDetails, taskDuration);



JOptionPane.showMessageDialog(dialog, "total hours is: " + totalHours);
   
       break;    
    
       
    case "2":

                        // Search or delete option
  String[] reportOptions = {"Search for a task", "Delete a task", "Back to main menu","Show full list of tasks" ,"Search for tasks with 'done' status only ", "Search for all tasks assigned to a developer","Display task with the longest duration"};
   String reportChoice = (String) JOptionPane.showInputDialog(dialog, "What would you like to do next?", "Select an option", JOptionPane.QUESTION_MESSAGE, null, reportOptions, reportOptions[0]);

   if ("Search for a task".equals(reportChoice)) {
   String searchName = JOptionPane.showInputDialog(dialog, "Enter the task name to search for:");
    searchTaskByName(searchName, taskNames, developers, taskStatuses);
     } else if ("Delete a task".equals(reportChoice)) {
     String deleteName = JOptionPane.showInputDialog(dialog, "Enter the task name to delete:");
     deleteTaskByName(deleteName, taskDurations,taskNames, developers, taskIDs, taskStatuses);
                        }else if ("Show full list of tasks".equals(reportChoice)){
                            fullList(taskNames,  developers,  taskIDs,taskDurations, taskStatuses) ;
               }else if ("Search for tasks with 'done' status only ".equals(reportChoice)){
                    onlyDone(taskNames,  developers,  taskIDs, taskDurations,taskStatuses);
               }else if ( "Search for all tasks assigned to a developer".equals(reportChoice)){
                   String searchDeveloper = JOptionPane.showInputDialog(dialog, "Enter the developer name to search for ");
                 searchTaskByDeveloper (searchDeveloper,taskNames,developers,taskStatuses);
               }else if ("Display task with the longest duration".equals(reportChoice)){
                 displayLongestTask(developers,taskDurations);
               }
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
   // Method to search task by name
    public static void searchTaskByName(String searchName, ArrayList<String> taskNames, ArrayList<String> developers, ArrayList<String> taskStatuses) {
        boolean found = false;  // Flag to check if the task was found
        for (int i = 0; i < taskNames.size(); i++) {
            if (taskNames.get(i).equalsIgnoreCase(searchName)) {
                JOptionPane.showMessageDialog(null, "Task Name: " + taskNames.get(i) + "\nDeveloper: " + developers.get(i) + "\nStatus: " + taskStatuses.get(i));
                found = true;  // Set flag to true if found
                break;  // Exit the loop if the task is found
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Task not found.");
        }
    }

    // Method to delete task by name
    public static void deleteTaskByName(String Name,ArrayList<Integer> taskDurations ,ArrayList<String> taskNames, ArrayList<String> developers, ArrayList<String> taskIDs,  ArrayList<String> taskStatuses) {
      
    int indexToDelete = taskNames.indexOf(Name); // Find the index of the task name
    if (indexToDelete != -1) { // Ensure the task exists
        taskNames.remove(indexToDelete);
        developers.remove(indexToDelete);
        taskDurations.remove(indexToDelete);
        taskStatuses.remove(indexToDelete);
        if (!taskIDs.isEmpty()) {
            taskIDs.remove(indexToDelete); // Only if taskIDs is used
        }
       // System.out.println("Task '" + taskName + "' successfully deleted."); // Confirmation message
         JOptionPane.showMessageDialog(null, "Task " + Name + "\n" + " successfully deleted.");
    } else {
      //  System.out.println("Task not found: " + taskName);
         JOptionPane.showMessageDialog(null, "Task not found:" + Name);
    }
}
    
       public static void onlyDone(ArrayList<String> taskNames, ArrayList<String> developers, ArrayList<String> taskIDs, ArrayList<Integer> taskDurations ,  ArrayList<String> taskStatuses){
    StringBuilder completedTasks = new StringBuilder("Completed Tasks (Status: 'Done'):\n");
        boolean found = false;  // Flag to check if there are completed tasks

        for (int i = 0; i < taskStatuses.size(); i++) {
            if ("done".equalsIgnoreCase(taskStatuses.get(i))) {
                completedTasks.append("Developer: ").append(developers.get(i))
                              .append("\nTask Name: ").append(taskNames.get(i))
                              .append("\nDuration: ").append(taskDurations.get(i)).append(" hours\n\n");
                found = true;
            }
        }
        if (found) {
            JOptionPane.showMessageDialog(null, completedTasks.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No tasks with status 'Done' found.");
        }
       }
    
    public static void fullList(ArrayList<String> taskNames, ArrayList<String> developers, ArrayList<String> taskIDs, ArrayList<Integer> taskDurations , ArrayList<String> taskStatuses) {
        StringBuilder report = new StringBuilder("Full Task Report:\n");
                        for (int i = 0; i < taskNames.size(); i++) {
                            report.append("Task Name: ").append(taskNames.get(i))
                                  .append("\nDeveloper: ").append(developers.get(i))
                                  .append("\nTask ID: ").append(taskIDs.get(i))
                                .append("\nDuration: ").append(taskDurations.get(i))
                                  .append("\nStatus: ").append(taskStatuses.get(i)).append("\n\n");
                        }
                        JOptionPane.showMessageDialog(null, report.toString());
    }
    public static void searchTaskByDeveloper(String searchDeveloper,ArrayList<String> taskNames,ArrayList<String> developers, ArrayList<String> taskStatuses) {
          boolean found = false;  // Flag to check if the task was found
        for (int i = 0; i < developers.size(); i++) {
            if (developers.get(i).equalsIgnoreCase(searchDeveloper)) {
                JOptionPane.showMessageDialog(null, "Task Name: " + taskNames.get(i) + "\nStatus: " + taskStatuses.get(i));
                found = true;  // Set flag to true if found
                break;  // Exit the loop if the task is found
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Task not found.");
        }
    }
        
    public static void displayLongestTask(ArrayList<String> developers, ArrayList<Integer> taskDurations) {
          if (taskDurations.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No tasks available.");
        return;
    }
             int maxDurationIndex = 0;  // Index of the task with the longest duration
    int maxDuration = taskDurations.get(0);  // Initialize with the first task's duration

    for (int i = 1; i < taskDurations.size(); i++) {
        if (taskDurations.get(i) > maxDuration) {
            maxDuration = taskDurations.get(i);
            maxDurationIndex = i;
        }
    }

    String developerWithLongestTask = developers.get(maxDurationIndex);
    JOptionPane.showMessageDialog(null, "Developer: " + developerWithLongestTask + 
                                          "\nTask Duration: " + maxDuration + " hours");
}
    }
    
    
    


     




