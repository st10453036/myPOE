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
     * Test of setUserName method, of class LOGIN.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String username = "";
        LOGIN instance = null;
        instance.setUserName(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserName method, of class LOGIN.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        LOGIN instance = null;
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
        LOGIN instance = null;
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class LOGIN.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        LOGIN instance = null;
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUserName method, of class LOGIN.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "kyl_1";
        LOGIN instance = new LOGIN(username , "Ch&&sec@ke99!");
        boolean expResult = true;
        boolean result = instance.checkUserName(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity method, of class LOGIN.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "Ch&&sec@ke99!";
        LOGIN instance =  new LOGIN("kyl_1", password);
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class LOGIN.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "ky_1";
        String password = "Ch&&sec@ke99!";
        LOGIN instance = new LOGIN(username , password);
        String expResult = "The username is successfully captured and Password is successfully captured";
        String result = instance.registerUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class LOGIN.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String userName = "ky_1";
        String Password = "Ch&&sec@ke99!";
        LOGIN instance = new LOGIN("ky_1","Ch&&sec@ke99!" );
        boolean expResult = true;
        boolean result = instance.loginUser(userName, Password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class LOGIN.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String userName = "ky_1";
        String Password = "Ch&&sec@ke99!";
        String name = "SAM";
        String lastname = "DAM";
        LOGIN instance =new LOGIN("ky_1","Ch&&sec@ke99!") ;
        String expResult =  "Welcome " + name + " "  + lastname +" " + "it is great to see you again";
        String result = instance.returnLoginStatus(userName, Password, name, lastname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
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
        LOGIN instance = null;
        instance.display(name, lastname, userName, Password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
