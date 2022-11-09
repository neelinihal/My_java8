import java.util.Scanner;

public class ArrayMethods {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = totalIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("element "+i+" values are "+myIntegers[i]);
        }
        System.out.println("the average of the numbers "+getAverage(myIntegers));
    }
    public static int[] totalIntegers(int numbers){
        System.out.println("enter "+numbers+" integer values:\r");
        int[] values  = new int[numbers];
        for (int i = 0; i < values.length ; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static double getAverage(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum/(double)array.length;
    }
}
