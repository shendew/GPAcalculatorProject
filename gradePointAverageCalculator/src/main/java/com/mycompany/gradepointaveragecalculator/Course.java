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
        
        if(score < 40) {
            point = 0;
        }else if(score  < 45) {
            point = 1;
        }else if(score < 50) {
            point = 2;
        }else if(score < 60) {
            point = 3;
        }else if(score < 70) {
            point = 4;
        }else if(score < 100) {
            point = 5;
        }
        
        return point;
    };
}
