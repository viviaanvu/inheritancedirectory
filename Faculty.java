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

public class Faculty extends Employee {

    /**
     * declare private instance variables
     */

    private String rank;

    /**
     * default constructor -
     * rank is instructor
     */

    public Faculty() {
        rank = "Instructor";
    }

    /**
     * parameterized constructor -
     * sets parameters for names, address, phone numbers,
     * emails, office, salary, and the hire date including
     * month, day, year, and rank
     */

    public Faculty(String firstName, String middleName, String lastName, Address homeAddress, String phoneNumber, String email, String office, int salary, int month, int day, int year, String rank) {

        /**
         * gets credentials from the parent class
         */

        super(firstName, middleName, lastName, homeAddress, phoneNumber, email, office, salary, month, day, year);

        /**
         * checks the isValidRank method: if true,
         * this.rank = rank, otherwise throw an exception
         */

        if (isValidRank(rank)) {
            this.rank = rank;
        }
        else {
            throw new IllegalArgumentException();
        }

    }

    /**
     * isValidRank method checks if the rank is equal to
     * one of the valid ranks, returns a boolean value
     */

    private boolean isValidRank(String rank2) {

        //declare validity variable
        boolean isValid;

        //check if the level is equivalent to a valid level, declaring valid true
        if (rank2.equals("Adjunct") || rank2.equals("Instructor") || rank2.equals("Assistant Professor") || rank2.equals("Professor")) {
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
         * return previous parent class super.toString() and added on string
         */

        return super.toString() +
                "\nRank: " + rank + "\n";

    }
}
