/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangles;

/**
 * Class with main method for testing the Rectangle class.
 *
 * @author Satvick Acharya
 */
public class Rectangles {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Testing the Rectangle Class:\n");

        // creating new Rectangle (r1) using default constructor
        Rectangle r1 = new Rectangle();

        System.out.println("r1:");
        System.out.println(r1);
        System.out.println();

        // creating new Rectangle (r2) with set dimensions using custom constructor
        Rectangle r2 = new Rectangle(1, 1, 5.024, 3.14);

        System.out.println("r2:");
        System.out.println(r2);
        System.out.println();

        // retrieving fields of r1 and r2 using getters
        System.out.println("length of r1 = " + r1.getLength());
        System.out.println("width of r2 = " + r2.getWidth());
        System.out.println("x-coordinate of bottom-left vertex of r1 = " + r1.getX());
        System.out.println("y-coordinate of bottom-left vertex of r2 = " + r2.getY());
        System.out.println();

        // editing fields of r1 using setter and printing r1 and r2 with print method and print vector method
        r1.setAll(0, 0, 5, 9.456);

        System.out.println("r1: ");
        System.out.println(r1);
        Rectangle.printVector(r1);
        System.out.println("r2: ");
        System.out.println(r2);
        Rectangle.printVector(r2);
        System.out.println();

        // printing diagonal, perimeter and area of r1 and r2
        System.out.printf("Diagonal of r1: %.2f units%n", r1.diagonal());
        System.out.printf("Perimeter of r1: %.2f units%n", r1.perimeter());
        System.out.printf("Area of r1: %.2f units²%n", r1.area());
        System.out.println();

        System.out.printf("Diagonal of r2: %.2f units%n", r2.diagonal());
        System.out.printf("Perimeter of r2: %.2f units%n", r2.perimeter());
        System.out.printf("Area of r2: %.2f units²%n", r2.area());
        System.out.println();

        // assigning the smaller of r1 and r2 to a new Rectangle (called smaller) and printing it
        Rectangle smaller = r1.smaller(r2);
        System.out.println("Smaller of r1 and r2: ");
        System.out.println(smaller);
        System.out.println();

        // making a new Rectangle (called r3) and giving it the same attributes as r1
        Rectangle r3 = new Rectangle(r1);

        System.out.println("r3:");
        System.out.println(r3);
        System.out.println("r1:");
        System.out.println(r1);
        System.out.println();

        // checking if r3 and r1 are equal
        System.out.println("r3 == r1? " + r3.equals(r1));
        System.out.println();

        // checking if r2 and r3 are equal
        System.out.println("r3:");
        System.out.println(r3);
        System.out.println("r2:");
        System.out.println(r2);
        System.out.println();

        System.out.println("r3 == r2? " + r3.equals(r2));
        System.out.println();

        // editing fields of r2 using setter
        r2.setAll(0, 0, 5, 9.456);

        System.out.println("r3:");
        System.out.println(r3);
        System.out.println("r2:");
        System.out.println(r2);
        System.out.println();

        // checking if r3 equals r2
        System.out.println("r3 == r2? " + r3.equals(r2));
        System.out.println();

        // creating new Rectangle (r4) with set dimensions using custom constructor
        Rectangle r4 = new Rectangle(1, 1, 5.024, 3.14);

        System.out.println("r4:");
        System.out.println(r4);
        System.out.println();

        // swapping the length and width of r4
        r4.swapLengthWidth();

        System.out.println("r4:");
        System.out.println(r4);
        System.out.println();

        // editing dimensions of r1 using custom constructor
        r1.setAll(0, 0, 2.3, 2.3);
        System.out.println("r1:");
        System.out.println(r1);
        System.out.println();

        // checking if r1 is a square
        System.out.println("r1 is a square? " + r1.isSquare());
        System.out.println();

        // printing r1 and r4
        System.out.println("r1:");
        System.out.println(r1);
        System.out.println("r4:");
        System.out.println(r4);
        System.out.println();

        // printing distance between the centers of r1 and r4
        System.out.printf("Distance between centers of r1 and r4: %.2f units%n", r1.distance(r4));
        System.out.println();

        // printing the circumcircle area, circumcircle perimeter and circumcircle equation of r4
        System.out.printf("r4 circumcircle area: %.2f units²%n", r4.circumcircleArea());
        System.out.printf("r4 circumcircle perimeter: %.2f units%n", r4.circumcirclePerimeter());
        System.out.print("r4 circumcircle equation: ");
        Rectangle.printCircumcircleEquation(r4);
    }

}
