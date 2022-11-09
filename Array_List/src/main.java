import java.util.ArrayList;
import java.util.Scanner;

public class main {

    protected static Scanner scanner = new Scanner(System.in);
    protected static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        int choice = 0;
        boolean quit = false;
        printInstuctions();
        while (!quit){
            System.out.println("Enter a number ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0 :
                    printInstuctions();
                case 1 :
                    groceryList.printGrocery();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }
    public static void printInstuctions(){
        System.out.println("\n press ");
        System.out.println("\t 0 - to print choice options");
        System.out.println("\t 1 - to print the list of groceries");
        System.out.println("\t 2 - to add an item to list ");
        System.out.println("\t 3 - to modify an item");
        System.out.println("\t 4 - to remove an item ");
        System.out.println("\t 5 - to search for an item in list");
        System.out.println("\t 6 - to quit the application");
    }
    public static void addItem(){
        System.out.println("please enter a grocery item ");
        groceryList.addGroceryItem(scanner.nextLine());
    }
    public static void modifyItem(){
        System.out.println("enter a item name to modify");
        String itemNO = scanner.nextLine();
        scanner.nextLine();
        System.out.println("enter the new item");
        String newItem = scanner.nextLine();
        scanner.nextLine();
        groceryList.modifyGroceryItem(itemNO,newItem);
    }
    public static void removeItem(){
        System.out.println("enter the item name you want to remove ");
        String Item = scanner.nextLine();
        scanner.nextLine();
        groceryList.removeGroceryItem(Item);
    }
    public static void searchItem(){
        System.out.println("enter the item do you want to search ");
        String newItem = scanner.nextLine();
        scanner.nextLine();
        if(groceryList.findItem(newItem) >= 0 ){
            System.out.println("found "+newItem+" in our groceryList");
        }
        else {
            System.out.println(newItem+" is not found in the list");
        }
    }
    public static void processArrayList(){
        ArrayList<String > newarrayList = new ArrayList<>();
        newarrayList.addAll(groceryList.getGroceryList());

        //or

        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
