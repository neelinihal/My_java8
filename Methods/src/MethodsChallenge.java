public class MethodsChallenge {
    public static void main(String [] args) {


        int him = methodvalues(true, 800, 5, 100);
        System.out.println(him);

    }
    public static int methodvalues(boolean gameover,int score,int levelcompleted,int bonus) {
        if (score == 800) {
            score += 1000;
        }
        return score;
    }
}