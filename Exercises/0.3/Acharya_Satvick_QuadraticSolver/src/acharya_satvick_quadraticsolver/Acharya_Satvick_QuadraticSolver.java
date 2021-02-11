/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acharya_satvick_quadraticsolver;

import java.util.*;

/**
 *
 * @author satvi
 */
public class Acharya_Satvick_QuadraticSolver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Welcome to Quadratic Equation Solver!");
        
        Scanner reader = new Scanner(System.in);
        System.out.print("a = ");
        double a = Double.parseDouble(reader.nextLine());
        System.out.print("b = ");
        double b = Double.parseDouble(reader.nextLine());
        System.out.print("c = ");
        double c = Double.parseDouble(reader.nextLine());
        
        double D = discriminant(a, b, c);
        System.out.println("The discriminant is " + D + ".");
        int solutions = numSolutions(a, b, c);
        System.out.println("There is/are " + solutions + " solution(s).");
        solveEquation(a, b, c);
    }
    
    public static double discriminant(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        return D;
    }
    
    public static int numSolutions(double a, double b, double c) {
        if (discriminant(a, b, c) > 0) {
            return 2;
        } else if (discriminant(a, b, c) < 0) {
            return 0;
        } else {
            return 1;
        }
    }
    
    public static void solveEquation(double a, double b, double c) {
        if (numSolutions(a, b, c) == 2) {
            double x1 = (-1 * b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            double x2 = (-1 * b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            System.out.printf("The roots are %.2f and %.2f\n", x1, x2);
        }
        if (numSolutions(a, b, c) == 1) {
            double root = (-1 * b / 2 * a);
            System.out.printf("The root is %.2f\n", root);
        }
    }
    
}
