/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 * A PartTimeEmployee object is an subclass of the Employee class with unique
 * behaviors such as recording/reporting pay in a monthly format.
 *
 * @author 333526820
 */
public class PartTimeEmployee extends Employee {

    static final int HOURS_PER_DAY = 7;
    private int numHoursAssigned;
    private double hourlyWage;
    private double sickDaysTaken;

    /**
     * Create a new PartTimeEmployee object with a name, id, title, number of
     * hours assigned and number of sick days taken.
     *
     * @param employeeNumber The PartTimeEmployee's Employee id
     * @param lastName The PartTimeEmployee's last name
     * @param firstName The PartTimeEmployee's first name
     * @param jobTitle The PartTimeEmployee's job title
     * @param numHoursAssigned The number of hours assigned
     * @param hourlyWage The PartTimeEmployee's hourly wage
     * @param sickDaysTaken The number od sick days taken
     */
    public PartTimeEmployee(String employeeNumber, String lastName, String firstName, String jobTitle, int numHoursAssigned, double hourlyWage, double sickDaysTaken) {
        super(employeeNumber, lastName, firstName, jobTitle);
        this.hourlyWage = hourlyWage;
        this.numHoursAssigned = numHoursAssigned;
        this.sickDaysTaken = sickDaysTaken;
    }

    /**
     * Get the number of hours assigned to a PartTimeEmployee.
     *
     * @return The number of hours assigned to the PartTimeEmployee
     */
    public int getNumHoursAssigned() {
        return this.numHoursAssigned;
    }

    /**
     * Get a PartTimeEmployee's hourly wage
     *
     * @return The hourly wage
     */
    public double getHourlyWage() {
        return this.hourlyWage;
    }

    /**
     * Get the String representation of a PartTimeEmployee, which is a modified
     * version of the String representation for a generic Employee.
     *
     * @return The string
     */
    @Override
    public String toString() {
        return super.toString() + ", part-time";
    }

    /**
     * Get a PartTimeEmployee's pay for the month based on their wage and number
     * of sick days taken.
     *
     * @return The pay
     */
    @Override
    public double pay() {
        return (this.numHoursAssigned - this.sickDaysTaken * HOURS_PER_DAY) * this.hourlyWage;
    }

    /**
     * Use a PartTimeEmployee's sick day.
     *
     * @param amount The number of sick days to be used
     * @return None
     */
    @Override
    public void useSickDay(double amount) {
        this.sickDaysTaken += amount;
        System.out.println("New sick days taken: " + amount + "\n");
    }

    /**
     * Get the number of sick days a PartTimeEmployee has taken.
     *
     * @return The number of sick days taken
     */
    @Override
    public double getSickDays() {
        return this.sickDaysTaken;
    }

    /**
     * Reset the number of sick days taken to zero.
     *
     * @return None
     */
    @Override
    public void resetSickDays() {
        this.sickDaysTaken = 0;
    }

    /**
     * Print a PartTimeEmployee's pay stub.
     *
     * @return None
     */
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
