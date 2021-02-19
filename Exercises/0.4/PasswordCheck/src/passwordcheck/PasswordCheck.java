/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordcheck;

import java.util.*;

/**
 *
 * @author satvi
 */
public class PasswordCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        while (true) {
            Scanner reader = new Scanner(System.in);
            
            System.out.print("Please enter a new password: ");
            String pwd1 = reader.nextLine();
            System.out.print("Please re-enter the password: ");
            String pwd2 = reader.nextLine();
            
            System.out.println("");
            
            if (pwd1.equals(pwd2)) {
                if (pwd1.length() > 8) {
                    
                } else {
                    System.out.println("The password strength is invalid!\n");
                }
            } else {
                System.out.println("Passwords do not match. Try again.\n");
            }
        }
    }
    
}
