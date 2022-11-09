import java.util.Scanner;

public class chall {
    public static void main(String []args ){
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        int height = scanner.nextInt();
        int total = (radius*radius)*((2*radius)+height);
        System.out.println(total);
    }
}
