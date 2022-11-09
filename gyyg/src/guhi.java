import java.util.Arrays;
import java.util.Scanner;

public class guhi {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int numbers = 0;
        int[] integers = getNum(numbers);
        System.out.println("the values you entered are: "+ Arrays.toString(integers)+ "\r");
        System.out.println("the reversed array numbers are: "+Arrays.toString(reverseArray(integers))+"\r");

    }
    public static int[] getNum(int numbers){
        System.out.println("enter the numbers how many you want to print: \r");
//        System.out.println("enter "+numbers+" numbers: \r");
        int values[] = new int[numbers];
        for (int i = 0; i < values.length ; i++) {
            System.out.println("Enter #"+i+" number: \r");
             values[i] = numbers;
            numbers = scanner.nextInt();
        }
        return values;
    }
    public static int[] reverseArray(int[] values){
        int valueIndex = values.length-1;
        for (int i = 0; i < values.length/2; i++) {
            int temp = values[i];
            values[i] = values[valueIndex-i];
            values[valueIndex - i] = temp;
        }
        return values;
    }
}
