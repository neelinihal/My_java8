import java.util.Scanner;

public class Age_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your name: ");
        String name = scanner.nextLine();
       scanner.nextLine();   // handle next line character(enter key)

        System.out.println("enter your birth year:");
        int birthyear = scanner.nextInt();
        int age = 2022-birthyear;

        if(age>0 && age<=100) {
            System.out.println("your name is " + name + " and your age is " + age);
        }
        else
            System.out.println("error : please enter correct year");
        scanner.close();
    }
}
