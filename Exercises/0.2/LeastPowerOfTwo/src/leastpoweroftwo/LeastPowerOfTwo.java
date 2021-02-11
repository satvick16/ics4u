/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leastpoweroftwo;

import java.util.*;
import java.lang.Math;

/**
 *
 * @author satvi
 */
public class LeastPowerOfTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = Integer.parseInt(reader.nextLine());

        int i = 0;
        while (true) {
            if (Math.pow(2, i) >= num) {
                    break;
            }
            i++;
        }

        int powerOfTwo = (int) Math.pow(2, i);
        System.out.println(powerOfTwo + " is the smallest power of 2 greater than " + num + ".");
    }
    
}
