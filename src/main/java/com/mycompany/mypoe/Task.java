/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mypoe;

import javax.swing.JOptionPane;



/**
// *
 * @author RC_Student_lab
 */
public class Task {
   
    //declarations
   private String TaskName;
    private int TaskNumber;
   private String TaskDescription;

  private String developerDetails;
  private int taskDuration;
  

    public boolean checkTaskDescription(String TaskDescription){
    //  return //askDescription.length()<=50;
       if(TaskDescription.length()<=50){
   JOptionPane.showMessageDialog(null, "Tasks successfully captured");
   return true;
 }
 else {
       JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
       return false;
 }
      
    }
 public String createTaskID(String TaskName, int TaskNumber, String TaskDescription, String developerDetails,  int taskDuration){
   //return ("TaskID " + TaskName.charAt(0) + TaskName.charAt(1) + ":" + TaskNumber + ":" + developerDetails.substring(developerDetails.length()-3)).toUpperCase();
   return (TaskName.substring(0, 2)+ ":" + TaskNumber + ":" + developerDetails.substring(developerDetails.length()-3)).toUpperCase();
     
     
    }
public String printTaskDetails(String TaskName, int TaskNumber,String TaskDescription, String developerDetails,int taskDuration, String taskStatus){
        return "taskName: " + TaskName + "\n" +" "+ "TaskNumber: "+ TaskNumber + "\n" +" "+ "TaskDescription: " +TaskDescription + "\n" +" "+ "DeveloperDetails: " +developerDetails + "\n" + " "+ "TaskDuration: " +taskDuration +"\n" +"TaskStatus: "+ taskStatus;
    
}
public  int returnTotalHours(int[] taskDurations,String TaskName, int TaskNumber,String TaskDescription, String developerDetails,int taskDuration ){
         int totalHours = 0;
        for (int duration : taskDurations) {
        totalHours += duration; 
    }
            this.TaskName =  TaskName;
this.TaskNumber = TaskNumber;
this. developerDetails =  developerDetails;
this.taskDuration = taskDuration;
this.TaskDescription = TaskDescription;

    return  totalHours;
   
}
}
