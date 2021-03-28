/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 333526820
 */
public class Circle {
    
    // instance fields
    private double x;
    private double y;
    private double r;
    
    // constructors
    public Circle() {
        this.x = 0.0;
        this.y = 0.0;
        this.r = 1.0;
    }
    
    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = Math.abs(r);
    }
    
    public Circle(Circle other) {
        this.x = other.x;
        this.y = other.y;
        this.r = other.r;
    }
    
    // getters and setters
    public double getX() {
        return this.x;
    }
    
    public double getY() {
        return this.y;
    }
    
    public double getR() {
        return this.r;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    public void setR(double r) {
        this.r = r;
    }
    
    public void setAll(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    
    // override
    @Override
    public String toString() {
        return "Circle: centre at (" + this.x + ", " + this.y + ") and radius " + this.r;
    }
    
    // instance methods (new obj req)
    public double area() {
        return Math.PI * this.r * this.r;
    }
    
    public double circumference() {
        return 2 * Math.PI * this.r;
    }
    
    public double diameter() {
        return this.r * 2;
    }
    
    public Circle smaller(Circle c) {
        if (this.r < c.r) {
            Circle c3 = new Circle(this);
            return c3;
        } else {
            Circle c3 = new Circle(c);
            return c3;
        }
    }
    
    public double distance(Circle c) {
        return Math.pow((Math.abs(this.x-c.x))*(Math.abs(this.x-c.x)) + 
                (Math.abs(this.y-c.y))*(Math.abs(this.y-c.y)), 0.5);
    }
    
    public boolean isInside(Circle c) {
        if (this.distance(c) < c.r) {
            if (this.r < c.r - this.distance(c)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean equals(Circle c) {
        return this.r == c.r;
    }
    
    // class methods (no new obj req)
    public static void printEquation(Circle c) {
        System.out.print("(x ");
        
        if (c.x < 0) {
            System.out.print("+ " + Math.abs(c.x));
        } else {
            System.out.print("- " + c.x);
        }
        
        System.out.print(")² + (y ");
        
        if (c.y < 0) {
            System.out.print("+ " + Math.abs(c.y));
        } else {
            System.out.print("- " + c.y);
        }
        
        System.out.print(")² = " + c.r*c.r);
    }
    
}
