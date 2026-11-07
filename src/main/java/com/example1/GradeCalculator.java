
package com.example1;

import java.util.Scanner;

public class GradeCalculator {

    public String calculateGrade(int marks) {

        if (marks < 0 || marks > 100) {
            return "Invalid Marks";
        }
        else if (marks >= 90) {
            return "A";
        }
        else if (marks >= 80) {
            return "B";
        }
        else if (marks >= 40) {
            return "C";
        }
        else {
            return "F";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GradeCalculator gc = new GradeCalculator();

        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        String grade = gc.calculateGrade(marks);

        System.out.println("Student Grade: " + grade);

        sc.close();
    }
}
