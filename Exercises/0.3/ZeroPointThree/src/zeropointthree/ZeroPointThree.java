/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeropointthree;

/**
 *
 * @author satvi
 */
public class ZeroPointThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static int doubleInt(int num) {
        int doubleNum = 2 * num;
        return doubleNum;
    }
    
    public static double average(double a, double b, double c) {
        double average = (a + b + c) / 3;
        return average;
    }
    
    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public static double circumference(double radius) {
        double circleCircumference = 2 * Math.PI * radius;
        return circleCircumference;
    }
    
    public static double velocity(double d, double t) {
        double v = d / t;
        return v;
    }
    
    public static int factorial(int n) {
        int fact = 1;
        for (int i = n; i > 1; i--) {
            fact *= i;
        }
        return fact;
    }
    
    public static boolean isEven(int n) {
        if (n%2 == 0) {
            return true;
        }
        return false;
    }
    
}
