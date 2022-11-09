import java.util.Scanner;

public class Reading_User_Input_Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true) {
            int order = count + 1;
            System.out.println("enter a number#" + order + ": ");

            boolean nxtint = scanner.hasNextInt();
            if(true) {
                int num = scanner.nextInt();
                count++;
                sum += num;
                if (count == 10) {
                    break;
                }
            }
            else {
                System.out.println("enter valid number");
            }
            scanner.nextLine();
        }
        System.out.println("Sum = "+sum);
        scanner.close();
    }
}
