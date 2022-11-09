import java.util.Scanner;

public class Prime_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = scanner.nextInt();

        while (num<50) {
            num++;
            if (primenum(num)) {
                System.out.println(num + " is a prime");
            } else {
                System.out.println(num + " is not a prime");
            }
        }

    }
    public static boolean primenum(int num){
        for (int i = 2; i <num/2 ; i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
