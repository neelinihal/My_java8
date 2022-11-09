public class Methodoverloading {
    public static void main(String[] args) {

        int newscore =claculatescore("bom" , 500);
        System.out.println(newscore);                       // here score is printed with multiplied with 1000 because of return value

        claculatescore(75);

        claculatescore();

    }
    public static int claculatescore( String playername,int score) {
        System.out.println(playername + " got " + score + " points" );
        return score*1000;
    }
    public static int claculatescore( int score) {
        System.out.println( "unnamed player got " + score + " points" );
        return score*1000;
    }
    public static int claculatescore( ) {
        System.out.println( "unnamed player got no points" );
        return 0;
    }

}
