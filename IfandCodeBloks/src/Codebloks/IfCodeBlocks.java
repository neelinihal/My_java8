package Codebloks;

public class IfCodeBlocks {
    public static void main(String [] args) {

        boolean marks = true;
        int score = 1000;
        int highscore = 10000;
        int newscore = 1200;

       if (score < 100 && score >1000) {
            System.out.println("it is grater than 100 and equal to 1000");
        }
        else if (score == 100)
        {
            System.out.println("score is less than or equal to 1200");
        }
        else {
            System.out.println("not here");
        }


             score = 1000;
             highscore = 10000;
             newscore = 1200;

         if (marks == true) {
            int finalscore = (score + (highscore*newscore));
            finalscore +=1000000000;
            System.out.println(finalscore);
        }
        

    }

}
