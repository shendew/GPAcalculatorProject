/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gradepointaveragecalculator;

/**
 *
 * @author henry
 */
public class Course {
    private String courseName;
    private int score;
    private int unitLoad;
    
    public Course(String name, int score, int uLoad) {
        this.courseName = name;
        this.score = score;
        this.unitLoad = uLoad;
    };
    
    int getQualityPoint() {
        return getGradePoint() * getUnitLoad();
    };
    
    int getUnitLoad() {
        return unitLoad;
    }
    
    int getGradePoint() {
        int point = 0;
        
        point = (score < 40) ? 0 : (score < 45) ? 1 : (score < 50) ? 2 : (score < 60) ? 3 : (score < 70) ? 4 : 5;

        return point;
    };
}
