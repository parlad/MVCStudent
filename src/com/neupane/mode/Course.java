/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neupane.mode;

/**
 *
 * @author parlad
 */
public class Course {

    int c_id;
    String courseName, cDetail;

    public Course() {
    }

    public Course(int c_id, String courseName, String cDetail) {
        this.c_id = c_id;
        this.courseName = courseName;
        this.cDetail = cDetail;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getcDetail() {
        return cDetail;
    }

    public void setcDetail(String cDetail) {
        this.cDetail = cDetail;
    }

    @Override
    public String toString() {
        return "Course{" + "c_id=" + c_id + ", courseName=" + courseName + ", cDetail=" + cDetail + '}';
    }

}
