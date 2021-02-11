/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addpairs;

import java.util.*;

/**
 *
 * @author satvi
 */
public class AddPairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner reader = new Scanner(System.in);
        System.out.print("Input: ");
        String num = reader.nextLine();
        
        int sum = 0;
        
        if (num.length() % 2 == 0) {
            for (int i = 0; i <= num.length() - 2; i += 2) {
                sum += Integer.parseInt(num.substring(i, i+2));
            }
        } else {
            for (int i = 0; i <= num.length() - 3; i += 2) {
                sum += Integer.parseInt(num.substring(i, i+2));
            }
            sum += Integer.parseInt(Character.toString(num.charAt(num.length()-1)));
        }
        
        System.out.println("Output: " + sum);
    }
    
}
