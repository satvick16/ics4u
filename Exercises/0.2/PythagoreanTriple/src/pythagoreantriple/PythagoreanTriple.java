/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagoreantriple;

import java.util.*;
import java.lang.Math;

/**
 *
 * @author satvi
 */
public class PythagoreanTriple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = Integer.parseInt(reader.nextLine());
        
        System.out.println("Pythagorean Triples: ");
        
        for (int c = 5; c <= num; c++) {
            for (int a = 3; a < c; a++) {
                for (int b = a+1; b < c; b++) {
                    if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                        if (!(isComposite(a) && isComposite(b) && isComposite(c))) {
                            System.out.println("(" + a + ", " + b + ", " + c + ")");
                        }
                    }
                }
            }
        }
    }
    
    public static boolean isComposite(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }
    
}
