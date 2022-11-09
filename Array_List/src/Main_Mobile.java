import java.util.Scanner;

public class Main_Mobile {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("908099185");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit){
            System.out.println("\n enter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("shutting down...");
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    public static void printContacts(){
        System.out.println("contacts list: ");
        mobilePhone.printContacts();
    }

    public static void startPhone(){
        System.out.println("phone is starting....");
    }

    public static void printActions(){
        System.out.println("\n Available actions: \n press");
        System.out.println("0 - to shutDown\n"+
                "1 - to print contacts\n"+
                "2 - to add a new contacts\n"+
                "3 - to update existing an existing contact\n"+
                "4 - to remove an existing contact \n"+
                "5 - query if an existing contact exists\n"+
                "6 - to print a list of available actions.");
        System.out.println("choose your action: ");
    }

    public static void addContact(){
        System.out.println("enter the contact name: ");
        String newName = scanner.nextLine();
        scanner.nextLine();
        System.out.println("enter contact phone number: ");
        String newNumber = scanner.nextLine();
        scanner.nextLine();
        Contact newContact = Contact.createContact(newName,newNumber);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("new contact added: " + newName + ",phone number: " + newNumber);
        }
        else {
            System.out.println("cannot add, "+newName+" already exists on file");
        }
    }

    public static void updateContact(){
        System.out.println("please enter the name which you want to update: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord==null){
            System.out.println("contact does not exist");
        }
        System.out.println("enter a new contact name");
        String newName = scanner.nextLine();
        System.out.println("enter a new phone number");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName,newNumber);
        mobilePhone.updateContact(existingContactRecord,newContact);
        System.out.println(newName+" has been updated");
    }

    public static void removeContact(){
        System.out.println("please enter the name of contact to remove: ");
        String name = scanner.nextLine();
        Contact existingContact  = mobilePhone.queryContact(name);
        if (existingContact == null){
            System.out.println("Contact does not exist");
        }
        mobilePhone.removeContact(existingContact);
        System.out.println(name+" has been removed");
    }

    public static void queryContact(){
        System.out.println("enter the name you want to search: ");
        String name = scanner.nextLine();
        System.out.println("enter the number ");
        String number = scanner.nextLine();
        Contact oldcontact = Contact.createContact(name,number);
        if (mobilePhone.queryContact(oldcontact)==null){
            System.out.println(name+" contact exist");
        }
        else {
            System.out.println("contact does not exists");
        }
    }
}
