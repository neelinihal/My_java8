public class MIAN {
    public static void main(String[] args) {

        football_Player joe = new football_Player("joe");
        baseball_PLayer pat = new baseball_PLayer("pat");
        Soccer_Player jack = new Soccer_Player("jack");


        Team eagle = new Team("eagle");
        eagle.addPlayer(joe);
        eagle.addPlayer(pat);
        eagle.addPlayer(jack);

        System.out.println(eagle.numPlayers());
    }
}
