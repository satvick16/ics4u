/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangles;

/**
 * Objects of this class are rectangles with a location (denoted by the
 * coordinates of the bottom-left vertex), a length and a width.
 *
 * @author Satvick Acharya
 */
public class Rectangle {

    private double x;
    private double y;
    private double length;
    private double width;

    /**
     * Create a default Rectangle with dimensions 1*1 and bottom-left vertex at
     * the origin.
     */
    public Rectangle() {
        this.x = 0;
        this.y = 0;
        this.length = 1.0;
        this.width = 1.0;
    }

    /**
     * Create new Rectangle object with provided location and dimensions.
     *
     * @param x The x-coordinate of the bottom-left vertex
     * @param y The y-coordinate of the bottom-left vertex
     * @param length The length
     * @param width The width
     */
    public Rectangle(double x, double y, double length, double width) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;
    }

    /**
     * Create new Rectangle object with the same location and dimensions as
     * another Rectangle.
     *
     * @param other Another Rectangle
     */
    public Rectangle(Rectangle other) {
        this.x = other.x;
        this.y = other.y;
        this.length = other.length;
        this.width = other.width;
    }

    /**
     * Get the x-coordinate of the bottom-left vertex of the Rectangle.
     *
     * @return the x-coordinate
     */
    public double getX() {
        return this.x;
    }

    /**
     * Get the y-coordinate of the bottom-left vertex of the Rectangle.
     *
     * @return the y-coordinate
     */
    public double getY() {
        return this.y;
    }

    /**
     * Get the length of the Rectangle.
     *
     * @return the length
     */
    public double getLength() {
        return this.length;
    }

    /**
     * Get the width of the Rectangle.
     *
     * @return the width
     */
    public double getWidth() {
        return this.width;
    }

    /**
     * Edit the location and dimensions of a Rectangle all at once.
     *
     * @param x The x-coordinate of the bottom-left vertex
     * @param y The y-coordinate of the bottom-left vertex
     * @param length The length
     * @param width The width
     * @return None
     */
    public void setAll(double x, double y, double length, double width) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;
    }

    /**
     * Generate a well-formatted String representation of a Rectangle.
     *
     * @return the String representation
     */
    @Override
    public String toString() {
        return "Rectangle: bottom-left corner at (" + this.x + ", " + this.y + "), length " + this.length + ", width " + this.width;
    }

    /**
     * Convert an m*n Rectangle into an n*m Rectangle.
     *
     * @return None
     */
    void swapLengthWidth() {
        double len = this.length;
        this.length = this.width;
        this.width = len;
    }

    /**
     * Calculate the area of a Rectangle.
     *
     * @return the area
     */
    double area() {
        double area = this.length * this.width;
        return area;
    }

    /**
     * Calculate the perimeter of a Rectangle.
     *
     * @return the perimeter
     */
    double perimeter() {
        double perimeter = 2 * this.length + 2 * this.width;
        return perimeter;
    }

    /**
     * Calculate the length of the diagonal of a Rectangle.
     *
     * @return the length of the diagonal
     */
    double diagonal() {
        double diagonal = Math.pow(Math.pow(this.length, 2) + Math.pow(this.width, 2), 0.5);
        return diagonal;
    }

    /**
     * Determine and return the smaller of this and another Rectangle.
     *
     * @param r Another Rectangle
     * @return the smaller Rectangle
     */
    Rectangle smaller(Rectangle r) {
        if (this.area() < r.area()) {
            Rectangle r3 = new Rectangle(this);
            return r3;
        } else {
            Rectangle r3 = new Rectangle(r);
            return r3;
        }
    }

    /**
     * Calculate the distance between the centers of this and another Rectangle.
     *
     * @param r Another Rectangle
     * @return the distance
     */
    double distance(Rectangle r) {
        double x1 = this.x + this.length / 2;
        double x2 = r.x = r.length / 2;

        double y1 = this.y + this.width / 2;
        double y2 = r.y = r.width / 2;

        double distance = Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)), 0.5);
        return distance;
    }

    /**
     * Determine whether a Rectangle is also a square.
     *
     * @return true or false
     */
    boolean isSquare() {
        return this.length == this.width;
    }

    /**
     * Calculate the area of the circumcircle of a Rectangle.
     *
     * @return the area
     */
    double circumcircleArea() {
        double radius = this.diagonal() / 2;
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    /**
     * Calculate the perimeter of the circumcircle of a Rectangle.
     *
     * @return the perimeter
     */
    double circumcirclePerimeter() {
        double radius = this.diagonal() / 2;
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    /**
     * Determine whether two Rectangles are equal.
     *
     * @return true or false
     */
    boolean equals(Rectangle r) {
        return (this.length == r.length && this.width == this.width);
    }

    /**
     * Print the vector represented by the diagonal (pointing up and to the
     * right) of a Rectangle.
     *
     * @param r The Rectangle
     * @return None
     */
    public static void printVector(Rectangle r) {
        System.out.println("Vector: " + r.length + "î + " + r.width + "ĵ");
    }

    /**
     * Print the equation for the circumcircle of a Rectangle.
     *
     * @param r The Rectangle
     * @return None
     */
    public static void printCircumcircleEquation(Rectangle r) {
        double radius = r.diagonal() / 2;
        double centerX = r.x + r.length / 2;
        double centerY = r.y + r.width / 2;

        System.out.print("(x ");

        if (centerX / 2 < 0) {
            System.out.print("+ " + Math.abs(centerX));
        } else {
            System.out.print("- " + centerX);
        }

        System.out.print(")² + (y ");

        if (centerY < 0) {
            System.out.print("+ " + Math.abs(centerY));
        } else {
            System.out.print("- " + centerY);
        }

        System.out.printf(")² = %.2f", radius * radius);
        System.out.println();
    }

}
