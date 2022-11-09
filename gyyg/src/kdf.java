import java.util.Scanner;

public class kdf {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] integers = getInteger(5);
        for (int i = 0; i < integers.length; i++) {
            System.out.println("element "+i+" type value is "+integers[i]);
        }

    }
    public static int[] getInteger(int num){
        System.out.println("Enter "+num+" numbers");
        int[] values = new int[num];
        for (int i = 0; i < values.length ; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
}
