/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mypoe;

/**
 *
 * @author RC_Student_lab
 */
public class MyPOE {

    public static void main(String[] args) {
       
        LOGIN ab = new LOGIN();
        ab.Prompt();
        ab.checkUserName();
        ab.checkPasswordComplexity();
        ab.registerUser();
        ab.loginUser();
        ab.display();
       
    }
}
