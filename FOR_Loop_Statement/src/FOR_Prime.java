public class FOR_Prime {
    public static void main(String[] args) {
        //int n = 2;
        for (int n = 2; n < 100 ; n++) {
            if (prime(n)) {
                System.out.println(n+" is a prime");
                continue;
            }
            System.out.println(n+" is not a prime");
        }
    }
    public static boolean prime(int n){
        for (int i = 2; i <n/2 ; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
