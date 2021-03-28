/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acharya_satvick_marks;

import java.util.Scanner;

/**
 *
 * @author 333526820
 */
public class Acharya_Satvick_Marks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // ask user for number of students and number of tests
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = Integer.parseInt(reader.nextLine());
        System.out.print("Enter the number of tests: ");
        int numTests = Integer.parseInt(reader.nextLine());
        System.out.println();
        
        // initialize 2d array to store all marks
        int[][] marks = new int[numStudents][numTests];
        
        // get each student's test marks from user and add it to 2d marks array
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter all the test marks for Student " + i + ":");
            for (int j = 0; j < numTests; j++) {
                System.out.print("mark " + j + ": ");
                int mark = Integer.parseInt(reader.nextLine());
                marks[i][j] = mark;
            }
        }
        
        // calculate the average test marks for each student and place in a parallel array
        int[] stuAvgs = findStuAvgs(marks);
        
        // neatly print each student's marks and average
        printAllMarks(marks, stuAvgs);
        
        // calculate and print class average
        int classAvg = findClassAvg(stuAvgs);
        System.out.println("Class average: " + classAvg + "\n");
        
        // find student with highest average and print their info
        printBestStuInfo(stuAvgs);
        
        // print "names" of all students with averages higher than or equal to the class average
        printGoodStudents(stuAvgs, classAvg);
    }
    
    public static int[] findStuAvgs(int[][] marks) {
        // initialize parallel array to store each student's average
        int[] stuAvgs = new int[marks.length];
        
        // calculate each student's average and add it to parallel stuAvgs array
        for (int student = 0; student < marks.length; student++) {
            int sum = 0;
            for (int test = 0; test < marks[0].length; test++) {
                sum += marks[student][test];
            }
            // average is calculated by dividing sum of marks by number of tests
            int avg = sum / marks[0].length;
            stuAvgs[student] = avg;
        }
        
        return stuAvgs;
    }
    
    public static void printAllMarks(int[][] marks, int[] stuAvgs) {
        System.out.println("\nThe test marks:");
        
        // print each student's marks in each test separated by commas
        for (int student = 0; student < stuAvgs.length; student++) {
            System.out.println("Student " + student);
            System.out.print("marks: ");
            
            for (int test = 0; test < marks[0].length-1; test++) {
                System.out.print(marks[student][test] + ", ");
            }
            // to avoid having an extra comma at the end of the line, print the last mark on its own
            System.out.println(marks[student][marks[0].length-1]);
            
            // print the student's average
            System.out.println("average: " + stuAvgs[student] + "\n");
        }
    }
    
    public static int findClassAvg(int[] stuAvgs) {
        int sum = 0;
        
        // sum all student averages
        for (int avg : stuAvgs) {
            sum += avg;
        }
        
        // calculate class average by dividing sum by the number of students
        int avg = sum / stuAvgs.length;
        
        return avg;
    }
    
    public static void printBestStuInfo(int[] stuAvgs) {
        // by default, the student with the highest average is student 0
        int bestStu = 0;
        
        // find student with highest average by checking through each student avg
        for (int stu = 0; stu < stuAvgs.length; stu++) {
            // check if the student's avg is higher than the highest avg so far
            if (stuAvgs[stu] > stuAvgs[bestStu]) {
                bestStu = stu;
            }
        }
        
        System.out.println("Highest average: Student " + bestStu + ", average " + stuAvgs[bestStu] + "\n");
    }
    
    public static void printGoodStudents(int[] stuAvgs, int classAvg) {
        System.out.println("Students above class average:");

        // check if each student's avg is higher than or equal to the class avg
        // if so, print their "name" on a new line
        for (int stu = 0; stu < stuAvgs.length; stu++) {
            if (stuAvgs[stu] >= classAvg) {
                System.out.println("Student " + stu);
            }
        }
    }
    
}
