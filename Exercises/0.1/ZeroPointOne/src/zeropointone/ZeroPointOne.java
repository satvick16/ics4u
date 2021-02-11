/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeropointone;

import java.util.*;

/**
 *
 * @author satvi
 */
public class ZeroPointOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Q2();
        Q3();
        Q4();
    }
    
    public static void Q2() {
        Scanner nums = new Scanner(System.in);

        System.out.print("Num 1: ");
        double a = Double.parseDouble(nums.nextLine());
        System.out.print("Num 2: ");
        double b = Double.parseDouble(nums.nextLine());
        System.out.print("Num 3: ");
        double c = Double.parseDouble(nums.nextLine());

        double mean = (a + b + c) / 3;
        System.out.println("mean = " + mean);
    }

    public static void Q3() {
        final double B = 1.69;
        final double F = 1.09;
        final double D = 0.99;

        Scanner reader = new Scanner(System.in);

        System.out.print("Burgers: ");
        double burgers = Double.parseDouble(reader.nextLine());
        System.out.print("Fries: ");
        double fries = Double.parseDouble(reader.nextLine());
        System.out.print("Drinks: ");
        double drinks = Double.parseDouble(reader.nextLine());

        double subtotal = B * burgers + F * fries + D * drinks;
        System.out.println("Subtotal = " + subtotal);

        double pst = subtotal * 0.08;
        double gst = subtotal * 0.05;
        System.out.println("PST = " + pst);
        System.out.println("GST = " + gst);

        double total = subtotal + pst + gst;
        System.out.println("Total = " + total);

        System.out.print("Amount tendered: ");
        double amountTendered = Double.parseDouble(reader.nextLine());
        double change = amountTendered - total;
        System.out.println("Change = " + change);
    }

    public static void Q4() {
        Scanner number = new Scanner(System.in);
        System.out.print("Number: ");
        int num = Integer.parseInt(number.nextLine());

        int digitsum = (num%10) + (num%100/10) + (num%1000/100);
        System.out.println("Sum of digits = " + digitsum);
    }
    
}
