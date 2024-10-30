/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mypoe;

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
public class TaskTest {

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }


 
    
    
    /**
     * Test of getTaskName method, of class Task.
     */
   
    
    
    @Test
    public void testCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        String TaskDescription = "jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj";
        Task instance = new Task();
        boolean expResult = false;
        boolean result = instance.checkTaskDescription(TaskDescription);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        String TaskName = "Login Feature";
        int TaskNumber = 0;
        String TaskDescription = "Create login to authenticate users";
        String developerDetails = " Robyn Harrison";
        int taskDuration = 8;
        Task instance = new Task();
        String expResult = "LO:0:SON";
        String result = instance.createTaskID(TaskName, TaskNumber, TaskDescription, developerDetails, taskDuration);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of printTaskDetails method, of class Task.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        String TaskName = "";
        int TaskNumber = 0;
        String TaskDescription = "";
        String developerDetails = "";
        int taskDuration = 0;
        String taskStatus = "";
        Task instance = new Task();
        String expResult = "";
        String result = instance.printTaskDetails(TaskName, TaskNumber, TaskDescription, developerDetails, taskDuration, taskStatus);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of returnTotalHours method, of class Task.
     */
    @Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");
        int[] taskDurations = new int[]{10,12,55,11,1};
        String TaskName = "";
        int TaskNumber = 5;
        String TaskDescription = "";
        String developerDetails = "";
        int taskDuration = 0;
        Task instance = new Task();
        int expResult = 89;
        int result = instance.returnTotalHours(taskDurations, TaskName, TaskNumber, TaskDescription, developerDetails, taskDuration);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
