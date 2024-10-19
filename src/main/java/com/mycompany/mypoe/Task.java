/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mypoe;



/**
// *
 * @author RC_Student_lab
 */
public class Task {
     public Task(String TaskName, int TaskNumber,String TaskDescription, String developerDetails, int TaskID, int taskDuration){
        this. TaskName =  TaskName;
this.TaskNumber = TaskNumber;
this. developerDetails =  developerDetails;
this.TaskID = TaskID;
this.taskDuration = taskDuration;
this.TaskDescription = TaskDescription;
    }  
    //declarations
   private String TaskName;
    private int TaskNumber;
   private String TaskDescription;
  private int TaskID;
  private String developerDetails;
  private int taskDuration;
  
 String getTaskName(){
       return TaskName;
   }
    public int getTaskNumber(){
       return TaskNumber;
   }
     public String getTaskDescription(){
       return TaskDescription;
   }
  
  
   
    public String getDeveloperDetails(){
       return developerDetails;
   }
   
    public int getTaskDuration(){
       return taskDuration;
   }
 
    public boolean checkTaskDescription(String TaskDescription){
      return TaskDescription.length()<=50;
    }
 public String createTaskID(String TaskName, int TaskNumber, String TaskDescription, String developerDetails,  int taskDuration){
     return ("TaskID " + TaskName.charAt(0) + TaskName.charAt(1) + ":" + TaskNumber + ":" + developerDetails.substring(developerDetails.length()-3)).toUpperCase();
     
    }
// public String TaskDetails(){
     
// }
}

