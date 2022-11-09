import java.util.Scanner;

public class MinElementChallaenge {
    protected static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a count");
        int count = scanner.nextInt();
        scanner.nextLine();

        System.out.println("the min value is : "+findMin(readIntegers(count)));
    }

    public static int[] readIntegers(int count) {
        int[] values = new int[count];
        for (int i = 0; i < values.length; i++) {
            System.out.println("enter a number");
            int number = scanner.nextInt();
            scanner.nextLine();
            values[i] = number;
        }
        return values;
    }
    protected static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
