/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acharyasavick_gradebook;

import java.util.ArrayList;

/**
 * Objects of this class are courses with a name, course code and a list of
 * Students.
 *
 * @author Satvick Acharya
 */
public class Course {

    private String name;
    private String code;
    private ArrayList<Student> students;

    /**
     * Create new Course object with provided name and code.
     *
     * @param name The course name
     * @param code The course code
     */
    public Course(String name, String code) {
        this.name = name;
        this.code = code;
        this.students = new ArrayList<>();
    }

    /**
     * Add a Student object to the Course.
     *
     * @param s The new Student
     * @return None
     */
    public void addStudent(Student s) {
        for (int i = 0; i < this.getNumAssignments(); i++) {
            s.addMark(-1);
        }

        this.students.add(s);
    }

    /**
     * Get the list of all Students in the Course.
     *
     * @return the list of Students
     */
    public ArrayList<Student> getStudents() {
        return this.students;
    }

    /**
     * Get a Student from the Course based on their name or id.
     *
     * @param nameOrID The Student's name or id
     * @return the Student or null if the name or id is invalid
     */
    public Student getStudent(String nameOrID) {
        for (Student s : students) {
            if (s.getName().equals(nameOrID) || s.getID().equals(nameOrID)) {
                return s;
            }
        }
        return null;
    }

    /**
     * Get the number of assignments in the Course.
     *
     * @return the number of assignments
     */
    public int getNumAssignments() {
        if (this.students.isEmpty()) {
            return 0;
        } else {
            return this.students.get(0).getMarks().size();
        }
    }

    /**
     * Remove a Student from the Course based on their name or id.
     *
     * @param nameOrID The Student's name or id
     * @return None
     */
    public void removeStudent(String nameOrID) {
        Student s = getStudent(nameOrID);

        if (s != null) {
            this.students.remove(s);
            System.out.println("Student " + nameOrID + " has been removed.");
        } else {
            System.out.println(nameOrID + " is not a student.");
        }
    }

    /**
     * Add an assignment to the Course (initialize the marks of each Student to
     * -1).
     *
     * @return None
     */
    public void addAssignment() {
        for (Student s : this.students) {
            s.addMark(-1);
        }
    }

    /**
     * Delete an assignment from the Course (change the marks to -1).
     *
     * @param num The assignment number
     * @return None
     */
    public void deleteAssignment(int num) {
        for (Student s : this.students) {
            s.setAnyMark(num, -1);
        }
    }

    /**
     * Edit any assignment mark for a Student.
     *
     * @param nameOrID The Student's name or id
     * @param num The assignment number
     * @param newMark The new mark
     * @return None
     */
    public void editAnyAssignmentMark(String nameOrID, int num, int newMark) {
        Student s = getStudent(nameOrID);

        if (s != null) {
            s.setAnyMark(num, newMark);
        } else {
            System.out.println(nameOrID + " is not a student.");
        }
    }

    /**
     * Get the average of all the elements in an ArrayList of Doubles.
     *
     * @param nums The Double ArrayList
     * @return the average
     */
    public double getAvg(ArrayList<Double> nums) {
        int sum = 0;
        int numMarks = 0;

        for (double num : nums) {
            if (num != -1) {
                sum += num;
                numMarks++;
            }
        }

        return sum / (double) numMarks;
    }

    /**
     * Get the Course average.
     *
     * @return the average
     */
    public double getCourseAvg() {
        ArrayList<Double> stuAvgs = new ArrayList<>();

        for (Student s : this.students) {
            stuAvgs.add(s.getAvg());
        }

        return getAvg(stuAvgs);
    }

    /**
     * Get the average for any assignment.
     *
     * @param num The assignment number
     * @return the average
     */
    public double getAnyAssignmentAvg(int num) {
        ArrayList<Double> marks = new ArrayList<>();

        for (Student s : this.students) {
            marks.add((double) s.getMark(num));
        }

        return getAvg(marks);
    }

    /**
     * Print all marks for an assignment including Student names.
     *
     * @param num The assignment number
     * @return None
     */
    public void printAssignmentMarks(int num) {
        System.out.println("Assignment " + num + ":");

        for (Student s : this.students) {
            System.out.println(" " + s.getName() + ": " + s.getMark(num));
        }
    }

    /**
     * Print all Student names and their averages.
     *
     * @return None
     */
    public void printAllStudentsAndAvgs() {
        System.out.println("Students and their averages:");

        for (Student s : this.students) {
            System.out.printf(" %s: %.1f\n", s.getName(), s.getAvg());
        }
    }

}
