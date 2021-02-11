/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

/**
 *
 * @author satvi
 */
public class Lesson2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // relational operators
        // boolean operators (different)
        // if statements
        // while loops
        // do-while loops
        // for loops
        // nested for loops
        
        // recap
        int counter = 0;
//        while (counter < 10) {
//            counter ++;
//            System.out.println(counter);
//            // counter++;
//        }
        
        do {
            System.out.println(counter);
            counter++;
        } while (counter > 10);
        System.out.println(counter);
        
        for (int i = 10; i > 0; i -= 2) {
            System.out.println(i);
            if (i < 5) {
                System.out.println("less than 5");
            } else if (i > 5) {
                System.out.println("greater than 5");
            }
        }
        
        
    }
    
}
