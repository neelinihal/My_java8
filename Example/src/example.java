public class example {
    public static void main(String[] args) {

        follow(245);
    }
    public static int follow(int hin ) {
        if (hin % 2 == 0) {
            System.out.println(hin + " is  even number");
        }
        else {
            System.out.println(hin+" it is not a even number");

        }
        return hin;
    }
}
