/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import java.io.*;
import java.util.ArrayList;

/**
 * A Payroll Object is comprised of a list of Employee objects and can perform
 * various functions, such as reading/writing/listing Employee info to a file,
 * printing pay stubs and resetting the number of sick days.
 *
 * @author 333526820
 */
public class Payroll {

    private ArrayList<Employee> staffList;

    /**
     * Creates new Payroll object with an empty list of Employee objects.
     */
    public Payroll() {
        this.staffList = new ArrayList<>();
    }

    /**
     * Read Employee data from a file, create new Employee objects and add them
     * to the Payroll.
     *
     * @param fileName The name of the file to be read
     * @return Whether true or false based on whether the file was successfully
     * read
     */
    public boolean loadStaffList(String fileName) {
        String line;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            line = reader.readLine();

            while (line != null) {
                String[] info = line.split(",");

                if (info[4].equals("full-time")) {
                    Employee e = new FullTimeEmployee(info[0], info[1], info[2], info[3], Integer.parseInt(info[5]), Double.parseDouble(info[6]));
                    this.staffList.add(e);
                } else {
                    Employee e = new PartTimeEmployee(info[0], info[1], info[2], info[3], Integer.parseInt(info[5]), Double.parseDouble(info[6]), Double.parseDouble(info[7]));
                    this.staffList.add(e);
                }

                line = reader.readLine();
            }

            return true;
        } catch (IOException iox) {
            System.out.println("Problem reading file.");
            return false;
        }
    }

    /**
     * Save current Employee data to a file.
     *
     * @param fileName The name of the file to be written to
     * @return true or false based on whether the file has been successfully
     * written to.
     */
    public boolean saveStaffList(String fileName) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));

            for (Employee e : this.staffList) {
                out.write(e.getEmployeeNumber() + ",");
                out.write(e.getLastName() + ",");
                out.write(e.getFirstName() + ",");
                out.write(e.getJobTitle() + ",");

                if (e instanceof FullTimeEmployee) {
                    out.write("full-time,");
                    out.write(e.pay() + ",");
                    out.write(e.getSickDays() + "");
                } else {
                    out.write("full-time,");
                    out.write(((PartTimeEmployee) e).getNumHoursAssigned() + ",");
                    out.write(((PartTimeEmployee) e).getHourlyWage() + ",");
                    out.write(e.getSickDays() + "");
                }

                out.newLine();
            }

            return true;
        } catch (IOException iox) {
            System.out.println("Problem writing file.");
            return false;
        }
    }

    /**
     * List the biographical information of each Employee on the Payroll.
     *
     * @return None
     */
    public void listAllEmployees() {
        System.out.println("All Employees:");

        for (Employee e : this.staffList) {
            System.out.println(e);
        }

        System.out.println("");
    }

    /**
     * Return an Employee from the Payroll based on their id.
     *
     * @param id The Employee's id
     * @return The Employee (or null if the Employee does not exist)
     */
    public Employee getEmployee(String id) {
        for (Employee e : this.staffList) {
            if (e.getEmployeeNumber().equals(id)) {
                return e;
            }
        }

        System.out.println("Employee " + id + " not found!\n");
        return null;
    }

    /**
     * Print an Employee's pay stub.
     *
     * @param id The Employee's id
     * @return None
     */
    public void printEmployeePayStub(String id) {
        Employee e = getEmployee(id);

        if (e != null) {
            e.printPayStub();
        }
    }

    /**
     * Print each Employee's pay stub.
     *
     * @return None
     */
    public void printAllPayStubs() {
        System.out.println("All Employee Pay Stubs:");

        for (Employee e : this.staffList) {
            e.printPayStub();
        }

        System.out.println("");
    }

    /**
     * Use sick days for an Employee on the Payroll.
     *
     * @param id The Employee's id
     * @param amount The amount of sick days to be used
     * @return None
     */
    public void enterSickDay(String id, double amount) {
        Employee e = getEmployee(id);

        if (e != null) {
            e.useSickDay(amount);
        }
    }

    /**
     * Reset the number of sick days left for each full-time Employee.
     *
     * @return None
     */
    public void yearlySickDayReset() {
        for (Employee e : this.staffList) {
            if (e instanceof FullTimeEmployee) {
                e.resetSickDays();
            }
        }
    }

    /**
     * Reset the number of sick days taken for each part-time Employee.
     *
     * @return None
     */
    public void monthlySickDayReset() {
        for (Employee e : this.staffList) {
            if (e instanceof PartTimeEmployee) {
                e.resetSickDays();
            }
        }
    }

}
