/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypt;

import java.util.*;

/**
 *
 * @author satvi
 */
public class Encrypt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a message to be encrypted: ");
        String original = reader.nextLine();
        String cipherText = encrypt(original);
        System.out.println("The cipher text is: " + cipherText);
    }
    
    public static String encrypt(String s) {
        String newString = "";
        
        if (s.length() < 3) {
            if (s.length() == 2) {
                char firstChar = s.charAt(0);
                char lastChar = s.charAt(s.length()-1);
                newString += lastChar;
                newString += firstChar;
            } else {
                // figure out what to do here
            }
        }
        
        newString += s.charAt(s.length()-1);
        s = s.substring(0, s.length()-1);
        
        char firstChar = s.charAt(0);
        s = s.substring(1, s.length());
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                newString += ' ';
            } else {
                newString += (char) ((int) s.charAt(i) + 2);
            }
        }
        
        newString += firstChar;
        
        return newString;
    }
    
}
