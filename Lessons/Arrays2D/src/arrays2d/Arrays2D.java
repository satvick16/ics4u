/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2d;

import java.util.Arrays;

/**
 *
 * @author satvi
 */
public class Arrays2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // declaring a 2d array
        double[][] decimals1 = new double[2][3];
        double[][] decimals2 = new double[2][];
        double[][] decimals3 = {{3.14, 2.72, 1.62}, 
                                {-1.1, -2.2, -3.3}};
        
        // manual iterate over 2d array
        for (int r = 0; r < decimals3.length; r++) {
            for (int c = 0; c < decimals3[r].length; c++) {
                System.out.printf("decimals[%d][%d]: %.2f %n", 
                                    r, c, decimals3[r][c]);
            } 
        }
        
        // easy iterate over 2d array
        for (double[] row : decimals3) {
            for (double num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        // printing 2d arrays
        System.out.println(Arrays.deepToString(decimals3));
        
        // arbitrary lengths
        int[][] numbers = {{1, 2, 4}, 
                           {-2}, 
                           {-1, 4}};
        
        // n-D arrays
        int[][][] cube = new int[3][3][3];
        
        for (int x = 0; x < cube.length; x++) {
            for (int y = 0; y < cube[x].length; y++) {
                for (int z = 0; z < cube[x][y].length; z++) {
                    System.out.println(cube[x][y][z]);
                }
            }
        }
        
        // passing array params vs. primitives (important)
        int[] x = new int[3];
        System.out.println(Arrays.toString(x));
        allOnes(x);
        System.out.println(Arrays.toString(x));
        
            // arrays are objects and are directly 
            // modified when passed into methods
    }
    
    public static void allOnes(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = 1;
        }
    }
    
}
