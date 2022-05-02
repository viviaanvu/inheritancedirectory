/*****************************************************************************
 * Vivian Vu
 * CMSC256-004
 *
 * Project 1 -Inheritance
 *
 * This program is designed to show the structure of inheritance starting with
 * the Person class as the parent and the child classes consisting of Student
 * and Employee with then leads to another child class with Faculty and Staff.
 * It is designed to add and display all their credentials as well as catch
 * invalid and illegal arguments.
 *
 *****************************************************************************/

package cmsc256;

import java.time.LocalDate;

public class Employee extends Person {

    /**
     * declare private instance variables
     */

    private String office;
    private int salary;
    private LocalDate hireDate;

    /**
     * default constructor -
     * office is unassigned
     * salary is 0
     * hireDate is null
     */

    public Employee() {

        office = "Unassigned";
        salary = 0;
        hireDate = null;

    }

    /**
     * parameterized constructor -
     * sets parameters for names, address, phone numbers,
     * emails, office, salary, and the hire date including
     * month, day, and year
     */

    public Employee(String firstName, String middleName, String lastName, Address homeAddress, String phoneNumber, String email, String office, int salary, int month, int day, int year) {

        /**
         * gets credentials from the parent class
         */

        super(firstName, middleName, lastName, homeAddress, phoneNumber, email);

        /**
         * if salary is a negative number throw throw
         * a negative number exception, otherwise
         * this.salary = salary
         */

        if (salary < 0) {
            throw new NumberFormatException("negative number");
        }
        else {
            this.salary = salary;
        }

        this.office = office;
        this.hireDate = LocalDate.of(year, month, day);
    }

    /**
     * toString method translates all information to a string
     */

    public String toString() {

        /**
         * if the hire date is null do not return the hire date,
         * otherwise print out the hire date
         */
        if (hireDate == null) {

                return super.toString() +
                        "\nOffice: " + office +
                        "\nSalary: $" + salary;

            }

            else {

            /**
             * super returns the parent class string
             */

            return super.toString() +
                        "\nOffice: " + office +
                        "\nSalary: $" + salary +
                        "\nDate Hired: " + hireDate.getMonthValue() + "/" + hireDate.getDayOfMonth() + "/" + hireDate.getYear() + "\n";

            }

    }


}