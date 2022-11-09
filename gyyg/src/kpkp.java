import java.util.Scanner;

public class kpkp {
    protected static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int flag = 0;
        int numbers = scanner.nextInt();
        int[] integers = checkPrime(numbers);
        for (int i = 0; i < integers.length; i++) {
            for (int j = 2; j < integers[i]/2 ; j++) {
                if (integers[i]%j == 0){
                    System.out.println(integers[i] +" it is not a prime number");
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println(integers[i] + " it is a prime number");
            }
        }
    }
    public static int[] checkPrime(int numbers){
        System.out.println("enter "+numbers+" numbers");
        int[] values = new int[numbers];
        for (int i = 0; i < values.length ; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
}
