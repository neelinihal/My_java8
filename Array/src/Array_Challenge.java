import java.util.Scanner;

public class Array_Challenge {
    protected static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Enter number of values would you like to enter : \r");
        int numbers = scanner.nextInt();
        int[] integers = getIntegers(numbers);
        int[] sorted = sortIntegers(integers);
        printArray(sorted);
    }
    public static int[] getIntegers(int numbers){
        System.out.println("Enter the numbers: \r");
        int[] values = new int[numbers];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static int[] sortIntegers(int[] values){
        int[] sortedArray = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            sortedArray[i] = values[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] > sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
    public static void printArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.println("elements " + i + " contents " + values[i]);
        }
    }
}
