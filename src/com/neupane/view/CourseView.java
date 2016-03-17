/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neupane.view;

import com.neupane.controller.CourseController;
import java.util.Scanner;

/**
 *
 * @author parlad
 */
public class CourseView {

    public void CrView() {

        Scanner input = new Scanner(System.in);
        CourseController st = new CourseController();
        while (true) {

            System.out.println("Enter the course detail");
            System.out.println("1.for AddCourse");
            System.out.println("2.for Show");
            System.out.println("3.for Exit");
            System.out.println("choose [1-3]");
            int choice = input.nextInt();

            st.controller(choice);
        }

    }

}
