import java.util.Scanner;

public class MIN_MAX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

//   or     int min = 8181411;
//   or     int max = -8181411;


        int count = 0;
        boolean first = true;

        while (true){
            count++;
            System.out.println("Enter a number: ");
            boolean isanint = scanner.hasNextInt();
            if(isanint) {
                int num = scanner.nextInt();
//                if(first){
//                    first = false;
//                    min = num;
//                    max = num;
//                }
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
                scanner.nextLine();
            }
            else {
                break;
            }
        }
        System.out.println("MAX VALUE= "+max+" MIN VALUE= "+min);
        scanner.close();
    }
}
