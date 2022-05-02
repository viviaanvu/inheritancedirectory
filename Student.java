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

public class Student extends Person {

    /**
     * declare private instance variables
     */

    private String level;

    /**
     * default constructor -
     * level is freshman
     */

    public Student() {
        level = "Freshman";
    }

    /**
     * parameterized constructor -
     * sets parameters for names, address, phone numbers,
     * emails, and level
     */

    public Student(String firstName, String middleName, String lastName, Address homeAddress, String phoneNumber, String email, String level) {

        /**
         * gets credentials from the parent class
         */

        super(firstName, middleName, lastName, homeAddress, phoneNumber, email);

        /**
         * checks the isValidLevel method: if true,
         * this.level = level, otherwise throw an exception
         */

        if (isValidLevel(level)) {
            this.level = level;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * isValidLevel method checks if the level is equal to
     * one of the valid levels, returns a boolean value
     */

    private boolean isValidLevel(String level2) {

        //declare validity variable
        boolean isValid;

        //check if the level is equivalent to a valid level, declaring valid true
        if (level2.equals("Freshman") || level2.equals("Sophomore") || level2.equals("Junior") || level2.equals("Senior")) {
            isValid = true;
        }

        //if it is not one of those, valid is false
        else {
            isValid = false;
        }

        //return state of validity
        return isValid;

    }

    /**
     * toString method translates all information to a string
     */

    public String toString() {

        /**
         * super returns the parent class string
         */

        return super.toString() +
                "\nStudent Level: " + level + "\n";

    }


}