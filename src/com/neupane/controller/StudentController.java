/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neupane.controller;

import com.neupane.mode.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author parlad
 */
public class StudentController extends Controller {

    List<Student> list = new ArrayList();

    Scanner sc = new Scanner(System.in);

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

        Student st = new Student();
        System.out.println("enter id");
        st.setId(sc.nextInt());
        System.out.println("Enter the first name");
        st.setName(sc.next());
        System.out.println("enter address");
        st.setAddress(sc.next());
        System.out.println("enter contact");
        st.setContact(sc.next());
        list.add(st);

    }

    @Override
    public void ShowItem() {
        for (Student st : list) {
            System.out.println(st);
        }
    }

    @Override
    public void Exit() {
        System.exit(0);
    }

}
