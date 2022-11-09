import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        addInOrder(linkedList,"Adilabad");
        addInOrder(linkedList,"Nirmal");
        addInOrder(linkedList,"Hyderabad");
        addInOrder(linkedList,"Delhi");
        printList(linkedList);

        addInOrder(linkedList,"Metpally");
        printList(linkedList);
        visit(linkedList);
    }
    public static void printList(LinkedList<String> List){
        Iterator i = List.iterator();
        while (i.hasNext()){
            System.out.println("Now Visiting "+i.next());
        }
        System.out.println("===================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList,String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison==0){
                //equal, do not add
                System.out.println(newCity+" is already exists in the list");
            }else if (comparison>0) {
                //new city should appear before this one
                //Bangalore -> Adilabad
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if (comparison<0){
                //move to next city
                //stringListIterator.add(newCity);
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()){
            System.out.println("no cities in the itinerary");
        }else {
            System.out.println("now visiting "+listIterator.next());
            printMenu();
        }
        while (!quit){
            int num = scanner.nextInt();
            scanner.nextLine();
            switch (num){
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward){
                        if (listIterator.hasNext()){
                         listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now visiting "+listIterator.next());
                    }else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("now visiting "+listIterator.previous());
                    }else {
                        System.out.println("we are the start point of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }
    public static void printMenu(){
        System.out.println("Available actions :\n");
        System.out.println("0 - to quit \n"+
                "1 - go to next city\n"+
                "2 - go to previous city\n"+
                "3 - print menu options");
    }
}
