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
        String username = "kyle!!!!!!!";
        LOGIN instance = new LOGIN(username , "Ch&&sec@ke99!");
        boolean expResult = false;
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
        String password = "password";
        LOGIN instance =  new LOGIN("kyl_1", password);
        boolean expResult = false;
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
        String username = "kyle!!!!!!!";
        String password = "password";
        LOGIN instance = new LOGIN(username , password);
        String expResult = "The username is incorrectly formatted, please ensure that the username contains an underscore and is no more than 5 characters in length or Password is incorrectly formatted, please ensure that the password contains at least 8 chatacters,a capital letter ,a number and a special character";
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
        String userName = "kyle!!!!!!!";
        String Password = "password";
        LOGIN instance = new LOGIN("ky_1","Ch&&sec@ke99!" );
        boolean expResult = false;
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
        String userName = "kyle!!!!!!!";
        String Password = "password";
        String name = "SAM";
        String lastname = "DAM";
        LOGIN instance =new LOGIN("ky_1","Ch&&sec@ke99!") ;
        String expResult = "Username or password is incorrect.Please try again!";
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
