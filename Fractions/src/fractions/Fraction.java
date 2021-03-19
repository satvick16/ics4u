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
public class Fraction {
    
    private int numerator;
    private int denominator;
    
    // constructors
    public Fraction(int numerator, int denominator) {
        // just like "self" in Python
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public Fraction (Fraction other) {
        this.numerator = other.numerator;
        this.denominator = other.denominator;
    }
    
    // getters and setters
    public int getNumerator() {
        return this.numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    
    public int getDenominator() {
        return this.denominator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    public void setBoth(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
    
    // instance methods (not static)
    // (new Fraction object must be created to use these methods)
    public double toDecimal() {
        return (double) this.numerator / this.denominator;
    }
    
    public boolean greaterThan(Fraction other) {
        return this.toDecimal() > other.toDecimal();
    }
    
    public Fraction multiply(Fraction other) {
        Fraction product = new Fraction(this.numerator * other.numerator, 
                                        this.denominator * other.denominator);
        return product;
    }
    
    public Fraction add(Fraction other) {
        return new Fraction(this.numerator*other.denominator + 
                            this.denominator*other.numerator, 
                            this.denominator*other.denominator);
    }
    
    public boolean equals(Fraction other) {
        return this.numerator*other.denominator == this.denominator*other.numerator;
    }
    
    public void timesEquals(Fraction other) {
        this.numerator *= other.numerator;
        this.denominator *= other.denominator;
    }
    
    public void plusEquals(Fraction other) {
        
    }
    
    public void integerMultiply(int k) {
        this.numerator *= k;
    }
    
    public void reduce() {
        if (this.numerator < 0) {
            if (this.denominator < 0) {
                this.numerator *= -1;
                this.denominator *= -1;
            }
        } else {
            if (this.denominator < 0) {
                this.numerator *= -1;
                this.denominator *= -1;
            }
        }
        
        if (Math.abs(this.numerator) > Math.abs(this.denominator)) {
            for (int i = this.denominator / 2; i >= 2; i--) {
                if (this.numerator % i == 0 && this.denominator % i == 0) {
                    this.numerator /= i;
                    this.denominator /= i;
                }
            }
        } else {
            for (int i = this.numerator / 2; i >= 2; i--) {
                if (this.numerator % i == 0 && this.denominator % i == 0) {
                    this.numerator /= i;
                    this.denominator /= i;
                }
            }
        }
    }
    
    public Fraction reciprocal() {
        return new Fraction(this.denominator, this.numerator);
    }
    
    public Fraction divide(Fraction other) {
        Fraction quotient = new Fraction(this.numerator * other.denominator, 
                                        this.denominator * other.numerator);
        return quotient;
    }
    
    // class methods
    public static Fraction product(Fraction f1, Fraction f2) {
        return f1.multiply(f2);
    }
    
    public static Fraction sum(Fraction f1, Fraction f2) {
        return f1.add(f2);
    }
    
    public static Fraction difference(Fraction f1, Fraction f2) {
        
    }
    
    public static Fraction quotient(Fraction f1, Fraction f2) {
        return f1.divide(f2);
    }
    
}
