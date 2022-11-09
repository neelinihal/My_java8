import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        int number = scanner.nextInt();

        if (palindromenum(number)){
            System.out.println(number+" it is a palindrome number");
        }
        else {
            System.out.println(number+" it is not a palindrome number");
        }

    }
    private static boolean palindromenum(int number){

        int r,temp,rev = 0;
        if (number>0) {
            temp=number;
            while (number>0) {
               r = number%10;
               rev = (rev*10)+r;
               number/=10;

                if (rev==temp){
                    return true;
                }
            }
        }
        return false;
    }
}
