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
public class LOGINTest {
    
    public LOGINTest() {
    }
    
  

    /**
     * Test of getUserName method, of class LOGIN.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        LOGIN instance = new LOGIN();
        String expResult = "";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class LOGIN.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        LOGIN instance = new LOGIN();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUserName method, of class LOGIN.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "p_";
        LOGIN instance = new LOGIN();
        boolean expResult = true;
        boolean result = instance.checkUserName(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity method, of class LOGIN.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "";
        LOGIN instance = new LOGIN();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class LOGIN.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String firstname = "";
        String lastname = "";
        String username = "";
        String password = "";
        LOGIN instance = new LOGIN();
        String expResult = "";
        String result = instance.registerUser(firstname, lastname, username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class LOGIN.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String userName = "";
        String Password = "";
        LOGIN instance = new LOGIN();
        boolean expResult = false;
        boolean result = instance.loginUser(userName, Password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class LOGIN.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        boolean login = false;
        LOGIN instance = new LOGIN();
        String expResult = "";
        String result = instance.returnLoginStatus(login);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class LOGIN.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        String name = "";
        String lastname = "";
        String userName = "";
        String Password = "";
        LOGIN instance = new LOGIN();
        instance.display(name, lastname, userName, Password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
