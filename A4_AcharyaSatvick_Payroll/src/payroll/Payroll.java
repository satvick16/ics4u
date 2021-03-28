/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author 333526820
 */
public class Payroll {

    private ArrayList<Employee> staffList;

    public Payroll() {
        this.staffList = new ArrayList<>();
    }

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
                    out.write(((FullTimeEmployee) e).getYearlySalary() + ",");
                    out.write(e.getSickDays() + "");
                } else {
                    out.write("full-time,");
                    out.write(((PartTimeEmployee) e).getNumHoursAssigned() + ",");
                    out.write(((PartTimeEmployee) e).getHourlyWage() + ",");
                    out.write(e.getSickDays() + "");
                }
            }

            return true;
        } catch (IOException iox) {
            System.out.println("Problem writing file.");
            return false;
        }
    }

    public void listAllEmployees() {
        System.out.println("All Employees:");

        for (Employee e : this.staffList) {
            System.out.println(e);
        }

        System.out.println("");
    }

    public Employee getEmployee(String id) {
        for (Employee e : this.staffList) {
            if (e.getEmployeeNumber().equals(id)) {
                return e;
            }
        }

        return null;
    }

    public void printEmployeePayStub(String id) {
        Employee e = getEmployee(id);
        e.printPayStub();
    }

    public void printAllPayStubs() {
        for (Employee e : this.staffList) {
            e.printPayStub();
        }
    }

    public void enterSickDay(String id, double amount) {
        Employee e = getEmployee(id);
        e.useSickDay(amount);
    }

    public void yearlySickDayReset() {
        for (Employee e : this.staffList) {
            if (e instanceof FullTimeEmployee) {
                e.resetSickDays();
            }
        }
    }

    public void monthlySickDayReset() {
        for (Employee e : this.staffList) {
            if (e instanceof PartTimeEmployee) {
                e.resetSickDays();
            }
        }
    }

}
