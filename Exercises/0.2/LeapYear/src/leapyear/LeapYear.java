/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear;

import java.util.*;

/**
 *
 * @author satvi
 */
public class LeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = Integer.parseInt(reader.nextLine());
        
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("The year " + year + " is a leap year.");
                } else {
                    System.out.println("The year " + year + " is not a leap year.");
                }
            } else {
                System.out.println("The year " + year + " is a leap year.");
            }
        } else {
            System.out.println("The year " + year + " is not a leap year.");
        }
    }
    
}
