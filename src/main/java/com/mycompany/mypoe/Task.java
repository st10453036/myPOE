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
   
    
  
    
    //declarations
   private String TaskName;
    private int TaskNumber;
   private String TaskDescription;
  private int TaskID;
  private String developerDetails;
  private int taskDuration;
   
     public void setTaskName(String TaskName){
        this.TaskName = TaskName;
    }
   public String getTaskName(){
       return TaskName;
   }
    public int getTaskNumber(){
       return TaskNumber;
   }
   public void setTaskNumber(int TaskNumber){
       this.TaskNumber=  TaskNumber;
   }
     public String getTaskDescription(){
       return TaskDescription;
   }
   public void setTaskDescription(String TaskDescription){
       this.TaskDescription = TaskDescription;
   }
    public int getTaskID(){
       return TaskNumber;
   }
   public void setTaskID(int TaskID){
       this.TaskID=  TaskID;
   }
  
    public String getDeveloperDetails(){
       return developerDetails;
   }
   public void setTaskNumber(String DeveloperDetails){
       this.developerDetails =  DeveloperDetails;
   }
    public int getTaskDuration(){
       return taskDuration;
   }
   public void setTaskDuration(int taskDuration){
       this.taskDuration=  taskDuration;
   }   
       
    public boolean checkTaskDescription(String TaskDescription){
      return TaskDescription.length()<=50;
    }
 public String createTaskID(String TaskName, int TaskNumber, String TaskDescription, String developerDetails  ){
     return ("TaskID " + TaskName.charAt(0) + TaskName.charAt(1) + ":" + TaskNumber + ":" + developerDetails.substring(developerDetails.length()-3)).toUpperCase();
     
    }
// public String TaskDetails(){
     
// }
}

