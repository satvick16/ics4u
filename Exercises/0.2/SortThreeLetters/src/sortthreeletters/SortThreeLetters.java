/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortthreeletters;

import java.util.*;

/**
 *
 * @author satvi
 */
public class SortThreeLetters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner reader = new Scanner(System.in);
        String initial = "";

        System.out.println("Enter a single letter followed by 'Enter':");

        for (int i = 1; i <= 3; i++) {
            String letter = reader.nextLine();
            initial += letter;
        }

        String sorted = "";
        sorted += initial.charAt(0);
        
        if (initial.charAt(1) <= initial.charAt(0)){
            sorted = initial.charAt(1) + sorted;
        } else {
            sorted += initial.charAt(1);
        }
        
        if (initial.charAt(2) <= sorted.charAt(0) && initial.charAt(2) <= sorted.charAt(1)) {
            System.out.println(initial.charAt(2) + sorted);
        } else if (initial.charAt(2) >= sorted.charAt(0) && initial.charAt(2) <= sorted.charAt(1)) {
            System.out.println(sorted.charAt(0) + initial.charAt(2) + sorted.charAt(1));
        } else {
            System.out.println(sorted + initial.charAt(2));
        }
    }
    
    public static void arrayMethod() {
        Scanner reader = new Scanner(System.in);
        String initial = "";

        System.out.println("Enter a single letter followed by 'Enter':");

        for (int i = 1; i <= 3; i++) {
            String letter = reader.nextLine();
            initial += letter;
        }
        
        char[] x = initial.toCharArray();
        Arrays.sort(x);
        
        for (int i = 0; i <= 3; i++) {
            System.out.print(x[1]);
        }
    }
    
}
