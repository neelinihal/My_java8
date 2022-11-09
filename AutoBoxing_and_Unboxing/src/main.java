import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static Scanner scanner = new Scanner(System.in);
    public  static ArrayList<Integer> integers = new ArrayList<Integer>();
    public static void main(String[] args) {

//        Integer integer = new Integer(54);
//        Double doubleValue = new Double(54.28);
    boolean quit = false;
    while (!quit) {
        addNum();
        printNum();
    }

    }
    public static void addNum() {
        System.out.println("enter a number: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        integers.add(num);
    }

    public static void printNum() {
        for (int i = 0; i < integers.size(); i++) {
            System.out.println((i + 1) + "." + integers.get(i));
        }
    }
}
