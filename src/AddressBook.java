/**Rostik G.
 * Exercise 5
 * 02/11/25
 */

import java.util.Scanner;
import java.util.ArrayList;

public class AddressBook {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Person> peopleList = new ArrayList<>();

        while (true) {
            System.out.println("Address Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. List Contacts");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1/2/3): ");
            String choice = input.nextLine();

            if (choice.equals("1")) {
                System.out.println("Please Enter a contact name:");
                String name = input.nextLine();
                System.out.println("Please Enter their email:");
                String email = input.nextLine();

                Person person = new Person(name, email);
                peopleList.add(person);

            } else if (choice.equals("2")) {
                System.out.println("Contacts in your Address Book:");
                if (peopleList.isEmpty()) {
                    System.out.println("No contacts available.");
                } else {
                    for (Person p : peopleList) {
                        System.out.println(p);
                    }
                }

            } else if (choice.equals("3")) {
                System.out.println("Exiting Address Book. Goodbye!");
                break;

            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}