/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 * A FullTimeEmployee object is an subclass of the Employee class with unique
 * behaviors such as recording/reporting pay in a yearly format.
 *
 * @author 333526820
 */
public class FullTimeEmployee extends Employee {

    static final int YEARLY_SICK_DAYS = 20;
    static final int MONTHS = 12;
    private int yearlySalary;
    private double sickDaysLeft;

    /**
     * Create a new FullTimeEmployee object with a name, id, title, yearly
     * salary and number of sick days left.
     *
     * @param employeeNumber
     * @param lastName
     * @param firstName
     * @param jobTitle
     * @param yearlySalary
     * @param sickDaysLeft
     */
    public FullTimeEmployee(String employeeNumber, String lastName, String firstName, String jobTitle, int yearlySalary, double sickDaysLeft) {
        super(employeeNumber, lastName, firstName, jobTitle);
        this.sickDaysLeft = sickDaysLeft;
        this.yearlySalary = yearlySalary;
    }

    /**
     * Get a FullTimeEmployee's yearly salary.
     *
     * @return The yearly salary
     */
    public double getYearlySalary() {
        return this.yearlySalary;
    }

    /**
     * Get the number of sick days left for a FullTimeEmployee.
     *
     * @param sickDaysLeft The number of sick days left
     * @return None
     */
    public void setSickdaysLeft(double sickDaysLeft) {
        this.sickDaysLeft = sickDaysLeft;
    }

    /**
     * Get the String representation of a FullTimeEmployee, which is a modified
     * version of the String representation for a generic Employee.
     *
     * @return The string
     */
    @Override
    public String toString() {
        return super.toString() + ", full-time";
    }

    /**
     * Get a FullTimeEmployee's pay for the month based on their yearly salary.
     *
     * @return The pay
     */
    @Override
    public double pay() {
        return this.yearlySalary / MONTHS;
    }

    /**
     * Use a FullTimeEmployee's sick day.
     *
     * @param amount The number of sick days to be used
     * @return None
     */
    @Override
    public void useSickDay(double amount) {
        if (this.sickDaysLeft - amount >= 0) {
            this.sickDaysLeft -= amount;
            System.out.println("New sick days taken: " + amount);
        } else {
            System.out.println("Insufficient sick days left!");
        }
    }

    /**
     * Get the number of sick days left for a FullTimeEmployee.
     *
     * @return The number of sick days left
     */
    @Override
    public double getSickDays() {
        return this.sickDaysLeft;
    }

    /**
     * Reset the number of sick days a FullTimeEmployee has left.
     *
     * @return None
     */
    @Override
    public void resetSickDays() {
        this.sickDaysLeft = YEARLY_SICK_DAYS;
    }

    /**
     * Print a FullTimeEmployee's pay stub.
     *
     * @return None
     */
    @Override
    public void printPayStub() {
        System.out.println("\n--------------- PAY STUB ---------------");
        System.out.println(this);
        System.out.println("Yearly Salary: $" + this.getYearlySalary());
        System.out.println("Current Month pay: $" + this.pay());
        System.out.println("Sick days left: " + this.sickDaysLeft);
        System.out.println("----------------------------------------\n");
    }

}
