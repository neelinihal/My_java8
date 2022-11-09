import java.util.Scanner;

public class ih {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int [] integrs = print(5);
        for (int i = 0; i < integrs.length; i++) {
            System.out.println(i+"  "+integrs[i]);
        }

    }
    public static int[] print(int numbers){
        System.out.println("enter "+numbers+" numbers");
        int[] values = new int[numbers];
        for (int i = 0; i <values.length ; i++) {
            values[i]= scanner.nextInt();
        }
        return values;
    }
}
