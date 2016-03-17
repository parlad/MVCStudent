/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neupane.view;

import com.neupane.controller.ExitController;
import com.neupane.controller.StudentController;
import java.util.Scanner;

/**
 *
 * @author parlad
 */
public class ExitView {
    
    public void ExView() {
        ExitController c = new ExitController();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the command detail");
        
        String choice = input.next();
        
        if (choice.equalsIgnoreCase("close")) {
            System.exit(0);
        }
    }
    
}
