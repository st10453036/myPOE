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
    public void testGetTaskName() {
        System.out.println("getTaskName");
        Task instance = new Task();
        String expResult = "";
        String result = instance.getTaskName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskNumber method, of class Task.
     */
    @Test
    public void testGetTaskNumber() {
        System.out.println("getTaskNumber");
        Task instance = new Task();
        int expResult = 0;
        int result = instance.getTaskNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskDescription method, of class Task.
     */
    @Test
    public void testGetTaskDescription() {
        System.out.println("getTaskDescription");
        Task instance = new Task();
        String expResult = "";
        String result = instance.getTaskDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeveloperDetails method, of class Task.
     */
    @Test
    public void testGetDeveloperDetails() {
        System.out.println("getDeveloperDetails");
        Task instance = new Task();
        String expResult = "";
        String result = instance.getDeveloperDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskDuration method, of class Task.
     */
    @Test
    public void testGetTaskDuration() {
        System.out.println("getTaskDuration");
        Task instance = new Task();
        int expResult = 0;
        int result = instance.getTaskDuration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void testCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        String TaskDescription = "";
        Task instance = new Task();
        boolean expResult = false;
        boolean result = instance.checkTaskDescription(TaskDescription);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        String TaskName = "Add Task Feature";
        int TaskNumber = 1;
        String TaskDescription = "Welcome";
        String developerDetails = "Mike Smith";
        int taskDuration = 10;
        Task instance = new Task();
        String expResult = "AD:1:ITH";
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
        int[] taskDurations = new int[]{22,10};
        String TaskName = "";
        int TaskNumber = 2;
        String TaskDescription = "";
        String developerDetails = "";
        int taskDuration = 0;
        Task instance = new Task();
        int expResult = 32;
        int result = instance.returnTotalHours(taskDurations, TaskName, TaskNumber, TaskDescription, developerDetails, taskDuration);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
