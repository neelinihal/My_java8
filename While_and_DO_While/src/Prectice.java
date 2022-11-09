public class Prectice {
    public static void main(String[] args) {

        int n = 2;
        int count = 0;
        int sum = 0;

        while(n<100){
            n++;
            if(prime(n)){
                System.out.println(n+" is not a prime ");
                continue;
            }
            System.out.println(n+" is a prime");

        }
    }
    public static boolean prime(int n){
        for (int i = 2; i <n/2 ; i++) {
            if (n%i==0) {
                return true;
            }
        }
        return false;
    }
}

