public class Break_Continue {
    public static void main(String[] args) {
        int count = 0;
        while (count < 15) {
            count++;
            if (count <= 5) {
                System.out.println("it dosent skip = " + count);
                continue;
            }
            System.out.println("continue number = " + count);
        }
        if (count >= 10) {
            System.out.println("breaking number = " + count);
        }
    }
}