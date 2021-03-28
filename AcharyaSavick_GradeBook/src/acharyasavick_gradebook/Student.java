/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acharyasavick_gradebook;

import java.util.ArrayList;

/**
 * Objects of this class are students with a name, id and a list of marks.
 *
 * @author Satvick Acharya
 */
public class Student {

    private String name;
    private String id;
    private ArrayList<Integer> marks;

    /**
     * Create new Student object with provided name/id and an empty marks
     * ArrayList.
     *
     * @param name The Student's name
     * @param id The Student's id
     */
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.marks = new ArrayList<>();
    }

    /**
     * Get the Student's name.
     *
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the Student's id.
     *
     * @return the id
     */
    public String getID() {
        return this.id;
    }

    /**
     * Get the Student's marks.
     *
     * @return the marks
     */
    public ArrayList<Integer> getMarks() {
        return this.marks;
    }

    /**
     * Get the Student's mark in a specific assignment.
     *
     * @param num The assignment number
     * @return the mark
     */
    public Integer getMark(int num) {
        return this.marks.get(num);
    }

    /**
     * Edit a Student's name.
     *
     * @param name The new name
     * @return None
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Edit a Student's id.
     *
     * @param id The new id
     * @return None
     */
    public void setID(String id) {
        this.id = id;
    }

    /**
     * Edit a Student's mark in an assignment.
     *
     * @param num The assignment number
     * @param newMark The new mark
     * @return None
     */
    public void setAnyMark(int num, int newMark) {
        this.marks.set(num, newMark);
    }

    /**
     * Add a mark for a Student.
     *
     * @param mark The new mark
     * @return None
     */
    public void addMark(int mark) {
        this.marks.add(mark);
    }

    /**
     * Get a Student's average.
     *
     * @return the average
     */
    public double getAvg() {
        int sum = 0;
        int numMarks = 0;

        for (int mark : this.marks) {
            if (mark != -1) {
                sum += mark;
                numMarks++;
            }
        }

        return sum / (double) numMarks;
    }

}
