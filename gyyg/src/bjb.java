import java.util.Arrays;
import java.util.Scanner;

public class bjb {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args){
        System.out.println(Arrays.toString(getNum(5)));
    }
    public static int[] getNum(int numbers){
        int[] values = new int[numbers];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
}
