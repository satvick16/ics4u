/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 *
 * @author 333526820
 */
public class FullTimeEmployee extends Employee {

    static final int YEARLY_SICK_DAYS = 20;
    static final int MONTHS = 12;
    private int yearlySalary;
    private double sickDaysLeft;

    public FullTimeEmployee(String employeeNumber, String lastName, String firstName, String jobTitle, int yearlySalary, double sickDaysLeft) {
        super(employeeNumber, lastName, firstName, jobTitle);
        this.sickDaysLeft = sickDaysLeft;
        this.yearlySalary = yearlySalary;
    }

    public double getYearlySalary() {
        return this.yearlySalary;
    }

    public void setSickdaysLeft(double sickDaysLeft) {
        this.sickDaysLeft = sickDaysLeft;
    }

    @Override
    public String toString() {
        return super.toString() + ", full-time";
    }

    @Override
    public double pay() {
        return this.yearlySalary / MONTHS;
    }

    @Override
    public void useSickDay(double amount) {
        this.sickDaysLeft = amount;
        System.out.println("New sick days taken: " + amount + "\n");
    }

    @Override
    public double getSickDays() {
        return this.sickDaysLeft;
    }

    @Override
    public void resetSickDays() {
        this.sickDaysLeft = YEARLY_SICK_DAYS;
    }

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
