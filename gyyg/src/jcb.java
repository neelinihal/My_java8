import java.util.Scanner;

public class jcb {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;
        int num = scanner.nextInt();
        int[] integers = inprint(num);
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] == 0){
                System.out.println(1);
            }
            if (integers[i] <0 ){
                System.out.println(0);
            }
            System.out.println((integers[i]-1)+(integers[i]-2));
        }

    }
    public static int[] inprint(int num){
        int[] values = new int[num];
        for (int i = 0; i < values.length ; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
}
