/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gradepointaveragecalculator;

/**
 *
 * @author henry
 */
public class Semester {
     private Course[] courses = new Course[10];
    private double GPA;
    private int totalGradePoint = 0, totalUnitLoad = 0;
    
    public Semester(Course[] semCourse) {
        this.courses = semCourse;
    }
    
    double getSemesterGPA() {
        GPA = (double) getTotalQualityPoint() / getTotalUnitLoad();
        
        return GPA;
    };
    
    int getTotalQualityPoint() {
        for(int i = 0; i < courses.length;++i) {
            totalGradePoint += courses[i].getQualityPoint();
        }
        
        return totalGradePoint;
    };
    
    int getTotalUnitLoad() {
       for(int i = 0;i < courses.length;++i) {
           totalUnitLoad += courses[i].getUnitLoad();
       } 
       
       return totalUnitLoad;
    };
}
