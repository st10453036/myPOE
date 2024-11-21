/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mypoe;

import static com.mycompany.mypoe.MyPOE.deleteTaskByName;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class MyPOETest {
    
    public MyPOETest() {
    }
  private ArrayList<String> taskNames;
    private ArrayList<String> developers;
    private ArrayList<String> taskStatuses;
    private ArrayList<Integer> taskDurations;
    private ArrayList<String> taskIDs;

    @BeforeEach
    public void setUp() {
        taskNames = new ArrayList<>();
        developers = new ArrayList<>();
        taskStatuses = new ArrayList<>();
        taskDurations = new ArrayList<>();
        taskIDs = new ArrayList<>();

        // Adding sample tasks
        taskNames.add("Create Login");
        developers.add("Mike Smith");
        taskStatuses.add("To Do");
        taskDurations.add(5);
        taskIDs.add("CR:0:ITH");

        taskNames.add("Create Add Features");
        developers.add("Edward Harrison");
        taskStatuses.add("Doing");
        taskDurations.add(8);
      taskIDs.add("CR:1:SON");

        taskNames.add("Create Reports");
        developers.add("Samantha Paulson");
        taskStatuses.add("Done");
        taskDurations.add(2);
         taskIDs.add("CR:2:SON");
        
        
        taskNames.add("Add Arrays");
        developers.add("Glenda Oberholzer"); 
        taskStatuses.add("To Do");
        taskDurations.add(11);
         taskIDs.add("AD:3:ZER");
    }

    @Test
    public void testSearchTaskByName() {
         MyPOE.searchTaskByName("Create Login", taskNames, developers, taskStatuses);
        assertEquals("Create Login", taskNames.get(0));
        assertEquals("Mike Smith", developers.get(0));
        assertEquals("To Do", taskStatuses.get(0));
    }

    @Test
    public void testDisplayDoneTasks() {
         MyPOE.onlyDone(taskNames, developers,taskIDs,taskDurations, taskStatuses);
        assertEquals("Done", taskStatuses.get(2));
    }

    @Test
    public void testDeleteTaskByName() {
      String delete = "Create Reports";

    // Ensure the task exists before deletion
    assertTrue(taskNames.contains(delete));

    // Call the deleteTaskByName method
    MyPOE.deleteTaskByName(delete, taskDurations, taskNames, developers, taskIDs, taskStatuses);
    // Verify the task was removed
    assertEquals(3, taskNames.size()); // Verify size reduction
    assertFalse(taskNames.contains(delete)); // Ensure task is removed

    // Output should include: Task 'Create Reports' successfully deleted.
}

    

    @Test
    public void testDisplayLongestTask() {
         MyPOE.displayLongestTask(developers, taskDurations);
        assertEquals("Glenda Oberholzer", developers.get(3)); // Developer Y has the longest task
    }

    @Test
    public void testfullList() {
        
      // Ensure the lists are not empty before running the test
    assertFalse(taskNames.isEmpty(), "taskNames list is empty");
    assertFalse(taskDurations.isEmpty(), "taskDurations list is empty");
    assertFalse(taskStatuses.isEmpty(), "taskStatuses list is empty");
    assertFalse(taskIDs.isEmpty(), "taskIDs list is empty"); // Assert that taskIDs is not empty

    // Call the method under test
    MyPOE.fullList(taskNames, developers, taskIDs, taskDurations, taskStatuses);
    //Part1.allTasks(taskNames, developers, taskDurations, taskStatuses, taskIDs);

    // Verify that the tasks are still in the expected state
    assertEquals(4, taskNames.size()); // Ensure all tasks are listed

    assertEquals("Create Login", taskNames.get(0));
    assertEquals("Mike Smith", developers.get(0));
    assertEquals(5, taskDurations.get(0));
    assertEquals("To Do", taskStatuses.get(0));
    assertEquals("CR:0:ITH", taskIDs.get(0)); // Check the taskID for "Create Login"

    assertEquals("Create Add Features", taskNames.get(1));
    assertEquals("Edward Harrison", developers.get(1));
    assertEquals(8, taskDurations.get(1));
    assertEquals("Doing", taskStatuses.get(1));
    assertEquals("CR:1:SON", taskIDs.get(1)); // Check the taskID for "Create Add Features"

    assertEquals("Create Reports", taskNames.get(2));
    assertEquals("Samantha Paulson", developers.get(2));
    assertEquals(2, taskDurations.get(2));
    assertEquals("Done", taskStatuses.get(2));
    assertEquals("CR:2:SON", taskIDs.get(2)); // Check the taskID for "Create Reports"

    assertEquals("Add Arrays", taskNames.get(3));
    assertEquals("Glenda Oberholzer", developers.get(3));
    assertEquals(11, taskDurations.get(3));
    assertEquals("To Do", taskStatuses.get(3));
    assertEquals("AD:3:ZER", taskIDs.get(3)); // Check the taskID for "Add Arrays"


    }   
        
    @Test
    public void testSearchTaskByDeveloper() {
        MyPOE.searchTaskByDeveloper("Samantha Paulson", taskNames, developers, taskStatuses);
        assertEquals("Samantha Paulson", developers.get(2));
        assertEquals("Done", taskStatuses.get(2));
    }
}   
   