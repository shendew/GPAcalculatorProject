> This Program should be run on Apache Netbean

This project calculate GPA for a particular semester, we clearly used **Object Oriented programming** concept in the implementation of this program.


We define two classes, **Semester** and **Course** class. 

##### Semester Class
    Properties:
        Courses: Array of Course class
        GPA: contain GPA value
        totalGradePoint: contain sum of courses grade Point
        totalUnitLoad: contain sum of courses unit Load

    Methods:
        getSemesterGPA(): 
            return the division of getTotalQualityPoint() by getTotalUnitLoad()
        getTotalQualityPoint():
            return the total quality points of all courses
        getTotalUnitLoad():
             return the total unit Loads of all courses 

##### Course class
    Properties:
        courseName: contain course name
        unitLoad: contain course unit load
        score: contain the score obtained in course
    
    Methods:
        getQualityPoint():
            return the product of course unit Load and grade numeric equivalent e.g A = 5

        getUnitLoad():
            To obey data abstraction, we chose to return the unit load by this function.

        getGradePoint():
            return the grade numeric equivalent of score e.g 70 is assigned A and A is 5.

#### Main function

        We import the Scanner class to get the name, score and unit
        load of course. Create an array of Course class to contain the
        courses(8 courses).

        We loop to get the name, score and unit load of courses from user
        and declare a new course class to be stored within the next index
        of the courses array. 
        
        Then we displayed the semester GPA by calling the semester class
        getSemesterGPA method inside a System.out.printf() as argument.


 
***Bugs***

    1. PROBLEM: The output for the double GPA variable was displaying a 
       six decimal place float but we wanted 2.

       SOLUTION: We used System.out.printf(), which allow us to specify
       number of decimals we want with %.2f, and passing the variable
       as an argument to the System.out.printf() function


#### Debugging
We added **breakpoint** at line 9, 25 and 28 in the **main** function of **GPAcalculator** class. Stepping into them and their analyzing their implementation and variable, to ensure that every thing works fine.
