import java.util.Scanner;

public class vyv {
    protected static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numbers = 0;
        int[] integer = printNum(numbers);
        System.out.println(minValue(integer));

    }
    public static int[] printNum(int numbers){
        System.out.println("how many numbers you want to print: \r");
        numbers = scanner.nextInt();
        int[] values = new int[numbers];
        for (int i = 0; i < values.length; i++) {
            System.out.println("enter #"+i+" the number \r");
            numbers = scanner.nextInt();
            values[i] = numbers;
        }
        return values;
    }
    public static int minValue(int[] values){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < values.length; i++) {
            int num = values[i];
            if (num<min){
                min = num;
            }
        }
        return min;
    }
}
