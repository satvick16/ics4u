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
        
        
        
        
        return newString;
    }
    
}
