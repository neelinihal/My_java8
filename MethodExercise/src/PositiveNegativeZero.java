public class PositiveNegativeZero {
    public static void main(String[] args) {

        checkNumber(5);
        checkNumber(-5);
        checkNumber(0);
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        }
        else if (number == 0) {
            System.out.println("equal to 0");
        }
        else {
            System.out.println("negative");
        }
    }
}
