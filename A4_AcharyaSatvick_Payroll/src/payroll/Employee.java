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

    /**
     * Create new Employee object with a name, employee id and title.
     *
     * @param employeeNumber The employee id
     * @param lastName The Employee's last name
     * @param firstName The Employee's first name
     * @param jobTitle The Employee's job title
     */
    public Employee(String employeeNumber, String lastName, String firstName, String jobTitle) {
        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.jobTitle = jobTitle;
    }

    /**
     * Get the Employee's employee id.
     *
     * @return The Employee's employee id
     */
    public String getEmployeeNumber() {
        return this.employeeNumber;
    }

    /**
     * Get the Employee's last name.
     *
     * @return The last name
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Get the Employee's first name.
     *
     * @return The first name
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Get the Employee's job title.
     *
     * @return The job title
     */
    public String getJobTitle() {
        return this.jobTitle;
    }

    /**
     * Get the String representation of the Employee object.
     *
     * @return The string
     */
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
