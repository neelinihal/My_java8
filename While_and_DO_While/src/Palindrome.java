public class Palindrome {
    public static void main(String[] args) {
        if(isPalindrome(1221)){
            System.out.println("it is a palindrome");
        }
    }
    public static boolean isPalindrome(int number){
        if(number>0) {
          int reverse = 0;
            while (number>0) {
                int lastdigit = number%10;
                lastdigit+=reverse*10+lastdigit;
                lastdigit/=10;
                if(lastdigit==number){
                    return true;
                }
                reverse++;
            }
        }
        return false;
    }
}
