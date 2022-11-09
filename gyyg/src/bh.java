public class bh {
    // Function returns count of ways to cover 'dist'
    static int printCountRec(int dist)
    {
        // Base cases
        if (dist<0)
            return 0;
        if (dist==0)
            return 1;

        // Recur for all previous 3 and add the results
        return printCountRec(dist-1) +
                printCountRec(dist-2) ;

    }

    // driver program
    public static void main (String[] args)
    {
        int dist = 8;
        System.out.println(printCountRec(dist));
    }
}
