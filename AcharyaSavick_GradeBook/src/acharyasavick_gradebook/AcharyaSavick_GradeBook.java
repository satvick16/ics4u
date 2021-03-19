/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acharyasavick_gradebook;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class containing driver code, hard-coded student data and user interaction
 * with main menu.
 *
 * @author Satvick Acharya
 */
public class AcharyaSavick_GradeBook {

    public static final Scanner reader = new Scanner(System.in);

    /**
     * Manage user interaction with menu.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Course csc100 = generateDefaultCourse();

        System.out.println("Welcome to GradeBook, Mr. Cho!\n");

        while (true) {
            printMenu();
            int option = getInt("Option: ", 1, 18);

            System.out.println();

            switch (option) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name1 = reader.nextLine();

                    System.out.print("Enter student id: ");
                    String id1 = reader.nextLine();

                    csc100.addStudent(new Student(name1, id1));
                    System.out.println("Student " + name1 + " with student number " + id1 + " has been added.");
                    break;
                case 2:
                    String nameOrID2 = getNameOrID();

                    csc100.removeStudent(nameOrID2);
                    System.out.println(nameOrID2 + " has been removed.");
                    break;
                case 3:
                    String nameOrID3 = getNameOrID();
                    Student s3 = csc100.getStudent(nameOrID3);

                    if (s3 != null) {
                        System.out.print("Enter new name or id: ");
                        String newNameOrID = reader.nextLine();

                        if (nameOrID3.equals(s3.getName())) {
                            s3.setName(newNameOrID);
                            System.out.println("Successfully changed name to " + newNameOrID);
                        } else {
                            s3.setID(newNameOrID);
                            System.out.println("Successfully changed id to " + newNameOrID);
                        }
                    } else {
                        System.out.println(nameOrID3 + " is not a student.");
                    }

                    break;
                case 4:
                    String nameOrID4 = getNameOrID();
                    Student s4 = csc100.getStudent(nameOrID4);

                    if (s4 != null) {
                        int mark4 = getInt("Enter new mark: ", 0, 100);

                        for (Student s : csc100.getStudents()) {
                            s.addMark(-1);
                        }

                        s4.setAnyMark(s4.getMarks().size() - 1, mark4);
                        System.out.println("Mark of " + mark4 + " has been added for Student " + nameOrID4);
                    } else {
                        System.out.println(nameOrID4 + " is not a student.");
                    }

                    break;
                case 5:
                    String nameOrID5 = getNameOrID();
                    Student s5 = csc100.getStudent(nameOrID5);

                    if (s5 != null) {
                        int num5 = getInt("Enter assignment number: ", 0, csc100.getNumAssignments() - 1);
                        int mark5 = getInt("Enter new mark: ", 0, 100);

                        s5.setAnyMark(num5, mark5);
                        System.out.println("Student " + nameOrID5 + "'s mark for assignment " + num5 + " has been changed to " + mark5);
                    } else {
                        System.out.println(nameOrID5 + " is not a student.");
                    }

                    break;
                case 6:
                    String nameOrID6 = getNameOrID();
                    Student s6 = csc100.getStudent(nameOrID6);

                    if (s6 != null) {
                        for (int i = 0; i < csc100.getNumAssignments(); i++) {
                            int mark6 = getInt("New mark for assignment " + i + ": ", 0, 100);
                            s6.setAnyMark(i, mark6);
                        }
                    } else {
                        System.out.println(nameOrID6 + " is not a student.");
                    }

                    break;
                case 7:
                    csc100.addAssignment();
                    System.out.println("Assignment has been added.");
                    break;
                case 8:
                    int num8 = getInt("Enter assignment number: ", 0, csc100.getNumAssignments() - 1);
                    csc100.deleteAssignment(num8);
                    System.out.println("Assignment " + num8 + " has been deleted.");
                    break;
                case 9:
                    String nameOrID9 = getNameOrID();

                    int num9 = getInt("Enter assignment number: ", 0, csc100.getNumAssignments() - 1);
                    int mark9 = getInt("Enter new mark: ", 0, 100);

                    csc100.editAnyAssignmentMark(nameOrID9, num9, mark9);
                    System.out.println(nameOrID9 + "'s mark in assginment " + num9 + " has been changed to " + mark9);
                    break;
                case 10:
                    int num10 = getInt("Enter assignment number: ", 0, csc100.getNumAssignments() - 1);

                    for (Student s10 : csc100.getStudents()) {
                        int mark10 = getInt("New mark for " + s10.getName() + ": ", 0, 100);
                        s10.setAnyMark(num10, mark10);
                    }

                    break;
                case 11:
                    System.out.printf("Course average %.1f\n", csc100.getCourseAvg());
                    break;
                case 12:
                    int num12 = getInt("Enter assignment number: ", 0, csc100.getNumAssignments() - 1);
                    System.out.printf("Assignment %d average: %.1f\n", num12, csc100.getAnyAssignmentAvg(num12));
                    break;
                case 13:
                    for (int i = 0; i < csc100.getNumAssignments(); i++) {
                        System.out.printf("Assignment %d average: %.1f\n", i, csc100.getAnyAssignmentAvg(i));
                    }

                    break;
                case 14:
                    String nameOrID14 = getNameOrID();
                    Student s14 = csc100.getStudent(nameOrID14);

                    if (s14 != null) {
                        System.out.printf("%s's average: %.1f\n", nameOrID14, s14.getAvg());
                    } else {
                        System.out.println(nameOrID14 + " is not a student.");
                    }

                    break;
                case 15:
                    for (Student s15 : csc100.getStudents()) {
                        System.out.printf("%s's average: %.1f\n", s15.getName(), s15.getAvg());
                    }

                    break;
                case 16:
                    csc100.printAllStudentsAndAvgs();
                    break;
                case 17:
                    int num17 = getInt("Enter assignment number: ", 0, csc100.getNumAssignments() - 1);
                    csc100.printAssignmentMarks(num17);
                    break;
                case 18:
                    String nameOrID18 = getNameOrID();
                    Student s18 = csc100.getStudent(nameOrID18);

                    if (s18 != null) {
                        ArrayList<Integer> marks18 = s18.getMarks();

                        for (int i = 0; i < marks18.size(); i++) {
                            System.out.println(" Assignment " + i + ": " + marks18.get(i));
                        }
                    } else {
                        System.out.println(nameOrID18 + " is not a student.");
                    }

                    break;
            }

            System.out.print("\nEnter 'M' or 'm' to proceed to main menu. Enter anything else to quit: ");
            String input = reader.nextLine();

            if (input.equalsIgnoreCase("m")) {
                continue;
            } else {
                System.exit(0);
            }

            System.out.println();
        }
    }

    /**
     * Generate default, hard-coded students and course.
     *
     * @return the course
     */
    public static Course generateDefaultCourse() {
        Student alan = new Student("Alan T", "110101011");
        Student donald = new Student("Donald K", "314159265");
        Student albert = new Student("Albert E", "299792458");
        Student marie = new Student("Marie C", "002661600");
        Student ada = new Student("Ada L", "018151210");

        Course csc100 = new Course("Introduction to Computer Science", "CSC100");

        csc100.addStudent(alan);
        csc100.addStudent(donald);
        csc100.addStudent(albert);
        csc100.addStudent(marie);
        csc100.addStudent(ada);

        alan.addMark(83);
        alan.addMark(71);
        alan.addMark(76);
        alan.addMark(91);
        alan.addMark(85);

        donald.addMark(84);
        donald.addMark(90);
        donald.addMark(88);
        donald.addMark(99);
        donald.addMark(80);

        albert.addMark(93);
        albert.addMark(65);
        albert.addMark(95);
        albert.addMark(40);
        albert.addMark(19);

        marie.addMark(76);
        marie.addMark(52);
        marie.addMark(96);
        marie.addMark(92);
        marie.addMark(66);

        ada.addMark(91);
        ada.addMark(98);
        ada.addMark(89);
        ada.addMark(99);
        ada.addMark(99);

        return csc100;
    }

    /**
     * Print a nicely-formatted menu for the user with all options.
     *
     * @return None
     */
    public static void printMenu() {
        System.out.println("Please choose one of the following options:");
        System.out.println(" 1 : add student to course");
        System.out.println(" 2 : remove student from course");
        System.out.println(" 3 : edit name or student id of a student");
        System.out.println(" 4 : add mark for a student");
        System.out.println(" 5 : edit any mark for a student");
        System.out.println(" 6 : edit all marks for a student");
        System.out.println(" 7 : add assignment to course");
        System.out.println(" 8 : delete assignment from course");
        System.out.println(" 9 : edit any mark for an assignment");
        System.out.println("10 : edit all marks for an assignment");
        System.out.println("11 : print course average");
        System.out.println("12 : print any assignment average");
        System.out.println("13 : print all assignment averages");
        System.out.println("14 : print any student average");
        System.out.println("15 : print all student averages");
        System.out.println("16 : print all students with their average");
        System.out.println("17 : print all marks in an assignment with names");
        System.out.println("18 : print all marks for a particular student\n");
    }

    /**
     * Get an integer from the user, ensuring that the number provided is valid.
     *
     * @param msg The prompt
     * @param min The minimum acceptable value of the integer
     * @param max The maximum acceptable value of the integer
     * @return the integer
     */
    public static int getInt(String msg, int min, int max) {
        int num;

        while (true) {
            try {
                System.out.print(msg);
                num = Integer.parseInt(reader.nextLine());

                if (min <= num && num <= max) {
                    break;
                } else {
                    System.out.println("Invalid input.");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input.");
            }
        }

        return num;
    }

    /**
     * Get name or id of Student from user.
     *
     * @return name or student id
     */
    public static String getNameOrID() {
        System.out.print("Enter student name or id: ");
        String nameOrID = reader.nextLine();

        return nameOrID;
    }

}
