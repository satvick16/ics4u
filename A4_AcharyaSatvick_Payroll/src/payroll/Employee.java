/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 * An Employee object is an abstract class of Employee whose subclasses include
 * FullTimeEmployee and PartTimeEmployee.
 *
 * @author 333526820
 */
abstract class Employee {

    protected String employeeNumber;
    protected String lastName;
    protected String firstName;
    protected String jobTitle;

    public Employee(String employeeNumber, String lastName, String firstName, String jobTitle) {
        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.jobTitle = jobTitle;
    }

    public String getEmployeeNumber() {
        return this.employeeNumber;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    @Override
    public String toString() {
        return "Employee: " + this.employeeNumber + ", " + this.firstName + " " + this.lastName + ", " + this.jobTitle;
    }

    abstract double pay();

    abstract void useSickDay(double amount);

    abstract double getSickDays();

    abstract void resetSickDays();

    abstract void printPayStub();

}
