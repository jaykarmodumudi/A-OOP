package contactmanagementsys;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ContactManager {
    private Map<String, Contact> contacts;

    public ContactManager() {
        contacts = new HashMap<>();
    }

    // Add a contact to the map
    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getName())) {
            System.out.println("Contact already exists with the name: " + contact.getName());
        } else {
            contacts.put(contact.getName(), contact);
            System.out.println("Added contact: " + contact);
        }
    }

    // Remove a contact by name
    public void removeContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println("Removed contact with name: " + name);
        } else {
            System.out.println("No contact found with the name: " + name);
        }
    }

    // Find a contact by name
    public Contact findContact(String name) {
        return contacts.get(name);
    }

    // Display all contacts
    public void displayAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("Contact List:");
            for (Contact contact : contacts.values()) {
                System.out.println(contact);
            }
        }
    }

    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Simple menu-driven interface
        do {
            System.out.println("\nContact Management Application");
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Find Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    Contact newContact = new Contact(name, phoneNumber, email);
                    contactManager.addContact(newContact);
                    break;
                case 2:
                    System.out.print("Enter name of contact to remove: ");
                    String nameToRemove = scanner.nextLine();
                    contactManager.removeContact(nameToRemove);
                    break;
                case 3:
                    System.out.print("Enter name of contact to find: ");
                    String nameToFind = scanner.nextLine();
                    Contact contact = contactManager.findContact(nameToFind);
                    if (contact != null) {
                        System.out.println("Found: " + contact);
                    } else {
                        System.out.println("No contact found with the name: " + nameToFind);
                    }
                    break;
                case 4:
                    contactManager.displayAllContacts();
                    break;
                case 5:
                    System.out.println("Exiting application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
