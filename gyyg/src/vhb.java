import java.util.Arrays;

public class vhb {
    public static void main(String[] args) {
        int [] num = new int[5];
        int [] num2 = num;

        num[2] = 4;
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(num2));

        num2[4] = 5;
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(num2));
    }
}
