/*  

Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

Marks        Grade 

91-100         AA 

81-90          AB 

71-80          BB 

61-70          BC 

51-60          CD 

41-50          DD 

<=40          Fail

*/

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter marks : ");
        int marks = in.nextInt();
        System.out.println(grade(marks));
    }
    static String grade (int marks) {
        String grade = "";
        if (marks >= 91 && marks <= 100) {
            grade = "AA";
        }
        else if (marks >= 81 && marks <= 90) {
            grade = "AB";
        }
        else if (marks >= 71 && marks <= 80) {
            grade = "BB";
        }
        else if (marks >= 61 && marks <= 90) {
            grade = "BC";
        }
        else if (marks >= 51 && marks <= 90) {
            grade = "CD";
        }
        else if (marks >= 41 && marks <= 90) {
            grade = "DD";
        }
        else if (marks <= 40) {
            grade = "Fail";
        }
        else {
            grade = "Marks should not be greater than 100";
        }
        return grade;
    }
}
