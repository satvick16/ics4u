/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayslesson;

import java.util.Arrays;

/**
 *
 * @author satvi
 */
public class ArraysLesson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] numbers = new int[5]; // all values default to 0
        int[] nums = {5, 6, 0, 1};
        
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        // arrays are of constant size
        
        int x = nums.length;
        System.out.println(Arrays.toString(nums));
        
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= 2;
        }
        
        // better array iteration:
        for (int num : nums) {
            System.out.println(num);
        }
        
        // printing arrays
        System.out.println(Arrays.toString(nums));
    }
    
}
