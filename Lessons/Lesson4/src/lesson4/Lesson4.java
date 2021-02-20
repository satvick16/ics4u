/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

/**
 *
 * @author satvi
 */
public class Lesson4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // declaring strings (two ways)
        // careful: (see below)
        System.out.println("My age is: " + 10 + 7);
        System.out.println("My age is: " + (10 + 7));
        
        // string indexing
        // .length()
        // .charAt()
        // .substring()
            // "abcd".substring(beginIndex, endIndex)
            // returns string from beginIndex to endIndex-1
        
        // iterating through strings
        // comparing ascii values of chars
        // chars have '', strings have ""
        // .contains()
        // .indexOf()
        // .valueOf()
        
        // comparing strings (memory location vs. chars)
        String name = new String("Alan");
        String nom = new String("Alan");
        String nombre = name;
            // name == nombre -> true
            // name == nom -> false
            // name.equals(nom) -> true
            // name.equals(nombre) -> true
            // name.equals("Alan") -> true
        
        // converting char to String
        String x = Character.toString('x');
        String y = String.valueOf('y');
        String z = "" + 'z'; // desperate
    }
    
}
