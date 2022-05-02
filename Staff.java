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

public class Staff extends Employee {

    /**
     * declare private instance variables
     */

    private String title;

    /**
     * default constructor -
     * title is none given
     */

    public Staff() {
        title = "None given";
    }

    /**
     * parameterized constructor -
     * sets parameters for names, address, phone numbers,
     * emails, office, salary, and the hire date including
     * month, day, year, and title
     */

    public Staff(String firstName, String middleName, String lastName, Address homeAddress, String phoneNumber, String email, String office, int salary, int month, int day, int year, String title) {

        /**
         * gets credentials from the parent class
         */

        super(firstName, middleName, lastName, homeAddress, phoneNumber, email, office, salary, month, day, year);

        this.title = title;
    }

    /**
     * toString method translates all information to a string
     */

    public String toString(){

        /**
         * super returns the parent class string
         */

        return super.toString() +
                "\nTitle: " + title + "\n";

    }
}
