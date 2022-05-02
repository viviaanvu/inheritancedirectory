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

public class Person {

    /**
     * declare private instance variables
     */

    private int id;
    Name name;
    Address homeAddress;
    private String phoneNumber;
    private String email;
    private static int recordNumber;

    /**
     * default constructor -
     * name is given a new name
     * address is given a new address
     * phone number is None given
     * email is None given
     * id is the recordNumber
     */

    public Person() {

        name = new Name();
        homeAddress = new Address();
        phoneNumber = "None given";
        email = "None given";

        //increment record number for id
        recordNumber++;
        id = recordNumber;

    }

    /**
     * parameterized constructor -
     * sets parameters for names, address, phone numbers,
     * emails
     */

    public Person(String first, String middle, String last, Address homeAddress, String phoneNumber, String email) {

        this.name = new Name(first, middle, last);
        this.homeAddress = homeAddress;
        this.phoneNumber = phoneNumber;
        this.email = email;

        //increment record number for id
        recordNumber++;
        this.id = recordNumber;

    }

    /**
     * getName method returns the name to a String
     */

    public String getName() {

        String aName;
        aName = this.name.toString();

        return aName;

    }

    /**
     * toString method translates all information to a string
     */

    public String toString(){

        //identifies class name
        StringBuilder str = new StringBuilder(this.getClass().getSimpleName());

        //returns string combination
        return str.toString() + ":\n---------------------------------------" +
                "\n" + name +
                "\n---------------------------------------" +
                "\nHome Address: " + homeAddress +
                "\nPhone Number: " + phoneNumber +
                "\nEmail Address: " + email +
                "\nID: " + id;

    }

}