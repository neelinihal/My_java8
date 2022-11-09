import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Array {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numbers = scanner.nextInt();
        int[] integers = printNum(numbers);
        System.out.println("the values are "+ Arrays.toString(integers));
        System.out.println("the reverse number is "+ Arrays.toString(reversNum(integers)).replace("[","").replace("]",""));

    }
    public static int[] printNum(int numbers){
        System.out.println("enter "+numbers+" numbers");
        int[] values = new int[numbers];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static int[] reversNum(int[] values){
        int numIndex = values.length-1;
        int midValues = values.length/2;
        for (int i = 0; i < midValues; i++) {
            int temp = values[i];
            values[i] = values[numIndex-i];
            values[numIndex -i] = temp;
        }
        return values;
    }
}
