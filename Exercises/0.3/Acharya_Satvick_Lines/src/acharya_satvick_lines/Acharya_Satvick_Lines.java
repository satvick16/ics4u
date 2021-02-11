/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acharya_satvick_lines;

import java.util.*;

/**
 *
 * @author satvi
 */
public class Acharya_Satvick_Lines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Please enter the coordinates of two points on line segment 1:");
        
        System.out.print("point A x-value: ");
        double xA = Double.parseDouble(reader.nextLine());
        System.out.print("point A y-value: ");
        double yA = Double.parseDouble(reader.nextLine());
        System.out.println("");
        System.out.print("point B x-value: ");
        double xB = Double.parseDouble(reader.nextLine());
        System.out.print("point B y-value: ");
        double yB = Double.parseDouble(reader.nextLine());
        System.out.println("");
                     
        System.out.println("Please enter the coordinates of two points on line segment 2:");
        
        System.out.print("point C x-value: ");
        double xC = Double.parseDouble(reader.nextLine());
        System.out.print("point C y-value: ");
        double yC = Double.parseDouble(reader.nextLine());
        System.out.println("");
        System.out.print("point D x-value: ");
        double xD = Double.parseDouble(reader.nextLine());
        System.out.print("point D y-value: ");
        double yD = Double.parseDouble(reader.nextLine());
        System.out.println("");
        
        System.out.println("Results:");
        double line1Length = calcLength(xA, xB, yA, yB);
        double line2Length = calcLength(xC, xD, yC, yD);
        
        if (line1Length == line2Length) {
            System.out.println("The two line segments have the same length.");
        } else {
            System.out.println("The two line segments do not have the same length.");
        }
        
        double line1Slope = calcSlope(xA, xB, yA, yB);
        double line2Slope = calcSlope(xC, xD, yC, yD);
        
        if (line1Slope == line2Slope) {
            System.out.println("The two line segments are parallel.");
            System.exit(0);
        }
        
        if (line1Slope == Double.POSITIVE_INFINITY || line1Slope == Double.NEGATIVE_INFINITY) {
            if (line2Slope == (double) 0) {
                System.out.println("The two line segments are perpendicular.");
                System.exit(0);
            } else {
                System.out.println("The two line segments are neither parallel nor perpendicular.");
                System.exit(0);
            }
        }
        
        if (line2Slope == Double.POSITIVE_INFINITY || line2Slope == Double.NEGATIVE_INFINITY) {
            if (line1Slope == (double) 0) {
                System.out.println("The two line segments are perpendicular.");
                System.exit(0);
            } else {
                System.out.println("The two line segments are neither parallel nor perpendicular.");
                System.exit(0);
            }
        }
        
        if (-1 / line1Slope == line2Slope) {
            System.out.println("The two line segments are perpendicular.");
        } else {
            System.out.println("The two line segments are neither parallel nor perpendicular.");
        }
    }
    
    public static double calcSlope(double x1, double x2, double y1, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        return slope;
    }
    
    public static double calcLength(double x1, double x2, double y1, double y2) {
        double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return length;
    }
    
}
