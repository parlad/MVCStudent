/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neupane.view;

import com.neupane.controller.StudentController;
import java.util.Scanner;

/**
 *
 * @author parlad
 */
public class StudentView {

    public void StView() {
        StudentController c = new StudentController();
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the student detail");
            System.out.println("1.for AddStudent");
            System.out.println("2.for Show");
            System.out.println("3.for Exit");
            System.out.println("choose [1-3]");
            int choice = input.nextInt();
            c.controller(choice);
        }
    }
}
