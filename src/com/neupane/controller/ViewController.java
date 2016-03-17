/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neupane.controller;

import com.neupane.view.CourseView;
import com.neupane.view.ExitView;
import com.neupane.view.StudentView;
import java.util.Scanner;

/**
 *
 * @author parlad
 */
public class ViewController {

    public void AllView() {

        Scanner input = new Scanner(System.in);

        int choice = input.nextInt();
        switch (choice) {
            case 1:
                StudentView sv = new StudentView();
                sv.StView();
                break;
            case 2:
                CourseView cv = new CourseView();
                cv.CrView();
                break;
            default:
                ExitView ev = new ExitView();
                ev.ExView();
                break;
        }
    }

}
