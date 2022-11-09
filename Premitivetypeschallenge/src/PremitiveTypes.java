public class PremitiveTypes {

    public static void main(String[] args) {

        int hi = 10;
        short hii = 11;
        byte hiii = 17;

        long hlo = 50000L + 10L *(hi + hii +hiii);
        System.out.println(hlo);

        short hiiii = (short) (100 + 10 *(hi + hii + hiii));
        System.out.println(hiiii);


    }

}
