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
public class PartTimeEmployee extends Employee {

    static final int HOURS_PER_DAY = 7;
    private int numHoursAssigned;
    private double hourlyWage;
    private double sickDaysTaken;

    public PartTimeEmployee(String employeeNumber, String lastName, String firstName, String jobTitle, int numHoursAssigned, double hourlyWage, double sickDaysTaken) {
        super(employeeNumber, lastName, firstName, jobTitle);
        this.hourlyWage = hourlyWage;
        this.numHoursAssigned = numHoursAssigned;
        this.sickDaysTaken = sickDaysTaken;
    }

    public int getNumHoursAssigned() {
        return this.numHoursAssigned;
    }

    public double getHourlyWage() {
        return this.hourlyWage;
    }

    @Override
    public String toString() {
        return super.toString() + ", part-time";
    }

    @Override
    public double pay() {
        return this.numHoursAssigned - (this.sickDaysTaken * HOURS_PER_DAY);
    }

    @Override
    public void useSickDay(double amount) {
        this.sickDaysTaken = amount;
        System.out.println("New sick days taken: " + amount + "\n");
    }

    @Override
    public double getSickDays() {
        return this.sickDaysTaken;
    }

    @Override
    public void resetSickDays() {
        this.sickDaysTaken = 0;
    }

    @Override
    public void printPayStub() {
        System.out.println("\n--------------- PAY STUB ---------------");
        System.out.println(this);
        System.out.println("Hourly Wage: $" + this.getHourlyWage());
        System.out.println("Number of hours assigned: " + this.numHoursAssigned);
        System.out.println("Sick days taken: " + this.sickDaysTaken);
        System.out.println("Current Month pay: $" + this.pay());
        System.out.println("----------------------------------------\n");
    }

}
