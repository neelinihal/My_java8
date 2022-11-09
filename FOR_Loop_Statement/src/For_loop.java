public class For_loop {
    public static void main(String[] args) {

        for (int i = 0; i < 9; i++) {

            System.out.println("10,000 at " + i +"% intrest rate is " +String.format("%.2f",intrestrate(10000,i)));
        }

        System.out.println("**************************");

        for (int i = 8; i >= 2; i--) {

            System.out.println("10,000 at " + i +"% intrest rate is " +String.format("%.2f",intrestrate(10000,i)));
        }

    }
    public static double intrestrate(double amount,double i){
        return (amount*(i/100));
    }
}
