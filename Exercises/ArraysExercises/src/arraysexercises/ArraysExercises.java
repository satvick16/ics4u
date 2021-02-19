/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysexercises;

import java.util.*;

/**
 *
 * @author satvi
 */
public class ArraysExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Q1();
        // Q2();
        Q3();
    }
    
    public static void Q1() {
        // initialize array of size n
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = Integer.parseInt(reader.nextLine());
        System.out.println("");
        
        int[] nums = new int[n];
        
        // initialize all values to 1        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 1;
        }
        
        // get user input for numbers to populate array
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            int arrayNum = Integer.parseInt(reader.nextLine());
            nums[i] = arrayNum;
        }
        
        // switch first and last values
        int first = nums[0];
        int last = nums[nums.length-1];
        nums[0] = last;
        nums[nums.length-1] = first;
        
        // change all negative elements to positive numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] *= -1;
            }
        }
        
        // print "*" for each element
        for (int num : nums) {
            for (int i = 1; i <= num; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        // print all even elements
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
    
    public static void Q2() {
        int[] arr = {13, 60, 50, 46, 56, 83, 22, 71};
        
        // part (a)
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        
        System.out.println("");
        
        // part (b)
        int[] newArr = new int[arr.length];
        
        for (int i = arr.length - 1; i >= 0; i--) {
            newArr[arr.length-1-i] = arr[i];
        }
        
        for (int num : newArr) {
            System.out.println(num);
        }
    }
    
    public static void Q3() {
        
    }
    
}
