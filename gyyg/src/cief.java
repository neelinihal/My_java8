import java.util.Scanner;

public class cief {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;

        while (true) {
            num++;
            if (checkPrime(num)) {
                System.out.println(num + " is a prime");
            } else {
                System.out.println(num + " is not a prime");
            }
            if (num == 20) {
                break;
            }
        }
    }
    public static boolean checkPrime(int num){
            for (int i = 2; i <num/2 ; i++) {
                if (num%i==0) {
                    return false;
                }
            }
            return true;
    }
}
