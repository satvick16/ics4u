/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3;

/**
 *
 * @author satvi
 */
public class Lesson3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // method syntax
        // modifiers: public, private, static
            // public: can be called from "anywhere"
            // static: can be called w/o creating new obj
        // return type: void, String, int...
        // method name: camel cased
        // parameter list: none or list separated by commas
        
        // entry and exit styles
        
        // recap
        int z = add(3, 4);
        System.out.println(z);
        
        printHello();
        
        printIntsUpToN(7);
        
        System.out.println(fib(10));
    }
    
    public static int add(int x, int y) {
        return x + y;
    }
    
    public static void printHello() {
        System.out.println("hello");
    }
    
    public static void printIntsUpToN(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
    
    public static int fib(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        
        for (int i = 0; i < n - 2; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        
        return c;
    }
    
}
