package filesexercises;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FilesExercises {

    /*
    Exercises.
    There are two files in this project in the src folder. You can view them
    in NetBeans, but don't change them! Don't forget to CLOSE the files when 
    you are done with them! (There is a lot of opening and closing -- this is 
    done on purpose for practice.)
     */
    public static void main(String[] args) {
        // note the forward slash rather than back slash in the file path
        File words = new File("src/words.txt");
        // change the line below to open numbers.txt
        File numbers = new File("src/numbers.txt");
        Scanner reader = null;
        String line;

        // Exercise 0: Open the file words.txt and print each line
        System.out.println("Exercise 0");
        
        try {
            reader = new Scanner(words);
            
            while (reader.hasNext()) {
                line = reader.nextLine();
                System.out.println(line);
            }
            
            reader.close();
            System.out.println("");
        } catch (IOException iox) {
            System.out.println(iox.getMessage());
        }
        
        // close the file after each exercise when done
        
        

        // Exercise 1: Open the file words.txt and print each 
        //             word on its own line
        System.out.println("Exercise 1");
        
        try {
            reader = new Scanner(words);
            String word;
            
            while (reader.hasNext()) {
                word = reader.next();
                System.out.println(word);
            }
            
            reader.close();
            System.out.println("");
        } catch (IOException iox) {
            System.out.println(iox.getMessage());
        }

        // Exercise 2: Open the file words.txt and add each 
        //             word to an ArrayList of Strings
        System.out.println("Exercise 2");

        try {
            reader = new Scanner(words);
            String word;
            
            ArrayList<String> strings = new ArrayList<>();
            
            while (reader.hasNext()) {
                word = reader.next();
                strings.add(word);
            }
            
            reader.close();
            
            System.out.println(strings);
            System.out.println("");
        } catch (IOException iox) {
            System.out.println(iox.getMessage());
        }
        
        // Exercise 3: Open the file numbers.txt and find and
        //             print the sum of the integers
        System.out.println("Exercise 3");
        
        try {
            reader = new Scanner(numbers);
            int number;
            int sum = 0;
            
            while (reader.hasNext()) {
                number = reader.nextInt();
                sum += number;
            }
            
            reader.close();
            System.out.println("sum = " + sum);
            System.out.println("");
        } catch (IOException iox) {
            System.out.println(iox.getMessage());
        }
        
        // Exercise 4: Open the file numbers.txt and add each 
        //             integer to an ArrayList<Integer>; print the list;
        //             compute and print the sum of the ArrayList
        System.out.println("Exercise 4");
        
        try {
            reader = new Scanner(numbers);
            int number;
            ArrayList<Integer> nums = new ArrayList<>();
            
            while (reader.hasNext()) {
                number = reader.nextInt();
                nums.add(number);
            }
            
            reader.close();
            System.out.println(nums);
            
            int sum = 0;
            
            for (int num : nums) {
                sum += num;
            }
            
            System.out.println("sum = " + sum);
            System.out.println("");
        } catch (IOException iox) {
            System.out.println(iox.getMessage());
        }
        
        // Exercise 5: Open the file numbers.txt and add them
        //             to a 3x10 array of int, where the first row of the file
        //             is the first row of the array, etc. Print the array.
        System.out.println("Exercise 5");
        
        try {
            reader = new Scanner(numbers);
            int[][] nums = new int[3][10];
            
            int i = 0;
            int j = 0;
            
            while (reader.hasNext()) {
                if (i == 3) {
                    break;
                }
                
                if (j == 10) {
                    i++;
                    j = 0;
                    continue;
                }
                
                nums[i][j] = reader.nextInt();
                
                j++;
            }
            
            reader.close();
            System.out.println(Arrays.deepToString(nums));
        } catch (IOException iox) {
            System.out.println(iox.getMessage());
        }
        
    }

}
