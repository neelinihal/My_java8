import java.util.Scanner;

public class huh {
    protected static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numbers = scanner.nextInt();
        int [] integers = getNumber(numbers);
        int [] sorted = sortIntegers(integers);
        printNumbers(sorted);


    }
    public static int[] getNumber(int numbers){
        int[] values = new int[numbers];
        System.out.println("enter "+numbers+" numbers: \r");
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static void printNumbers(int[] values){
        for (int i = 0; i < values.length ; i++) {
            System.out.println("integer #"+i+" the numbers are "+values[i]);
        }
    }
    public static int[] sortIntegers(int[] values){
        int [] sortedNum = new int[values.length];
        for (int i = 0; i < sortedNum.length; i++) {
            sortedNum[i] = values[i];
        }
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedNum.length; i++) {
                if(sortedNum[i] < sortedNum[i+1]){
                    temp = sortedNum[i];
                    sortedNum[i+1] = sortedNum[i];
                    sortedNum[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedNum;
    }
}
