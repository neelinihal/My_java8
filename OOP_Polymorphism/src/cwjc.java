public class cwjc {
    public static void main(String[] args) {
        int n = 1234,rev=0,reminder;
        while (n!=0){
            reminder  = n%10;
            rev = (rev*10)+reminder;
            n = n/10;
        }
        System.out.println(rev);
    }
}
