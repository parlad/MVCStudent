/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neupane.view;

import com.neupane.controller.ViewController;

/**
 *
 * @author parlad
 */
public class ViewFactory {

    public void CallView() {
        System.out.println("choose the following item in menu");
        System.out.println("1.for Student");
        System.out.println("2.for Course");
        System.out.println("3.for Exit");
        System.out.println("choose [1-3]");

        ViewController ex = new ViewController();
        ex.AllView();

    }

}
