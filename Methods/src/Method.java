// Create a method called displayHighScorePosition

// it should a players name as a parameter, and a 2nd parameter as a position in the high score table

// You should display the players name along with a message like " managed to get into position" and the

// position they got and a further message" on the high score table".

// Create a 2nd method called calculateHighScorePosition

// it should be sent one argument only, the player score

// it should return an int

// the return data should be

// 1 if the score is >1000

// 2 if the score is >500 and < 1000

// 3 if the score is > 100 and < 500

// 4 in all other cases

// call both methods and display the results of the following

// a score of 1500, 900, 400, and 50





public class Method {
    public static void main( String[] args) {

       int highscore =  calculateHighScorePosition(1500);
        displayHighScorePosition("bob",highscore);

         highscore =  calculateHighScorePosition(900);
        displayHighScorePosition("may",highscore);

        highscore =  calculateHighScorePosition(400);
        displayHighScorePosition("jim",highscore);

        highscore =  calculateHighScorePosition(50);
        displayHighScorePosition("nick",highscore);

    }

    public static void displayHighScorePosition(String playername, int highscoreposition) {
        System.out.println(playername + " managed to get into position " + highscoreposition +" on the high score table ");
    }
    public static int calculateHighScorePosition(int player1) {
        if (player1 > 1000){
            return 1;
        }
        else if (player1 > 500 && player1 < 1000) {
            return 2;
        }
        else if (player1 > 100 && player1 < 500) {
            return 3;
        }
        else {
            return 4;
        }








//        int position = 4;
//
//        if (player1 > 1000){
//            position = 1;
//        }
//        else if (player1 > 500 && player1 < 1000) {
//            position = 2;
//        }
//        else if (player1 > 100 && player1 < 500) {
//            position = 3;
//        }
//        return position;

    }

}







































