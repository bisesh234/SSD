import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Contact {
    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() { return name; }
    public String getPhone() { return phone; }

    @Override
    public String toString() {
        return "Name: " + name + " | Phone: " + phone;
    }
}

public class Main {
    private static final List<Contact> contacts = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== CONTACT BOOK ===");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> addContact();
                case "2" -> viewContacts();
                case "3" -> searchContact();
                case "4" -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void addContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine().trim();

        if (name.isEmpty() || phone.isEmpty()) {
            System.out.println("Name and phone cannot be empty!");
            return;
        }

        contacts.add(new Contact(name, phone));
        System.out.println("Contact saved successfully!");
    }

    private static void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
            return;
        }
        System.out.println("\n--- Contact List ---");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i + 1) + ". " + contacts.get(i));
        }
    }

    private static void searchContact() {
        System.out.print("Enter name to search: ");
        String query = scanner.nextLine().toLowerCase().trim();
        boolean found = false;

        for (Contact contact : contacts) {
            if (contact.getName().toLowerCase().contains(query)) {
                System.out.println("Found: " + contact);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching contact found.");
        }
    }
}