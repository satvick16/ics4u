/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

/**
 *
 * @author satvi
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int p = 2;
//        int q = 1;
//        int r = 3;
//        String s = "tom";
//        
//        System.out.println((q + r) == 2 || r >= p);
//        System.out.println(!(p < r));
//        System.out.println((q == p) && (r < 6));
//        System.out.println((p + q) % 3 == 0);
//        System.out.println("tom".equals(s));
        
//        int y = 5.5;
//        char d = "d";
//        String s = "java";
//        double m = 4;
//        boolean o = True;
//        int x;
//        char c = 97;
//        int n = 4;

//        int num = 3;
//        
//        if (num == 2) {
//            num = 1;
//            System.out.print("bird");
//        } else if (num < 2) {
//            num = 3;
//            System.out.print("cat");
//        } else {
//            System.out.print("fish");
//        }
//        if (num == 1) {
//            num = 3;
//            System.out.println("rabbit");
//        }
//        if (num == 3) {
//            System.out.println("dog");
//        }

//        String s = "spam and eggs";
//        System.out.println(s.substring(9) + s.substring(5, 8) + s.substring(0, 4));
        
//        System.out.print(3 * 8);
//        System.out.print("hel" + 10);
//        System.out.print('!');

//        int num = 4;
//        while (num <= 12) {
//            num = num + 4;
//            System.out.print(num + ",");
//        }

    }
    
    public static double convertUsdToCad(double cad) { 
        double usd = 0.79 * cad; 
        return usd;
    }
    
    public static void printChars(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
    
    public static double doubleSum(double x, int n) {
        double summation = 0;
        
        for (int i = 1; i <= n; i++) {
            double intermediate = 1;
            
            for (int j = 1; j <= i; j++) {
                intermediate *= x;
            }
            
            summation += 1 / intermediate;
        }
        
        return summation;
    }
    
}
