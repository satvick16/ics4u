/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractions;

/**
 *
 * @author 333526820
 */
public class Fractions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fraction f = new Fraction(-1, 2);
        System.out.println(f);
        System.out.println(f.getNumerator());
//        f.setNumerator(3);
        System.out.println(f);
        System.out.println(f.toDecimal());
        
        Fraction g = new Fraction(2, -4);
        System.out.println("f > g? " + f.greaterThan(g));
        
        System.out.println("f = g? " + f.equals(g));
        
        Fraction h = Fraction.product(f, g);
        System.out.println("f * g = " + h);
    }
    
}
