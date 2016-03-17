/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neupane.controller;

/**
 *
 * @author parlad
 */
public class ControllerFactory {

    public void function(int i, StudentController st) {

        switch (i) {
            case 1:
                st.AddItem();
                break;
            case 2:
                st.ShowItem();
                break;
            default:
                st.Exit();
        }

    }
}
