/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gradepointaveragecalculator;

import java.util.Scanner;

/**
 *
 * @author henry
 */
public class GradePointAverageCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Course[] courses = new Course[8];
        Semester semester = new Semester(courses);

        int score;
        String courseName;
        int unitLoad;

        // Get semester courses
        for (int j = 0; j < courses.length; ++j) {
            System.out.print("\nEnter course name: ");
            courseName = input.next();
            System.out.printf("Enter score for %s: ", courseName);
            score = input.nextInt();
            System.out.printf("Enter Unit Load for %s: ", courseName);
            unitLoad = input.nextInt();

            courses[j] = new Course(courseName, score, unitLoad);
        }
        input.close();
        System.out.printf("\n\nYour GPA for this semester is : %.2f", semester.getSemesterGPA());
    }
}
