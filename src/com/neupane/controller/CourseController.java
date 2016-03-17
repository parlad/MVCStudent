/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neupane.controller;

import com.neupane.mode.Course;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author parlad
 */
public class CourseController extends Controller {

    List<Course> list = new ArrayList();
    Scanner input = new Scanner(System.in);

    public void controller(int i) {
        switch (i) {
            case 1:
                AddItem();
                break;
            case 2:
                ShowItem();
                break;
            case 3:
                Exit();
                break;
        }
    }

    @Override
    public void AddItem() {

        Course st = new Course();
        System.out.println("enter Course id");
        st.setC_id(input.nextInt());
        System.out.println("Enter course name");
        st.setCourseName(input.next());
        System.out.println("enter Course Detail");
        st.setcDetail(input.next());
        list.add(st);

    }

    @Override
    public void ShowItem() {
        for (Course cr : list) {
            System.out.println(cr);
        }
    }

    @Override
    public void Exit() {
        System.exit(0);
    }

}
