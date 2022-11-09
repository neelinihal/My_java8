public class MegaBitesConvertor {
    public static void main(String[] args) {


        printmegabytesandkilobytes(2500);
        printmegabytesandkilobytes(-1024);
        printmegabytesandkilobytes(5000);
    }
    public static void printmegabytesandkilobytes(int kilobytes) {

        double megabytes = Math.round(kilobytes/1024);
        double megabite = (kilobytes%1024);

        if (kilobytes < 0) {
            System.out.println("Invalid value");
        }
        else if (kilobytes > 0) {
            System.out.println(kilobytes+" KB = "+megabytes +" MB and " + megabite +" KB");
        }
    }
}
