/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makeuppercase;

import java.util.*;

/**
 *
 * @author satvi
 */
public class MakeUppercase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = reader.nextLine();
        String sModified = toUpperCase(s);
        System.out.println("Uppercase Equivalent: " + sModified);
    }
    
    public static String toUpperCase(String s) {
        String newString = "";
        
        for (int i = 0; i < s.length(); i++) {
            if (97 <= s.charAt(i) && s.charAt(i) <= 122) {
                newString += (char) ((int) s.charAt(i) - 32);
            } else {
                newString += s.charAt(i);
            }
        }
        
        return newString;
    }
    
}
