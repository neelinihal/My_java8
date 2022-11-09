import java.util.Scanner;

public class hd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        if (n >= 0 && n <= 1000) {
            n = scanner.nextInt();
        }
        int t;
        int count = 0;
        while (true) {
            t = scanner.nextInt();
            count++;
            if (count == n-1) {
                break;
            }
        }
    }
    public static int num(int t){
//        if(t>=0&&t<=10000){
//            return num(t-1) + num(t-2);
//        }
//        else {
//            return 0;
//        }
        return num(t-1)+num(t-2);
    }
}
