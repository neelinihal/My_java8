import java.util.Scanner;

public class cihv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0,count=0;

        while (true) {
            num = scanner.nextInt();
            if(him(num)) {
                System.out.println(num+" it is a palindrome number");
            }
            else {
                System.out.println(num+" it is not a palindrome number");
            }
            count++;
            if (count == 2) {
                break;
            }
        }
    }
    public static boolean him(int num){
        int temp,reminder,rev=0;
        temp = num;
        while (num >0){
            reminder = num%10;
            rev = (rev*10)+reminder;
            num = num/10;
        }
        if(temp==rev){
            return true;
        }else {
            return false;
        }
    }
}
