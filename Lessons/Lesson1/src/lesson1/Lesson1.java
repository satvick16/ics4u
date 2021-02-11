/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1;

import java.util.*;

/**
 *
 * @author satvi
 */
public class Lesson1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // printing
        // escape sequences
        // string length
        // primitive data types (boolean, char, int, double)
        // non-primitive data types (string, array)
        // immutability
        // casting: (double) vs. dividing by 3.0 to avoid integer division
        // constants
        // scanner class (nextLine, Integer.parseInt, Double.parseDouble)

        // recap
        int n = 2;
        int m = -5;
        double x = 3.4;
        double y = -9.9;
        char c = 'j';
        String text = "java";
        System.out.println(text);
        System.out.println(c);
        System.out.println(x);
        text = "code";
        System.out.println(text);
        double z = Double.parseDouble("5.5");

        // simple program: name and greeting
        Scanner reader = new Scanner(System.in);

        String name;
        int age;

        System.out.print("Enter your name: ");
        name = reader.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.print("How old are you " + name + "? ");
        age = Integer.parseInt(reader.nextLine());
        int birthYear = 2021 - age;
        System.out.println("You were probably born in: " + birthYear);
    }
    
}
