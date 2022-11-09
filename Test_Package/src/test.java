import com.neelinihal.mylibrary.Series;
public class test {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.fibonacci(i));
        }
        System.out.println("======================");

        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.factorial(i));
        }
        System.out.println("=======================");

        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.nSum(i));
        }
    }
}
