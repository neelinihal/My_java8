public class Digit_Sum {
    public static void main(String[] args) {

        System.out.println("sum of the digit numbers is "+ sumDigits(125));
        System.out.println("sum of the digit numbers is "+ sumDigits(485));

    }
    private static int sumDigits(int number){
        if (number <10) {
            return -1;
        }

        int sum = 0;
        while (number>0){
            int digit = number % 10;
            sum +=digit;
            number/=10;
        }
       return sum;
    }
}
