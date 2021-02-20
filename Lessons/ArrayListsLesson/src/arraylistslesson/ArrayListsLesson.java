/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistslesson;

import java.util.*;

/**
 *
 * @author satvi
 */
public class ArrayListsLesson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // declaring an ArrayList
        ArrayList<Integer> myList1 = new ArrayList<>();
        ArrayList<String> myList2 = new ArrayList<>();
        ArrayList<Character> myList3 = new ArrayList<>();
        ArrayList<ArrayList> myList4 = new ArrayList<>();
        
        int obj = 4;
        
        myList1.add(obj);
        myList1.add(2);
        myList1.add(9);
        myList1.add(-2);
        myList1.remove(obj);
        myList1.remove(0);
        myList1.get(0);
        
        int x = myList1.size();
        boolean y = myList1.contains(5);
        
        System.out.println(myList1); // printing ArrayList
        
        // iterating over ArrayLists
        for (int i = 0; i < myList1.size(); i++) {
            System.out.println(myList1.get(i));
        }
        
        for (int num : myList1) {
            System.out.println(num);
        }
        
        // ordering, reversing, shuffling
        Collections.sort(myList1);
        Collections.reverse(myList1);
        Collections.shuffle(myList1);
        
        // recap
        ArrayList<String> names = new ArrayList<>();
        names.add("Jacky");
        names.add("Tony");
        System.out.println(names);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(0);
        System.out.println(numbers);
        
        numbers.remove(0); // remove by index
        numbers.remove((Integer) 0); // remove object
        System.out.println(numbers);
        
    }
    
}
